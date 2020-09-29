package defpackage;

/* renamed from: gkn reason: default package */
final class gkn extends gkp {
    private final String a;

    gkn(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null itemId");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gkp)) {
            return false;
        }
        return this.a.equals(((gkp) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemId{itemId=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
