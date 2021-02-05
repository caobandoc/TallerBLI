/*
 * Archivo: VW_AGREGARPDT_468_ViewEvent.java
 * Fecha: 4/02/2021 09:21:07 PM
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
 * VW_AGREGARPDT_468_ViewEvent - View of agregarProducto
 *
 */
@Component
@Service({ViewEventBuilder.class})
@Properties(value={
		@Property(name = "view.id", value = "VW_AGREGARPDT_468"),
		@Property(name = "view.version", value = "1.0.0")
})
public class CEVA_010VA_VABUTTONTNHFWDH_620468_676_ViewEvent extends ViewEventBuilder
 implements IExecuteCommand
{
	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(CEVA_010VA_VABUTTONTNHFWDH_620468_676_ViewEvent.class);
    
	@Reference(name="iExecuteCommandVA_VABUTTONTNHFWDH_620468",referenceInterface =IExecuteCommand.class,bind = "setiExecuteCommandVA_VABUTTONTNHFWDH_620468",unbind = "unsetiExecuteCommandVA_VABUTTONTNHFWDH_620468",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(view.id=VW_AGREGARPDT_468)(view.version=1.0.0)(view.controlId=VA_VABUTTONTNHFWDH_620468))")
	private IExecuteCommand iExecuteCommandVA_VABUTTONTNHFWDH_620468;

	public void setiExecuteCommandVA_VABUTTONTNHFWDH_620468(IExecuteCommand iExecuteCommandVA_VABUTTONTNHFWDH_620468) {
		this.iExecuteCommandVA_VABUTTONTNHFWDH_620468 = iExecuteCommandVA_VABUTTONTNHFWDH_620468;
	}

	public void unsetiExecuteCommandVA_VABUTTONTNHFWDH_620468(IExecuteCommand iExecuteCommandVA_VABUTTONTNHFWDH_620468) {
		this.iExecuteCommandVA_VABUTTONTNHFWDH_620468 = iExecuteCommandVA_VABUTTONTNHFWDH_620468;
	}

	@Reference(bind = "setBLI9227_bli_agregarcuentaahorros", unbind = "unsetBLI9227_bli_agregarcuentaahorros", cardinality = ReferenceCardinality.MANDATORY_UNARY,target="(bli.id=BLI9227_bli_agregarcuentaahorros)")
	private com.cobiscorp.designer.bli.api.IBLIExecutor bLI9227_bli_agregarcuentaahorros;
	public void setBLI9227_bli_agregarcuentaahorros(com.cobiscorp.designer.bli.api.IBLIExecutor bLI9227_bli_agregarcuentaahorros) {
		this.bLI9227_bli_agregarcuentaahorros = bLI9227_bli_agregarcuentaahorros;
	}
	public void unsetBLI9227_bli_agregarcuentaahorros(com.cobiscorp.designer.bli.api.IBLIExecutor bLI9227_bli_agregarcuentaahorros) {
		this.bLI9227_bli_agregarcuentaahorros = null;
	}
	@Override
	public void executeCommand(DynamicRequest arg0, IExecuteCommandEventArgs arg1) {
		try {
			iExecuteCommandVA_VABUTTONTNHFWDH_620468.executeCommand(arg0, arg1);
			bLI9227_bli_agregarcuentaahorros.execute(arg0);
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}


	@Override
	public void configure() {
        this.addExecuteCommandEvent("VA_VABUTTONTNHFWDH_620468", this);
	}

}

