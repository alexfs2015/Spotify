package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.subjects.BehaviorSubject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ijq reason: default package */
public final class ijq {
    public final Map<Integer, a> a = new LinkedHashMap();
    public final BehaviorSubject<List<a>> b = BehaviorSubject.a();

    /* renamed from: ijq$a */
    public static class a {
        public final int a;
        public final WeakReference<iia> b;

        public a(iia iia) {
            this.a = iia.c;
            this.b = new WeakReference<>(iia);
        }
    }

    public final List<a> a() {
        return new ArrayList(this.a.values());
    }

    public final void a(iia iia) {
        a aVar = (a) this.a.get(Integer.valueOf(iia.c));
        if (aVar != null) {
            iia iia2 = (iia) aVar.b.get();
            HelloDetails b2 = (iia2 == null || !iia2.c()) ? null : iia2.b();
            if (b2 != null) {
                Logger.b("Session updated: %s", b2.info);
                this.b.onNext(a());
            }
            return;
        }
        Assertion.b("Called update on stopped session.");
    }
}
