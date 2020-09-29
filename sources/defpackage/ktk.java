package defpackage;

/* renamed from: ktk reason: default package */
public final class ktk {
    String a;
    String b;
    String c;
    long d;
    String e;
    String f;
    long g;

    public ktk(String str, String str2, String str3, long j, String str4, String str5, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = j2;
    }

    public static ktk a(ktj ktj) {
        ktk ktk = new ktk(ktj.a(), ktj.b(), ktj.c(), ktj.d(), ktj.e(), ktj.f(), ktj.g());
        return ktk;
    }
}
