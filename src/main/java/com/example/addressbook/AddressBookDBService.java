package com.example.addressbook;


import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDBService {

    public List<ContactPerson> readAllContacts() throws SQLException {
    	
        List<ContactPerson> list = new ArrayList<>();
        String sql = "SELECT * FROM address_book_contact";
        try (Connection conn = DBConnectionManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ContactPerson c = new ContactPerson();
                c.setId(rs.getInt("id"));
                c.setFirstName(rs.getString("first_name"));
                c.setLastName(rs.getString("last_name"));
                c.setAddress(rs.getString("address"));
                c.setCity(rs.getString("city"));
                c.setState(rs.getString("state"));
                c.setZip(rs.getString("zip"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
                Timestamp ts = rs.getTimestamp("date_added");
                if (ts != null) c.setDateAdded(ts.toLocalDateTime());
                list.add(c);
            }
        }
        return list;
    }
}

