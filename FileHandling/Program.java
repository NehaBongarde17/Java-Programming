package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Program {
	public static void main(String[] args) {
		//writeVehicle();
		readVehicle();
		
		
		
	}
	
	public static void readVehicle() {
		
		List<Vehicle> list = new ArrayList<Vehicle>();
		
		try(FileInputStream fin = new FileInputStream("Vehicle.db")){
			try(DataInputStream din = new DataInputStream(fin)){
				while(true) {
					Vehicle v = new Vehicle(); 
					v.setVehicleId(din.readInt());
					v.setModel(din.readUTF());
					v.setType(din.readUTF());
					v.setPrice(din.readDouble());
					list.add(v);
				}
			}//dout.close();
		}//fout.close();
		catch(Exception e) {
			//e.printStackTrace();
		}
		//list.forEach(e -> System.out.println(e));
		
		Collections.sort(list,(x,y) -> Double.compare(y.getPrice(), x.getPrice()));
		list.forEach(e -> System.out.println(e));
	}




	public static void writeVehicle() {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(3, " BMW ", " 4-wheeler ",900000.00));
		list.add(new Vehicle(5, " Audi","4-wheeler ", 0));
		list.add(new Vehicle(2, " Hyundai Elantra ","4-wheeler", 240000.00));
		list.add(new Vehicle(1, "Tesla","Electric car", 300000.00));
		list.add(new Vehicle(4, " Honda Activa","Two-wheeler",1000000.00 ));

		try(FileOutputStream fout = new FileOutputStream("Vehicle.db")){
			try(DataOutputStream dout = new DataOutputStream(fout)){
				for(Vehicle v : list) {
					if(v.getPrice()>0) {
						dout.writeInt(v.getVehicleId());
						dout.writeUTF(v.getModel());
						dout.writeUTF(v.getType());
						dout.writeDouble(v.getPrice());	
				}
			}
		}//dout.close();
			System.out.println("Vehicles saved...");
	}//fout.close();
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
