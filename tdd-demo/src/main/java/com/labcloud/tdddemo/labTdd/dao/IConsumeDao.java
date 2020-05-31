package com.labcloud.tdddemo.labTdd.dao;

import com.labcloud.tdddemo.utils.RestResult;

public interface IConsumeDao {
    public int buyGood(RestResult opResult, int id, int useMoney, String goodName);
    public String space();
}
