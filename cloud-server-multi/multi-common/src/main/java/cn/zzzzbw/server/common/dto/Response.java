package cn.zzzzbw.server.common.dto;

import lombok.Data;

/**
 * @author by zzzzbw
 * @since 2020/3/20 12:46
 */
@Data
public class Response<T> {
    private int code;
    private String msg;
    private T data;
    private boolean success;

    private Response() {
    }

    private Response(boolean success) {
        this.success = success;
    }

    private Response(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    private Response(boolean success, T data, int code) {
        this.success = success;
        this.data = data;
        this.code = code;
    }

    private Response(boolean success, int code) {
        this.success = success;
        this.code = code;
    }

    private Response(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }


    private Response(boolean success, int code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public static Response ok() {
        return new Response(true);
    }

    public static <T> Response<T> ok(T data) {
        return new Response<>(true, data);
    }

    public static <T> Response<T> ok(T data, int code) {
        return new Response<>(true, data, code);
    }

    public static Response fail() {
        return new Response(false);
    }

    public static Response fail(int code) {
        return new Response(false, code);
    }

    public static Response fail(String msg) {
        return new Response(false, msg);
    }

    public static Response fail(int code, String msg) {
        return new Response(false, code, msg);
    }

    public static class EmptyData {
    }
}
