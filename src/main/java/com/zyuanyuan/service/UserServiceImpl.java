package com.zyuanyuan.service;

import org.n3r.idworker.Sid;
import com.zyuanyuan.mapper.UsersMapper;
import com.zyuanyuan.pojo.Users;
import com.zyuanyuan.pojo.UsersReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper userMapper;

    @Autowired
    private Sid sid;


    @Transactional(propagation = Propagation.SUPPORTS) /*如果其他bean调用这个方法,在其他bean中声明事务,那就用事务.如果其他bean没有声明事务,那就不用事务.*/
    @Override
    public boolean queryUsernameIsExist(String username) {

        Users user = new Users();
        user.setUsername(username);

        Users result = userMapper.selectOne(user);

        return result == null ? false : true;
    }

    @Transactional(propagation = Propagation.REQUIRED)  /*如果有事务, 那么加入事务, 没有的话新建一个(默认情况下)*/
    @Override
    public void saveUser(Users user) {
        String userId = sid.nextShort();
        user.setId(userId);
        userMapper.insert(user);

    }

    @Override
    public Users queryUserForLogin(String username, String password) {
        return null;
    }

    @Override
    public void updateUserInfo(Users user) {

    }

    @Override
    public Users queryUserInfo(String userId) {
        return null;
    }

    @Override
    public boolean isUserLikeVideo(String userId, String videoId) {
        return false;
    }

    @Override
    public void saveUserFanRelation(String userId, String fanId) {

    }

    @Override
    public void deleteUserFanRelation(String userId, String fanId) {

    }

    @Override
    public boolean queryIfFollow(String userId, String fanId) {
        return false;
    }

    @Override
    public void reportUser(UsersReport userReport) {

    }
}
