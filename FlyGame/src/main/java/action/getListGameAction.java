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
	
	public String execute() throws Exception {
		try {
			GameModel gm = new GameModel();
			listGame = gm.getAllGame();
		} catch (Exception e) {
			throw e;
		}
		return SUCCESS;
	}

	public List<Game> getListGame() {
		return listGame;
	}

	public void setListGame(List<Game> listGame) {
		this.listGame = listGame;
	}

<<<<<<< Upstream, based on origin/master
	
=======
>>>>>>> ba3bcc6 Xin dung
	
}
