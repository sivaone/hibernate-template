/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siva.multiten1;

import com.siva.multiten1.domain.Event;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author siva
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            System.out.println("Is session open "+session.isOpen());
            Event event = new Event();
            event.setTitle("Film festival");
            event.setDate(new Date());
            session.save(event);
            session.getTransaction().commit();
        }
        System.exit(0);
    }
    
}
