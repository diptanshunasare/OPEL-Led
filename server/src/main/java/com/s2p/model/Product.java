package com.s2p.model;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (length = 256)
    private String title ;

    @Column (length =600)
    private String description ;

    private String img_url_1 ;

    private String img_url_2 ;

    private String img_url_3 ;

    private String img_url_4 ;

    private long actual_price ;

    private long offer_price ;

    private long offer_percentage ;

    private int rating ;

    private String brand ;

    private String light_type ;

    private String special_feature ;

    private int wattage ;

    private int voltage ;

    private String colour ;

    public String room_type ;

    private boolean is_in_stock ;

    private boolean home_delivery ;


    private boolean cash_on_delivery ;

    private String warranty_period ;

    private String return_policy_upto ; ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_url_1() {
        return img_url_1;
    }

    public void setImg_url_1(String img_url_1) {
        this.img_url_1 = img_url_1;
    }

    public String getImg_url_2() {
        return img_url_2;
    }

    public void setImg_url_2(String img_url_2) {
        this.img_url_2 = img_url_2;
    }

    public String getImg_url_3() {
        return img_url_3;
    }

    public void setImg_url_3(String img_url_3) {
        this.img_url_3 = img_url_3;
    }

    public String getImg_url_4() {
        return img_url_4;
    }

    public void setImg_url_4(String img_url_4) {
        this.img_url_4 = img_url_4;
    }

    public long getActual_price() {
        return actual_price;
    }

    public void setActual_price(long actual_price) {
        this.actual_price = actual_price;
    }

    public long getOffer_price() {
        return offer_price;
    }

    public void setOffer_price(long offer_price) {
        this.offer_price = offer_price;
    }

    public long getOffer_percentage() {
        return offer_percentage;
    }

    public void setOffer_percentage(long offer_percentage) {
        this.offer_percentage = offer_percentage;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLight_type() {
        return light_type;
    }

    public void setLight_type(String light_type) {
        this.light_type = light_type;
    }

    public String getSpecial_feature() {
        return special_feature;
    }

    public void setSpecial_feature(String special_feature) {
        this.special_feature = special_feature;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public boolean isIs_in_stock() {
        return is_in_stock;
    }

    public void setIs_in_stock(boolean is_in_stock) {
        this.is_in_stock = is_in_stock;
    }

    public boolean isHome_delivery() {
        return home_delivery;
    }

    public void setHome_delivery(boolean home_delivery) {
        this.home_delivery = home_delivery;
    }

    public boolean isCash_on_delivery() {
        return cash_on_delivery;
    }

    public void setCash_on_delivery(boolean cash_on_delivery) {
        this.cash_on_delivery = cash_on_delivery;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getWarranty_period() {
        return warranty_period;
    }

    public void setWarranty_period(String warranty_period) {
        this.warranty_period = warranty_period;
    }

    public String getReturn_policy_upto() {
        return return_policy_upto;
    }

    public void setReturn_policy_upto(String return_policy_upto) {
        this.return_policy_upto = return_policy_upto;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", img_url_1='" + img_url_1 + '\'' +
                ", img_url_2='" + img_url_2 + '\'' +
                ", img_url_3='" + img_url_3 + '\'' +
                ", img_url_4='" + img_url_4 + '\'' +
                ", actual_price=" + actual_price +
                ", offer_price=" + offer_price +
                ", offer_percentage=" + offer_percentage +
                ", rating=" + rating +
                ", brand='" + brand + '\'' +
                ", light_type='" + light_type + '\'' +
                ", special_feature='" + special_feature + '\'' +
                ", wattage=" + wattage +
                ", voltage=" + voltage +
                ", colour='" + colour + '\'' +
                ", room_type='" + room_type + '\'' +
                ", is_in_stock=" + is_in_stock +
                ", home_delivery=" + home_delivery +
                ", cash_on_delivery=" + cash_on_delivery +
                ", warranty_period='" + warranty_period + '\'' +
                ", return_policy_upto='" + return_policy_upto + '\'' +
                '}';
    }
}
