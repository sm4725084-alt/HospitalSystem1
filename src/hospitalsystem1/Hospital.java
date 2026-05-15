/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Shahd Mohamed
 */
public class Hospital {

    public static void main(String[] args) {

        try{

            Connection con =
                    DBConnection.connect();

            Statement st =
                    con.createStatement();


            st.execute("""

CREATE TABLE IF NOT EXISTS users(

id INTEGER PRIMARY KEY AUTOINCREMENT,
username TEXT UNIQUE,
password TEXT,
role TEXT

)

""");




            st.execute("""

CREATE TABLE IF NOT EXISTS departments(

id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT

)

""");




            st.execute("""

CREATE TABLE IF NOT EXISTS doctors(

id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
specialization TEXT,
phone TEXT,
email TEXT,
department_id INTEGER,
FOREIGN KEY(department_id)
REFERENCES departments(id)

)

""");





            st.execute("""

CREATE TABLE IF NOT EXISTS patients(

id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
age INTEGER,
gender TEXT,
phone TEXT,
address TEXT,
blood_group TEXT

)

""");
  st.execute("""

CREATE TABLE IF NOT EXISTS doctors(

id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
specialization TEXT,
phone TEXT,
email TEXT,
department_id INTEGER,
FOREIGN KEY(department_id)
REFERENCES departments(id)

)

""");





            st.execute("""

CREATE TABLE IF NOT EXISTS patients(

id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
age INTEGER,
gender TEXT,
phone TEXT,
address TEXT,
blood_group TEXT

)

""");






            st.execute("""

CREATE TABLE IF NOT EXISTS rooms(

id INTEGER PRIMARY KEY AUTOINCREMENT,
room_number TEXT,
room_type TEXT,
status TEXT

)

""");







            st.execute("""

CREATE TABLE IF NOT EXISTS appointments(

id INTEGER PRIMARY KEY AUTOINCREMENT,
patient_id INTEGER,
doctor_id INTEGER,
appointment_date TEXT,
status TEXT,

FOREIGN KEY(patient_id)
REFERENCES patients(id),

FOREIGN KEY(doctor_id)
REFERENCES doctors(id)

)

""");








            st.execute("""

CREATE TABLE IF NOT EXISTS billing(

id INTEGER PRIMARY KEY AUTOINCREMENT,
patient_id INTEGER,
amount REAL,
payment_status TEXT,

FOREIGN KEY(patient_id)
REFERENCES patients(id)

)

""");








            st.execute("""

CREATE TABLE IF NOT EXISTS medicines(

id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
quantity INTEGER,
price REAL

)

""");








            st.execute("""

CREATE TABLE IF NOT EXISTS prescriptions(

id INTEGER PRIMARY KEY AUTOINCREMENT,
doctor_id INTEGER,
patient_id INTEGER,
medicine_id INTEGER,
dosage TEXT,

FOREIGN KEY(doctor_id)
REFERENCES doctors(id),

FOREIGN KEY(patient_id)
REFERENCES patients(id),

FOREIGN KEY(medicine_id)
REFERENCES medicines(id)

)

""");








            st.execute("""

CREATE TABLE IF NOT EXISTS medical_records(

id INTEGER PRIMARY KEY AUTOINCREMENT,
patient_id INTEGER,
diagnosis TEXT,
notes TEXT,

FOREIGN KEY(patient_id)
REFERENCES patients(id)

)

""");








            st.execute("""

CREATE TABLE IF NOT EXISTS reception_logs(

id INTEGER PRIMARY KEY AUTOINCREMENT,
patient_id INTEGER,
check_in TEXT,
check_out TEXT,

FOREIGN KEY(patient_id)
REFERENCES patients(id)

)

""");




            System.out.println(
                    "DATABASE CREATED SUCCESSFULLY"
            );


        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

}
    
