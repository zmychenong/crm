package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleClientloss;
import com.sc.spring.service.SaleClientlossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/saleclientloss")   /*控制器类的请求映射url*/
public class SaleClientlossController {

    @Autowired
    SaleClientlossService saleClientlossService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(){
        PageInfo<SaleClientloss> pageInfo = saleClientlossService.selectpage(1, 5, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setiTotalRecords(pageInfo.getList().size());
        r.setiTotalDisplayRecords(pageInfo.getList().size());

        return r;
    }

}
