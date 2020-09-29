package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: uvs reason: default package */
public final class uvs {
    private final xii<Offer> a;
    private xip b;

    public uvs(xii<Offer> xii) {
        this.a = xii;
    }

    public final void a() {
        b();
        this.b = this.a.a((xis<? super T>) $$Lambda$uvs$nrRXAu45FUgOiVfhYFK2gEwR3s.INSTANCE, (xis<Throwable>) $$Lambda$uvs$HLU_7JzOxqoIG2RtUKaHYdKUHSk.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        xip xip = this.b;
        if (xip != null && !xip.isUnsubscribed()) {
            this.b.unsubscribe();
        }
        this.b = null;
    }
}
