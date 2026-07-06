package com.alejandro.controller;

import com.alejandro.config.AppConstants;
import com.alejandro.domain.LibraryEvent;
import com.alejandro.domain.LibraryEventType;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(AppConstants.API_BASE_PATH)
public class LibraryEventsController {

    private final LibraryEventService libraryEventService;


    public LibraryEventsController(LibraryEventService libraryEventService) {
        this.libraryEventService = libraryEventService;
    }

    @PostMapping
    public CompletableFuture<ResponseEntity<?>> createLibraryEvent(@RequestBody @Valid LibraryEvent libraryEvent) {
        if (libraryEvent.eventType() != LibraryEventType.ADD) {
            return CompletableFuture.completedFuture(
                    ResponseEntity
                            .status(HttpStatus.BAD_REQUEST)
                            .body(new LibraryEventsControllerAdvice.ErrorResponse(List.of("only ADD event type is supported"))));
        }
    }
}
