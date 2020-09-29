package defpackage;

/* renamed from: voa reason: default package */
public final class voa extends vod {
    private final String a;

    public voa(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vod)) {
            return false;
        }
        return this.a.equals(((vod) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header{title=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
