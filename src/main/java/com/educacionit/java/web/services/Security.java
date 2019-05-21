
package com.educacionit.java.web.services;


import com.educacionit.java.web.db.DataException;
import org.apache.commons.codec.binary.Base64;

import java.sql.Connection;
import java.sql.ResultSet;

import com.educacionit.java.web.beans.User;


public class Security {


    private Connection conn;


    public Security (Connection conn) {


        super ();

        this.conn = conn;
    }


    public String code (String val) {

        Base64 base64 = new Base64 ();
        return  new String (base64.encode (val.getBytes ()));
    }

    public String encode (String val) {

        Base64 base64 = new Base64 ();
        return new String (base64.decode (val.getBytes ()));
    }

    public User login (String u, String p) {


        User user = null;
        try {

            ResultSet rs = conn.createStatement ().
                    executeQuery (String.format ("select * from login where email='%s' and pw='%s'", u, p));

            while (rs.next ()) {

                user = new User ();
            }

        } catch (Exception e) {

            throw new DataException (e);
        }


        return user;
    }
}