/* variables locales de T_INTRDUSLLBKMI_804*/

(function (root, factory) {
    factory();
} (this, function() {

    "use strict";

    /*global designerEvents, console */

        //*********** COMENTARIOS DE AYUDA **************
        //  Para imprimir mensajes en consola
        //  console.log("executeCommand");

        //  Para enviar mensaje use
        //  eventArgs.commons.messageHandler.showMessagesInformation('Ejecutando comando personalizado');

        //  Para evitar que se continue con la validación a nivel de servidor
        //  eventArgs.commons.execServer = false;

        //**********************************************************
        //  Eventos de VISUAL ATTRIBUTES
        //**********************************************************

    
        var task = designerEvents.api.cuentanueva;
    

    //"TaskId": "T_INTRDUSLLBKMI_804"


    	

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

	

//Entity: Cuenta
//Cuenta. (Button) View: CuentaNueva
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONGXXKGJN_951498 = function(  entities, executeCommandEventArgs ) {

    //executeCommandEventArgs.commons.serverParameters.Cuenta = true;
    
    let saldo = entities.Cuenta.saldo;
    
    if(saldo<=0){
        executeCommandEventArgs.commons.messageHandler.showMessagesError("Error en el saldo");
        executeCommandEventArgs.commons.execServer = false;
        return;
    }
    
    const obtenerNumeroCuenta = () => {
        return Math.floor(Math.random() * 1000000000 + 1000000000);
    } 
    
    entities.Cuenta.numeroCuenta = obtenerNumeroCuenta(); 
    entities.Cuenta.codigoCliente = entities.Cliente._data[0].cedula;
    
    executeCommandEventArgs.commons.execServer = true;
};

	

//Entity: Cuenta
//Cuenta. (Button) View: CuentaNueva
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONLBISLMH_184498 = function(  entities, executeCommandEventArgs ) {
    
    //executeCommandEventArgs.commons.serverParameters.Cuenta = true;
    
    let saldo = entities.Cuenta.saldo;
    
    if(saldo<=0){
        executeCommandEventArgs.commons.messageHandler.showMessagesError("Error en el saldo");
        executeCommandEventArgs.commons.execServer = false;
        return;
    }
    
    const obtenerNumeroCuenta = () => {
        return Math.floor(Math.random() * 1000000000 + 1000000000);
    } 
    
    entities.Cuenta.numeroCuenta = obtenerNumeroCuenta(); 
    entities.Cuenta.codigoCliente = entities.Cliente._data[0].cedula;
    
    executeCommandEventArgs.commons.execServer = true;
};

	
//ClienteQuery Entity: Cliente
task.executeQuery.Q_CLIEENNT_KV80 = function(executeQueryEventArgs){
    executeQueryEventArgs.commons.execServer = true;
    //executeQueryEventArgs.commons.serverParameters.Cliente = true;
    executeQueryEventArgs.parameters.cedula = executeQueryEventArgs.commons.api.vc.model.BusquedaCliente.codigo;
};



}));
