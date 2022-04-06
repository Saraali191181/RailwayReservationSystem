/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwayreservation;

/**
 *
 * @author hp
 */
public class Train {
    
    private String trainName ;
    private  int trainNo ;
    

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    @Override
    public String toString() {
        return "Train{" + "trainName=" + trainName + ", trainNo=" + trainNo + '}';
    }
    
    
    
}
