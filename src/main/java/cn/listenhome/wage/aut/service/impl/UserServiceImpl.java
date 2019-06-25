package cn.listenhome.wage.aut.service.impl;

import cn.listenhome.wage.aut.entity.User;
import cn.listenhome.wage.aut.mapper.UserMapper;
import cn.listenhome.wage.aut.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xu.you
 * @since 2019-03-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
