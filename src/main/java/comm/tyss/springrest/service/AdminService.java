package comm.tyss.springrest.service;
import java.util.List;

import comm.tyss.springrest.beans.AdminInfoBean;
import comm.tyss.springrest.beans.ItemBean;

public interface AdminService {
	
	
	public boolean addItem(ItemBean infoBean);
	public ItemBean getItemData(Integer iid);

	public List<ItemBean> getAllItemDetails();
	

	public boolean deleteItem(Integer iid);
}
