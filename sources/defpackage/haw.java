package defpackage;

/* renamed from: haw reason: default package */
public class haw {
    private final String a;

    haw(Object... objArr) {
        this.a = hax.a(objArr);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haw)) {
            return false;
        }
        return this.a.equals(((haw) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
