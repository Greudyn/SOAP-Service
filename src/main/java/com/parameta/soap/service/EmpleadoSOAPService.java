package com.parameta.soap.service;

import com.parameta.soap.entity.Empleado;
import com.parameta.soap.repository.EmpleadoRepository;
import com.parameta.soap.response.InsertarEmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@Service
@WebService(serviceName = "EmpleadoSOAPService")
public class EmpleadoSOAPService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @WebMethod
    public InsertarEmpleadoResponse insertarEmpleado(@WebParam(name = "empleado") Empleado empleado) {
        InsertarEmpleadoResponse response = new InsertarEmpleadoResponse();

        try {
            Empleado empleadoGuardado = empleadoRepository.save(empleado);

            response.setMensaje("Empleado insertado correctamente");
            response.setExito(true);
        } catch (Exception e) {
            response.setMensaje("Error al insertar el empleado: " + e.getMessage());
            response.setExito(false);
        }

        return response;
    }
}
