package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: qiw reason: default package */
public final class qiw implements kmm<slz, slz> {
    private final wzi<smb> a;
    private final sqe b;

    public qiw(wzi<smb> wzi, sqe sqe) {
        this.a = wzi;
        this.b = sqe;
    }

    static /* synthetic */ void a(qiw qiw, slz slz) {
        if (slz instanceof c) {
            c cVar = (c) slz;
            qiw.b.a(cVar.a, cVar.b);
        } else if (slz instanceof g) {
            g gVar = (g) slz;
            smb smb = (smb) qiw.a.get();
            if (gVar.a instanceof b) {
                b bVar = (b) gVar.a;
                String str = bVar.a;
                String str2 = bVar.c;
                int i = bVar.b;
                String a2 = smb.b() instanceof e ? ((e) smb.b()).a.a() : "-1";
                if (slq.a(str, smb)) {
                    qiw.b.a(str, str2, i, a2);
                }
                if ((smb.b() instanceof b) || !jva.a(str, LinkType.TRACK)) {
                    qiw.b.b(str, str2, i, a2);
                }
            }
        } else if (slz instanceof f) {
            f fVar = (f) slz;
            qiw.b.b(fVar.a, fVar.b);
        } else {
            if (slz instanceof a) {
                qiw.b.a();
            }
        }
    }

    public final kmn<slz> connect(final knw<slz> knw) {
        return new kmn<slz>() {
            public final /* synthetic */ void accept(Object obj) {
                slz slz = (slz) obj;
                qiw.a(qiw.this, slz);
                knw.accept(slz);
            }

            public final void dispose() {
            }
        };
    }
}
