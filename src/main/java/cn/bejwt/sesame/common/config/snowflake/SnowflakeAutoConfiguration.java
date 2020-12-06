package cn.bejwt.sesame.common.config.snowflake;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * describe:雪花算法工具类的自动装配
 *
 * @author lqs
 * @date 2019/05/22
 */
@Configuration
@ConditionalOnClass(SnowflakeIdWorker.class)
@EnableConfigurationProperties({SnowflakeProperties.class})
public class SnowflakeAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(SnowflakeIdWorker.class)
    public SnowflakeIdWorker snowflakeIdWorker(Environment environment, SnowflakeProperties properties) {
        long workerId = properties.getWorkerId();
        long datacenterId = properties.getDatacenterId();
        String worker = environment.getProperty(SnowflakeUtils.WORKER_PROPERTY_NAME);
        String datacenter = environment.getProperty(SnowflakeUtils.DATACENTER_PROPERTY_NAME);
        if (!this.isEmpty(worker)) {
            workerId = Long.parseLong(worker);
        }
        if (!this.isEmpty(datacenter)) {
            datacenterId = Long.parseLong(datacenter);
        }
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(workerId, datacenterId);
        return snowflakeIdWorker;
    }

    /**
     * [判断字符串是否为null为""]
     *
     * @param str
     * @return boolean true:为null或""
     */
    private boolean isEmpty(String str) {
        return null == str || "".equals(str.trim());
    }
}
