package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sgk reason: default package */
public final class sgk extends sgh {
    public sgk(sgd sgd, Map<String, String> map) {
        super(sgd, map);
    }

    public final Single<HubsJsonViewModel> a(sbf sbf) {
        return sbf.b(b(), this.b);
    }
}
