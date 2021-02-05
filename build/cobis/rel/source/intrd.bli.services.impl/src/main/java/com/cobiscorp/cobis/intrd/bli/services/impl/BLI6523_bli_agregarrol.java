package com.cobiscorp.cobis.intrd.bli.services.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.cobiscorp.cobis.cwc.context.MapperManager;
import com.cobiscorp.cobis.cwc.kernel.sp.dto.MapperResult;
import com.cobiscorp.cobis.cwc.kernel.sp.impl.ExecutorSP;

import com.cobiscorp.cobis.intrd.model.AgregarRol;

import com.cobiscorp.designer.api.DataEntity;
import com.cobiscorp.designer.api.DataEntityList;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.bli.util.BLIUtils;
import com.cobiscorp.designer.bli.api.IBLIExecutor;
import com.cobiscorp.designer.exception.DesignerRuntimeException;
import com.cobiscorp.designer.bli.manager.BliManagerException;
import com.cobiscorp.cobis.cwc.server.information.ServerParamUtil;
import com.cobiscorp.cobis.commons.domains.log.ILogger;
import com.cobiscorp.cobis.commons.log.LogFactory;
import com.cobiscorp.ecobis.map.Mapper;
import com.cobiscorp.ecobis.map.dto.Result;
import com.cobiscorp.ecobis.map.enums.SqlType;

@Component
@Service({ IBLIExecutor.class })
@Properties({
  @Property(name = "task.module", value = "INTRD"),
  @Property(name = "bli.id", value = "BLI6523_bli_agregarrol")
})
public class BLI6523_bli_agregarrol implements IBLIExecutor {
  private static final ILogger logger = LogFactory.getLogger(BLI6523_bli_agregarrol.class);

  public void execute(DynamicRequest dynamicRequest) {
    Mapper mapper = null;
    try {
      DataEntity row = BLIUtils.getRowDataEntity(dynamicRequest);
      List<Object> outListEntities = new ArrayList<Object>();
      DataEntity rowAgregarRol;
      if (row != null && AgregarRol.ENTITY_NAME.equals(row.getEntityName())) {
        rowAgregarRol = row;
      } else {
        rowAgregarRol = BLIUtils.getDataEntity(dynamicRequest, AgregarRol.ENTITY_NAME);
        if (rowAgregarRol == null) {
          throw new DesignerRuntimeException("No existe entidad " + AgregarRol.ENTITY_NAME);
        }
      }

      String wdescripcion = rowAgregarRol.get(AgregarRol.DESCRIPCION);
      Date wfechaActual = rowAgregarRol.get(AgregarRol.FECHAACTUAL);
      String westado = rowAgregarRol.get(AgregarRol.ESTADO);

      if (logger.isDebugEnabled()) {
        logger.logDebug("inputParameters: " + " DESCRIPCION: " + wdescripcion + " FECHAACTUAL: " + wfechaActual + " ESTADO: " + westado);
      }

      mapper = MapperManager.get(Mapper.class);
      mapper.addInputParameter("@t_trn", SqlType.SMALLINT, "540");
      mapper.addInputParameter("@i_operacion", SqlType.VARCHAR, "I");
      mapper.addInputParameter("@i_filial", SqlType.TINYINT, "1");

      if (wdescripcion != null){
        mapper.addInputParameter("@i_descripcion", SqlType.VARCHAR, BLIUtils.convertToType(wdescripcion, String.class));
      }
      mapper.addInputParameter("@i_creador", SqlType.SMALLINT, "3");

      if (wfechaActual != null){
        mapper.addInputParameter("@i_fecha_crea", SqlType.DATETIME, BLIUtils.dateToString(wfechaActual, null));
      }

      if (westado != null){
        mapper.addInputParameter("@i_estado", SqlType.VARCHAR, BLIUtils.convertToType(westado, String.class));
      }
      boolean ret = mapper.execute(".cobis.sp_ad_rol");
      int retCode = mapper.returnCode();
      if (ret && (retCode == 0)) {




        if (logger.isDebugEnabled()) {
          logger.logDebug("returnCode: " + retCode);
        }
      } else {
        BliManagerException.handleMapperException(mapper);
      }
    } catch (Exception ex) {
      BliManagerException.handleBliException(ex);
    } finally {
      if (mapper != null)
        mapper.check();
    }
  }

}
