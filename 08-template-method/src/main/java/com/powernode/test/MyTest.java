package com.powernode.test;

import com.powernode.service.ClothesShopping;
import com.powernode.service.ShoesShopping;
import com.powernode.service.Shopping;

public class MyTest {

    public static void main(String[] args) {
        Shopping shoesShopping = new ShoesShopping();
        shoesShopping.buyGoods();

        Shopping clothesShopping = new ClothesShopping();
        clothesShopping.buyGoods();
    }

}
