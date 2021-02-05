/* variables locales de T_INTRDADETHAPA_865*/

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

    
        var task = designerEvents.api.agregarproducto;
    

    //"TaskId": "T_INTRDADETHAPA_865"


    	

//Entity: Producto
//Producto. (Button) View: agregarProducto
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONTNHFWDH_620468 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = true;
    //executeCommandEventArgs.commons.serverParameters.Producto = true;

};

	
//Start signature to Callback event to VA_VABUTTONTNHFWDH_620468
task.executeCommandCallback.VA_VABUTTONTNHFWDH_620468 = function(entities, executeCommandCallbackEventArgs) {
     //here your code
};




}));
