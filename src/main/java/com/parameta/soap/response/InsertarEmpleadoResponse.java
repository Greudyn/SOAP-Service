package com.parameta.soap.response;

public class InsertarEmpleadoResponse {
    private String mensaje;
    private boolean exito;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }
}
