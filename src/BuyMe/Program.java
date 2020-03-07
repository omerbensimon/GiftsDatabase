package BuyMe;

import javax.swing.*;

import BuyMe.model.IModel;
import BuyMe.model.Model;
import BuyMe.view.IView;
import BuyMe.view.View;
import BuyMe.viewModel.IViewModel;
import BuyMe.viewModel.ViewModel;

public class Program {
    public static void main(String[] args) throws MVVMDemoExcption {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                IModel m = new Model();
                IView v = new View();
                v.start();
                IViewModel vm = new ViewModel();
                v.setViewModel(vm);
                vm.setModel(m);
            }
        });

    }
}
