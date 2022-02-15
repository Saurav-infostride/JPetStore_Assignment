package com.Pages;

public class PageFactory {
    private SignInPage obj;
    private RegisterPage obje;
    private FishPage objec;
    private HomePage hom;
    private AddToCartPage atc;

    public SignInPage getSignIn() {
        if (obj == null) {
            obj = new SignInPage();
        }
        return obj;
    }
    public RegisterPage getRegister(){
        if (obje == null){
            obje = new RegisterPage();
        }
        return obje;
    }
    public HomePage getHomePage(){
        if ( hom == null){
            hom = new HomePage();
        }
        return hom;
    }
    public FishPage getFishPage(){
        if (objec == null){
            objec = new FishPage();
        }
        return objec;
    }
    public AddToCartPage getAddToCartPage(){
        if (atc == null){
            atc = new AddToCartPage();
        }
        return atc;
    }
}
