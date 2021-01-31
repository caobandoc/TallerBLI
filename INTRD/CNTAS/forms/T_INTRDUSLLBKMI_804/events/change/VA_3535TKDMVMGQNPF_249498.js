

//Entity: Cuenta
//Cuenta.tipoCuenta (ComboBox) View: CuentaNueva
//Evento Change: Se ejecuta al cambiar el valor de un InputControl.
task.change.VA_3535TKDMVMGQNPF_249498 = function(  entities, changedEventArgs ) {

    changedEventArgs.commons.execServer = false;
    
    let valor = changedEventArgs.newValue;
    if(valor ==='A'){
        changedEventArgs.commons.api.viewState.show("VA_VABUTTONGXXKGJN_951498");
        changedEventArgs.commons.api.viewState.hide("VA_VABUTTONLBISLMH_184498");
    }else{
        changedEventArgs.commons.api.viewState.show("VA_VABUTTONLBISLMH_184498");
        changedEventArgs.commons.api.viewState.hide("VA_VABUTTONGXXKGJN_951498");
    }

};