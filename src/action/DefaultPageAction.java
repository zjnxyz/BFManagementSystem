package action;

import java.util.List;

import dao.DefaultPageDao;

public class DefaultPageAction extends DefaultAction {

	
	    private int pageLength;
	    private int currentPage;
	    private int maxPage;
	    private int goPage;
	    private int start;
	    private String order;
	    private int count;

	    public void processOrder(List results, int count){
	        //获取请求时首先根据总行数和每页显示行数计算一下总页数
	        this.setMaxPage(count / this.getPageLength() + 1);

	        //如果请求的命令的第一页则将当前页置为1
	        if (this.getOrder().equals("first")) {
	            setCurrentPage(1);
	        } //如果命令为下一页，比较当前页+1是否超出最大页
	        else if (this.getOrder().equals("next")) {
	            setCurrentPage(this.getCurrentPageInSession() + 1 <= this.getMaxPage() ? this.getCurrentPageInSession() + 1 : this.getMaxPage());
	        } //同理
	        else if (this.getOrder().equals("pre")) {
	            setCurrentPage(this.getCurrentPageInSession() - 1 >= 1 ? this.getCurrentPageInSession() - 1 : 1);
	        } //跳到最后一页
	        else if (this.getOrder().equals("last")) {
	            setCurrentPage(this.getMaxPage());
	        } //跳到指定页
	        else if (this.getOrder().equals("go")) {
	            setCurrentPage(this.getGoPage());
	        } //没有命令则默认为请求首页
	        else {
	            setCurrentPage(1);
	        }
	        //将当前页保存同时存入session
	        this.setCurrentPage(getCurrentPage());
	        this.setCurrentPageInSession(getCurrentPage());
	        //查询起始页面
	        this.setStart((this.getCurrentPage() - 1) * this.getPageLength());
	    }

	    public void processOrder() {
	        //获取请求时首先根据总行数和每页显示行数计算一下总页数
	        this.setMaxPage(this.getCount() / this.getPageLength() + 1);

	        //如果请求的命令的第一页则将当前页置为1
	        if (this.getOrder().equals("first")) {
	            setCurrentPage(1);
	        } //如果命令为下一页，比较当前页+1是否超出最大页
	        else if (this.getOrder().equals("next")) {
	            setCurrentPage(this.getCurrentPageInSession() + 1 <= this.getMaxPage() ? this.getCurrentPageInSession() + 1 : this.getMaxPage());
	        } //同理
	        else if (this.getOrder().equals("pre")) {
	            setCurrentPage(this.getCurrentPageInSession() - 1 >= 1 ? this.getCurrentPageInSession() - 1 : 1);
	        } //跳到最后一页
	        else if (this.getOrder().equals("last")) {
	            setCurrentPage(this.getMaxPage());
	        } //跳到指定页
	        else if (this.getOrder().equals("go")) {
	            setCurrentPage(this.getGoPage());
	        } //没有命令则默认为请求首页
	        else {
	            setCurrentPage(1);
	        }
	        //将当前页保存同时存入session
	        this.setCurrentPage(getCurrentPage());
	        this.setCurrentPageInSession(getCurrentPage());
	        //查询起始页面
	        this.setStart((this.getCurrentPage() - 1) * this.getPageLength());
	    }

	    public int getPageLength() {
	        return pageLength;
	    }

	    public void setPageLength(int pageLength) {
	        this.pageLength = pageLength;
	    }

	    public int getCurrentPage() {
	        return currentPage;
	    }

	    public void setCurrentPage(int currentPage) {
	        this.currentPage = currentPage;
	    }

	    public int getMaxPage() {
	        return maxPage;
	    }

	    public void setMaxPage(int maxPage) {
	        this.maxPage = maxPage;
	    }

	    public String getOrder() {
	        return order;
	    }

	    public void setOrder(String order) {
	        this.order = order;
	    }

	    public int getCurrentPageInSession() {
	        if (this.getSession().get("currentPage") == null) {
	            this.setCurrentPageInSession(0);
	        }
	        return ((Integer) this.getSession().get("currentPage")).intValue();
	    }

	    public void setCurrentPageInSession(int currentPage) {
	        this.getSession().put("currentPage", currentPage);
	    }

	    public int getGoPage() {
	        if (goPage < 1) {
	            goPage = 1;
	        }
	        if (goPage > this.getMaxPage()) {
	            goPage = this.getMaxPage();
	        }
	        return goPage;
	    }

	    public void setGoPage(int goPage) {
	        this.goPage = goPage;
	    }

	    /**
	     * @return the count
	     */
	    public int getCount() {
	        return count;
	    }

	    /**
	     * @param count the count to set
	     */
	    public void setCount(int count) {
	        this.count = count;
	    }

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}
	    
	    
}
