package com.gtr.Service.User;

import java.util.List;

public interface TreasureService {
    List<Integer> getCollection(int Uid);
    List<Integer> getRelease(int Uid);
}
