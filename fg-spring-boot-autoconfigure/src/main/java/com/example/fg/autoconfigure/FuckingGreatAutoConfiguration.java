package com.example.fg.autoconfigure;

import com.example.fg.service.FuckingGreatService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author cattle -  稻草鸟人
 * @date 2020/3/14 下午6:24
 */
@EnableConfigurationProperties(FuckingGreatProperties.class)
public class FuckingGreatAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public FuckingGreatService fuckingGreatService(FuckingGreatProperties fuckingGreatProperties) {
        return new FuckingGreatService(fuckingGreatProperties);
    }
}
