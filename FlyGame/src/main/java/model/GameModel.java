package model;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import entity.Game;

public class GameModel {
	
	@SuppressWarnings("unchecked")
	public List<Game> getAllGame() throws Exception {
		List<Game> listGame = new ArrayList<Game>();
		try {
			Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd); 
			listGame = (List<Game>) smc.queryForList("Game.getAll");
		} catch (Exception e) {
			throw e;
		}
		return listGame;
	}
}
