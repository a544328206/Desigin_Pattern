package com.design.pattern.adapter;

/**
 * 被适配者3
 * Created by sdc on 2017/9/3.
 */
public class Adapteer implements Target {

    //适配者
    private Adaptee adaptee = new Adaptee();

    @Override
    public void spider() {
        adaptee.spiderFor();
    }
}
