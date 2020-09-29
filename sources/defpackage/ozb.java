package defpackage;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;

/* renamed from: ozb reason: default package */
public final class ozb implements oyy {
    private final oyz a;
    private final owi b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public ozb(oyz oyz, owi owi, boolean z, boolean z2, boolean z3) {
        this.a = oyz;
        this.b = owi;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final void a(Show show) {
        String str;
        if (a()) {
            owi owi = this.b;
            Covers b2 = show.b();
            if (b2 == null) {
                str = "";
            } else {
                str = b2.getUri();
            }
            owi.c = oym.a(str, owi.a, show.a(), show.c(), show.f(), show.g());
            owi.b.ap_();
            return;
        }
        this.a.a(show);
    }

    public final void a(fyt fyt, oye oye) {
        if (!a()) {
            this.a.a(fyt, oye);
        } else if (oye instanceof oxy) {
            this.b.a(fyt, (oxy) oye);
        } else {
            throw new IllegalStateException("Invalid header instance. Can't bind toolbar.");
        }
    }

    private boolean a() {
        return this.c || this.d || !this.e;
    }
}
