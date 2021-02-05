

//Entity: AgregarRol
//AgregarRol. (Button) View: agregarRol
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONTJDVETX_885149 = function(  entities, executeCommandEventArgs ) {
    
    entities.AgregarRol.fechaActual = new Date();

    executeCommandEventArgs.commons.execServer = true;
    //executeCommandEventArgs.commons.serverParameters.AgregarRol = true;
    
    entities.AgregarRol.fechaActual = null;
    entities.AgregarRol.usuario = null;
    entities.AgregarRol.descripcion = null;
    entities.AgregarRol.estado = null;

};