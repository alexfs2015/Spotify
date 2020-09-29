package defpackage;

import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;

/* renamed from: ifo reason: default package */
public final class ifo {
    StateType a;
    boolean b;

    public ifo(StateType stateType, boolean z) {
        this.a = stateType;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifo)) {
            return false;
        }
        ifo ifo = (ifo) obj;
        return this.b == ifo.b && this.a == ifo.a;
    }

    public final int hashCode() {
        StateType stateType = this.a;
        return ((stateType != null ? stateType.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BooleanAdState{mState=");
        sb.append(this.a);
        sb.append(", mActive=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
