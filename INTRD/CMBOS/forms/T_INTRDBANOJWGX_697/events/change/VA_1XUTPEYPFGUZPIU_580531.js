

//Entity: EstadoCivil
//EstadoCivil.estado (ComboBox) View: FormEstadoCivil
//Evento Change: Se ejecuta al cambiar el valor de un InputControl.
task.change.VA_1XUTPEYPFGUZPIU_580531 = function(  entities, changedEventArgs ) {

    changedEventArgs.commons.execServer = false;
     
    var estado = entities.EstadoCivil.estado;
    
    if(estado=="ESTADO_1"){
        changedEventArgs.commons.api.viewState.show('G_ESTADOCVII_743531');
        entities.InfoEstadoCivil.estadoCivil = "Soltero";
        entities.InfoEstadoCivil.actividadActual = "Listo para la farra" ;
    } else if(estado=="ESTADO_2"){
        changedEventArgs.commons.api.viewState.show('G_ESTADOCVII_743531');
        entities.InfoEstadoCivil.estadoCivil = "Casado";
        entities.InfoEstadoCivil.actividadActual = "Lavando los platos" ;
    }else{
        changedEventArgs.commons.api.viewState.hide('G_ESTADOCVII_743531');
    }

};