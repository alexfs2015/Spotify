package defpackage;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: iiw reason: default package */
public final class iiw {
    public final Set<rzt> a = new LinkedHashSet();
    private final hzu b;
    private final ObjectMapper c;

    public iiw(hzu hzu, rwj rwj) {
        this.b = hzu;
        this.c = rwj.a(MapperFeature.USE_ANNOTATIONS, true).a(MapperFeature.AUTO_DETECT_FIELDS, false).a(MapperFeature.AUTO_DETECT_GETTERS, false).a();
    }

    private Observable<Response> b() {
        return this.b.a("device_info", a(), true);
    }

    private Observable<Response> c() {
        return this.b.a("device_info", true);
    }

    private static boolean c(rzt rzt) {
        return "car".equals(rzt.e);
    }

    public final Observable<Response> a(rzt rzt) {
        return (!this.a.add(rzt) || !c(rzt)) ? Observable.c() : b();
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.c.writeValueAsString((rzt[]) this.a.toArray(new rzt[0]));
    }

    public final Observable<Response> b(rzt rzt) {
        this.a.remove(rzt);
        return !c(rzt) ? Observable.c() : !this.a.isEmpty() ? b() : c();
    }
}
