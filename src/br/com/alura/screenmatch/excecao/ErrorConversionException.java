package br.com.alura.screenmatch.excecao;

public class ErrorConversionException extends RuntimeException {

    private String message;

    public ErrorConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
