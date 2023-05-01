
//nazeeha fatima test case implementation
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorSchemePicker {

  // Constants for color schemes
  private static final String DARK_MODE = "dark";
  private static final String LIGHT_MODE = "light";

  // Method to pick a color scheme
  public static void pickColorScheme() {
    // Code to display color scheme options and get user input
    System.out.println("Please pick a color scheme:");
    System.out.println("1. Dark mode");
    System.out.println("2. Light mode");
    System.out.println("3. Custom color scheme");
    Scanner inputScanner = new Scanner(System.in);
    int choice = inputScanner.nextInt();

    // Code to handle the user's color scheme choice
    switch (choice) {
      case 1:
        setDarkMode();
        break;
      case 2:
        setLightMode();
        break;
      case 3:
        setCustomColorScheme();
        break;
      default:
        System.out.println("Invalid choice. Please try again.");
        pickColorScheme();
    }
  }

  // Method to set the dark mode color scheme
  private static void setDarkMode() {
    // Code to set the dark mode color scheme
    System.out.println("Dark mode set.");
  }

  // Method to set the light mode color scheme
  private static void setLightMode() {
    // Code to set the light mode color scheme
    System.out.println("Light mode set.");
  }

  // Method to set a custom color scheme
  private static void setCustomColorScheme() {
    // Code to handle setting a custom color scheme
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Please enter your custom color scheme (e.g. #000000):");
    String customColorScheme = inputScanner.nextLine();
    System.out.println("Custom color scheme set: " + customColorScheme);
  }

  // Main flow of events
  public static void main(String[] args) {
    pickColorScheme();
  }
}
