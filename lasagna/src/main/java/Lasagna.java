public class Lasagna {
    public final int EXPECTED_MINUTES_IN_OVEN = 40;
    public final int LAYER_PREPARATION_TIME_IN_MINUTES=2;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int inOvenTime)
    {
        return EXPECTED_MINUTES_IN_OVEN-inOvenTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numOfLayers)
    {
        return numOfLayers*LAYER_PREPARATION_TIME_IN_MINUTES;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers,int inOvenTime)
    {
        int totalCookingTime = inOvenTime + preparationTimeInMinutes(numOfLayers);
        return totalCookingTime;
    }
}
