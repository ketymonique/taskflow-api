package com.keth.exception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Provider
public class GlobalExceptionHandler
        implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException exception) {

        List<String> errors = exception
                .getConstraintViolations()
                .stream()
                .map(ConstraintViolation::getMessage)
                .toList();

        Map<String, Object> response = new HashMap<>();
        response.put("error", "Validation error");
        response.put("details", errors);

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(response)
                .build();
    }
}