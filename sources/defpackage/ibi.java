package defpackage;

/* renamed from: ibi reason: default package */
public final class ibi extends ibj {
    private final String a;

    public ibi(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null currentUri");
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarqueeNavigationEvent{currentUri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibj)) {
            return false;
        }
        return this.a.equals(((ibj) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
