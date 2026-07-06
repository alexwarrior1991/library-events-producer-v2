package com.alejandro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service layer for {@link LibraryEvent} operations.
 *
 * <p>Enforces business rules before delegating to the Kafka producer.
 * Keeps the controller thin: validation (Bean Validation) lives on the
 * controller, while business-rule enforcement lives here.
 */
@Service
public class LibraryEventService {

    private static final Logger log = LoggerFactory.getLogger(LibraryEventService.class);

}
