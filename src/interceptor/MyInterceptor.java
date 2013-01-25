package interceptor;

/*
 * ��ֹδ��¼���û����ʳ���½ҳ���������ҳ��
 * 
 */

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map session=actionInvocation.getInvocationContext().getSession();
		System.out.println("������������������");
		if(session.get("user")!=null){
			return actionInvocation.invoke();
		}else{
			return "login";
		}
		
	}

}
