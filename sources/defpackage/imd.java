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

/* renamed from: imd reason: default package */
public final class imd {
    public final Map<Integer, a> a = new LinkedHashMap();
    public final BehaviorSubject<List<a>> b = BehaviorSubject.a();

    /* renamed from: imd$a */
    public static class a {
        public final int a;
        public final WeakReference<ikn> b;

        public a(ikn ikn) {
            this.a = ikn.c;
            this.b = new WeakReference<>(ikn);
        }
    }

    public final List<a> a() {
        return new ArrayList(this.a.values());
    }

    public final void a(ikn ikn) {
        a aVar = (a) this.a.get(Integer.valueOf(ikn.c));
        if (aVar != null) {
            ikn ikn2 = (ikn) aVar.b.get();
            HelloDetails b2 = (ikn2 == null || !ikn2.c()) ? null : ikn2.b();
            if (b2 != null) {
                Logger.b("Session updated: %s", b2.info);
                this.b.onNext(a());
            }
            return;
        }
        Assertion.b("Called update on stopped session.");
    }
}
