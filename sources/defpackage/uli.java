package defpackage;

/* renamed from: uli reason: default package */
abstract class uli extends uls {
    final CharSequence a;

    uli(CharSequence charSequence) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uls)) {
            return false;
        }
        return this.a.equals(((uls) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CharSequenceText{text=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
