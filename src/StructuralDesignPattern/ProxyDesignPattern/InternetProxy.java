package StructuralDesignPattern.ProxyDesignPattern;

public class InternetProxy implements ISP {
    @Override
    public String getResource(String site) {
        if (this.isBlocked(site)) {
            return "This is a blocked site";
        } else {
            ISP isp = new NetworkSetting().getISP();
            return isp.getResource(site);
        }
    }

    public boolean isBlocked(String site) {
        switch (site) {
            case "www.google.com":
                return false;
            case "www.bing.com":
                return false;
            case "www.gaming.com":
                return true;
            default:
                return true;
        }
    }
}
