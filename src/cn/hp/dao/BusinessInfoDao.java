package cn.hp.dao;

import cn.hp.model.Business;

import java.util.List;

public interface BusinessInfoDao {
    /**
     * 添加数据  一条记录
     * @param b 一个对象
     * @return 一条记录
     */
    public int AddBusiness(Business b);

    /**
     * 全查询
     * @return  对象
     */
    public List<Business> BusinessAll();
}
