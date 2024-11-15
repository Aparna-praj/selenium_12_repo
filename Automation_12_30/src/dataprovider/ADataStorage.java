package dataprovider;

import org.testng.annotations.DataProvider;

public class ADataStorage {
	@DataProvider
	public String[][] loginData() {
		String data[][]= {
				{"alex4@gmail.com","123456"},
				{"alex4@gmail.com","1234"},
				{"al@gmail.com","123456"},
				{"al@gmail.com","1234"}
		};
		return data;
	}

}
