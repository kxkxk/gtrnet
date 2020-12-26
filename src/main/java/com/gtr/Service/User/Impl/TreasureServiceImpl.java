package com.gtr.Service.User.Impl;

import com.gtr.Mapper.UserMapper;
import com.gtr.Service.User.TreasureService;
import com.gtr.entity.H;
import com.gtr.tools.longStringDeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TreasureServiceImpl implements TreasureService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    longStringDeal lsd;
    @Override
    public List<String> getCollection(int Uid) {
        String initRes = userMapper.findCollectionById(Uid);
        List<String> res = lsd.imageSplit(initRes);
        res.remove(0);
        return res;
    }

    @Override
    public List<String> getRelease(int Uid) {
        String initRes = userMapper.findReleaseById(Uid);
        List<String> res = lsd.imageSplit(initRes);
        res.remove(0);
        return res;
    }

    @Override
    public boolean addCollection(int Uid, String Collection) {
        Collection = "|" + Collection;
            return userMapper.updateUserCollection(Uid,Collection) > 0;
    }

    @Override
    public boolean addRelease(int Uid, String Release) {
        Release = "|" + Release;
        return userMapper.updateUserRelease(Uid,Release) > 0;
    }

    @Override
    public boolean delCollection(int Uid, List<String> Collection) {
        String initRes = userMapper.findReleaseById(Uid);
        List<String> res = lsd.imageSplit(initRes);
        res.remove(0);
        for (String i : Collection) {
            res.remove(i);
        }
        String Collections = "";
        for(String i : res) {
            i = "|" + i;
            Collections = Collections + i;
        }
        return userMapper.deleteUserCollection(1,"st"+Collections) > 0;
    }

    @Override
    public boolean delRelease(int Uid, List<String> Release) {
        String initRes = userMapper.findReleaseById(Uid);
        List<String> res = lsd.imageSplit(initRes);
        res.remove(0);
        for (String i : Release) {
            res.remove(i);
        }
        String Releases = "";
        for (String i : res) {
            i = "|" + i;
            Releases = Releases + i;
        }
        return userMapper.deleteUserRelease(1,"st"+Releases) > 0;
    }
}
