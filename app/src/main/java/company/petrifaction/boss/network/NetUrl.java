package company.petrifaction.boss.network;

import java.util.Map;
import okhttp3.RequestBody;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import io.reactivex.Observable;
import retrofit2.http.Multipart;
import company.petrifaction.boss.bean.BaseReturnData;

public interface NetUrl
{
   /* @POST("/auth/logout.app")
    Observable<BaseReturnData> signOut();

    @POST("/yjfb/notify/newMessage.app")
    Observable<BaseReturnListData<RefreshMsgBean>> refreshMsg();

    @POST("/yjfb/notify/delete.app")
    @Multipart
    Observable<BaseReturnData> deleteMsg(@PartMap Map<String, RequestBody> params);

    @POST("/yjfb/notify/list.app")
    @Multipart
    Observable<BaseReturnData<MsgBean>> getMsg(@PartMap Map<String, RequestBody> params);*/
}