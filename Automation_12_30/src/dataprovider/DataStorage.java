package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] loginData() {
		String data[][]= {
				{"admin","admin"},
				{"admin","ad"},
				{"ad","admin"},
				{"ad","ad"}
		};
		return data;
	}
	@DataProvider
	public String[][] registerData() {
		String data[][]= {
				{},
				{},
				{},
				{},
				{}
		};
		return data;
	}
	@DataProvider
	public String[][] webStoreLoginData() {
		String data[][]= {
				{"alex4@gmail.com","123456"},
				{"alex4@gmail.com","1234"},
				{"al@gmail.com","123456"},
				{"al@gmail.com","1234"}
		};
		return data;
	}
}
