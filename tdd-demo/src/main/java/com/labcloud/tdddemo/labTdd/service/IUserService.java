package com.labcloud.tdddemo.labTdd.service;

import com.labcloud.tdddemo.labTdd.entity.LabUser;
import com.labcloud.tdddemo.utils.RestResult;

import java.util.List;

public interface IUserService {

    /**
     * 新增用户
     * @param opResult
     * @param labUser
     * @return
     */
    public int addUser(RestResult opResult, LabUser labUser);

    /**
     * 查询用户
     * @param opResult
     * @param id
     * @return
     */
    public LabUser getUser(RestResult opResult, int id);

    public List<LabUser> queryLabUsers(RestResult restResult, String condition);
}
