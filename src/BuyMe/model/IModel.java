package BuyMe.model;

import BuyMe.MVVMDemoExcption;

public interface IModel {
    public String[] getItems() throws MVVMDemoExcption;
    public String getItem() throws MVVMDemoExcption;
    public void addItem(String text) throws MVVMDemoExcption;
    public void deleteItem() throws MVVMDemoExcption;
}
