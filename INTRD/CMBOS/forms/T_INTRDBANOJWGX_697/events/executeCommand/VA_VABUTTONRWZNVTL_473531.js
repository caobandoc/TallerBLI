

//Entity: EstadoCivil
//EstadoCivil. (Button) View: FormEstadoCivil
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONRWZNVTL_473531 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.api.viewState.hide('G_ESTADOCVII_743531');
    
    entities.EstadoCivil.estado = "ESTADO_0";
    
    executeCommandEventArgs.commons.execServer = false;

};