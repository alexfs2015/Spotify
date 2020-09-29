package defpackage;

/* renamed from: twg reason: default package */
final class twg extends twv {
    private final String a;

    twg(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null contextUri");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof twv)) {
            return false;
        }
        return this.a.equals(((twv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowPlayerState{contextUri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
