package com.example.simtj.hello;

public class SportsCar extends Car {

    private boolean isOpenSunRoof = false;

    public SportsCar(int accleration, int maxSpeed, int brakeSpeed) {
        super(accleration, maxSpeed, brakeSpeed);
    }

    public void openSunRoof() {
        isOpenSunRoof = true;
    }

    public void closeSunRoof() {
        isOpenSunRoof = false;
    }

    public String getSunRoofInfo() {
        if (isOpenSunRoof) {
            return "선루프를 열었더니 상쾌하다.";
        } else {
            return "선루프를 닫혀있다.";
        }
    }
}
