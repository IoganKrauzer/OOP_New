package ru.antipov.seminar_6.lsp_1;

public class Bird {

    private int flySpeed = 25;

    public int getFlySpeed() {
        return flySpeed;
    }

    protected boolean canFly = true;

    public boolean isCanFly() {
        return canFly;
    }

    public void fly(){
        System.out.printf("Птичка летит со скорость %d км./ч. \n", flySpeed);
    }
}
