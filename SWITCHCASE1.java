import java.util.Scanner;

public class SWITCHCASE1 {
    public static void main(String[] args) {
        String[] cores = ("Roxo","Laranja","Preto","Amarelo","Azul");
        Scanner scnCor = new Scanner(System.in);
        for(int c =0; c < cores.length; c++) {
            System.out.println("Cor [" + c + "]) - " + cores[c]);
        }
        System.out.println("Digite o codigo de uma das cores acima");
        short cor = scnCor.nextShort();

        switch (cor) {
            case 0:
            System.out.println("Voce escolheua cor " + cores(0));
                
            break;
            case1:
            System.out.println("Voce escolheu a cor " + cores(1));
            break;
            case2:
            System.out.println("Voce escolheu a cor " + cores(2));
            break;
            case3:
            System.out.println("Voce escolheu a cor " + cores(3));
            break;
            case4:
            System.out.println("Voce escolheu a cor " + cores(4));
            break;
            default:
            System.out.println("Ops! cor não encotrada");
            break;
        
            
        }
    }
}
