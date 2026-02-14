package com.patterns.automovil.model;

import com.patterns.automovil.product.BatMobile;
import lombok.Setter;

@Setter
public class WeaponSystem {

    private BatMobile batMobile;

    public String showWeaponStatus() {
        if (this.batMobile.isStartEngine()) {
            return "Car is started\nWeapon System Initialized";
        } else {
            return "Car isn't started\nWeapon System Is Down";
        }
    }
}
