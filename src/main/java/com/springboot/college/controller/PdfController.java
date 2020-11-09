package com.springboot.college.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/6/24 10:53
 * @Created by zhuozuoying
 */
@RestController
@RequestMapping("/pdf")
public class PdfController {

    @PostMapping("/pdfCreate")
    public void getPdf(){
    }
}
