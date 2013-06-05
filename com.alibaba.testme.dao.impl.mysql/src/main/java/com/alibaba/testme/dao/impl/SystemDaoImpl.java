package com.alibaba.testme.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.alibaba.testme.dao.SystemDao;
import com.alibaba.testme.domain.dataobject.SystemDO;

/**
 * System Dao Implement
 * 
 * @author xiaopenzi
 */
public class SystemDaoImpl extends SqlMapClientDaoSupport implements SystemDao {

    /**
     * @param systemDO
     * @return
     */
    @Override
    public Long addSystemDO(SystemDO systemDO) {
        return (Long) this.getSqlMapClientTemplate().insert("system.add", systemDO);
    }

    /**
     * @param systemDO
     * @return
     */
    @Override
    public int updateSystemDO(SystemDO systemDO) {
        Integer result = (Integer) this.getSqlMapClientTemplate().update("system.update", systemDO);
        if (result == null) {
            return 0;
        }
        return result;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int deleteSystemDO(Long id) {
        Integer result = (Integer) this.getSqlMapClientTemplate().delete("system.deleteById", id);
        if (result == null) {
            return 0;
        }
        return result;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public SystemDO findById(Long id) {
        return (SystemDO) this.getSqlMapClientTemplate().queryForObject("system.findById", id);
    }

    /**
     * @param id
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<SystemDO> findList(SystemDO systemDO) {
        return (List<SystemDO>) this.getSqlMapClientTemplate().queryForList("system.findList",
                systemDO);
    }

    @Override
    public int delSystemDOByIds(List<Long> idList) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("idList", idList);
        Integer result = (Integer) this.getSqlMapClientTemplate().delete("system.delSystemDOByIds",
                paramMap);
        if (result == null) {
            return 0;
        }

        return result;
    }

    @Override
    public SystemDO findByName(String name) {
        return (SystemDO) this.getSqlMapClientTemplate().queryForObject("system.findByName", name);
    }

}
