package com.powernode.service;

public class ClothesShopping extends Shopping {

    @Override
    public void buy() {
        System.out.println("购买七匹狼男装");
    }

    @Override
    public void pay() {
        System.out.println("使用支付宝付款");
    }

}
