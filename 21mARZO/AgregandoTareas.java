import java.util.*;
public class AgregandoTareas {
    public static void main (String []  args){
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        int N = sc.nextInt();
        int P = sc.nextInt();
       
        for (int i = 0 ; i < N; i++) {
            int tarea = sc.nextInt();
            if(tarea >= P){
                respuesta++;
            }
        }
        System.out.println(respuesta);
    }
}