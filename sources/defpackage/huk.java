package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;
import java.util.HashSet;
import java.util.Set;

/* renamed from: huk reason: default package */
public final class huk {
    static final OfflineProgressModel a = OfflineProgressModel.create(0, 0, false);
    final wud<OfflineProgressModel> b;
    wuk c = xaj.b();
    private final Set<a> d = new HashSet(1);

    /* renamed from: huk$a */
    public interface a {
        void a(OfflineProgressModel offlineProgressModel);
    }

    public huk(wud<OfflineProgressModel> wud, wug wug) {
        this.b = wud.a(wug);
    }

    public final void a(a aVar) {
        this.d.add(aVar);
    }

    public final void b(a aVar) {
        this.d.remove(aVar);
    }

    static /* synthetic */ void a(huk huk, OfflineProgressModel offlineProgressModel) {
        for (a a2 : huk.d) {
            a2.a(offlineProgressModel);
        }
    }
}
