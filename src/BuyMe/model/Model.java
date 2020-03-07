package BuyMe.model;

import BuyMe.MVVMDemoExcption;

public class Model implements IModel {
    @Override
    public String[] getItems() throws MVVMDemoExcption {
        return new String[0];
    }

    @Override
    public String getItem() throws MVVMDemoExcption {
        return null;
    }

    @Override
    public void addItem(String text) throws MVVMDemoExcption {

    }

    @Override
    public void deleteItem() throws MVVMDemoExcption {

    }
}