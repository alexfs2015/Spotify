package defpackage;

/* renamed from: psx reason: default package */
abstract class psx extends ptd {
    final int a;
    final String b;
    final String c;
    final String d;
    final boolean e;

    psx(int i, String str, String str2, String str3, boolean z) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptd) {
            ptd ptd = (ptd) obj;
            return this.a == ptd.a() && this.b.equals(ptd.b()) && this.c.equals(ptd.c()) && this.d.equals(ptd.d()) && this.e == ptd.e();
        }
    }

    public int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
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
}
