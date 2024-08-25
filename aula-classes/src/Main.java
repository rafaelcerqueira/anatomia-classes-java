import static edu.classes.metodos.ConcatNames.concatNames;

public class Main {
    public static void main(String[] args) {

        String firstName = "Rafael";
        String middleName = null; // "Cerqueira";
        String lastName = "Freitas";

        //a variavel fullName recebe o metodo concatNames() declarado abaixo.
        String fullName = concatNames(firstName, middleName, lastName);

        System.out.println(fullName);

    }

}