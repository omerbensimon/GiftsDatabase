package BuyMe.view;

import BuyMe.MVVMDemoExcption;
import BuyMe.viewModel.IViewModel;

public interface IView {
    public void setMessage(String text) throws MVVMDemoExcption;
    public  void showItems(String []items) throws MVVMDemoExcption;
    public void showItem(String item) throws MVVMDemoExcption;
    public void setViewModel(IViewModel ob);
    public void start();
}