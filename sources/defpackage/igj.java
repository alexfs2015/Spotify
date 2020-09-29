package defpackage;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: igj reason: default package */
public final class igj {
    public final Set<rqi> a = new LinkedHashSet();
    private final hxi b;
    private final ObjectMapper c;

    public igj(hxi hxi, rnd rnd) {
        this.b = hxi;
        this.c = rnd.a(MapperFeature.USE_ANNOTATIONS, true).a(MapperFeature.AUTO_DETECT_FIELDS, false).a(MapperFeature.AUTO_DETECT_GETTERS, false).a();
    }

    public final Observable<Response> a(rqi rqi) {
        if (!this.a.add(rqi) || !c(rqi)) {
            return Observable.c();
        }
        return b();
    }

    public final Observable<Response> b(rqi rqi) {
        this.a.remove(rqi);
        if (!c(rqi)) {
            return Observable.c();
        }
        if (!this.a.isEmpty()) {
            return b();
        }
        return c();
    }

    private Observable<Response> b() {
        return this.b.a("device_info", a(), true);
    }

    private Observable<Response> c() {
        return this.b.a("device_info", true);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.c.writeValueAsString((rqi[]) this.a.toArray(new rqi[0]));
    }

    private static boolean c(rqi rqi) {
        return "car".equals(rqi.e);
    }
}
