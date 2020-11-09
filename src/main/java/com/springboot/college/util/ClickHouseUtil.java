package com.springboot.college.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**数据库连接工具
 * @Description TODO
 * @Date 2020/4/17 17:46
 * @Created by zhuozuoying
 */
@Slf4j
@Component
@Data
@ConfigurationProperties(prefix = "spring.datasource.clickhouse")
public class ClickHouseUtil {

    private String driverClassName ;
    private String url ;
    private Integer initialSize ;
    private Integer maxActive ;
    private Integer minIdle ;
    private Integer maxWait ;

    /*private static String clickhouseAddress;

    private static String clickhouseUsername;

    private static String clickhousePassword;

    private static String clickhouseDB;

    private static Integer clickhouseSocketTimeout;

    @Value("${clickhouse.address}")
    public  void setClickhouseAddress(String address) {
        ClickHouseUtil.clickhouseAddress = address;
    }
    @Value("${clickhouse.username}")
    public  void setClickhouseUsername(String username) {
        ClickHouseUtil.clickhouseUsername = username;
    }
    @Value("${clickhouse.password}")
    public  void setClickhousePassword(String password) {
        ClickHouseUtil.clickhousePassword = password;
    }
    @Value("${clickhouse.db}")
    public  void setClickhouseDB(String db) {
        ClickHouseUtil.clickhouseDB = db;
    }
    @Value("${clickhouse.socketTimeout}")
    public  void setClickhouseSocketTimeout(Integer socketTimeout) {
        ClickHouseUtil.clickhouseSocketTimeout = socketTimeout;
    }


    public static Connection getConn() {

        ClickHouseConnection conn = null;
        ClickHouseProperties properties = new ClickHouseProperties();
        properties.setUser(clickhouseUsername);
        properties.setPassword(clickhousePassword);
        properties.setDatabase(clickhouseDB);
        properties.setSocketTimeout(clickhouseSocketTimeout);
        ClickHouseDataSource clickHouseDataSource = new ClickHouseDataSource(clickhouseAddress,properties);
        try {
            conn = clickHouseDataSource.getConnection();
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<JSONObject> exeSql(String sql){
        log.info("cliockhouse 执行sql：" + sql);
        Connection connection = getConn();
        try {
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsmd = results.getMetaData();
            List<JSONObject> list = new ArrayList();
            while(results.next()){
                JSONObject row = new JSONObject();
                for(int i = 1;i<=rsmd.getColumnCount();i++){
                    row.put(rsmd.getColumnName(i),results.getString(rsmd.getColumnName(i)));
                }
                list.add(row);
            }

            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }*/

}
