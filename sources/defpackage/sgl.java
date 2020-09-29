package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sgl reason: default package */
public final class sgl extends sgj {
    public final String c;
    public final Optional<Integer> d;
    private final boolean e;

    public sgl(sgd sgd, Map<String, String> map, boolean z) {
        Optional<Integer> optional;
        super(sgd, map);
        this.c = (String) fay.a(sgd.a.a());
        String str = (String) map.get("offset");
        if (fax.a(str)) {
            optional = Optional.e();
        } else {
            optional = Optional.b(Integer.valueOf(str));
        }
        this.d = optional;
        this.e = z;
    }

    public final Single<HubsJsonViewModel> a(sbf sbf) {
        if (this.e) {
            return sbf.b(b(), this.c, this.b);
        }
        return sbf.a(b(), this.c, this.b);
    }
}
