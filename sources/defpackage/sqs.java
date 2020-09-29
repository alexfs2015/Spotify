package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sqs reason: default package */
public final class sqs extends sqq {
    public final String c;
    public final Optional<Integer> d;
    private final boolean e;

    public sqs(sqk sqk, Map<String, String> map, boolean z) {
        super(sqk, map);
        this.c = (String) fbp.a(sqk.a.a());
        String str = (String) map.get("offset");
        this.d = fbo.a(str) ? Optional.e() : Optional.b(Integer.valueOf(str));
        this.e = z;
    }

    public final Single<HubsJsonViewModel> a(slm slm) {
        return this.e ? slm.b(b(), this.c, this.b) : slm.a(b(), this.c, this.b);
    }
}
