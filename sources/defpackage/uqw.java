package defpackage;

import com.google.common.collect.EvictingQueue;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import java.util.Queue;

@Deprecated
/* renamed from: uqw reason: default package */
public final class uqw implements uqv {
    private final ToastieManager a;
    private final uqx b;
    private final uqy c;
    private final jtz d;
    private Queue<Long> e = EvictingQueue.a(3);

    public uqw(ToastieManager toastieManager, uqx uqx, uqy uqy, jtz jtz) {
        this.a = (ToastieManager) fbp.a(toastieManager);
        this.c = (uqy) fbp.a(uqy);
        this.d = (jtz) fbp.a(jtz);
        this.b = (uqx) fbp.a(uqx);
    }

    public final void a() {
        long c2 = this.d.c();
        this.e.add(Long.valueOf(c2));
        if (this.e.size() == 3 && c2 - ((Long) this.e.peek()).longValue() < 10000) {
            this.a.a(this.c.a(R.string.freetier_education_toastie_skip_too_fast, 3000));
            this.e.clear();
        }
        if (!this.b.b.a(uqx.a, false)) {
            this.a.a(this.c.a(R.string.freetier_education_toastie_skip_first, 3000));
            this.b.b.a().a(uqx.a, true).b();
        }
    }
}
