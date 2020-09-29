package defpackage;

/* renamed from: ryh reason: default package */
public class ryh implements rxz {
    private final int a;

    public ryh(int i) {
        this.a = i;
    }

    public final Object a() {
        return Integer.valueOf(this.a);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ryh) && this.a == ((ryh) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + Integer.valueOf(this.a).hashCode();
    }
}
