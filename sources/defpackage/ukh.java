package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;

/* renamed from: ukh reason: default package */
public final class ukh {
    private final wud<Offer> a;
    private wuk b;

    public ukh(wud<Offer> wud) {
        this.a = wud;
    }

    public final void a() {
        b();
        this.b = this.a.a((wun<? super T>) $$Lambda$ukh$EFqamcJA5GJFDm6AtqPWkGBICp8.INSTANCE, (wun<Throwable>) $$Lambda$ukh$hbyGsqTzTcaQoRqsCYjYBap1LY4.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        wuk wuk = this.b;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.b.unsubscribe();
        }
        this.b = null;
    }
}
