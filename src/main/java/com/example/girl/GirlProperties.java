package com.example.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author:    wh
 * @since:     5.0
 * @Component   泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
 * @ConfigurationProperties(prefix = "girl")  把同类的配置信息自动封装成实体类
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String environment;

    private Integer age;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
