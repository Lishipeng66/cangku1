package pojo;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.code = 200;
        result.data = data;
        return result;
    }

    public static Result<?> fail(String msg) {
        Result<?> result = new Result<>();
        result.code = 500;
        result.message = msg;
        return result;
    }

    public static Result success(){
        Result result = new Result<>();
        result.code = 200;
        result.message = "success";
        return result;
    }
}