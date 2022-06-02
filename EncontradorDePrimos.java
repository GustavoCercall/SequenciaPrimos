import java.util.ArrayList;

public class EncontradorDePrimos {
    public int[] encontraPrimos(int a, int b) {
        int [] resposta;
        ArrayList<Integer> lista = new ArrayList<>();


        boolean ehPrimo;
        for( int numero = a; numero <= b; numero++) {
            ehPrimo = true;
            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    ehPrimo = false;
                }
            }
            if (ehPrimo && numero != 1) {
                lista.add(numero);

            }
        }

        resposta = new int[lista.size()];
        int index = 0;
        for(Integer i : lista){
            resposta[index] = i;
            index++;

        }

        return resposta;
    }
}
