package cn.bejwt.sesame.common.config.snowflake;

/**
 * describe:
 *
 * @author lqs
 * @date 2019/05/22
 */
public final class SnowflakeUtils {

    public static final String PROPERTY_NAME_SEPARATOR = ".";

    public static final String SF_PREFIX = "snowflake";

    public static final String WORKER_PROPERTY_NAME = SF_PREFIX + PROPERTY_NAME_SEPARATOR + "worker";

    public static final String DATACENTER_PROPERTY_NAME = SF_PREFIX + PROPERTY_NAME_SEPARATOR + "datacenter";

}
