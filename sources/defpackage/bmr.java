package defpackage;

/* renamed from: bmr reason: default package */
public final class bmr {
    private static int b = 31;
    public int a = 1;

    public final bmr a(Object obj) {
        this.a = (b * this.a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final bmr a(boolean z) {
        this.a = (b * this.a) + (z ? 1 : 0);
        return this;
    }
}
