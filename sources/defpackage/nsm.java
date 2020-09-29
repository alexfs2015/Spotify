package defpackage;

/* renamed from: nsm reason: default package */
final class nsm extends nsr {
    private final String a;
    private final String b;
    private final int c;

    nsm(String str, String str2, int i) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsr) {
            nsr nsr = (nsr) obj;
            if (this.a.equals(nsr.a())) {
                String str = this.b;
                if (str != null ? str.equals(nsr.b()) : nsr.b() == null) {
                    if (this.c == nsr.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixAffinityUser{username=");
        sb.append(this.a);
        sb.append(", affinity=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
