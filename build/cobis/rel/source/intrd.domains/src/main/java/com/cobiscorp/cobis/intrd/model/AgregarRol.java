package com.cobiscorp.cobis.intrd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class AgregarRol {

	public static final String EN_AGREGARLO_832 = "EN_AGREGARLO_832";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "AgregarRol";
	
	
	public static final Property<String> DESCRIPCION = new Property<String>("descripcion", String.class, false);
	
	public static final Property<String> ESTADO = new Property<String>("estado", String.class, false);
	
	public static final Property<Date> FECHAACTUAL = new Property<Date>("fechaActual", Date.class, false);
	
	public static final Property<String> USUARIO = new Property<String>("usuario", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
