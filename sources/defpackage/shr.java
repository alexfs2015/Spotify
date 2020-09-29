package defpackage;

/* renamed from: shr reason: default package */
public class shr implements shj {
    private final int a;

    public shr(int i) {
        this.a = i;
    }

    public final Object a() {
        return Integer.valueOf(this.a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof shr) && this.a == ((shr) obj).a;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + Integer.valueOf(this.a).hashCode();
    }
}
