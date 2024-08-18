package contador;


public class ParametrosInvalidosException extends Exception {
    // Construtor que aceita uma mensagem de erro
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
