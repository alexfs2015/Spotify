package defpackage;

/* renamed from: hvv reason: default package */
final class hvv extends hwb {
    private final boolean a;
    private final String b;

    hvv(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hwb) {
            hwb hwb = (hwb) obj;
            if (this.a == hwb.a()) {
                String str = this.b;
                return str != null ? str.equals(hwb.b()) : hwb.b() == null;
            }
        }
    }

    public final int hashCode() {
        int i = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState{isSearchInitiated=");
        sb.append(this.a);
        sb.append(", searchError=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
