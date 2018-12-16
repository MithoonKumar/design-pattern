package StructuralDesignPattern.ProxyDesignPattern;

import javax.swing.*;

public class Browser {

    public void sendRequest() {
        String site = JOptionPane.showInputDialog("Enter the site URL");
        String response = this.getInternetProvider().getResource(site);
        this.loadResponse(response);
    }

    private ISP getInternetProvider() {
        return new NetworkSetting().getInternet();
    }

    private void loadResponse(String response) {
        System.out.println(response);
    }
}
