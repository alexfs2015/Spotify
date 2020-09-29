package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: rvh reason: default package */
public final class rvh implements a {
    public final rvn a;
    private final run b;
    private final rut c;
    private final ruo d;

    public rvh(run run, rut rut, ruo ruo, rvn rvn) {
        this.a = rvn;
        this.b = (run) fbp.a(run);
        this.c = (rut) fbp.a(rut);
        this.d = ruo;
        rvn rvn2 = this.a;
        if (rvn2.b != null) {
            Assertion.b("Overwriting listener");
        }
        rvn2.b = this;
        if (rvn2.a != null) {
            a();
        }
    }

    public final void a() {
        a(true);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (this.d.a) {
            aio aio = agx.d().a;
            aio.b(this.a.a());
            this.b.a(aio, z);
        }
    }
}
