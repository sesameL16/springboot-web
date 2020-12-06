package cn.bejwt.sesame.common.config.snowflake;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * describe:雪花算法的参数
 *
 * @author lqs
 * @date 2019/05/22
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "application.snowflake")
public class SnowflakeProperties {

    //工作ID
    private long workerId = 0;
    //数据中心ID
    private long datacenterId = 0;

}
