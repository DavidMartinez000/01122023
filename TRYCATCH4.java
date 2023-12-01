import java.util.Scanner;

public class TRYCATCH4 {
    public static void main(String[] args) {
        try {

            Scanner scnQuantia = new Scanner(System.in);
            System.out.println("Digite o valor da quantia que deseja depositar");
            long quantia = scnQuantia.nextLong();

            if (quantia > 1500000000000000000) { // 17 zeros
                System.out.println("Valor muito alto para deposito! Tente outro valor menor");
            } else {
                System.out.println("Valor depositado com sucesso");
            }

        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }


    }
}
