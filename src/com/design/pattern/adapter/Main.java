package com.design.pattern.adapter;

/**
 * Created by sdc on 2017/9/3.
 */
public class Main {

    public static void main(String[] args) {
       Target adapteer =  new Adapteer();
       adapteer.spider();

       Target target1 = new TargetImpl();
       target1.spider();
    }

}
