package defpackage;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;

/* renamed from: pgk reason: default package */
public final class pgk implements pgh {
    private final pgi a;
    private final pdv b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public pgk(pgi pgi, pdv pdv, boolean z, boolean z2, boolean z3) {
        this.a = pgi;
        this.b = pdv;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    private boolean a() {
        return this.c || this.d || !this.e;
    }

    public final void a(Show show) {
        if (a()) {
            pdv pdv = this.b;
            Covers b2 = show.b();
            pdv.c = pfy.a(b2 == null ? "" : b2.getUri(), pdv.a, show.a(), show.c(), show.f(), show.g());
            pdv.b.ao_();
            return;
        }
        this.a.a(show);
    }

    public final void a(fzn fzn, pfq pfq) {
        if (!a()) {
            this.a.a(fzn, pfq);
        } else if (pfq instanceof pfk) {
            this.b.a(fzn, (pfk) pfq);
        } else {
            throw new IllegalStateException("Invalid header instance. Can't bind toolbar.");
        }
    }
}
