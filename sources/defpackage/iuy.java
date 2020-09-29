package defpackage;

/* renamed from: iuy reason: default package */
public final class iuy {
    public static final iuy a = new iuy("empty_track", "empty_context", false, false);
    final String b;
    final String c;
    final boolean d;
    final boolean e;

    public iuy(String str, String str2, boolean z, boolean z2) {
        this.c = str;
        this.b = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuy)) {
            return false;
        }
        iuy iuy = (iuy) obj;
        return this.d == iuy.d && this.e == iuy.e && this.b.equals(iuy.b) && this.c.equals(iuy.c);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackCollectionState{mContextUri='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mTrackUri='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mInCollection=");
        sb.append(this.d);
        sb.append(", mCollectable=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
