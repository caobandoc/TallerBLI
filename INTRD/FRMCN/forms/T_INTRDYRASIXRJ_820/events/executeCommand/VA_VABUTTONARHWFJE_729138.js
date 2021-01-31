

//Entity: CuentaOrigen
//CuentaOrigen. (Button) View: FormularioCuentas
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONARHWFJE_729138 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = false;
    
    if(entities.CuentaOrigen.valor < entities.CuentaOrigen.saldo){
        entities.CuentaOrigen.saldo =  entities.CuentaOrigen.saldo - entities.CuentaOrigen.valor;
        entities.CuentaDestino.saldo =  entities.CuentaDestino.saldo + entities.CuentaOrigen.valor;
       // success message
        executeCommandEventArgs.commons.messageHandler.showMessagesSuccess("Transferencia realizada con éxito!");
    }else{
        // error message
        executeCommandEventArgs.commons.messageHandler.showMessagesError("El saldo es insuficiente");
    }

};