package defpackage;

/* renamed from: tko reason: default package */
final class tko extends tld {
    private final String a;

    tko(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null contextUri");
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowPlayerState{contextUri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tld)) {
            return false;
        }
        return this.a.equals(((tld) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
