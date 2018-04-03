package com.example.xuqiang.myvolley.retrofitrxjava;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * ================================================
 * 作    者：marsxq
 * 创建日期：2018/4/3
 * 描    述：
 * ================================================
 */
public interface TestApi {

    @GET("/")
    Observable<HttpResult<RxHomeDataBean>> getTest(@Query("data[id]") String id,
                                                   @Query("data[pages]") String pages,
                                                   @Query("data[maxperpage]") String maxperpage);

}
