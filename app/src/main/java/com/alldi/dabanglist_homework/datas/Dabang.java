package com.alldi.dabanglist_homework.datas;

import java.io.Serializable;

public class Dabang implements Serializable {

    public int payment;
    public int menthpayment;
    public int floor;
    public String adress;
    public String numroom;
    public String optionroom;

    public Dabang(int payment, int menthpayment, int floor, String adress, String numroom, String optionroom) {
        this.payment = payment;
        this.menthpayment = menthpayment;
        this.floor = floor;
        this.adress = adress;
        this.numroom = numroom;
        this.optionroom = optionroom;
    }
}
