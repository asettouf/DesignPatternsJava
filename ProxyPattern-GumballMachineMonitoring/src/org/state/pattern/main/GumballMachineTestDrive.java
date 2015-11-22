package org.state.pattern.main;

import java.rmi.Naming;

import org.state.pattern.abstracts.GumballMachineRemote;
import org.state.pattern.classes.GumballMachine;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		System.out.println("TA MERE");
		int count;
		if (args.length < 2){
			System.out.println("Gumball machine <name> <inventory>");
			System.exit(1);
		}
		
		try{
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
