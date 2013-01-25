package interceptor;

/*
 * 防止未登录的用户访问除登陆页面外的其他页面
 * 
 */

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map session=actionInvocation.getInvocationContext().getSession();
		System.out.println("我是拦截器。。。。");
		if(session.get("user")!=null){
			return actionInvocation.invoke();
		}else{
			return "login";
		}
		
	}

}
