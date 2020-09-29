package defpackage;

import java.util.Map;

/* renamed from: cnq reason: default package */
final class cnq extends cwt {
    private final /* synthetic */ byte[] k;
    private final /* synthetic */ Map l;
    private final /* synthetic */ cop m;

    cnq(int i, String str, edv edv, edc edc, byte[] bArr, Map map, cop cop) {
        this.k = bArr;
        this.l = map;
        this.m = cop;
        super(i, str, edv, edc);
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
