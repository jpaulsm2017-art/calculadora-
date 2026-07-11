public class Calculadora {

    public static void main(String[] args) {

        int seleccionador = 0;
        boolean sistemaEncendido = true;

        while (sistemaEncendido == true) {
            double numero1 = 0, numero2 = 0, respuesta;
            boolean opcionValida = false;
            IO.println("====================");
            IO.println("===Calculadora===");
            IO.println("====================");
            IO.println("=====1. SUMA=====");
            IO.println("2. Resta");
            IO.println("3. Multiplicación");
            IO.println("4. División");
            IO.println("5. Salir");

            while (opcionValida == false) {
                try {
                    seleccionador = Integer.parseInt(IO.readln("Seleccione su opción: "));
                    opcionValida = true;
                } catch (NumberFormatException error) {
                    IO.println("Error: debe ingresar un número entero válido.");
                }
            }

            if (seleccionador == 5) {
                sistemaEncendido = false;
                IO.println("Gracias por usar la calculadora. Hasta luego!");

            } else if (seleccionador >= 1 && seleccionador <= 4) {
 
                boolean numerosValidos = false;
                while (numerosValidos == false) {
                    try {
                        numero1 = Double.parseDouble(IO.readln("Ingrese el primer número: "));
                        numero2 = Double.parseDouble(IO.readln("Ingrese el segundo número: "));
                        numerosValidos = true;
                    } catch (NumberFormatException error) {
                        IO.println("Error: debe ingresar números válidos.");
                    }
                }

                switch (seleccionador) {
                    case 1:
                        respuesta = numero1 + numero2;
                        IO.println("El resultado de la suma es: " + respuesta);
                        break;

                    case 2:
                        respuesta = numero1 - numero2;
                        IO.println("El resultado de la resta es: " + respuesta);
                        break;

                    case 3:
                        respuesta = numero1 * numero2;
                        IO.println("El resultado de la multiplicación es: " + respuesta);
                        break;

                    case 4:
                        if (numero2 == 0) {
                            IO.println("Error: no se puede dividir entre cero.");
                        } else {
                            respuesta = numero1 / numero2;
                            IO.println("El resultado de la división es: " + respuesta);
                        }
                        break;
                }

            } else {
                IO.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}