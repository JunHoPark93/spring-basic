package com.springbook.ioc.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Jun Ho Park on 2017-05-02.
 */
public class CollectionBeanClient {
    public static void main(String[] args) {
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("applicationContext.xml");

        CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
        /*List<String> addressList = bean.getAddressList();
        for(String address : addressList) {
            System.out.println(address.toString());
        }*/
        factory.close();
    }

}
