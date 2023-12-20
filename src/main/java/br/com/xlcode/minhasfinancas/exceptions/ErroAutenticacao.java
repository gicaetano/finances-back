package br.com.xlcode.minhasfinancas.exceptions;

public class ErroAutenticacao extends RuntimeException {

    public ErroAutenticacao(String mensagem) {
        super(mensagem);
    }
}
