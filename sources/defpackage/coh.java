package defpackage;

import java.util.Map;

/* renamed from: coh reason: default package */
final class coh extends cxk {
    private final /* synthetic */ byte[] k;
    private final /* synthetic */ Map l;
    private final /* synthetic */ cpg m;

    coh(int i, String str, eem eem, edt edt, byte[] bArr, Map map, cpg cpg) {
        this.k = bArr;
        this.l = map;
        this.m = cpg;
        super(i, str, eem, edt);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        a((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        this.m.a(str);
        super.a(str);
    }

    public final byte[] a() {
        byte[] bArr = this.k;
        return bArr == null ? super.a() : bArr;
    }

    public final Map<String, String> b() {
        Map<String, String> map = this.l;
        return map == null ? super.b() : map;
    }
}
