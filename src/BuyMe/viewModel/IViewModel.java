package BuyMe.viewModel;

import BuyMe.MVVMDemoExcption;
import BuyMe.model.IModel;
import BuyMe.view.IView;

public interface IViewModel {
    public void getItems();
    public void getItem(int id);
    public void addItem(String text) throws MVVMDemoExcption;
    public void deleteItem() throws MVVMDemoExcption;
    public void setModel(IModel model);
    public void setView(IView view);
}
