package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class BusquedaCliente {

	public static final String EN_BUSQUEDNA_124 = "EN_BUSQUEDNA_124";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "BusquedaCliente";
	
	
	public static final Property<String> CODIGO = new Property<String>("codigo", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
