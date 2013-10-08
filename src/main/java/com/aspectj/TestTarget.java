package com.aspectj;

/**
 * $Revision:  $
 * $Author: shleger $
 * $Date: 08.10.13 10:53  $
 */
public class TestTarget {

    public static void main(String[] args) {
        System.out.println("----------------------->--------- Start test -----------<---------------------");
        new TestTarget().run();
        System.out.println("----------------------->--------- End test -----------<---------------------");
    }

    public void run() {
        System.out.println("TestTarget.run()");
        test();
    }

    @LogMethod
    private void test() {
        System.out.println("TestTarget.test()");
    }
}
