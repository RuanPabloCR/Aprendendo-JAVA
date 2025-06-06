package POO.Exercicios.Planta2;
import java.util.ArrayList;
import java.util.List;
public class Utils {

    public static boolean existe(ArrayList lista, Planta planta){
        return lista.contains(planta);
    }
    public static Planta[] ordena(List lista){
        int tam = lista.size();
        Planta []plantas = new Planta[tam];
        for(int i = 0; i < tam; i++){
            plantas[i] = (Planta) lista.get(i);
        }   

        for(int i = 0; i < tam - 1; i++){
            for(int j = 0; j < tam - i - 1; j++){
                if(plantas[j].tamanho > plantas[j + 1].tamanho){
                    Planta temp = plantas[j];
                    plantas[j] = plantas[j + 1];
                    plantas[j + 1] = temp;
                }
            }
        }
        return plantas;
    }
}
