/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Entity.Debts;
import Entity.Users;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author inwle
 */
public class TestDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DebtHunterByG3_war_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Connection con = null;
//        try {
//            DatabaseConnection dbCon = new DatabaseConnection();
//            con = dbCon.getConn();
//            Statement stmt = con.createStatement();
////            ResultSet rs = stmt.executeQuery("select * from USERS");
////            while (rs.next()) {
////                System.out.println(rs.getInt(1) + " " + rs.getString(2));
////            }
//            Users u = new Users();
//            String sql = "INSERT INTO DEBTS (DEBT_NAME, DEBTOR_MAIL, DESCRIPTION, COST) VALUES (?, ?, ?, ?)";
//            PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            pstmt.setString(1, "Coke");
//            pstmt.setString(2, "1@gmail.com");
//            pstmt.setString(3, "Arai ko dai");
//            pstmt.setInt(4, 50);
//            pstmt.setInt(5, u.getId());
//            pstmt.executeUpdate();
<<<<<<< HEAD
                
             Users u = em.createQuery("SELECT u from Users u WHERE u.email = :email", Users.class)
                .setParameter("email", userName).getSingleResult() ;   
      
=======
//
////            Users u = em.createQuery("SELECT u from Users u WHERE u.email = :email", Users.class)
////                    .setParameter("email", userName).getSingleResult();
//        } catch (Exception e) {
//            System.out.println("Error1: " + e);
//        }
//
        String sql = "Select d.debt_name, d.debtor_mail, d.description, d.cost from Debts d inner join Users u on u.id = d.users_id";
//        Query qry = em.createQuery(sql);
        List<Debts> debts = new ArrayList() ; 
        
        try {
            DatabaseConnection dbCon = new DatabaseConnection();
            con = dbCon.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
//                debts.add ;
//                String debtName = rs.getString("debt_name");
//                String debtorMail = rs.getString("debtor_mail");
//                String description = rs.getString("description");
//                int cost = rs.getInt("cost");
//                System.out.println(debtName + "  " + debtorMail + "   " + description + " " + cost);
            }
>>>>>>> parent of b0649e0... Merge branch 'main' of https://github.com/LLXGF1/DebtHunterByG3 into main
        } catch (Exception e) {
            System.out.println("Error1: " + e);
        }

    }
}
