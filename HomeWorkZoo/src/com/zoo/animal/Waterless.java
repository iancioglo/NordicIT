package com.zoo.animal;

import com.zoo.exception.MoreWithoutWatherException;

public interface Waterless {

	public abstract void noWater(int day) throws MoreWithoutWatherException;
}
