package com.zbkj.crmeb.store.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;

/**
 * 推广列表参数
 * +----------------------------------------------------------------------
 * | CRMEB [ CRMEB赋能开发者，助力企业发展 ]
 * +----------------------------------------------------------------------
 * | Copyright (c) 2016~2020 https://www.crmeb.com All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed CRMEB并不是自由软件，未经许可不能去掉CRMEB相关版权
 * +----------------------------------------------------------------------
 * | Author: CRMEB Team <admin@crmeb.com>
 * +----------------------------------------------------------------------
 */
@Data
@ApiModel(value = "RetailShopStairUserRequest对象", description = "推广等级参数")
public class RetailShopStairUserRequest {

    @ApiModelProperty(value = "搜索关键字")
    private String nickName;

    @ApiModelProperty(value = "时间参数 today,yesterday,lately7,lately30,month,year,/yyyy-MM-dd hh:mm:ss,yyyy-MM-dd hh:mm:ss/")
    private String dateLimit;

    // 类型 mull = 全部 1=一级推广人 2=二级推广人
    @ApiModelProperty(value = "类型 null = 全部 1=一级推广人 2=二级推广人")
    private Integer type;

    // 推广订单中的参数，公用对象
    @ApiModelProperty()
    private String orderPriceId;

    @ApiModelProperty(value = "用户id")
    @Min(value = 1, message = "用户id不能为空")
    private Integer uid;
}
