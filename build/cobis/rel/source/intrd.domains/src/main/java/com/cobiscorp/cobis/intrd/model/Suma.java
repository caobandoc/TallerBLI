package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Suma {

	public static final String EN_SUMARZHSD_890 = "EN_SUMARZHSD_890";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Suma";
	
	
	public static final Property<Integer> NUMERO2 = new Property<Integer>("numero2", Integer.class, false);
	
	public static final Property<Integer> RESULTADO = new Property<Integer>("resultado", Integer.class, false);
	
	public static final Property<Integer> NUMERO1 = new Property<Integer>("numero1", Integer.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
