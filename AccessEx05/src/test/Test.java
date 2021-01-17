/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author lyamkin
 */
public class Test {
    public String str = "public";
    private String str2 = "private";
    protected String str3 = "protecred";
    String str4 = "packege";
    
    public void method1() {
        System.out.println("Public method");
    };
    private void method2() {
        System.out.println("Private method");
    };
    protected void method3() {
        System.out.println("Protected method");
    };
    void method4() {
        System.out.println("Default method");
    };
}
