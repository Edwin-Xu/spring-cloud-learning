package cn.edw.springcloud.domain.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Edwin Xu
 * @date 3/3/2021 5:17 PM.
 */
@Setter
@Getter
public class Response implements Serializable {
    private int code;
    private boolean success;
    private String msg;
    private Object data;

    public Response(){}
    public Response(int code, boolean success, String msg, Object data) {
        this.code = code;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public static Response buildSuccess(String msg,Object data){
        return new Response(200,true,msg,data);
    }
    public static Response buildFailure(String msg){
        return new Response(400,false,msg,null);
    }
}
