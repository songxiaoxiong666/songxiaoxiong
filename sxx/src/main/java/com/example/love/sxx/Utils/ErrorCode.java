package com.example.love.sxx.Utils;

public enum ErrorCode {
	
	/**
	 * 成功
	 */
	SYS_SUCCESS("0","成功"),
	/**
	 * 失败
	 */
	SYS_FAIL("-1","失败"),
	
	/**
	 * 0001-入参为空
	 */
	PARAM_IN_PARAMETER_IS_NULL("0001","入参为空"),
	/**
	 * 0002-脏数据
	 */
	PARAM_DIRTY_DATA("0002","脏数据"),
	/**
	 * 0003-入参列表中有重复数据
	 */
	PARAM_IN_PARAMETER_LIST_HAVE_REPEAT_DATA("0003","入参列表中有重复数据"),
	/**
	 * 0004-入参无效
	 */
	PARAM_IN_PARAMETER_IS_INVALIDITY("0004","入参无效"),
	/**
	 * 0005-重复操作
	 */
	REPEAT_EXECUTE("0005","重复操作"),
	/**
	 * 0006-入参数据缺失
	 */
	PARAM_IN_PARAMETER_IS_MISS("0006","入参数据缺失"),
	/**
	 * 990001-数据库重复写入
	 */
	DATABASE_REPEAT_INSERT("990001","数据库重复写入"),
	/**
	 * 提取人员特征值失败
	 */
	FACE_IDENTITY_GET_STAFF_EIGENVALUE_FAIL("0001", "提取人员特征值失败"),
	/**
	 * 图片中没有找到到人员
	 */
	FACE_IDENTITY_MATCH_FAIL("0002", "图片中没有找到到人员"),
	/**
	 * 上传图片采集人脸特征数据失败
	 */
	FACE_IDENTITY_UPLOAD_FACE_PHOTO_DATA_FAIL("0003", "上传图片采集人脸特征数据失败"),
	/**
	 * 上传图片没有识别到人员，至少需要有一个人
	 */
	FACE_IDENTITY_CANNOT_IDENTIFY_PERSON("0004", "上传图片没有识别到人员，至少需要有一个人"),
	/**
	 * 未找到要删除的登记人员
	 */
	FACE_IDENTITY_CANNOT_HIT_DELETE_PERSON("0005", "未找到要删除的登记人员"),
	/**
	 * 非系统登记的人员
	 */
	FACE_IDENTITY_UNRECORDED_PERSON("0006", "非系统登记的人员"),
	/**
	 * 数据库插入失败
	 */
	DB_INSERT_ERROR("2201", "数据库插入失败"),
	/**
	 * 数据库更新失败
	 */
	DB_UPDATE_ERROR("2202", "数据库更新失败"),
	
	/**
	 * 000101-家属会见-会见人与被会见人未绑定社会关系
	 */
	FAMILY_MEETING_RELATION_UNBIND("000101","会见人与被会见人未绑定社会关系"),
	/**
	 * 在押人员绑定社会关系数量超过上限
	 */
	CRIMINAL_SOCIAL_RELATION_BIND_OUT_OF_LIMIT( "000102", "在押人员绑定社会关系数量超过上限" ),
	/**
	 * 该问题在数据库不存在任何的选项
	 */
	QUESTIONNAIRE_UPDATE_OPTION_ERROR_DB_NOT_EXIST_ANY_OPTION("000103","错误的题目"),
	/**
	 * 警情预案模板错误
	 */
	ALARM_PLAN_TEMPLATE_MISS("000104","警情预案模板错误"),
	/**
	 * 预案创建失败-已存在同类型预案
	 */
	ALARM_PLAN_EXIST_SAME_TYPE_PLAN("000105","已存在同类型预案"),
	/**
	 * 创建警情预案详情失败-错误的环节类型
	 */
	ALARM_PLAN_CREATE_ERROR_LINK_TYPE_ERROR("000106","错误的环节类型"),
    /**
     * 创建警情预案详情失败-错误的岗位类型
     */
    ALARM_PLAN_CREATE_ERROR_POST_TYPE_ERROR("000107","错误的岗位类型"),
	/**
	 * 警情不存在或非1，2级警情
	 */
	ALARM_DOES_NOT_EXIST_OR_NOT_SATISFY_REQUEST("000108","警情不存在或非1，2级警情"),
	/**
	 * 警情id不存在
	 */
	ALARM_DOES_NOT_EXIST("000109","警情不存在"),
	/**
	 * 领导已审批，无法修改
	 */
	ALARM_LEADER_DISPOSE_YET("000110","领导已审批，无法修改"),
	/**
	 * 民警尚未处理，无法审批
	 */
	ALARM_POLICE_NOT_DISPOSE_YET("000111","民警尚未处理，无法审批"),
    /**
     * 领导没填写意见
     */
    ALARM_LEADER_ADVICE_DO_NOT_FILL_IN("000112","请您填写处理意见"),
	/**
	 * 医生尚未处理，无法审批
	 */
	ALARM_DOCTOR_NOT_DISPOSE_YET("000113","医生尚未处理，无法审批"),
	/**
	 * 警情未处理或已完结，无法更新状态
	 */
	ALARM_NOT_DISPOSE_OR_FINISHED("000114","警情未处理或已完结，无法更新状态"),
	/**
	 * 打印失败-无该警情
	 */
	ALARM_PRINT_ERROR_NOT_EXIST_THIS_ALARM("000115","打印失败-无该警情"),
	/**
	 * 人员不存在
	 */
	PERSON_NO_ERROR_NOT_EXIST("000116","人员不存在"),
	;
	
	private String code;
	private String msg;
	
	ErrorCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
