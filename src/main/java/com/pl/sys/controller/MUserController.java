package com.pl.sys.controller;


import com.pl.sys.entity.MUser;
import com.pl.sys.service.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pengl
 * @since 2020-06-16
 */
@RestController
@RequestMapping("/m-user")
public class MUserController extends BaseController {

    @Autowired
    MUserService mUserService;

    @RequestMapping("getBy1")
    public void getBy1() {
        MUser user = mUserService.getById(1L);
        System.out.println(user.toString());
    }

}
