package org.command.pattern.abstracts;

public abstract class Remote {
	protected Command[] onCommands;
	protected Command[] offCommands;
	protected int size = 7;
	
	public Remote(int size) {
		this.size = size;
		this.onCommands = new Command[this.size];
		this.offCommands = new Command[this.size];
		
		for(int i = 0; i < this.size; i++){
			onCommands[i] = null;
			offCommands[i] = null;
		}
		
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		this.onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot){
		this.offCommands[slot].execute();
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\n-------------Remote Control ------------------- \n");
		for (int i=0; i< this.size; i++){
			sb.append("[slot" + i + " ]" + this.onCommands[i].getClass().getName()
					+ "  " + this.offCommands[i].getClass().getName() + "\n");
		}
		return sb.toString();
	}
}
