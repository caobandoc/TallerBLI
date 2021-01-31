/*
 * Archivo: Q_CLIEENNT_KV80_QueryEvent.java
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

package com.cobiscorp.cobis.intrd.customevents.query;

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
import com.cobiscorp.designer.api.builder.QueryEventBuilder;
import com.cobiscorp.designer.api.customization.*;
import com.cobiscorp.designer.api.customization.arguments.*;
import com.cobiscorp.designer.api.managers.DesignerManagerException;

/**
 * Personalizacion de Eventos del Query
 *
 * Q_CLIEENNT_KV80_QueryEvent - ClienteQuery
 *
 */
@Component
@Service({QueryEventBuilder.class})
@Properties(value={
		@Property(name = "query.id", value = "Q_CLIEENNT_KV80"),
		@Property(name = "query.version", value = "1.0.0")
})
public class Q_CLIEENNT_KV80_QueryEvent extends QueryEventBuilder
 implements IExecuteQuery
{

	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(Q_CLIEENNT_KV80_QueryEvent.class);
	
	@Reference(name="iExecuteQueryQ_CLIEENNT_KV80",referenceInterface =IExecuteQuery.class,bind = "setiExecuteQueryQ_CLIEENNT_KV80",unbind = "unsetiExecuteQueryQ_CLIEENNT_KV80",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(query.version=1.0.0)(query.id=Q_CLIEENNT_KV80))")
	private IExecuteQuery iExecuteQueryQ_CLIEENNT_KV80;

	public void setiExecuteQueryQ_CLIEENNT_KV80(IExecuteQuery iExecuteQueryQ_CLIEENNT_KV80) {
		this.iExecuteQueryQ_CLIEENNT_KV80 = iExecuteQueryQ_CLIEENNT_KV80;
	}

	public void unsetiExecuteQueryQ_CLIEENNT_KV80(IExecuteQuery iExecuteQueryQ_CLIEENNT_KV80) {
		this.iExecuteQueryQ_CLIEENNT_KV80 = iExecuteQueryQ_CLIEENNT_KV80;
	}

	@Reference(bind = "setBLI4548_bli_buscarcliente", unbind = "unsetBLI4548_bli_buscarcliente", cardinality = ReferenceCardinality.MANDATORY_UNARY,target="(bli.id=BLI4548_bli_buscarcliente)")
	private com.cobiscorp.designer.bli.api.IBLIExecutor bLI4548_bli_buscarcliente;
	public void setBLI4548_bli_buscarcliente(com.cobiscorp.designer.bli.api.IBLIExecutor bLI4548_bli_buscarcliente) {
		this.bLI4548_bli_buscarcliente = bLI4548_bli_buscarcliente;
	}
	public void unsetBLI4548_bli_buscarcliente(com.cobiscorp.designer.bli.api.IBLIExecutor bLI4548_bli_buscarcliente) {
		this.bLI4548_bli_buscarcliente = null;
	}
	@Override
	public List<?> executeDataEvent(DynamicRequest arg0, IExecuteQueryEventArgs arg1) {
		List<?> lst = null;
		try {
			bLI4548_bli_buscarcliente.execute(arg0);
			lst = iExecuteQueryQ_CLIEENNT_KV80.executeDataEvent(arg0, arg1);
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
		return lst;
	}


	@Override
	public void configure() {
	    this.addQueryEvent("Q_CLIEENNT_KV80", this);
	}

}

