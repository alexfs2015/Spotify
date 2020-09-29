package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sqr reason: default package */
public final class sqr extends sqo {
    public sqr(sqk sqk, Map<String, String> map) {
        super(sqk, map);
    }

    public final Single<HubsJsonViewModel> a(slm slm) {
        return slm.b(b(), this.b);
    }
}
