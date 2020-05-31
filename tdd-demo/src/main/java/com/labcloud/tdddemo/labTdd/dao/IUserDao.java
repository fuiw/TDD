package com.labcloud.tdddemo.labTdd.dao;

import com.labcloud.tdddemo.labTdd.entity.LabUser;
import com.labcloud.tdddemo.utils.RestResult;

import java.util.List;

public interface IUserDao {
    public int addUser(RestResult opResult, LabUser labUser);
    public LabUser getUser(RestResult opResult, int id);
    public List<LabUser> queryLabUsers(RestResult restResult, String condition);
    public int userMoneyUpdate(RestResult restResult, int userId, int money);
    public String space();
}
