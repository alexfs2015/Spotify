package defpackage;

import com.spotify.cosmos.router.Request;
import java.util.Map;

/* renamed from: cnu reason: default package */
public final class cnu extends dwe<dud> {
    private final cqc<dud> k;
    private final Map<String, String> l;
    private final cop m;

    public cnu(String str, cqc<dud> cqc) {
        this(str, cqc, 0);
    }

    private cnu(String str, cqc<dud> cqc, byte b) {
        super(0, str, new cnv(cqc));
        this.l = null;
        this.k = cqc;
        this.m = new cop();
        this.m.a(str, Request.GET, null, null);
    }

    /* access modifiers changed from: protected */
    public final ecb<dud> a(dud dud) {
        return ecb.a(dud, cqt.a(dud));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        dud dud = (dud) obj;
        cop cop = this.m;
        Map<String, String> map = dud.c;
        int i = dud.a;
        if (cop.c()) {
            cop.a(map, i);
            if (i < 200 || i >= 300) {
                cop.b(null);
            }
        }
        cop cop2 = this.m;
        byte[] bArr = dud.b;
        if (cop.c() && bArr != null) {
            cop2.a(bArr);
        }
        this.k.b(dud);
    }
}
