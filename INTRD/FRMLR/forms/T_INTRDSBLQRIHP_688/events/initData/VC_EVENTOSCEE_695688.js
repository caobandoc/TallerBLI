
     
//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: EventosCliente
task.initData.VC_EVENTOSCEE_695688 = function (entities, initDataEventArgs){
    
    // Desabilitar el boton LIMPIAR
    initDataEventArgs.commons.api.viewState.disable("VA_VABUTTONRHCXZYI_901544");
    
    initDataEventArgs.commons.execServer = false;

};