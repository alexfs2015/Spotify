package defpackage;

/* renamed from: kad reason: default package */
final class kad extends kac {
    private final int a;
    private final String b;

    kad(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat{bitrate=");
        sb.append(this.a);
        sb.append(", codecs=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kac) {
            kac kac = (kac) obj;
            if (this.a == kac.a()) {
                String str = this.b;
                return str != null ? str.equals(kac.b()) : kac.b() == null;
            }
        }
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        return i ^ (str == null ? 0 : str.hashCode());
    }
}
