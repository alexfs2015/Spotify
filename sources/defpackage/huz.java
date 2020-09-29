package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: huz reason: default package */
public interface huz {
    @xhn(a = "vanilla/v1/views/hub2/{genre}")
    Single<HubsJsonViewModel> a(@xia(a = "genre") String str, @xic Map<String, String> map, @xhr Map<String, String> map2);

    @xhn(a = "vanilla/v1/views/hub2/external-integration-browse")
    Single<HubsJsonViewModel> a(@xic Map<String, String> map, @xhr Map<String, String> map2);
}
