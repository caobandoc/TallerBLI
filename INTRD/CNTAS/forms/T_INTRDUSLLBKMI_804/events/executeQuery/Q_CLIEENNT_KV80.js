
//ClienteQuery Entity: Cliente
task.executeQuery.Q_CLIEENNT_KV80 = function(executeQueryEventArgs){
    executeQueryEventArgs.commons.execServer = true;
    //executeQueryEventArgs.commons.serverParameters.Cliente = true;
    executeQueryEventArgs.parameters.cedula = executeQueryEventArgs.commons.api.vc.model.BusquedaCliente.codigo;
};