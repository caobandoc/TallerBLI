package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class CuentaAhorros {

	public static final String EN_CUENTAASR_369 = "EN_CUENTAASR_369";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "CuentaAhorros";
	
	
	public static final Property<String> CLIENTE = new Property<String>("cliente", String.class, false);
	
	public static final Property<String> BANCO = new Property<String>("banco", String.class, false);
	
	public static final Property<Integer> SALDO = new Property<Integer>("saldo", Integer.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
