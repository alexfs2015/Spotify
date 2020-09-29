package defpackage;

/* renamed from: pkf reason: default package */
abstract class pkf extends pkl {
    final int a;
    final String b;
    final String c;
    final String d;
    final boolean e;

    pkf(int i, String str, String str2, String str3, boolean z) {
        this.a = i;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.d = str3;
                    this.e = z;
                    return;
                }
                throw new NullPointerException("Null url");
            }
            throw new NullPointerException("Null campaignId");
        }
        throw new NullPointerException("Null messageId");
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenUrlAction{notificationId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", campaignId=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", isQuickAction=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pkl) {
            pkl pkl = (pkl) obj;
            return this.a == pkl.a() && this.b.equals(pkl.b()) && this.c.equals(pkl.c()) && this.d.equals(pkl.d()) && this.e == pkl.e();
        }
    }

    public int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
    }
}
