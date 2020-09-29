package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: rmb reason: default package */
public final class rmb implements a {
    public final rmh a;
    private final rlh b;
    private final rln c;
    private final rli d;

    public rmb(rlh rlh, rln rln, rli rli, rmh rmh) {
        this.a = rmh;
        this.b = (rlh) fay.a(rlh);
        this.c = (rln) fay.a(rln);
        this.d = rli;
        rmh rmh2 = this.a;
        if (rmh2.b != null) {
            Assertion.b("Overwriting listener");
        }
        rmh2.b = this;
        if (rmh2.a != null) {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (this.d.a) {
            aia aia = agj.d().a;
            aia.b(this.a.a());
            this.b.a(aia, z);
        }
    }

    public final void a() {
        a(true);
    }
}
