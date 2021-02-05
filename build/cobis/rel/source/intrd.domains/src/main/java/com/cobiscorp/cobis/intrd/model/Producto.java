package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Producto {

	public static final String EN_PRODUCTOO_741 = "EN_PRODUCTOO_741";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Producto";
	
	
	public static final Property<String> IDPRODUCTO = new Property<String>("idProducto", String.class, false);
	
	public static final Property<String> ABREVIATURA = new Property<String>("abreviatura", String.class, false);
	
	public static final Property<String> DESCRIPCION = new Property<String>("descripcion", String.class, false);
	
	public static final Property<Integer> SALDOMINIMO = new Property<Integer>("saldoMinimo", Integer.class, false);
	
	public static final Property<String> TIPO = new Property<String>("tipo", String.class, false);
	
	public static final Property<Integer> COSTO = new Property<Integer>("costo", Integer.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
