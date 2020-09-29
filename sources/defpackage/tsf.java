package defpackage;

/* renamed from: tsf reason: default package */
public abstract class tsf {
    public abstract String a();

    public abstract String b();

    public static tsf a(String str, String str2) {
        return new tsc(str, str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof tsf) {
            tsf tsf = (tsf) obj;
            if (a().equals(tsf.a()) && b().equals(tsf.b())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return a();
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }
}
