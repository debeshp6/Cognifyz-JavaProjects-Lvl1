import java.util.Scanner;

public class TemperatureConverter {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the Temperature value: ");
            double temperature = scanner.nextDouble();

            System.out.println("Enter the unit of measurement (C or F): ");
            char unit = scanner.next().charAt(0);

            double convertedTemperature;

            if(unit=='C' || unit=='c')
            {
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println("The converted temperature in Fahrenheit is: " + convertedTemperature + "°F");
            }

            else if(unit=='F' || unit=='f')
            {
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println("The converted temperature in Celsius is: " + convertedTemperature + "°C");
            }

            else
            {
                System.out.println("Invalid unit of measurement.");
            }

            scanner.close();

        }

        public static double celsiusToFahrenheit(double celsius)
        {
            return (celsius * 9 / 5) + 32;
        }

        public static double fahrenheitToCelsius(double fahrenheit)
        {
            return (fahrenheit - 32) * 5 / 9;
        }
    }
