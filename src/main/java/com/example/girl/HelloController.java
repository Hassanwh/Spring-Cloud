package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:    wh
 * @since:     5.0
 */
@RestController
public class HelloController {

   /**
     *@Value("${cupSize}")//获取配置文件中定义的值
     *private String cupSize;
     */

   @Autowired
   private GirlProperties girlProperties;


    /**
     * @GetMapping 等于 method = RequestMethod.GET
     * @PostMapping 等于 method = RequestMethod.POST
     * 要写上请求方式 应对与不同场景 不同业务
     * @return
     */
   @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return girlProperties.getEnvironment()+":::"+girlProperties.getAge();
    }

    /**
     * 要写上请求方式 应对与不同场景 不同业务
     * 请求路径：http://localhost:8080/say/100
     * @param id
     * @return
     */
   @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "id:" + id;
    }

    /**
     * 要写上请求方式 应对与不同场景 不同业务
     * 请求路径：http://localhost:8080/say1?id=100
     * @param id
     * @return
     */
    @RequestMapping(value = "/say1",method = RequestMethod.GET)
    public String say1(@RequestParam("id") Integer id){
        return "id:" + id;
    }

    /**
     * 要写上请求方式 应对与不同场景 不同业务
     * required:是否必传 defaultValue:默认值 请求路径：http://localhost:8080/say1?id=100 // http://localhost:8080/say1
     * @param id
     * @return
     */
    @RequestMapping(value = "/say2",method = RequestMethod.GET)
    public String say2(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id:" + id;
    }
}
