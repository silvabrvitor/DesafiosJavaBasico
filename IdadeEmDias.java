import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos =  idadeDias/ 365;
        idadeDias -=  anos * 365;
        int mes = idadeDias / 30;
        idadeDias -=  mes * 30;
        int  dia = idadeDias;
        System.out.println( anos + " ano(s)");
        System.out.println( mes + " mes(es)");
        System.out.println( dia + " dia(s)");
    }
	
}