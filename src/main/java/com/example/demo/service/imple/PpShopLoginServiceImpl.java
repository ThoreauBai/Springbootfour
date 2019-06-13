package com.example.demo.service.imple;

import com.example.demo.bean.PShopUser;
import com.example.demo.domain.bo.CommonBO;
import com.example.demo.service.PpshopLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.PpshopLoginMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class PpShopLoginServiceImpl implements PpshopLoginService {
    @Autowired
    private PpshopLoginMapper PpshopLoginMapper;


    /***
     * 该方法栈溢出因为循环调用了
     * @param pShopUser
     * @return
     */
//    @Override
//    public String login(PShopUser pShopUser) {
//
//        System.out.println(pShopUser.getUsername()+"::::::？？？？？？"+pShopUser.getUserpassword());
//        String  result=  ppshopLoginService.login(pShopUser);
//        return result;
//    }
    @Override
    public PShopUser login(PShopUser pShopUser) {
        List<PShopUser> listps = new ArrayList<PShopUser>();
        System.out.println(pShopUser.getUsername() + "::::::？？？？？？" + pShopUser.getUserpassword());
        PShopUser listps1 = PpshopLoginMapper.login(pShopUser);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!" + listps1);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!" + listps1.getUserstate() + listps1.getUserphone());
        return listps1;
    }

    /***
     * 用户用于登陆的信息
     * @param pShopUser
     * @return
     */
    @Override
    public boolean ReginActivon(PShopUser pShopUser) {

        Boolean result = PpshopLoginMapper.reginaction(pShopUser);
        return result;
    }

    /***
     * 用于用户更新状态的方法 （用户重新输入密码）
     * @param pShopUser
     * @return
     */
    @Override
    public boolean updatareginuser(PShopUser pShopUser) {
        boolean  result=PpshopLoginMapper.updatareginuser(pShopUser);
        return result;
    }


}
