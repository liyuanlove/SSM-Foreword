package com.powernode.service;

public abstract class Shopping {

    /**
     * 模板方法
     */
    public void buyGoods() {
        userLogin();
        buy();
        pay();
    }

    /**
     * 子类不能重写的方法
     */
    public final void userLogin() {
        System.out.println("用户登录");
    }

    /**
     * 子类必须实现
     */
    public abstract void buy();

    /**
     * 钩子方法
     */
    public void pay() {
        System.out.println("使用银联卡支付");
    }

}
