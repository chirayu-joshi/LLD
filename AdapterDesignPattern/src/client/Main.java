package client;

import adaptee.WeightMachineForBabies;
import adaptor.WeightMachineAdaptor;
import adaptor.WeightMachineAdaptorImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdaptor weightMachineAdapter = new WeightMachineAdaptorImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
