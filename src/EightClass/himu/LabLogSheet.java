package EightClass.himu;
import java.util.Date;

public class LabLogSheet {
    private int TraineeID;
    private Date ArrivalTime;
    private String Signature;
    private int ComputerID;

    public int getTraineeID(int i)
    {
        return TraineeID;
    }
    public Date getArrivalTime()
    {
        return ArrivalTime;
    }
    public String getSignature()
    {
        return Signature;
    }
    public int getComputerID()
    {
        return ComputerID;
    }

    public void setTraineeID(int traineeID)
    {
        TraineeID = traineeID;
    }

    public void setArrivalTime(Date arrivalTime)
    {
        ArrivalTime = arrivalTime;
    }

    public void setSignature(String signature)
    {
        Signature = signature;
    }

    public void setComputerID(int computerID)
    {
        ComputerID = computerID;
    }
}
