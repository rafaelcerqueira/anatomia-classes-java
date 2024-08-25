import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {

        String firstName = "Rafael";
        String middleName = null; // Cerqueira;
        String lastName = "Freitas";

        //a variavel fullName recebe o metodo concatNames() declarado abaixo.
        String fullName = concatNames(firstName, middleName, lastName);

        System.out.println(fullName);

    }

    //para declarar o metodo, é necessario informar o tipo de retorno. Neste caso, o tipo é String:
    public static String concatNames(String firstName, String middleName, String lastName) {

        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Os nomes não podem ser nulos.");
        }

        if (middleName == null) {
            return "Nome e sobrenome: " + firstName.concat(" ").concat(lastName);
        } else {
            //pode-se usar o metodo concat() para concatenar strings ou o sinal de "+".
            return "O nome completo é: " + firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        }

    }
}