package defpackage;

/* renamed from: sif reason: default package */
abstract class sif extends sih {
    final String a;

    sif(String str) {
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
        if (!(obj instanceof sih)) {
            return false;
        }
        return this.a.equals(((sih) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
