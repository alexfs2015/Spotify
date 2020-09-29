package defpackage;

/* renamed from: tyn reason: default package */
abstract class tyn extends tyx {
    final CharSequence a;

    tyn(CharSequence charSequence) {
        if (charSequence != null) {
            this.a = charSequence;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* access modifiers changed from: 0000 */
    public final CharSequence a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CharSequenceText{text=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tyx)) {
            return false;
        }
        return this.a.equals(((tyx) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
