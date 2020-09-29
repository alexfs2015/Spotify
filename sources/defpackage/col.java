package defpackage;

import com.spotify.cosmos.router.Request;
import java.util.Map;

/* renamed from: col reason: default package */
public final class col extends dwv<duu> {
    private final cqt<duu> k;
    private final Map<String, String> l;
    private final cpg m;

    public col(String str, cqt<duu> cqt) {
        this(str, cqt, 0);
    }

    private col(String str, cqt<duu> cqt, byte b) {
        super(0, str, new com(cqt));
        this.l = null;
        this.k = cqt;
        this.m = new cpg();
        this.m.a(str, Request.GET, null, null);
    }

    /* access modifiers changed from: protected */
    public final ecs<duu> a(duu duu) {
        return ecs.a(duu, crk.a(duu));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        duu duu = (duu) obj;
        cpg cpg = this.m;
        Map<String, String> map = duu.c;
        int i = duu.a;
        if (cpg.c()) {
            cpg.a(map, i);
            if (i < 200 || i >= 300) {
                cpg.b(null);
            }
        }
        cpg cpg2 = this.m;
        byte[] bArr = duu.b;
        if (cpg.c() && bArr != null) {
            cpg2.a(bArr);
        }
        this.k.b(duu);
    }
}
