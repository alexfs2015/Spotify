package defpackage;

/* renamed from: ur reason: default package */
public final class ur {
    public final String a;
    public final int b;

    public ur(String str, int i) {
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
        ur urVar = (ur) obj;
        if (this.b != urVar.b) {
            return false;
        }
        return this.a.equals(urVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
