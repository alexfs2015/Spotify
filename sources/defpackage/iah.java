package defpackage;

/* renamed from: iah reason: default package */
abstract class iah extends iao {
    final String a;
    final String b;

    iah(String str, String str2) {
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

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedbackReason{reasonType=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iao) {
            iao iao = (iao) obj;
            return this.a.equals(iao.a()) && this.b.equals(iao.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
