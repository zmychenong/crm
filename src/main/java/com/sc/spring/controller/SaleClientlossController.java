package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.R;
import com.sc.spring.entity.Result;
import com.sc.spring.entity.SaleClientloss;
import com.sc.spring.service.SaleClientlossService;
import com.sun.deploy.panel.ITreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.SortedSet;

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
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SaleClientloss> pageInfo = saleClientlossService.selectpage(iDisplayStart, iDisplayLength, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(14);
        r.setRecordsFiltered(14);


        return r;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SaleClientloss saleClientloss) {
        System.out.println("----"+saleClientloss);
        if(saleClientloss!=null&&saleClientloss.getLossnum()!=null){
            this.saleClientlossService.update(saleClientloss);
            return new R(200,"修改成功！");
        }else {
            this.saleClientlossService.add(saleClientloss);
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(BigDecimal lossnum) {
        System.out.println("--=======--"+lossnum);
        this.saleClientlossService.del(lossnum);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SaleClientloss get(BigDecimal lossnum) {
        System.out.println("--=======--"+lossnum);
        return this.saleClientlossService.get(lossnum);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                BigDecimal lossnum=new BigDecimal(s[i]);
                this.saleClientlossService.del(lossnum);
            }
        }

        return new R(200,"删除成功！");
    }
}
