package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Cuenta {

	public static final String EN_CUENTAYHV_494 = "EN_CUENTAYHV_494";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Cuenta";
	
	
	public static final Property<Double> SALDO = new Property<Double>("saldo", Double.class, false);
	
	public static final Property<String> TIPOCUENTA = new Property<String>("tipoCuenta", String.class, false);
	
	public static final Property<String> NUMEROCUENTA = new Property<String>("numeroCuenta", String.class, false);
	
	public static final Property<String> CODIGOCLIENTE = new Property<String>("codigoCliente", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
