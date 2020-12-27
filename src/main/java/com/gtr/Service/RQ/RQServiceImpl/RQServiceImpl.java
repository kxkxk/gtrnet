package com.gtr.Service.RQ.RQServiceImpl;

import com.gtr.Mapper.RQMapper;
import com.gtr.Service.RQ.RQService;
import com.gtr.entity.RQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RQServiceImpl implements RQService {
    @Autowired
    RQMapper rqMapper;
    @Override
    public RQ findRQ(int RQid) {
        return rqMapper.findRQById(RQid);
    }
}
