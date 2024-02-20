// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase EjemploStatic

        EjemploStatic obj1 = new EjemploStatic();                       // Llamar al método estático


        EjemploStatic obj2 = new EjemploStatic();                       // Nota: No necesitamos una instancia de la clase para llamar a este método

        EjemploStatic obj3 = new EjemploStatic();                       //Aquí, se crean tres instancias de EjemploStatic. Cada vez que se crea una instancia, el contador se incrementa en 1.

        EjemploStatic.mostrarContador();                                //mostrarContador() es un método estático, en el cual no se necesita una instancia de EjemploStatic para llamar a este método. Muestra el número de instancias de EjemploStatic que se han creado.
    }
}
