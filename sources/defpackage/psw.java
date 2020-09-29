package defpackage;

/* renamed from: psw reason: default package */
abstract class psw extends ptc {
    final int a;
    final String b;
    final String c;

    psw(int i, String str, String str2) {
        this.a = i;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                return;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptc) {
            ptc ptc = (ptc) obj;
            return this.a == ptc.a() && this.b.equals(ptc.b()) && this.c.equals(ptc.c());
        }
    }

    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenPushSettingsAction{notificationId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", campaignId=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
