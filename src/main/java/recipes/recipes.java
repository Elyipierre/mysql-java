package recipes;

import java.sql.Connection;

import recipes.dao.dBConnection;

public class recipes {

	public static void main(String[] args) { 
		dBConnection.getConnection();
	}

}
  