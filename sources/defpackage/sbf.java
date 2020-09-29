package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.searchview.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sbf reason: default package */
public interface sbf {
    @wti(a = "searchview/android/v4/search/{drilldown}/{query}")
    Single<HubsJsonViewModel> a(@wtv(a = "query", b = true) String str, @wtv(a = "drilldown") String str2, @wtx Map<String, String> map);

    @wti(a = "searchview/android/v4/search/{query}?")
    Single<HubsJsonViewModel> a(@wtv(a = "query", b = true) String str, @wtx Map<String, String> map);

    @wti(a = "searchview/android/v4/assisted-curation/{drilldown}/{query}")
    Single<HubsJsonViewModel> b(@wtv(a = "query", b = true) String str, @wtv(a = "drilldown") String str2, @wtx Map<String, String> map);

    @wti(a = "searchview/android/v4/assisted-curation/{query}?")
    Single<HubsJsonViewModel> b(@wtv(a = "query", b = true) String str, @wtx Map<String, String> map);

    @wtn(a = {"Accept: application/protobuf"})
    @wti(a = "searchview/v1/search/{drilldown}/{query}?platform=android")
    Single<DrillDownViewResponse> c(@wtv(a = "query", b = true) String str, @wtv(a = "drilldown") String str2, @wtx Map<String, String> map);

    @wtn(a = {"Accept: application/protobuf"})
    @wti(a = "searchview/v1/search/{query}?platform=android")
    Single<MainViewResponse> c(@wtv(a = "query", b = true) String str, @wtx Map<String, String> map);
}
