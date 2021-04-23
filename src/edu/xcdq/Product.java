package edu.xcdq;
/**
 * @author 王艺博
 * @date 2021/4/22 15:03
 */
/*
    类的封装 1 把属性私有化 2 用方法对外提供访问或设置
 */
public class Product {
    private int id;
    private double price;
    private int count;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return this.count;
    }

}
