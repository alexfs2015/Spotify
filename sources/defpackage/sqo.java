package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sqo reason: default package */
public abstract class sqo {
    public final sqk a;
    protected final Map<String, String> b;

    sqo(sqk sqk, Map<String, String> map) {
        this.a = (sqk) fbp.a(sqk);
        this.b = map;
    }

    public abstract Single<HubsJsonViewModel> a(slm slm);

    public final Map<String, String> a() {
        return this.b;
    }

    public final String b() {
        return skv.a(this.a.a.b());
    }

    public final boolean c() {
        return (this.a.c instanceof b) || (this.a.c instanceof a);
    }

    public final String d() {
        return (String) this.b.get("requestId");
    }
}
