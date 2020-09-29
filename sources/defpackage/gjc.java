package defpackage;

/* renamed from: gjc reason: default package */
final class gjc extends gje {
    private final String a;

    gjc(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null itemId");
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemId{itemId=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gje)) {
            return false;
        }
        return this.a.equals(((gje) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
