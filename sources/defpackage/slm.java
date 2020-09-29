package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.searchview.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: slm reason: default package */
public interface slm {
    @xhn(a = "searchview/android/v4/search/{drilldown}/{query}")
    Single<HubsJsonViewModel> a(@xia(a = "query", b = true) String str, @xia(a = "drilldown") String str2, @xic Map<String, String> map);

    @xhn(a = "searchview/android/v4/search/{query}?")
    Single<HubsJsonViewModel> a(@xia(a = "query", b = true) String str, @xic Map<String, String> map);

    @xhn(a = "searchview/android/v4/assisted-curation/{drilldown}/{query}")
    Single<HubsJsonViewModel> b(@xia(a = "query", b = true) String str, @xia(a = "drilldown") String str2, @xic Map<String, String> map);

    @xhn(a = "searchview/android/v4/assisted-curation/{query}?")
    Single<HubsJsonViewModel> b(@xia(a = "query", b = true) String str, @xic Map<String, String> map);

    @xhs(a = {"Accept: application/protobuf"})
    @xhn(a = "searchview/v1/search/{drilldown}/{query}?platform=android")
    Single<DrillDownViewResponse> c(@xia(a = "query", b = true) String str, @xia(a = "drilldown") String str2, @xic Map<String, String> map);

    @xhs(a = {"Accept: application/protobuf"})
    @xhn(a = "searchview/v1/search/{query}?platform=android")
    Single<MainViewResponse> c(@xia(a = "query", b = true) String str, @xic Map<String, String> map);
}
