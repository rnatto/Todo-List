package br.edu.utfpr.renatoccalunos.todolist.Utils;

public class UtilsString {

    public static boolean stringVazia(String texto){

        return texto == null || texto.trim().length() == 0;
    }
}
