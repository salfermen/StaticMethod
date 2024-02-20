public class EjemploStatic {
                                                                                                            // Variable estática
                                                                                                            // Una variable estática es común a todas las instancias de una clase.
                                                                                                            // Es decir, todas las instancias de la clase comparten la misma variable estática.

    static int contador = 0;
                                                                                                            // contador es una variable estática. Esto significa que es común a todas las instancias de la clase EjemploStatic. Todas las instancias de la clase comparten la misma variable contador.
                                                                                                            // Constructor de la clase
                                                                                                            // Cada vez que se crea una nueva instancia, incrementamos el contador


    public EjemploStatic() {
        contador++;                                                                                      // Método estático
                                                                                                        // Un método estático pertenece a la clase en lugar de a una instancia de la clase.
                                                                                                        // Se puede llamar sin crear una instancia de la clase.
                                                                                                        //  Cada vez que se crea una nueva instancia de EjemploStatic, el constructor se llama y el contador se incrementa en 1.
    }

    public static void mostrarContador() {
        System.out.println("Número de instancias creadas: " + contador);                                // Bloque estático
                                                                                                        // Un bloque estático se utiliza para inicializar variables estáticas.
                                                                                                        // Se ejecuta solo una vez: la primera vez que se hace referencia a cualquier miembro estático de la clase.
                                                                                                        //mostrarContador() pertenece a la clase EjemploStatic en lugar de a una instancia de la clase. donde este se llama sin crear una instancia de EjemploStatic.
    }


    static {
        System.out.println("Bloque estático. Este mensaje se mostrará solo una vez.");                  // Se utiliza para inicializar variables estáticas. Se ejecuta solo una vez
                                                                                                        // la primera vez que se hace referencia a cualquier miembro estático de la clase.

    }
}

