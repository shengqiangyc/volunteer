/**
 * AllrightsReserved,DesignedBywww.maihaoche.com
 * Package com.volunteer.demo.enums
 * author: shengqiang (shengqiang@maihaoche.com)
 * date:  2018/3/5下午5:13
 * Copyright:2017-2018www.maihaoche.comInc.Allrightsreserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.volunteer.demo.enums;

/**
 * Description: 申请加入团队状态
 * author: shengqiang (shengqiang@maihaoche.com)
 * date: 2018/3/5下午5:13
 * sinceV1.0
 */
public enum ApplyStatusEnum {

    CHECKING(1, "待审核"),
    AGREED(2, "已同意"),
    REFUSED(3,"已拒绝"),
    CANCELED(-1,"已取消");

    private Integer code;
    private String msg;

    ApplyStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsgByCode(Integer code) {
        ApplyStatusEnum[] statusArray = values();
        for (ApplyStatusEnum status : statusArray) {
            if (status.code.equals(code)) {
                return status.getMsg();
            }
        }
        return null;
    }
}
