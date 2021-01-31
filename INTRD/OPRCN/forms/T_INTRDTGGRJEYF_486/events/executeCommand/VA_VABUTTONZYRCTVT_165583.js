

//Entity: Suma
//Suma. (Button) View: Calculadora
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONZYRCTVT_165583 = function(  entities, executeCommandEventArgs ) {
    
    //entities.Suma.resultado = entities.Suma.numero1 + entities.Suma.numero2;
    //executeCommandEventArgs.commons.api.viewState.enable('VA_VABUTTONRBYOMYH_890583');
    
    executeCommandEventArgs.commons.execServer = true;

};