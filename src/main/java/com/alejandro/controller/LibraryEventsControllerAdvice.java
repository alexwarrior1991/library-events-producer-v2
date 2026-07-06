package com.alejandro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * Global exception handler for the Library Events API.
 *
 * <p>All error responses follow the same shape:
 * <pre>
 * {
 *   "errors": [ "fieldA is required", "fieldB is required" ]
 * }
 * </pre>
 */
@RestControllerAdvice
public class LibraryEventsControllerAdvice {

    private static final Logger log = LoggerFactory.getLogger(LibraryEventsControllerAdvice.class);

    public record ErrorResponse(List<String> errors) {}
}
