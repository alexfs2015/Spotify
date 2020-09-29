package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: hsh reason: default package */
public interface hsh {
    @wti(a = "vanilla/v1/views/hub2/{genre}")
    Single<HubsJsonViewModel> a(@wtv(a = "genre") String str, @wtx Map<String, String> map, @wtm Map<String, String> map2);

    @wti(a = "vanilla/v1/views/hub2/external-integration-browse")
    Single<HubsJsonViewModel> a(@wtx Map<String, String> map, @wtm Map<String, String> map2);
}
