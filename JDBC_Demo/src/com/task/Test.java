package com.task;

import java.sql.*;
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step1 load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step2 Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","@charan01");		
		// step3 create Statements
		Statement st=con.createStatement();
		// step4
		//st.execute("create table student (sid int,sname varchar(10))");
		//st.executeUpdate("insert into student values(101,'gopi',)");
		//st.executeUpdate("update student set snmae='gopi' where sid=101");
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		// step5
		con.close();
		System.out.println("table is created");
			
	}

}
