import java.sql.*;
public class JDBC1
{
	public static void main(String args[]) throws Exception
	{
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
			System.out.println("Connected");
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");
			ps.setInt(1,10);
			ps.setInt(2,11);
			ps.setString(3, "arya");
			ps.setInt(4,20000);
			ps.executeUpdate();
			ps.close();
			
			ps=con.prepareStatement("select * from emp");
			ResultSet  rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getInt("eno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getInt("esal"));
			}
		}
		catch(SQLException |ClassNotFoundException se)
		{
			System.out.println(se);
		}
		finally 
		{
			con.setAutoCommit(false);
			con.commit();
		}
	}
}
