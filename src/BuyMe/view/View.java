package BuyMe.view;

import javax.swing.*;

import BuyMe.MVVMDemoExcption;
import BuyMe.viewModel.IViewModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements IView {
    JFrame frame;
    JPanel panel;
    JTextField tf;
    JButton bt;
    JButton allItemsBT;
    JButton deleteBT;
    JButton addBT;
    JButton updateBT;
    IViewModel viewModel;

    public IViewModel getViewModel() {
        return viewModel;
    }
    public void setViewModel(IViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public View() {
        frame = new JFrame("Gifts For You");
        tf = new JTextField(20);
        allItemsBT = new JButton("Show All");
        deleteBT = new JButton("Delete");
        addBT = new JButton("Add");
        bt = new JButton("general");
        updateBT = new JButton("Update");
        panel = new JPanel();

    }

    public void start() {
        panel.setSize(50,50);
        panel.add(bt);
        panel.add(addBT);
        panel.add(allItemsBT);
        panel.add(deleteBT);
        panel.add(updateBT);
        panel.add(tf);
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                viewModel.getItems();
            }
        });
        frame.setVisible(true);
        frame.setSize(600, 400);
    }

    @Override
    public void setMessage(String text) throws MVVMDemoExcption {
        tf.setText(text);
    }

    @Override
    public void showItems(String[] items) {
        String str = "items: ";
        for (String item : items) {
            str += "... " + item;
        }
        tf.setText(str);
    }

    @Override
    public void showItem(String item) throws MVVMDemoExcption {

    }
}
