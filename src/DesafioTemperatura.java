public class DesafioTemperatura {
    public static void main(String[] args) {

        double celsius = 23.5;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit",
                celsius,fahrenheit);
            System.out.println(mensaje);

        int fahrenheitEnter = (int) fahrenheit ;
             System.out.println(" La temperatura en Fahrenheit entera es: " + fahrenheitEnter );
    }
}
