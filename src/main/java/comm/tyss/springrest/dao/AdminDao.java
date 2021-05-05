package comm.tyss.springrest.dao;
import java.util.List;

import comm.tyss.springrest.beans.AdminInfoBean;
import comm.tyss.springrest.beans.ItemBean;

public interface AdminDao {
	
	public ItemBean getItemData(Integer iid);

	public boolean addItem(ItemBean infoBean);
	public List<ItemBean> getAllItemDetails();

	
	
	public boolean deleteItem(Integer iid);
}
