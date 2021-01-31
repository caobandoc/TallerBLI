

//Entity: Persona
//Persona. (Button) View: EventosCliente
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONJJXLFTX_570544 = function(  entities, executeCommandEventArgs ) {
    
    entities.Persona.nombreCompleto = entities.Persona.nombre+ " " + entities.Persona.apellido;
    executeCommandEventArgs.commons.api.viewState.enable("VA_VABUTTONRHCXZYI_901544");

    executeCommandEventArgs.commons.execServer = false;

};