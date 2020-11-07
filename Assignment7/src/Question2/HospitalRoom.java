package Question2;

import java.util.ArrayList;
import java.util.List;

public class HospitalRoom {
    //TODO: implement your code here
    List<Doctor> doctorRoom= new ArrayList<>();
    List<Patient> patientsRoom= new ArrayList<>();
    List<Doctor> doctorWaiting= new ArrayList<>();
    List<Patient> patientsWaiting= new ArrayList<>();

	
    public boolean doctorEnter(Doctor d) throws InterruptedException {
        //TODO: implement your code here

    	if(doctorRoom.size() < 1) {
    		doctorRoom.add(d);
    		System.out.println("Doctor "+d.name+" Entered, number of doctor "+doctorRoom.size());
    		if(doctorWaiting.contains(d)) 
    			doctorWaiting.remove(d);
    		
    		return true;
    	}else {
    		if(!doctorWaiting.contains(d)) {
    			doctorWaiting.add(d);
    			System.out.println("Doctor "+d.name+" is waiting to Enter, number of doctor "+doctorRoom.size());
    		}
    		return false;
    	}
    }

    public boolean doctorLeave(Doctor d) throws InterruptedException {
        //TODO: implement your code here
    	doctorRoom.remove(d);
    	System.out.println("Doctor "+d.name+" Left, number of doctor "+doctorRoom.size());
    	return true;
    	    }

    public boolean patientEnter(Patient p) throws InterruptedException {
        //TODO: implement your code here
    	if(patientsRoom.size()<3) {
    		patientsRoom.add(p);
    		System.out.println("Patient "+p.name+" entered, number of patients "+patientsRoom.size());
    		if(patientsWaiting.contains(p)) 
    			patientsWaiting.remove(p);
    		
    		return true;
    	}else {
    		if(!patientsWaiting.contains(p)) {
    			patientsWaiting.add(p);
    			System.out.println("Patient "+p.name+" is waiting to enter, number of patients "+patientsRoom.size());
    		}
    		return false;
    	}
    	
    }

    public boolean patientLeave(Patient p) throws InterruptedException {
        //TODO: implement your code here
    	patientsRoom.remove(p);
    	System.out.println("Patients "+p.name+" Left");
    	return true;
    	    }
 

}