package com.labcloud.tdddemo.labTdd.service;

import com.labcloud.tdddemo.utils.RestResult;

public interface IConsumeService {

    /**
     * 购买商品
     * @param opResult
     * @param id
     * @param useMoney
     * @param goodName
     * @return
     */
    public int buyGood(RestResult opResult, int id, int useMoney, String goodName);
}
