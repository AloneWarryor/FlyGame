package model;

import java.io.Reader;
import java.util.logging.Logger;

import entity.Account;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class AccountModel {
	
	private static Logger LOGGER = Logger.getLogger("InfoLogging");
	
	public Account getAccount(String userName, String password) throws Exception {
		Account a = new Account();
		Account b = new Account("",userName,password);
		try {
			Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd); 
			if(smc.queryForObject("Account.findAcc", b) != null) {
				a = (Account) smc.queryForObject("Account.findAcc", b);
			}
		} catch (Exception e) {
			LOGGER.info(e.toString());
			throw e;
		}
		return a;
	}
}
