package com.patterns.automovil.application;

import com.patterns.automovil.builder.AutomobileBuilder;
import com.patterns.automovil.builder.BatMobileBuilder;
import com.patterns.automovil.builder.Director;
import com.patterns.automovil.product.Automobile;
import com.patterns.automovil.product.BatMobile;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        //basic automobile
        AutomobileBuilder automobileBuilder = new AutomobileBuilder();

        director.setBuilder(automobileBuilder);
        director.constructBase();

        Automobile automobile = automobileBuilder.getResult();

        System.out.println(automobile);

        System.out.println("\n\n");

        //batman`s vehicle, with weapons :)
        BatMobileBuilder batMobileBuilder = new BatMobileBuilder();

        director.setBuilder(batMobileBuilder);
        director.constructBatMobile();

        BatMobile batMobile = batMobileBuilder.getResult();

        System.out.println(batMobile);
        System.out.println(batMobile.getWeaponSystem().showWeaponStatus());
    }
}
