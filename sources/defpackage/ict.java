package defpackage;

/* renamed from: ict reason: default package */
abstract class ict extends ida {
    final String a;
    final String b;

    ict(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null reasonType");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ida) {
            ida ida = (ida) obj;
            return this.a.equals(ida.a()) && this.b.equals(ida.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedbackReason{reasonType=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
