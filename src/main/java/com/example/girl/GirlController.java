package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:    wh
 * @since:     5.0
 */
@RestController
@RequestMapping(value = "/girl")
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/findAll")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/save")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return  girlRepository.save(girl);
    }

    @GetMapping(value = "/getOne/{id}")
    public Girl girlGetOne(@PathVariable("id") Integer id){
        System.out.println("id:"+id);
        return girlRepository.getOne(id);
    }

    //@PutMapping(value = "/update/{id}")

    //@DeleteMapping(value = "/delete/{id}")
}
