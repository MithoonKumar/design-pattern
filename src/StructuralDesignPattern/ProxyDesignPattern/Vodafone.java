package StructuralDesignPattern.ProxyDesignPattern;

public class Vodafone implements ISP {

    @Override
    public String getResource(String site) {
        switch (site) {
            case "www.google.com":
                return "This is the response from google.com";
            case "www.bing.com":
                return "This is bing.com";
            case "www.gaming.com":
                return "Welcome to the gaming zone";
            default:
                return "The requested resource does not exist";
        }
    }
}
