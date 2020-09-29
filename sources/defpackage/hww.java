package defpackage;

import com.spotify.mobile.android.service.offlinesync.OfflineProgressModel;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hww reason: default package */
public final class hww {
    static final OfflineProgressModel a = OfflineProgressModel.create(0, 0, false);
    final xii<OfflineProgressModel> b;
    xip c = xon.b();
    private final Set<a> d = new HashSet(1);

    /* renamed from: hww$a */
    public interface a {
        void a(OfflineProgressModel offlineProgressModel);
    }

    public hww(xii<OfflineProgressModel> xii, xil xil) {
        this.b = xii.a(xil);
    }

    static /* synthetic */ void a(hww hww, OfflineProgressModel offlineProgressModel) {
        for (a a2 : hww.d) {
            a2.a(offlineProgressModel);
        }
    }

    public final void a(a aVar) {
        this.d.add(aVar);
    }

    public final void b(a aVar) {
        this.d.remove(aVar);
    }
}
