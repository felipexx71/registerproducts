import java.util.*;

public class Main {
    static StringBuffer buffernameproduct = new StringBuffer("Nome do produto: ");
    static StringBuffer bufferidproduct = new StringBuffer("Id do produto: ");
    static Scanner scan = new Scanner(System.in);
    static Methods functions = new Methods();

    public static void main(String[] args) {
        int opc;
        try {
            while (true) {
                System.out.println("0) Sair\n1) Salvar dados\n2) Ver dados\n\nEscolha a opcao: ");
                opc = scan.nextInt();

                switch (opc) {
                    case 0:
                        System.out.println("Saindo...");
                        return;
                    case 1:
                        functions.SaveData();
                        continue;
                    case 2:
                        functions.ShowData();
                        continue;
                    default:
                        System.out.println("Opcao errada!");
                }
            }
        }catch (Exception e) {
            System.out.println("Você digitou algo errado!");
        }
    }
}