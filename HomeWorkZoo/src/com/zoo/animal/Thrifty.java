package com.zoo.animal;

import com.zoo.exception.TooMuchForCheeksException;

public interface Thrifty {
	
	// запасливый
	public abstract void bigCheeks(int gramm) throws TooMuchForCheeksException;
}
