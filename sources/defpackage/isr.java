package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a;

/* renamed from: isr reason: default package */
public final class isr extends a {
    private final boolean a;
    private final boolean b;

    public isr(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a == aVar.a() && this.b == aVar.b();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionState{inCollection=");
        sb.append(this.a);
        sb.append(", banned=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
