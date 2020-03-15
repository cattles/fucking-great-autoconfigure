package com.example.fg.service;

import com.example.fg.autoconfigure.FuckingGreatProperties;
import lombok.AllArgsConstructor;

/**
 * @author cattle -  稻草鸟人
 * @date 2020/3/14 下午6:47
 */
@AllArgsConstructor
public class FuckingGreatService {

    FuckingGreatProperties fuckingGreatProperties;

    public String hello() {
        return fuckingGreatProperties.getName();
    }

}
