package edu.xcdq;

/**
 * @author 王艺博
 * @date 2021/4/22 14:40
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(calc(80,90));
    }
    // 方法的封装 把复杂的操作放在一个函数里，用户只需要关心输入和输出
    public static double calc(int pingshi,int qimo) {
        return pingshi * 0.4 + qimo * 0.6;
    }
}
