package com.gtr.Service.RQ;

import com.gtr.entity.RQ;

import java.util.List;

public interface RQService {
    RQ findRQ(int RQid);
    List<String> getRQImg(RQ rq);
    boolean insertRQImg(int RQid, String url);
}
