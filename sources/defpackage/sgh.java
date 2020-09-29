package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: sgh reason: default package */
public abstract class sgh {
    public final sgd a;
    protected final Map<String, String> b;

    public abstract Single<HubsJsonViewModel> a(sbf sbf);

    public final Map<String, String> a() {
        return this.b;
    }

    sgh(sgd sgd, Map<String, String> map) {
        this.a = (sgd) fay.a(sgd);
        this.b = map;
    }

    public final String b() {
        return sao.a(this.a.a.b());
    }

    public final boolean c() {
        return (this.a.c instanceof b) || (this.a.c instanceof a);
    }

    public final String d() {
        return (String) this.b.get("requestId");
    }
}
