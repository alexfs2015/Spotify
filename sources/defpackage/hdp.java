package defpackage;

/* renamed from: hdp reason: default package */
public class hdp {
    private final String a;

    hdp(Object... objArr) {
        this.a = hdq.a(objArr);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdp)) {
            return false;
        }
        return this.a.equals(((hdp) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
