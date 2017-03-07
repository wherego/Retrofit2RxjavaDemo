package york.com.retrofit2rxjavademo.http;

import retrofit2.http.GET;
import rx.Observable;
import york.com.retrofit2rxjavademo.entity.HttpResult;
import york.com.retrofit2rxjavademo.entity.MockBean;

/**
 * @author YorkYu
 * @version V1.0
 * @Project: Retrofit2RxjavaDemo
 * @Package york.com.retrofit2rxjavademo.http
 * @Description:
 * @time 2017/3/7 15:38
 */
public interface MockApi {
    @GET("test")
    Observable<HttpResult<MockBean>> getMock();

    @GET("user/login")
    Observable<HttpResult<MockBean>> getMock2();
}

