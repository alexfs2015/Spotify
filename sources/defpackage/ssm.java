package defpackage;

/* renamed from: ssm reason: default package */
abstract class ssm extends sso {
    final String a;

    ssm(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null viewUri");
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sso)) {
            return false;
        }
        return this.a.equals(((sso) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
