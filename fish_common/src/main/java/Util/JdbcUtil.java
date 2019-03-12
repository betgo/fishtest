package Util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;

/**
 * @Description //TODO
 * @Date 2019/3/10 16:55
 * @Author wxx
 **/
public class JdbcUtil {

        static ComboPooledDataSource dataSource_ora;
        static ComboPooledDataSource dataSource_gp;
        static ComboPooledDataSource dataSource_gp_test;

        static {
            try {
                //设置连接池大小
                dataSource_ora = new ComboPooledDataSource();
                dataSource_ora.setInitialPoolSize(20);
                dataSource_ora.setMinPoolSize(10);
                dataSource_ora.setMaxPoolSize(50);

                dataSource_ora.setUser("username");
                dataSource_ora.setPassword("password");
                dataSource_ora.setDriverClass("com.mysql.jdbc.Driver");
                dataSource_ora.setJdbcUrl("jdbc:mysql://192.168.42.129:3306/fish?useUnicode=true&amp;characterEncoding=UTF8");

            } catch (PropertyVetoException e) {
                e.printStackTrace();
            }
        }

    public static ComboPooledDataSource getDataSource_ora() {
        return dataSource_ora;
    }

    public static void setDataSource_ora(ComboPooledDataSource dataSource_ora) {
        JdbcUtil.dataSource_ora = dataSource_ora;
    }
}
