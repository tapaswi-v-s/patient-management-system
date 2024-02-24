# Hospital Management System

__Note:__ To Run this project first add the [jDatePicker.jar](jdatepicker-2.0.3.jar) file to the library after cloning this project.

## Modules:

### 1. Person

* If the person is new to the system, then user has to click Browse button and fill the patient details and then user is redirected to Registration page. 
* After clicking on register, person is converted to patient.


### 2.	Patient

* Existing user can login using their username and password and select the user type as Patient.
* After logging in, patient is taken to the Patient Home Page where the patient can perform three tasks : Add appointment, View appointments, Edit appointment.
* If the patient selects on Make appointment, patient will be redirected to the Patient Appointment page and there patient will have to fill all the details to book an appointment.
* If the patient selects on View appointments, patient will be able to view all their active and past appointments.
* If the patient selects on Edit appointment, patient will be able to edit their appointment details and also be able to cancel their appointment.


### 3.	Doctor

* Existing user can login using their username and password and select the user type as Doctor.
* After logging in, doctor is taken to the Doctor Home Page where the doctor can perform three tasks: Add Availability, Examine Patients, Browse Patient Directory.
* If the doctor selects Add Availability, doctor will be redirected to the Doctor’s Appointment Page where doctor selects the date and select the start and end time.
* If the doctor selects Examine Patient, doctor will be redirected to the Examine Patient Page where doctor selects the date and the list of patient appointments will be displayed for the selected date.
* Doctor can add Note and Vital Sign to the patient record selected from the Examine Patient Page. 
* If the doctor selects Browse Patient Directory, doctor will be redirected to the Patient Directory where doctor can view the list of patients. 
* By selecting particular Patient, doctor can view the Patient Details.

### 4.	Admin

* Admin can create, view, edit & delete the Patient’s details.
* Admin can create, view, edit & delete the Doctor’s details and view & update doctor's appointments.
* Admin can create, view, delete & edit Hospitals.


