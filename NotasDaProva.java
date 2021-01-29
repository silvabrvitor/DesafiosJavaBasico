import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class NotasDaProva{
	
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nota = Integer.parseInt(st.nextToken());

            if (nota == 0){
                System.out.println("E");
            }
            if (nota >= 1 && nota <= 35){
                System.out.println("D");
            }
            if (nota >= 36 && nota <= 60){
                System.out.println("C");
            }
            if (nota >= 61 && nota <= 85){
                System.out.println("B");
            }
            if (nota >= 86 && nota <= 100){
                System.out.println("A");
            }
    }
	
}