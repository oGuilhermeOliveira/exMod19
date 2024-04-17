package anotacao;

import java.lang.annotation.Annotation;

/**
 * @author guiol
 */
public class NomeClass {

    static void lendoAnotacao() {
        Nome nome = new Nome();
        String annotations = nome.getNome();
        System.out.println(annotations);
    }
}
