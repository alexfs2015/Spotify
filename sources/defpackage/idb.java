package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;

/* renamed from: idb reason: default package */
public final class idb {
    StateType a;
    boolean b;

    public idb(StateType stateType, boolean z) {
        this.a = stateType;
        this.b = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BooleanAdState{mState=");
        sb.append(this.a);
        sb.append(", mActive=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idb)) {
            return false;
        }
        idb idb = (idb) obj;
        return this.b == idb.b && this.a == idb.a;
    }

    public final int hashCode() {
        StateType stateType = this.a;
        return ((stateType != null ? stateType.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }
}
