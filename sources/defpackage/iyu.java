package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: iyu reason: default package */
public final class iyu implements tjd {
    private final miy a;
    private final mmx b;
    private final mna c;

    public iyu(miy miy, mmx mmx, mna mna) {
        this.a = miy;
        this.b = mmx;
        this.c = mna;
    }

    public final void a(tje tje) {
        mmz a2 = this.c.a(this.b.a(tje));
        miy miy = this.a;
        miy.a.a(new c(a2) {
            private /* synthetic */ gug a;

            {
                this.a = r2;
            }

            public final void a() {
                this.a.b();
            }

            public final void c() {
                this.a.a();
            }
        });
    }
}
