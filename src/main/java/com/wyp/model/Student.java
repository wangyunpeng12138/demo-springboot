package com.wyp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: Student
 * @Description:
 * @Date: 2022/7/21 20:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component //该类对象的创建和销毁都有spring容器来管理
@ConfigurationProperties(prefix = "student") //读取springboot中的配置内容
public class Student {
    private Integer id;
    private String name;
    private String[] hobby;
    private List<String> lists;
    private Map<String,Object> maps;
    private Set<String> sets;
    private Integer age;
    private Date birth;

}