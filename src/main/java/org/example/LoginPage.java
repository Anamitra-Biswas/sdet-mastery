package org.example;

public  class LoginPage extends BasePage {
LoginPage(String pageTitle){
    super(pageTitle);
}
   @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to : "+url);

    }

    @Override
    public boolean isPageLoaded() {
        System.out.println("Page loaded: " + pageTitle);
        return true;
    }

    public void enterCredentials(String user,String pass){
        System.out.println("Enter the credentials : "+user);
    }
    // Why can't we call enterCredentials() on a PageActions reference?
// Answer: PageAction is an interface and entercredential method is not there instead its a part of a child class of Base page thus PageActions  references aren't used


}
