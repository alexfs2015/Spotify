package defpackage;

/* renamed from: ud reason: default package */
public final class ud {
    public final String a;
    public final int b;

    public ud(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ud udVar = (ud) obj;
        if (this.b != udVar.b) {
            return false;
        }
        return this.a.equals(udVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
