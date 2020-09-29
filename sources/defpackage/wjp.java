package defpackage;

/* renamed from: wjp reason: default package */
public final class wjp {
    public final String a;
    public final boolean b;

    wjp(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wjp wjp = (wjp) obj;
        if (this.b != wjp.b) {
            return false;
        }
        String str = this.a;
        String str2 = wjp.a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }
}
