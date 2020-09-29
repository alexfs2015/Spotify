package defpackage;

/* renamed from: nle reason: default package */
public final class nle extends nlg {
    private final String a;
    private final String b;
    private final int c;

    public nle(String str, String str2, int i) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nlg) {
            nlg nlg = (nlg) obj;
            String str = this.a;
            if (str != null ? str.equals(nlg.a()) : nlg.a() == null) {
                return this.b.equals(nlg.b()) && this.c == nlg.c();
            }
        }
    }

    public final int hashCode() {
        String str = this.a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }
}
