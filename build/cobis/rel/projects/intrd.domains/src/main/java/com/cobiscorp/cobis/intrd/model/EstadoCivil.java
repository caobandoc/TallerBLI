package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class EstadoCivil {

	public static final String EN_1ZQHWOKSZ_262 = "EN_1ZQHWOKSZ_262";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "EstadoCivil";
	
	
	public static final Property<String> ESTADO = new Property<String>("estado", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
