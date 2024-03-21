package Java.exercícios.ex77;

class Formulas {

    // Fórmula para converter Celsius -> Fahrenheint
    public static int celsiusFahrenheint(int celsius){

        int fahrenheint;
        fahrenheint = ((9 * celsius) + 160) / 5;
        return fahrenheint;
        
    }

    // Fórmula para converter Celsius -> Kelvin
    public static int celsiusKelvin(int celsius){

        int kelvin;
        kelvin = celsius + 273;
        return kelvin;

    }

    // Fórmula para converter Fahrenheint -> Celsius
    public static int fahrenheintCelsius(int fahrenheint){

        int celsius;
        celsius = ((5 * fahrenheint) - 160) / 9;
        return celsius;

    }

    // Fórmula para converter Fahrenheint -> Kelvin
    public static int fahrenheintKelvin(int fahrenheint){

        int kelvin;
        kelvin = ((5 * fahrenheint) + 2297) / 9;
        return kelvin;

    }

    // Fórmula para converter Kelvin -> Celsius
    public static int kelvinCelsius(int kelvin){

        int celsius;
        celsius = kelvin - 273;
        return celsius;

    }

    // Fórmula para converter Kelvin -> Fahrenheint
    public static int kelvinFahrenheint(int kelvin){

        int fahrenheint;
        fahrenheint = ((9 * kelvin) - 2297) / 5;
        return fahrenheint;

    }
    
}
