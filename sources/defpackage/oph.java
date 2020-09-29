package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;

/* renamed from: oph reason: default package */
public interface oph {
    @wti(a = "vanilla/v1/views/hub2/nft/recommendations-in-free-tier-playlist")
    Single<HubsJsonViewModel> a(@wtx Map<String, String> map, @wtw(a = "signal") List<String> list);
}
