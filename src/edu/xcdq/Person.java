package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/22 14:49
 */
// 类的封装
public class Person {
    private String name;
    private int age;
    private double high;
    // getter setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setHigh(int high) {
        this.high = high;
    }
    public double getHigh() {
        return this.high;
    }
}
