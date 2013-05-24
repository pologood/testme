package com.alibaba.testme.service;

import java.util.List;

import com.alibaba.testme.domain.dataobject.TestunitFlowDetailDO;

/**
 * TestunitFlowDetail Service Interface
 * 
 * @author xiaopenzi
 */
public interface TestunitFlowDetailService {

    /**
     * @param testunitFlowDetailDO
     * @return
     */
    public int addTestunitFlowDetailDO(TestunitFlowDetailDO testunitFlowDetailDO);

    /**
     * @param DO
     * @return
     */
    public int updateTestunitFlowDetailDO(TestunitFlowDetailDO testunitFlowDetailDO);

    /**
     * @param id
     * @return
     */
    public int deleteTestunitFlowDetailDO(Integer id);

    /**
     * @param id
     * @return
     */
    public TestunitFlowDetailDO findById(Integer id);

    /**
     * @param id
     * @return
     */
    public List<TestunitFlowDetailDO> findList(TestunitFlowDetailDO testunitFlowDetailDO);

}
