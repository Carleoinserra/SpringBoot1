package com.example.demo;

public class Logger {
    private ConsoleWriter consoleWriter;

    // Costruttore che accetta un'istanza di ConsoleWriter
    public Logger(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void log(String message) {
        consoleWriter.write(message);
    }
}
