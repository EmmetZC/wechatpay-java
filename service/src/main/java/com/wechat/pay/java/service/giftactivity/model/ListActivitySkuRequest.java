// Copyright 2021 Tencent Inc. All rights reserved.
//
// 支付有礼活动对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.1.2

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.giftactivity.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** ListActivitySkuRequest */
public class ListActivitySkuRequest {
  /** 活动Id 说明：活动Id */
  @SerializedName("activity_id")
  @Expose(serialize = false)
  private String activityId;
  /** 分页页码 说明：分页页码 */
  @SerializedName("offset")
  @Expose(serialize = false)
  private Long offset;
  /** 分页大小 说明：分页大小 */
  @SerializedName("limit")
  @Expose(serialize = false)
  private Long limit;

  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListActivitySkuRequest {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}