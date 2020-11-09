package com.springboot.college.props;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2020/4/17 11:51
 * @Created by zhuozuoying
 */
@ToString
@Component
@Configuration
@ConfigurationProperties(prefix = "database")
public class DatabaseProps {

    @Value("${database.def-database-id:mysql}")
    private String defDatabaseId;

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    private Map<String, String> mysql;
    private Map<String, String> mssql;
    public String getDefDatabaseId() {
        return defDatabaseId;
    }

    public void setDefDatabaseId(String defDatabaseId) {
        this.defDatabaseId = defDatabaseId;
    }

    public String getDriverClassName() {
        return getValue("driver-class-name");
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return getValue("url");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return getValue("username");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return getValue("password");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getMysql() {
        return mysql;
    }

    public void setMysql(Map<String, String> mysql) {
        this.mysql = mysql;
    }

    public Map<String, String> getMssql() {
        return mssql;
    }

    public void setMssql(Map<String, String> mssql) {
        this.mssql = mssql;
    }
    private String getValue(String key) {
        Map<String, String> map = new HashMap<>();
        if (defDatabaseId.equals("mysql")) {
            map = mysql;
        }
        if (map == null) {
            return "";
        }
        return map.get(key);
    }
}
