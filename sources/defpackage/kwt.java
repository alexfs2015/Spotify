package defpackage;

/* renamed from: kwt reason: default package */
public final class kwt {
    String a;
    String b;
    String c;
    long d;
    String e;
    String f;
    long g;

    public kwt(String str, String str2, String str3, long j, String str4, String str5, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = j2;
    }

    public static kwt a(kws kws) {
        kwt kwt = new kwt(kws.a(), kws.b(), kws.c(), kws.d(), kws.e(), kws.f(), kws.g());
        return kwt;
    }
}
