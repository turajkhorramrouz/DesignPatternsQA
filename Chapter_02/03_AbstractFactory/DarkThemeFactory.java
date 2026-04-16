class DarkThemeFactory implements ThemeFactory {
    @Override
    public UIComponent createButton() {
        return new DarkThemeButton();
    }


    @Override
    public UIComponent createCheckbox() {
        return new DarkThemeCheckbox();
    }
}
