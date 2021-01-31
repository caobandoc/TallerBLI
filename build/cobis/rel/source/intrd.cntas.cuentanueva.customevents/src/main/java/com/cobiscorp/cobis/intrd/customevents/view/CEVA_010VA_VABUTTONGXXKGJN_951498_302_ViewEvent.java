/*
 * Archivo: VW_CUENTANUAV_498_ViewEvent.java
 * Fecha: 31/01/2021 01:35:55 PM
 *
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */

package com.cobiscorp.cobis.intrd.customevents.view;

import java.util.List;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.apache.felix.scr.annotations.Service;

import com.cobiscorp.cobis.commons.domains.log.ILogger;
import com.cobiscorp.cobis.commons.log.LogFactory;
import com.cobiscorp.designer.api.DataEntity;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.api.builder.ViewEventBuilder;
import com.cobiscorp.designer.api.customization.*;
import com.cobiscorp.designer.api.customization.arguments.*;
import com.cobiscorp.designer.api.managers.DesignerManagerException;

/**
 * Personalizacion de Eventos del Formulario
 *
 * VW_CUENTANUAV_498_ViewEvent - View of CuentaNueva
 *
 */
@Component
@Service({ViewEventBuilder.class})
@Properties(value={
		@Property(name = "view.id", value = "VW_CUENTANUAV_498"),
		@Property(name = "view.version", value = "1.0.0")
})
public class CEVA_010VA_VABUTTONGXXKGJN_951498_302_ViewEvent extends ViewEventBuilder
 implements IExecuteCommand
{
	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(CEVA_010VA_VABUTTONGXXKGJN_951498_302_ViewEvent.class);
    
	@Reference(name="iExecuteCommandVA_VABUTTONGXXKGJN_951498",referenceInterface =IExecuteCommand.class,bind = "setiExecuteCommandVA_VABUTTONGXXKGJN_951498",unbind = "unsetiExecuteCommandVA_VABUTTONGXXKGJN_951498",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(view.id=VW_CUENTANUAV_498)(view.version=1.0.0)(view.controlId=VA_VABUTTONGXXKGJN_951498))")
	private IExecuteCommand iExecuteCommandVA_VABUTTONGXXKGJN_951498;

	public void setiExecuteCommandVA_VABUTTONGXXKGJN_951498(IExecuteCommand iExecuteCommandVA_VABUTTONGXXKGJN_951498) {
		this.iExecuteCommandVA_VABUTTONGXXKGJN_951498 = iExecuteCommandVA_VABUTTONGXXKGJN_951498;
	}

	public void unsetiExecuteCommandVA_VABUTTONGXXKGJN_951498(IExecuteCommand iExecuteCommandVA_VABUTTONGXXKGJN_951498) {
		this.iExecuteCommandVA_VABUTTONGXXKGJN_951498 = iExecuteCommandVA_VABUTTONGXXKGJN_951498;
	}

	@Reference(bind = "setBLI4005_bli_insertarcuentaahorros", unbind = "unsetBLI4005_bli_insertarcuentaahorros", cardinality = ReferenceCardinality.MANDATORY_UNARY,target="(bli.id=BLI4005_bli_insertarcuentaahorros)")
	private com.cobiscorp.designer.bli.api.IBLIExecutor bLI4005_bli_insertarcuentaahorros;
	public void setBLI4005_bli_insertarcuentaahorros(com.cobiscorp.designer.bli.api.IBLIExecutor bLI4005_bli_insertarcuentaahorros) {
		this.bLI4005_bli_insertarcuentaahorros = bLI4005_bli_insertarcuentaahorros;
	}
	public void unsetBLI4005_bli_insertarcuentaahorros(com.cobiscorp.designer.bli.api.IBLIExecutor bLI4005_bli_insertarcuentaahorros) {
		this.bLI4005_bli_insertarcuentaahorros = null;
	}
	@Override
	public void executeCommand(DynamicRequest arg0, IExecuteCommandEventArgs arg1) {
		try {
			iExecuteCommandVA_VABUTTONGXXKGJN_951498.executeCommand(arg0, arg1);
			bLI4005_bli_insertarcuentaahorros.execute(arg0);
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}


	@Override
	public void configure() {
        this.addExecuteCommandEvent("VA_VABUTTONGXXKGJN_951498", this);
	}

}

