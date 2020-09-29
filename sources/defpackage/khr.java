package defpackage;

/* renamed from: khr reason: default package */
final class khr extends khu {
    private final String a;
    private final jev b;
    private final jex c;

    khr(String str, jev jev, jex jex) {
        if (str != null) {
            this.a = str;
            if (jev != null) {
                this.b = jev;
                if (jex != null) {
                    this.c = jex;
                    return;
                }
                throw new NullPointerException("Null storyData");
            }
            throw new NullPointerException("Null messageData");
        }
        throw new NullPointerException("Null previewImageUrl");
    }

    public final String a() {
        return this.a;
    }

    public final jev b() {
        return this.b;
    }

    public final jex c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khu) {
            khu khu = (khu) obj;
            return this.a.equals(khu.a()) && this.b.equals(khu.b()) && this.c.equals(khu.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareData{previewImageUrl=");
        sb.append(this.a);
        sb.append(", messageData=");
        sb.append(this.b);
        sb.append(", storyData=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
