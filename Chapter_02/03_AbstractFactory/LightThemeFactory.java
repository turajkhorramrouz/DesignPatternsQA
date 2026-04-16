// Step 4: Concrete Theme Factories
class LightThemeFactory implements ThemeFactory {
    @Override
    public UIComponent createButton() {
        return new LightThemeButton();
    }


    @Override
    public UIComponent createCheckbox() {
        return new LightThemeCheckbox();
    }
}
