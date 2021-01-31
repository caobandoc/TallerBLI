

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