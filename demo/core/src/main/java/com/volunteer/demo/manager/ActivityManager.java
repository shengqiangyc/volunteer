/**
 * AllrightsReserved,DesignedBywww.maihaoche.com
 * Package com.volunteer.demo.manager
 * author: shengqiang (shengqiang@maihaoche.com)
 * date:  2018/2/26下午9:13
 * Copyright:2017-2018www.maihaoche.comInc.Allrightsreserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.volunteer.demo.manager;

import com.volunteer.demo.DO.YcActivity;
import com.volunteer.demo.vo.IndexActivityVO;

import java.util.List;

/**
 * Description: 活动相关接口
 * author: shengqiang (shengqiang@maihaoche.com)
 * date: 2018/2/26下午9:13
 * sinceV1.0
 */
public interface ActivityManager {

    List<IndexActivityVO> getIndexActivity();
}
