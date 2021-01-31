/*
 * Archivo: VW_CUENTANUAV_498_ViewEvent.java
 * Fecha: 31/01/2021 10:56:50 AM
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
public class CEVA_010VA_VABUTTONLBISLMH_184498_833_ViewEvent extends ViewEventBuilder
 implements IExecuteCommand
{
	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(CEVA_010VA_VABUTTONLBISLMH_184498_833_ViewEvent.class);
    
	@Reference(name="iExecuteCommandVA_VABUTTONLBISLMH_184498",referenceInterface =IExecuteCommand.class,bind = "setiExecuteCommandVA_VABUTTONLBISLMH_184498",unbind = "unsetiExecuteCommandVA_VABUTTONLBISLMH_184498",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(view.id=VW_CUENTANUAV_498)(view.version=1.0.0)(view.controlId=VA_VABUTTONLBISLMH_184498))")
	private IExecuteCommand iExecuteCommandVA_VABUTTONLBISLMH_184498;

	public void setiExecuteCommandVA_VABUTTONLBISLMH_184498(IExecuteCommand iExecuteCommandVA_VABUTTONLBISLMH_184498) {
		this.iExecuteCommandVA_VABUTTONLBISLMH_184498 = iExecuteCommandVA_VABUTTONLBISLMH_184498;
	}

	public void unsetiExecuteCommandVA_VABUTTONLBISLMH_184498(IExecuteCommand iExecuteCommandVA_VABUTTONLBISLMH_184498) {
		this.iExecuteCommandVA_VABUTTONLBISLMH_184498 = iExecuteCommandVA_VABUTTONLBISLMH_184498;
	}

	@Reference(bind = "setBLI6487_bli_insertarcuentacorriente", unbind = "unsetBLI6487_bli_insertarcuentacorriente", cardinality = ReferenceCardinality.MANDATORY_UNARY,target="(bli.id=BLI6487_bli_insertarcuentacorriente)")
	private com.cobiscorp.designer.bli.api.IBLIExecutor bLI6487_bli_insertarcuentacorriente;
	public void setBLI6487_bli_insertarcuentacorriente(com.cobiscorp.designer.bli.api.IBLIExecutor bLI6487_bli_insertarcuentacorriente) {
		this.bLI6487_bli_insertarcuentacorriente = bLI6487_bli_insertarcuentacorriente;
	}
	public void unsetBLI6487_bli_insertarcuentacorriente(com.cobiscorp.designer.bli.api.IBLIExecutor bLI6487_bli_insertarcuentacorriente) {
		this.bLI6487_bli_insertarcuentacorriente = null;
	}
	@Override
	public void executeCommand(DynamicRequest arg0, IExecuteCommandEventArgs arg1) {
		try {
			iExecuteCommandVA_VABUTTONLBISLMH_184498.executeCommand(arg0, arg1);
			bLI6487_bli_insertarcuentacorriente.execute(arg0);
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}


	@Override
	public void configure() {
        this.addExecuteCommandEvent("VA_VABUTTONLBISLMH_184498", this);
	}

}

