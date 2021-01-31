package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class CuentaDestino {

	public static final String EN_CUENTADOT_496 = "EN_CUENTADOT_496";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "CuentaDestino";
	
	
	public static final Property<String> NUMEROCUENTA = new Property<String>("numeroCuenta", String.class, false);
	
	public static final Property<Double> SALDO = new Property<Double>("saldo", Double.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
