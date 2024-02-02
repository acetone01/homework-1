public class parkinglot
{
    public parkingspot[] spot;

    public parkinglot()
    {
        this.spot = new parkingspot[10];

        for (int i = 0; i < 10; i++)
        {
            if (i<=1)
            {this.spot[i] = new parkingspot(true);}

            else
            {this.spot[i] = new parkingspot(false);}
            
        }
    }

    public String toString(){
        return "";
    }
}