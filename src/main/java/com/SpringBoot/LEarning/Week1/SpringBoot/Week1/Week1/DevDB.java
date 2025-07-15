package com.SpringBoot.LEarning.Week1.SpringBoot.Week1.Week1;

public class DevDB implements ServiceDb{
    @Override
    public void getData() {
        System.out.println("Data coming from DevDB");
    }
}
