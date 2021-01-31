
     
//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: FormularioCuentas
task.initData.VC_CUENTASYJQ_588820 = function (entities, initDataEventArgs){

    initDataEventArgs.commons.execServer = false;
    
    // Inicialización de valores
    entities.CuentaOrigen.numeroCuenta =  "CTA_001";
    entities.CuentaDestino.numeroCuenta = "CTA_002";
    
    entities.CuentaOrigen.saldo =  2000;
    entities.CuentaDestino.saldo = 1000;
  
    // Deshabilitar funciones
    initDataEventArgs.commons.api.viewState.disable("VA_NUMEROCUENTAPEG_838138");
    initDataEventArgs.commons.api.viewState.disable("VA_SALDODTNACDJKJT_612138");
    
    initDataEventArgs.commons.api.viewState.disable("VA_NUMEROCUENTALTY_240138");
    initDataEventArgs.commons.api.viewState.disable("VA_SALDOIUBRBZZOLS_353138");

};