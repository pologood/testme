package com.alibaba.testme.service;

import java.util.List;

import com.alibaba.testme.domain.dataobject.TestunitFlowCaseDO;

/**
 * TestunitFlowCase Service Interface
 * 
 * @author xiaopenzi
 */
public interface TestunitFlowCaseService {

    /**
     * @param testunitFlowCaseDO
     * @return
     */
    public int addTestunitFlowCaseDO(TestunitFlowCaseDO testunitFlowCaseDO);

    /**
     * @param DO
     * @return
     */
    public int updateTestunitFlowCaseDO(TestunitFlowCaseDO testunitFlowCaseDO);

    /**
     * @param id
     * @return
     */
    public int deleteTestunitFlowCaseDO(Integer id);

    /**
     * @param id
     * @return
     */
    public TestunitFlowCaseDO findById(Integer id);

    /**
     * @param id
     * @return
     */
    public List<TestunitFlowCaseDO> findList(TestunitFlowCaseDO testunitFlowCaseDO);

}
