package cn.bejwt.sesame.common.config.mybatis.base;

/**
 * describe:基础增删改查功能mapper
 *
 * @author lqs
 * @date 2019/06/04
 */
public interface CrudMapper<T> extends
        InsertMapper<T>,
        DeleteMapper<T>,
        UpdateMapper<T>,
        SelectMapper<T> {
}
