package cn.zzzbw.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author by zzzzbw
 * @since 2020/3/20 12:47
 */
@AllArgsConstructor
@Getter
public enum ResponseCodes {
    SUCCESS("0", "成功"),
    INTERNAL_SERVER_ERROR("500", "系统繁忙，请稍后再试");

    private String code;
    private String msg;
}
