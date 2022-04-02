package com.sccs.spring;

public class Orders {
    private String oName;
    private String oaddres;

    public Orders(String oName, String oaddres) {
        this.oName = oName;
        this.oaddres = oaddres;
    }
    public void testOrder() {
        System.out.println(oName+":"+oaddres);
    }
}
