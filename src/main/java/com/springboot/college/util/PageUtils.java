package com.springboot.college.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**分页工具类
 * @Description
 * @Date 2020/3/27 17:11
 * @Created by renjuanjuan
 */
@Data
public class PageUtils implements Serializable {
    private static final long serialVersionUID = 1L;
    //每页数目限制
    private int limit;
    //当前页
    private int currentPage;
    //总记录数
    private int totalCount;
    //所有列表
    private List<?> list;
    //总页数
    private int totalPage;

    /**
     * 分页
     * @param limit 每页记录数
     * @param currentPage 当前页数
     * @param totalCount 总记录数
     * @param list 列表数据
     */
    public PageUtils(int limit, int currentPage, int totalCount, List<?> list) {
        this.limit = limit;
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.list = list;
        this.totalPage = (int) Math.ceil((double) totalCount / limit);
    }
}
