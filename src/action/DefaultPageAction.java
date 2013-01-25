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
	        //��ȡ����ʱ���ȸ�����������ÿҳ��ʾ��������һ����ҳ��
	        this.setMaxPage(count / this.getPageLength() + 1);

	        //������������ĵ�һҳ�򽫵�ǰҳ��Ϊ1
	        if (this.getOrder().equals("first")) {
	            setCurrentPage(1);
	        } //�������Ϊ��һҳ���Ƚϵ�ǰҳ+1�Ƿ񳬳����ҳ
	        else if (this.getOrder().equals("next")) {
	            setCurrentPage(this.getCurrentPageInSession() + 1 <= this.getMaxPage() ? this.getCurrentPageInSession() + 1 : this.getMaxPage());
	        } //ͬ��
	        else if (this.getOrder().equals("pre")) {
	            setCurrentPage(this.getCurrentPageInSession() - 1 >= 1 ? this.getCurrentPageInSession() - 1 : 1);
	        } //�������һҳ
	        else if (this.getOrder().equals("last")) {
	            setCurrentPage(this.getMaxPage());
	        } //����ָ��ҳ
	        else if (this.getOrder().equals("go")) {
	            setCurrentPage(this.getGoPage());
	        } //û��������Ĭ��Ϊ������ҳ
	        else {
	            setCurrentPage(1);
	        }
	        //����ǰҳ����ͬʱ����session
	        this.setCurrentPage(getCurrentPage());
	        this.setCurrentPageInSession(getCurrentPage());
	        //��ѯ��ʼҳ��
	        this.setStart((this.getCurrentPage() - 1) * this.getPageLength());
	    }

	    public void processOrder() {
	        //��ȡ����ʱ���ȸ�����������ÿҳ��ʾ��������һ����ҳ��
	        this.setMaxPage(this.getCount() / this.getPageLength() + 1);

	        //������������ĵ�һҳ�򽫵�ǰҳ��Ϊ1
	        if (this.getOrder().equals("first")) {
	            setCurrentPage(1);
	        } //�������Ϊ��һҳ���Ƚϵ�ǰҳ+1�Ƿ񳬳����ҳ
	        else if (this.getOrder().equals("next")) {
	            setCurrentPage(this.getCurrentPageInSession() + 1 <= this.getMaxPage() ? this.getCurrentPageInSession() + 1 : this.getMaxPage());
	        } //ͬ��
	        else if (this.getOrder().equals("pre")) {
	            setCurrentPage(this.getCurrentPageInSession() - 1 >= 1 ? this.getCurrentPageInSession() - 1 : 1);
	        } //�������һҳ
	        else if (this.getOrder().equals("last")) {
	            setCurrentPage(this.getMaxPage());
	        } //����ָ��ҳ
	        else if (this.getOrder().equals("go")) {
	            setCurrentPage(this.getGoPage());
	        } //û��������Ĭ��Ϊ������ҳ
	        else {
	            setCurrentPage(1);
	        }
	        //����ǰҳ����ͬʱ����session
	        this.setCurrentPage(getCurrentPage());
	        this.setCurrentPageInSession(getCurrentPage());
	        //��ѯ��ʼҳ��
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
