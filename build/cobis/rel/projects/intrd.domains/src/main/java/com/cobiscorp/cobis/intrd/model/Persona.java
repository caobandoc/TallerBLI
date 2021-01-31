package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Persona {

	public static final String EN_PERSONAMI_230 = "EN_PERSONAMI_230";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Persona";
	
	
	public static final Property<String> APELLIDO = new Property<String>("apellido", String.class, false);
	
	public static final Property<String> NOMBRE = new Property<String>("nombre", String.class, false);
	
	public static final Property<String> NOMBRECOMPLETO = new Property<String>("nombreCompleto", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
