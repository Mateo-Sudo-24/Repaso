import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // Variable para controlar el bucle

        while (continuar) {
            try {
                System.out.println("\nSeleccione la figura:");
                System.out.println("1. Cuadrado");
                System.out.println("2. Círculo");
                System.out.println("3. Triángulo");
                System.out.println("4. Salir");
                int opcion = scanner.nextInt();

                Figura figura = null;

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double lado = Conversion.convertirAFloat(scanner.nextInt());
                        figura = new Cuadrado(lado);
                        break;
                    case 2:
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = Conversion.convertirAFloat(scanner.nextInt());
                        figura = new Circulo(radio);
                        break;
                    case 3:
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = Conversion.convertirAFloat(scanner.nextInt());
                        System.out.print("Ingrese la altura del triángulo: ");
                        double altura = Conversion.convertirAFloat(scanner.nextInt());
                        System.out.print("Ingrese el lado 1 del triángulo: ");
                        double lado1 = Conversion.convertirAFloat(scanner.nextInt());
                        System.out.print("Ingrese el lado 2 del triángulo: ");
                        double lado2 = Conversion.convertirAFloat(scanner.nextInt());
                        figura = new Triangulo(base, altura, lado1, lado2);
                        break;
                    case 4:
                        continuar = false; // Salir del bucle
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        continue; // Salta el resto del bucle
                    default:
                        System.out.println("Opción inválida, intente nuevamente.");
                        continue; // Volver al inicio del bucle
                }

                if (figura != null) {
                    System.out.println("Área: " + figura.calcularArea());
                    System.out.println("Perímetro: " + figura.calcularPerimetro());
                }

            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Intente nuevamente.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        scanner.close();
    }
}
