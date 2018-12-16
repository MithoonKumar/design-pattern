package StructuralDesignPattern.ProxyDesignPattern;

public class NetworkSetting {
    public ISP getISP (){
        return new Vodafone();
    }

    public ISP getInternet () {
        return new InternetProxy();
    }
}
