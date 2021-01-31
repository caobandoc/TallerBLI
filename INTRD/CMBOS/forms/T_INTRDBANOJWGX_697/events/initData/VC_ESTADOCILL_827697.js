
     
//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: FormEstadoCivil
task.initData.VC_ESTADOCILL_827697 = function (entities, initDataEventArgs){

    initDataEventArgs.commons.execServer = false;
    
    entities.EstadoCivil.estado = "ESTADO_0";
    

};