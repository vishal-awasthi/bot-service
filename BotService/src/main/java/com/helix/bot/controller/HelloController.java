package com.helix.bot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Tag(name = "Hello World", description = "The API to fetch hello world")
public class HelloController {

    @Operation(summary = "Get hello world.", tags = { "hello-world" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the hello world."),
            @ApiResponse(responseCode = "404", description = "URL not found."),
            @ApiResponse(responseCode = "400", description = "Bad Request")})
    @GetMapping("hello-world")
    @ResponseStatus(HttpStatus.OK)
    public String getHelloWorld() {
        return "Hello World!";
    }
}
