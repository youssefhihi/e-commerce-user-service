package com.ys.ecommerce.api.helper;

public record ApiResponse<T>(
        boolean success,
        String message,
        T data,
        int status
) {
    public static <T> ApiResponse<T> success(T data, String message,int status) {
        return new ApiResponse<>(true, message, data, status);
    }

    public static <T> ApiResponse<T> error(String message, int status) {
        return new ApiResponse<>(false, message, null, status);
    }
}

