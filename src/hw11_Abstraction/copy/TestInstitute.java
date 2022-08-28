package hw11_Abstraction.copy;

import javax.print.attribute.standard.Media;

/*
 * (see image below) Copy your previous package "hw10Abstraction" and rename it to "hw11Abstraction" inside your HW project and 
 * execute the below in hw11Abstraction package 
 * (I will evaluate this package only for abstraction). 
 * Read the question very carefully (follow coma and period). 
 * Please follow the below inheritance. 
 * University extends College, Hospital. 
 * ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool.
 * MedicalSchool extends NursingSchool implements LawSchool. 
 * NursingSchool extends RockefellerUniversity. 
 * RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool.
 * EngineeringSchool extends NYUniversity. 
 * Follow all the above hierarchy to inherit the methods. 
 * Now create a class TestInstitute. 
 * Then Instantiate ColumbiaUniversity, University and MedicalSchool one by one. 
 * Call all the possible methods from the object of ColumbiaUniversity , University and MedicalSchool. 
 * Make sure you execute the static methods from ColumbiaUniversity , University and MedicalSchool (if not created, please create one). 
 * Try to create default method (public default void ...........[follow the format of default method from interface]) in regular class and abstract class if possible and execute them if possible.  
 * Paste the github link below.
 */
public class TestInstitute {

	public static void main(String[] args) {

		System.out.println("\n=================== ColumbiaUniversity Regular class =========================\n");

		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.cafeteria();
		columbiaUniversity.cafeteria();
		columbiaUniversity.caring();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.computerLab();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.gymnasium();
		columbiaUniversity.hygiene();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.lawInfo();
		columbiaUniversity.maths();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.morgue();
		columbiaUniversity.playGround();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.columbiaUniversity();
		ColumbiaUniversity.columbiaUniversity();
		columbiaUniversity.medicalSchool();
		ColumbiaUniversity.medicalSchool();

		System.out.println("\n==================== University interface ===================================\n");

		University university = new University() {

			@Override
			public void surgeryRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void emergencyRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void cafeteria() {
				// TODO Auto-generated method stub

			}

			@Override
			public void languageClub() {
				// TODO Auto-generated method stub

			}

			@Override
			public void laboratory() {
				// TODO Auto-generated method stub

			}

			@Override
			public void commonRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void teacher() {
				// TODO Auto-generated method stub

			}

			@Override
			public void playGround() {
				// TODO Auto-generated method stub

			}

			@Override
			public void classSize() {
				// TODO Auto-generated method stub

			}
		};

		System.out.println("\n==================== MedicalSchool Abstract class ===========================\n");

		MedicalSchool medicalSchool = new MedicalSchool() {

			@Override
			public void lawInfo() {
				// TODO Auto-generated method stub

			}

			@Override
			public void hygiene() {
				// TODO Auto-generated method stub

			}

			@Override
			public void anatomyLab() {
				// TODO Auto-generated method stub

			}
		};
	}

}