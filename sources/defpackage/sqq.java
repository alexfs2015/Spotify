package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sqq reason: default package */
public class sqq extends sqo {
    public sqq(sqk sqk, Map<String, String> map) {
        super(sqk, map);
    }

    public Single<HubsJsonViewModel> a(slm slm) {
        return slm.a(b(), this.b);
    }
}
