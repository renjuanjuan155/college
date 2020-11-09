package com.springboot.college.service;

import com.springboot.college.mapper.ImgsInfoMapper;
import com.springboot.college.model.ImgsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Date 2020/3/25 14:53
 * @Created by renjuanjuan
 */
@Service
public class UploadFileService {

    @Autowired
    private ImgsInfoMapper imgsInfoMapper;

    public int save(ImgsInfo imgsInfo){
        return imgsInfoMapper.save(imgsInfo);
    }



}
