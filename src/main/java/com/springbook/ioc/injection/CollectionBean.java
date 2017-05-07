package com.springbook.ioc.injection;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * Created by Jun Ho Park on 2017-05-02.
 */
public class CollectionBean {
    /*private List<String> addressList;

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }*/
    private Map<String, Controller> addressList;

    public Map<String, Controller> getAddressList() {
        return addressList;
    }

    public void setAddressList(Map<String, Controller> addressList) {
        this.addressList = addressList;
    }
}
