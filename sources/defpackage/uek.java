package defpackage;

import com.google.common.collect.EvictingQueue;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import java.util.Queue;

@Deprecated
/* renamed from: uek reason: default package */
public final class uek implements uej {
    private final ToastieManager a;
    private final uel b;
    private final uem c;
    private final jrp d;
    private Queue<Long> e = EvictingQueue.a(3);

    public uek(ToastieManager toastieManager, uel uel, uem uem, jrp jrp) {
        this.a = (ToastieManager) fay.a(toastieManager);
        this.c = (uem) fay.a(uem);
        this.d = (jrp) fay.a(jrp);
        this.b = (uel) fay.a(uel);
    }

    public final void a() {
        long c2 = this.d.c();
        this.e.add(Long.valueOf(c2));
        if (this.e.size() == 3 && c2 - ((Long) this.e.peek()).longValue() < 10000) {
            this.a.a(this.c.a(R.string.freetier_education_toastie_skip_too_fast, 3000));
            this.e.clear();
        }
        if (!this.b.b.a(uel.a, false)) {
            this.a.a(this.c.a(R.string.freetier_education_toastie_skip_first, 3000));
            this.b.b.a().a(uel.a, true).b();
        }
    }
}
