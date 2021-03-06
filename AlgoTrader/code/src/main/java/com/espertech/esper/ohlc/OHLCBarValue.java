package com.espertech.esper.ohlc;

public class OHLCBarValue
{
    private long minuteValue;
    private Double first;
    private Double last;
    private Double max;
    private Double min;

    public OHLCBarValue(long minuteValue, Double first, Double last, Double max, Double min)
    {
        this.minuteValue = minuteValue;
        this.first = first;
        this.last = last;
        this.max = max;
        this.min = min;
    }

    public long getMinuteValue()
    {
        return this.minuteValue;
    }

    public Double getFirst()
    {
        return this.first;
    }

    public Double getLast()
    {
        return this.last;
    }

    public Double getMax()
    {
        return this.max;
    }

    public Double getMin()
    {
        return this.min;
    }

	public double getFirstP() {
		return this.first;
	}

	public double getLastP() {
		return this.last;
	}

	public double getMaxP() {
		return this.max;
	}

	public double getMinP() {
		return this.min;
	}
}
