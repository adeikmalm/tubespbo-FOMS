package foms.foms_api.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class WebResponse<T> {

    private Integer code;

    private String status;

    private Integer recordsTotal;

    private T data;

    private T errors;

//    public WebResponse(Integer code, String status, Integer recordsTotal, T data, T errors) {
//        this.code = code;
//        this.status = status;
//        this.recordsTotal = recordsTotal;
//        this.data = data;
//        this.errors = errors;
//    }
//
//    public static <T> WebResponse<T> success(Integer code, String status, Integer recordsTotal, T data) {
//        return new WebResponse<>(code, status, recordsTotal, data, null);
//    }
//
//    public static <T> WebResponse<T> error(Integer code, String status, T errors) {
//        return new WebResponse<>(code, status, null, null, errors);
//    }
}
