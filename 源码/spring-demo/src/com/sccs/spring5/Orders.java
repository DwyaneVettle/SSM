package com.sccs.spring5;

/**
 * @Author zoutr
 * @Description
 * @Date 2022/2/22
 **/
public class Orders {
    private String oname;
    private String oaddr;
    // 生成有参构造

    public Orders(String oname, String oaddr) {
        this.oname = oname;
        this.oaddr = oaddr;
    }
    public void testOrder() {
        System.out.println(oname+":"+oaddr);
    }

}
