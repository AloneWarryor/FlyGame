package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Account;

import model.AccountModel;


public class loginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String btnLogin;
	private String message;
	private String checkbox;
	private Map<String, Object> session = ActionContext.getContext().getSession();
/*	private static Logger LOGGER = Logger.getLogger("InfoLogging");*/
	
	public String execute() throws Exception {
				AccountModel am = new AccountModel();
				Account a = am.getAccount();
				if(a.getStudentID()!=null) {
					message = a.getStudentID();
					return SUCCESS;
				}else {
					message = "User Name or Password invalid";
				}
		return SUCCESS;		
	}
	

	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBtnLogin() {
		return btnLogin;
	}


	public void setBtnLogin(String btnLogin) {
		this.btnLogin = btnLogin;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getCheckbox() {
		return checkbox;
	}


	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	
	
	
}
