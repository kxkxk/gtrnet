package com.gtr.Service.RQ.RQServiceImpl;

import com.gtr.Mapper.RQMapper;
import com.gtr.Service.RQ.RQService;
import com.gtr.entity.RQ;
import com.gtr.tools.longStringDeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RQServiceImpl implements RQService {
    @Autowired
    RQMapper rqMapper;
    @Autowired
    longStringDeal longStringDeal;
    @Override
    public RQ findRQ(int RQid) {
        return rqMapper.findRQById(RQid);
    }

    @Override
    public List<String> getRQImg(RQ rq) {
        return longStringDeal.imageSplit(rq.getRQimage());
    }

    @Override
    public boolean insertRQImg(int RQid, String url) {
        url = "|" + url;
        return rqMapper.updateImg(RQid, url) > 0;
    }

    @Override
    public boolean newRq(RQ rq) {
        return rqMapper.insertRQ(rq) > 0;
    }

}
