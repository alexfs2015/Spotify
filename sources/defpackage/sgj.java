package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sgj reason: default package */
public class sgj extends sgh {
    public sgj(sgd sgd, Map<String, String> map) {
        super(sgd, map);
    }

    public Single<HubsJsonViewModel> a(sbf sbf) {
        return sbf.a(b(), this.b);
    }
}
