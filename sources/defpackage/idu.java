package defpackage;

/* renamed from: idu reason: default package */
public final class idu extends idv {
    private final String a;

    public idu(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null currentUri");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof idv)) {
            return false;
        }
        return this.a.equals(((idv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarqueeNavigationEvent{currentUri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
