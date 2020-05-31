package com.labcloud.tdddemo.labTdd.dao;

import com.labcloud.tdddemo.utils.RestResult;

public interface IRechargeDao {
    public int addMoney(RestResult opResult, int id, int addMoney);
    public String space();
}
