package com.example.fg.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author cattle -  稻草鸟人
 * @date 2020/3/14 下午6:40
 */
@Data
@ConfigurationProperties(prefix = "com.example.fg")
public class FuckingGreatProperties {

    /**
     * input your name
     */
    private String name;


}
