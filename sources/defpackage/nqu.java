package defpackage;

/* renamed from: nqu reason: default package */
public final class nqu extends nqw {
    private final String a;
    private final String b;
    private final int c;

    public nqu(String str, String str2, int i) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null initials");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nqw) {
            nqw nqw = (nqw) obj;
            String str = this.a;
            if (str != null ? str.equals(nqw.a()) : nqw.a() == null) {
                return this.b.equals(nqw.b()) && this.c == nqw.c();
            }
        }
    }

    public final int hashCode() {
        String str = this.a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Face{faceImageUri=");
        sb.append(this.a);
        sb.append(", initials=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
