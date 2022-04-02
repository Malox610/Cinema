/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author thomas
 */


public class TicketDAOImp implements TicketDAO{

    public ArrayList<Ticket> getApp()
    {
        ArrayList<Ticket> appointmentList= new ArrayList<>();
        Connection conn = null;
        try {
            DataBase dataSource = new DataBase();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from ticket");

            while (result.next()) {
                String date; //que faire de date ?
                for (int i = 0; i < cinema.hospitalList.size(); ++i) {
                    for (int j = 0; j < cinema.doctorList.size(); ++j) {
                        for (int k = 0; k < cinema.patientList.size(); ++k) {
                            if (cinema.hospitalList.get(i).getId() == result.getInt(9) && cinema.doctorList.get(j).getId() == result.getInt(7) && cinema.patientList.get(k).getId() == result.getInt(8)) {
                                Ticket ti = new Ticket(cinema.doctorList.get(j), cinema.patientList.get(k), cinema.hospitalList.get(i), d);
                                ti.setIdticket(result.getInt(1));
                                cinema.patientList.get(k).getTicket().add(ti);
                                cinema.doctorList.get(j).getTicket().add(ti);
                                cinema.hospitalList.get(i).getTicket().add(ti);
                                appointmentList.add(ti);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return appointmentList;
    }

    public void addAppointment(Ticket ap)
    {
        Connection conn = null;
        try {
            DataSource dataSource = new DataSource();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();



            String sqlStatement = "INSERT INTO Ticket " +
                      "(year,month,day,hour,minutes,doctor_id,patient_id,hospital_id)" +
                      " VALUES " +
                      "(" + ap.getDate().getYear() + "," + ap.getDate().getMonth() + "," + ap.getDate().getDay() + "," + ap.getDate().getHour() + "," + ap.getDate().getMin() + "," + ap.getDoc().getId() + "," + ap.getPatient().getId() + "," + ap.getHospi().getId() + ")" ;

            int rows = stmt.executeUpdate(sqlStatement);
            ResultSet result = stmt.executeQuery("select * from Ticket");
            while (result.next()) {
                if(result.getInt(2) == ap.getDate().getYear() && result.getInt(3) == ap.getDate().getMonth() && result.getInt(4) == ap.getDate().getDay() && result.getInt(5) == ap.getDate().getHour() && result.getInt(6) == ap.getDate().getMin() && result.getInt(7) == ap.getDoc().getId() && result.getInt(8) == ap.getPatient().getId() && result.getInt(9) == ap.getHospi().getId() )
                {
                    ap.setId(result.getInt(1));
                }
            }

            System.out.println("rows=" + rows);
            S1Project.appointmentList.add(ap);
            for(Patient s: S1Project.patientList)
            {
                if(s.getId()==ap.getPatient().getId())
                {
                    s.addTicket(ap);
                }
            }
            for(Doctor s: S1Project.doctorList)
            {
                if(s.getId()==ap.getDoc().getId())
                {
                    s.addTicket(ap);
                }
            }
            for(Hospital s: S1Project.hospitalList)
            {
                if(s.getId()==ap.getHospi().getId())
                {
                    s.addTicket(ap);
                    s.addConsult(ap);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   public void deleteAppointment(Ticket ap)
    {
        Connection conn = null;
        try {
            DataSource dataSource = new DataSource();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
           String  sqlStatement="DELETE FROM Ticket "
                     +"WHERE id=" + ap.getId();
            int rows = stmt.executeUpdate(sqlStatement);
            System.out.println("rows=" + rows);
            S1Project.appointmentList.remove(ap);
            for(Patient p: S1Project.patientList)
            {
                if(p.getId()==ap.getPatient().getId())
                {
                    p.getTicket().remove(ap);
                }
            }
            for(Doctor doc: S1Project.doctorList)
            {
                if(doc.getId()==ap.getDoc().getId())
                {
                    doc.getTicket().remove(ap);
                }
            }
            for(Hospital h: S1Project.hospitalList)
            {
                if(h.getId()==ap.getHospi().getId())
                {
                    h.getTicket().remove(ap);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   public Ticket getApp(int id)
    {
       Connection conn = null;
        try {
            DataSource dataSource = new DataSource();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from appointments where id = " + id);
            while (result.next()) {
                Date d = new Date(result.getInt(2), result.getInt(3), result.getInt(4), result.getInt(5), result.getInt(6));
                for (int i = 0; i < S1Project.hospitalList.size(); ++i) {
                    for (int j = 0; j < S1Project.doctorList.size(); ++j) {
                        for (int k = 0; k < S1Project.patientList.size(); ++k) {
                            if (S1Project.hospitalList.get(i).getId() == result.getInt(9) && S1Project.doctorList.get(j).getId() == result.getInt(7) && S1Project.patientList.get(k).getId() == result.getInt(8)) {
                                Ticket ap = new Ticket(S1Project.doctorList.get(j), S1Project.patientList.get(k), S1Project.hospitalList.get(i), d);
                                ap.setId(result.getInt(1));
                                return ap;
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return new Ticket();
    }

   public void modifAppointment(Ticket ap)
    {
        Connection conn = null;
        try {
            DataSource dataSource = new DataSource();
            conn = dataSource.createConnection();
            Statement stmt = conn.createStatement();
            String sqlStatement = "UPDATE Ticket " +
                      "SET Year =" + ap.getDate().getYear() + ", month=" + ap.getDate().getMonth()+ ", day=" + ap.getDate().getDay()+ ",hour=" + ap.getDate().getHour()+ ",minutes=" + ap.getDate().getMin()+ ",doctor_id=" + ap.getDoc().getId() + ",patient_id=" + ap.getPatient().getId() + ",hospital_id=" + ap.getHospi().getId() +
                      " WHERE " +
                      "id=" + ap.getId();
            int rows = stmt.executeUpdate(sqlStatement);
            System.out.println("rows=" + rows);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
