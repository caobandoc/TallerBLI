

//Entity: Suma
//Suma. (Button) View: Calculadora
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONRBYOMYH_890583 = function(  entities, executeCommandEventArgs ) {
    
    executeCommandEventArgs.commons.execServer = true;
    
    //entities.Suma.numero1 = ""; 
    //entities.Suma.numero2 = "";
    //entities.Suma.resultado = "";
    
    executeCommandEventArgs.commons.api.viewState.disable('VA_VABUTTONRBYOMYH_890583');
    
    // Mensaje de exito
    // executeCommandEventArgs.commons.messageHandler.showMessagesSuccess("Cleaned");
    
    
    

};