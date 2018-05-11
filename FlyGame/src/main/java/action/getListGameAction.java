package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entity.Game;
import model.GameModel;

public class getListGameAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Game> listGame;
	
	public String getListGame() throws Exception {
		try {
			GameModel gm = new GameModel();
			listGame = gm.getAllGame();
		} catch (Exception e) {
			throw e;
		}
		return SUCCESS;
	}

	public void setListGame(List<Game> listGame) {
		this.listGame = listGame;
	}

	
	
}
