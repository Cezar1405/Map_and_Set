import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Defina una clase de prueba con un método main() donde usted:
        - cree un mapa llamado meses donde la clave es el nombre del mes y el valor es el número cardinal del mes
        - llene el Mapa, asegurándose de conservar el orden de inserción
        - obtener e imprimir un Set de las claves que están en meses usando un
        método de mapa específico.
        - luego convierta meses usando una colección de enteros:
          - en una Lista (e imprimirla) de enteros llamada cardinalMonth donde inserta todos los
          values del Mapa
          - en una matriz (e imprimirla) de números enteros llamada cardinalMonthArray donde inserta
          todos los values del Mapa
         */
        LinkedHashMap<String, Integer> meses = new LinkedHashMap<>();
        meses.put("Enero", 1);
        meses.put("Febrero", 2);
        meses.put("Marzo", 3);
        meses.put("Abril", 4);
        meses.put("Mayo", 5);
        meses.put("Junio", 6);
        meses.put("Julio", 7);
        meses.put("Agosto", 8);
        meses.put("Septiembre", 9);
        meses.put("Octubre", 10);
        meses.put("Noviembre", 11);
        meses.put("Diciembre", 12);

        Set<String> keys = meses.keySet();//Obteniendo las llaves de meses y guardandolo en una variable llamada keys
        //System.out.println(keys);//Imprimiendo keys
        for (String i : keys){
            System.out.print(i+" ");
        }

        System.out.println();

        List<Integer> cardinalMeses = new ArrayList<>(meses.values());//Obteniendo las values de meses y convirtiendolas en una lista de enteros
        //System.out.println(cardinalMeses);//Imprimiendo nuestra nueva lista de enteros
        for (Integer i : cardinalMeses){
            System.out.print(i+" ");
        }

        System.out.println();

        Integer[] cardinalMesesArray = meses.values().toArray(new Integer[0]);//Obteniendo las values de meses y convirtiendolas en un Array
        //System.out.println(Arrays.toString(cardinalMesesArray));//Imprimiendo nuestro nuevo Array
        for (Integer i : cardinalMesesArray){
            System.out.print(i+" ");
        }
    }
}