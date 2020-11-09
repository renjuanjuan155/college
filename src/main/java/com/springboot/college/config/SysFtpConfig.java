package com.springboot.college.config;

import com.springboot.college.model.base.AutoId;
import lombok.Data;

import java.util.Date;

/**FTP配置表
 * @Description
 * @Date 2020/3/25 15:17
 * @Created by renjuanjuan
 */
@Data
public class SysFtpConfig extends AutoId {

    //用户名
    private String username;
    //密码
    private String password;
    //地址
    private String host;
    //端口
    private Integer port;
    private Integer connecttime;

    private String rootpath;

    private String origin;

    //0启用，1禁用
    protected Long disabled;
    //备注说明
    protected String remark = null;
    //创建者
    protected Long creater = null;
    //创建时间
    protected Date createTime = null;
    //修改者
    protected Long modifier = null;
    //修改时间
    protected Date modifyTime = null;
    //版本号
    protected Long version;
}
