package BuyMe.viewModel;


import javax.swing.*;

import BuyMe.MVVMDemoExcption;
import BuyMe.model.IModel;
import BuyMe.view.IView;

public class ViewModel implements IViewModel {
    private IView view;
    private IModel model;

    public void setView(IView view) {
        this.view = view;
    }

    public void setModel(IModel model) {
        this.model = model;
    }

    @Override
    public void getItems() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String []text = model.getItems();
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                view.showItems(text);
                            } catch (MVVMDemoExcption mvvmDemoExcption) {
                                mvvmDemoExcption.printStackTrace();
                            }
                        }
                    });

                } catch (MVVMDemoExcption e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void getItem(int id) {

    }

    @Override
    public void addItem(String text) throws MVVMDemoExcption {

    }

    @Override
    public void deleteItem() throws MVVMDemoExcption {

    }
}
