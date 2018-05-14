package action;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import com.opensymphony.xwork2.ActionSupport;

public class getPageInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String info;
	
	public String pageInfo() throws UnknownHostException {
		try {
			Inet4Address host = (Inet4Address) Inet4Address.getLocalHost();
			info = host.getHostAddress();
			info += ":8080/webapp/homepage";
			System.out.println(info);
		} catch (Exception e) {
			throw e;
		}
		
		return SUCCESS;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
