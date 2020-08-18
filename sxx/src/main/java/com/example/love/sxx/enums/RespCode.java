package com.example.love.sxx.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RespCode {
    /**
     * 常见错误信息
     */

    SUCCESS("0", "操作成功"),
    INSERT_SUCCESS("0", "添加成功"),
    DELETE_SUCCESS("0", "删除成功"),
    UPDATE_SUCCESS("0", "修改成功"),
    FAIL("1", "操作失败"),
    PARAMS_ERROR("2", "参数错误"),
    PARAMS_VALUE_ERROR("3", "请求参数值不合法"),
    PERSON_NUMBER_ERROR("10", "当前规则选择人数超过符合规则总人数, 请重新输入"),
    SYSTEM_ERROR("4", "系统异常"),
    INADEQUATE_PERMISSION("5", "权限不足"),
    PARAMS_VALUE_EMPTY("6", "参数为空"),
    DATA_REPEAT_ERROR("7", "数据重复, 禁止添加！"),
    DO_NOT_REPEAT_THE_EVALUATION("8", "请勿重复评优！"),
    INFORMATION_DOES_NOT_EXIST("9", "业务信息不存在"),
    QUERY_INFO_NOT_EXISTS("10", "记录不存在"),
    SELECT_OUT_OF_RANGE("11", "选择超过限制数量"),
    INIT_ERROR("12", "初始化失败"),
    NAME_REPEAT_ERROR("13", "名称重复"),
    TIME_CONFLICT_ERROR("14", "时间冲突"),
    CHOOSE_TIME_ERROR("20", "时间选择错误"),
    FILTER_RULE("31","该警情已经被过滤，请确认过滤规则!"),
    CREATE_DIR_ERROR("00100", "路径创建失败"),
    UPLOAD_EXCEL_ERROR("00200", "文件格式错误，请上传EXCEL文件！"),
    ID_CARD_ERROR("00300", "身份证号错误，请输入有效身份证号！"),
    RISK_OFFICER_ERROR("01000", "人员业务信息不存在！"),
    RISK_PROJECT_NOT_EMPTY("01101", "风险项不为空！"),
    DELETE_DEVICE_INFO_ERROR("02001", "删除设备信息失败！"),
    MONEY_PASS_BALANCE("04001", "当前购买金额已超出账户余额 请进行商品筛选后再进行支付"),
    DELETE_DIGITAL_HOUSE_SC_ERROR("03001", "仍有菜谱在使用该食材，无法删除！"),

    POLICE_RECORD_INFO_ERROR("01002", "当前警员信息不存在！"),
    DATA_ABNORMAL("11", "数据异常, 当前数据无法操作"),
    REPEAT_ERROR("10024", "请勿重复申请"),
    LINE_UP_EMPTY("1025", "暂无排队业务！"),


    INSERT_DEVICE_INFO_ERROR("02002", "添加设备信息失败!"),
    UPDATE_DEVICE_INFO_ERROR("02003", "修改设备信息失败!"),
    INSERT_EXIT_QUESTION_ERROR("02004", "添加答题结果失败!"),
    QUESTION_NUM_ANSWER_ERROR("02005", "题目数量与答题结果不符!"),

    DATA_DELETE_ERROR("03001", "必须清空此药品库存数量才能删除"),
    OUT_OF_STOCK_FAILED("03002", "出库失败, 出库药品大于库存数量"),
    DRUG_HAS_BEEN_RECALLED("03003","药品已被召回,无法修改"),

    GROUP_ADD_ERROR_NOT_ALLOWED_NAME("04001", "该名称不允许使用"),
    GROUP_EXECUTE_ERROR_NOT_ALLOWED_TO_DELETE("04002", "该组无法被删除"),
    GROUP_EXECUTE_ERROR_NOT_ALLOWED_TO_UPDATE("04003", "该组无法被更新"),
    POLICE_NOT_HAVE_PRISON_ROOM_CONTROL_PERMISSION("05001", "该民警无管理的监室"),

    INSERT_ERROR("10001", "添加失败"),
    DELETE_ERROR("10002", "删除失败"),
    UPDATE_ERROR("10003", "修改失败"),

    CHECK_FACE_ERROR("10005", "照片中提取不到人脸!"),
    CHECK_PEOPLE_ERROR("10006", "校验失败或查无此人!"),
    ID_CODE_PRINTING_ERROR("10007", "身份识别码打印失败!"),
    QUERY_TIME_ASTRICT("10008", "一个身份证号一日只能查询3次!"),
    PRINTING_QUEUED_TICKET_FAILED("10008", "打印排队小票失败!"),
    IDCARD_VERIFY_ERROR("10009", "身份验证失败,请确认是否完成录入!"),
    MEET_LAWYER_VERIFY_EERROR("10010", "请移步前台办理!"),
    ACCOMPLICE("10011", "同案人员不予会见!"),
    DETAINEES_NO("10012", "非在押人员!"),
    LOCK_NO("10013", "不是正常关押人员!"),
    INSIDE_STATUS("10014", "所内状态不予会见,正在会见等!"),

    OUT_BASE_SCORE("21010", "规范加分累计不得超过20分!"),
    OUT_DAILY_SCORE("21011", "学习训练加分累计不得超过15分!"),
    OUT_SPECIAL_SCORE("21012", "生活卫生加分累计不得超过15分!"),

    OUT_XWWG_SCORE("21010", "基础加分中规范加分累计不得超过40分!"),
    OUT_XXXL_SCORE("21011", "基础加分中学习训练加分累计不得超过30分!"),
    OUT_SHWS_SCORE("21012", "基础加分中生活卫生加分累计不得超过30分!"),

    CHECK_REPEAT_FAMILY("10000", "该人员正在家属会见，请勿重复登记！"),
    CHECK_REPEAT_MEDICAL("10000", "该人员正在所外就医，请勿重复登记！"),
    CHECK_REPEAT_ADJOURN("10000", "该人员正在被提押，请勿重复登记！"),
    DATA_NULL("201", "该人员暂无业务信息！"),
    OUT_NUMBER("999", "超出当日最大添加数量！"),

    ;


    private String code;
    private String msg;

    RespCode(final String code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



   // @Override
    public String getValue() {
        return code;
    }

    public String getValue(String msg) {
        for (RespCode e : RespCode.values()) {
            if ( e.msg.equals(msg)) {
                return e.code;
            }
        }
        return null;
    }

    @JsonValue
    public String getDesc() {
        return msg;
    }

    public String getDesc(String code) {

        for (RespCode e : RespCode.values()) {
            if ( e.code.equals(code)) {
                return e.msg;
            }
        }
        return null;
    }
}
