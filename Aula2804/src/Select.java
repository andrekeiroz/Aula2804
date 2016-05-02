import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Select {
	public List<String> lista(){
		Connection con;
		List<String> l = new ArrayList<String>();
		try {
			con = Conexao.getConnection();

			Statement stam = con.createStatement();
			ResultSet res = stam.executeQuery("SELECT * FROM numeros");
			
			while(res.next()){
				l.add(res.getString("number"));				
			}
			
			stam.close();
			res.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
                        
		}
		return l;
	}

}
