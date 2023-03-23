public class Main {
    public static void main(String[] args) {
        /*
        boolean isOK_ventana = false;
        boolean isOK_consola = false;
        isOK_consola = EntradaSaida.salida("Hola", EntradaSaida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSaida.salida("Hello world", EntradaSaida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");
        */

        String dato = EntradaSaida.entradaString("Teclee tu nombre");

        Integer numero = EntradaSaida.entradaInt("Teclee tu edad");
        if(numero!=null){
            EntradaSaida.salida(dato + numero + " años", EntradaSaida.SALIDA_WINDOW);
        }else{
            EntradaSaida.salida("Error en entero", EntradaSaida.SALIDA_CONSOLA);
        }





    }
}