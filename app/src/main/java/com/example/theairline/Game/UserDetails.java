package com.example.theairline.Game;

public class UserDetails {
    private static UserDetails onlyOne;
    private String user_name;
    private String user_airline_name;

    private UserDetails(String un, String uan) {
        this.user_name = un;
        this.user_airline_name = uan;
    }

    public static UserDetails getInstance(String un, String uan, int code) {
        if(onlyOne == null || code == 1)
            onlyOne = new UserDetails(un, uan);
        return onlyOne;
    }

    public String getUserName() {
        return this.user_name;
    }

    public String getUserAirlineName() {
        return this.user_airline_name;
    }
}
