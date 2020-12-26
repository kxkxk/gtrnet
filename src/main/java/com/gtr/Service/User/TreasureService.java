package com.gtr.Service.User;

import com.gtr.entity.H;

import java.util.List;

public interface TreasureService {
    List<String> getCollection(int Uid);
    List<String> getRelease(int Uid);
    boolean addCollection(int Uid, String Collection);
    boolean addRelease(int Uid,String Release);
    boolean delCollection(int Uid, List<String> Collection);
    boolean delRelease(int Uid, List<String> Release);
}
