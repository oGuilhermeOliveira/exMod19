package anotacao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author guiol
 */
public class NomeClass {

    static void lendoAnotacao() {
        Nome nome = new Nome();
        for (Field field : nome.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Anotacao.class)) {
                Anotacao ano = field.getAnnotation(Anotacao.class);
                System.out.println("Nome da anotação: " + ano.toString());
            }
        }

//        if (nome.getClass().isAnnotationPresent(Anotacao.class)) {
//            Anotacao ano = nome.getClass().getAnnotation(Anotacao.class);
//            System.out.println("Nome da anotação: " + ano.getClass().getName());
//            System.out.println("valor da anotação: " + ano.value());
//        }
    }
}