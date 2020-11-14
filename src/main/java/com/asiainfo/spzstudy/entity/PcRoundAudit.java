package com.asiainfo.spzstudy.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 绕行审计结果表
 * </p>
 *
 * @author Spz
 * @since 2020-11-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PC_ROUND_AUDIT")
public class PcRoundAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableField("PCRA_ID")
    @TableId(type = IdType.ID_WORKER)
    private String pcraId;

    /**
     * 客户端IP
     */
    @TableField("CLIENT_IP")
    private String clientIp;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private String createTime;

    /**
     * 终端
     */
    @TableField("TERMINAL")
    private String terminal;

    /**
     * 登录时间
     */
    @TableField("LOGIN_TIME")
    private String loginTime;

    /**
     * 登出时间
     */
    @TableField("LOGOUT_TIME")
    private String logoutTime;

    /**
     * 会话时间
     */
    @TableField("DURATION")
    private String duration;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 用户
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * 主机IP
     */
    @TableField("HOST_IP")
    private String hostIp;

    @TableField("DOUBT_TYPE")
    private String doubtType;


}
