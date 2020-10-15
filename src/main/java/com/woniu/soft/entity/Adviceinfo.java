package com.woniu.soft.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 		医嘱详情表
 * </p>
 *
 * @author liming
 * @since 2020-10-12
 */
public class Adviceinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 医嘱id
     */
    private Integer medAdviceId;
    /**
     * 项目id
     */
    private Integer pId;
    /**
     * 0为未执行的具体项目，1表示已执行
     */
    private Integer status;


	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedAdviceId() {
        return medAdviceId;
    }

    public void setMedAdviceId(Integer medAdviceId) {
        this.medAdviceId = medAdviceId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
