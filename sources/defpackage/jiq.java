package defpackage;

/* renamed from: jiq reason: default package */
public abstract class jiq {
    protected String a;
    protected String b;

    public final void a(String str) {
        this.a = str;
    }

    public final void b(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiq)) {
            return false;
        }
        return this.a.equals(((jiq) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CellInfo{mUri='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", mName='");
        sb.append(this.b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
