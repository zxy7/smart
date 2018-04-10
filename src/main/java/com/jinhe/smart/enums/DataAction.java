package com.jinhe.smart.enums;

public enum DataAction {
	Create(2), 
	Modify(3), 
	Delete(4), 
	Export(5),
	Import(6),
	Deal(7), 
	Submit(8),
	Upload(9),
	Valid(11), 
	InValid(12), 
	Check(13), 
	UnCheck(14),
	Special01(15), 
	Special02(16), 
	Special03(17);
	
	private final int action;
	
	private DataAction(int action) {
		this.action = action;
	}
	
	public int getAction () {
		return this.action;		
	}
}