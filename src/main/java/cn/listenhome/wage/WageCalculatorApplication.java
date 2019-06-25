package cn.listenhome.wage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 * @author xu.you
 */
@SpringBootApplication
@MapperScan("cn.listenhome.wage.aut.mapper")
public class WageCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(WageCalculatorApplication.class, args);
        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<-- 佛祖保佑 永不宕机 永无BUG -->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
