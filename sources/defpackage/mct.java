package defpackage;

/* renamed from: mct reason: default package */
public final class mct {
    final int a;
    final String b;

    private mct(int i, String str) {
        this.a = i;
        this.b = (String) fbp.a(str);
    }

    public static mct a(int i, String str) {
        return new mct(i, str);
    }
}
