package defpackage;

/* renamed from: lsm reason: default package */
public final class lsm extends lsk {
    private final boolean a;

    public lsm(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsk) {
            if (this.a == ((lsk) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumToolbarConfiguration{canGoToRadio=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
