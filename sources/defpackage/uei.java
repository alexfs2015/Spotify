package defpackage;

/* renamed from: uei reason: default package */
public abstract class uei {
    public static uei a(String str, String str2) {
        return new uef(str, str2);
    }

    public abstract String a();

    public abstract String b();

    public boolean equals(Object obj) {
        if (obj instanceof uei) {
            uei uei = (uei) obj;
            if (a().equals(uei.a()) && b().equals(uei.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }

    public String toString() {
        return a();
    }
}
