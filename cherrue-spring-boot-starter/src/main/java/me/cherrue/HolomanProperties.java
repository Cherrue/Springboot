package me.cherrue;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("holoman")
public class HolomanProperties {
    String name;
    int howLong;

    public String getName() {
        return name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }
}
