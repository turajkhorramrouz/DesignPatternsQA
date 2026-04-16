// Client Code
public class Client {
    public static void main(String[] args) {
        // Use the Light Theme Factory to create UI components
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        UIComponent lightThemeButton = lightThemeFactory.createButton();
        UIComponent lightThemeCheckbox = lightThemeFactory.createCheckbox();


        lightThemeButton.render();    // Output: "Light Theme Button"
        lightThemeCheckbox.render();  // Output: "Light Theme Checkbox"


        // Use the Dark Theme Factory to create UI components
        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        UIComponent darkThemeButton = darkThemeFactory.createButton();
        UIComponent darkThemeCheckbox = darkThemeFactory.createCheckbox();


        darkThemeButton.render();    // Output: "Dark Theme Button"
        darkThemeCheckbox.render();  // Output: "Dark Theme Checkbox"
    }
}
