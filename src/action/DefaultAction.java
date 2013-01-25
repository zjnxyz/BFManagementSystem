package action;

import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
/**
 *
 * @author zhiweiv
 */
public class DefaultAction extends ActionSupport implements SessionAware{
    private Map session;
    
    
    public Map getSession() {
        return session;
    }
    
    /**
     * @param session the session to set
     */
    public void setSession(Map session) {
        this.session = session;
    }
}
