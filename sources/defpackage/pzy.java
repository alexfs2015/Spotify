package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: pzy reason: default package */
public final class pzy implements kjd<sbs, sbs> {
    private final wlc<sbu> a;
    private final sfx b;

    public pzy(wlc<sbu> wlc, sfx sfx) {
        this.a = wlc;
        this.b = sfx;
    }

    public final kje<sbs> connect(final kkn<sbs> kkn) {
        return new kje<sbs>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                sbs sbs = (sbs) obj;
                pzy.a(pzy.this, sbs);
                kkn.accept(sbs);
            }
        };
    }

    static /* synthetic */ void a(pzy pzy, sbs sbs) {
        if (sbs instanceof c) {
            c cVar = (c) sbs;
            pzy.b.a(cVar.a, cVar.b);
        } else if (sbs instanceof g) {
            g gVar = (g) sbs;
            sbu sbu = (sbu) pzy.a.get();
            if (gVar.a instanceof b) {
                b bVar = (b) gVar.a;
                String str = bVar.a;
                String str2 = bVar.c;
                int i = bVar.b;
                String a2 = sbu.b() instanceof e ? ((e) sbu.b()).a.a() : "-1";
                if (sbj.a(str, sbu)) {
                    pzy.b.a(str, str2, i, a2);
                }
                if ((sbu.b() instanceof b) || !jst.a(str, LinkType.TRACK)) {
                    pzy.b.b(str, str2, i, a2);
                }
            }
        } else if (sbs instanceof f) {
            f fVar = (f) sbs;
            pzy.b.b(fVar.a, fVar.b);
        } else {
            if (sbs instanceof a) {
                pzy.b.a();
            }
        }
    }
}
