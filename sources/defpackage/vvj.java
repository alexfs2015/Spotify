package defpackage;

/* renamed from: vvj reason: default package */
public final class vvj {
    public final String a;
    public final boolean b;

    vvj(String str, boolean z) {
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
        vvj vvj = (vvj) obj;
        if (this.b != vvj.b) {
            return false;
        }
        String str = this.a;
        String str2 = vvj.a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }
}
