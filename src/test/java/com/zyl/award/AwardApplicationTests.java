package com.zyl.award;

import com.alibaba.fastjson.JSON;
import com.zyl.award.commons.model.po.Node;
import com.zyl.award.sys.entity.po.SysMenu;
import com.zyl.award.sys.service.SysMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardApplicationTests {

    @Autowired
    SysMenuService sysMenuService;
    @Test
    public void contextLoads() {

        Node<SysMenu> sysMenuNode = sysMenuService.selectNodeByParentId(1);
        System.out.println(JSON.toJSONString(sysMenuNode));
    }

}
