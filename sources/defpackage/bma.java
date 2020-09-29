package defpackage;

/* renamed from: bma reason: default package */
public final class bma {
    private static int b = 31;
    public int a = 1;

    public final bma a(Object obj) {
        this.a = (b * this.a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final bma a(boolean z) {
        this.a = (b * this.a) + (z ? 1 : 0);
        return this;
    }
}
