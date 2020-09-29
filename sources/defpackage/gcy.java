package defpackage;

import com.spotify.effortlesslogin.LoginState;
import com.spotify.effortlesslogin.LoginState.Type;

/* renamed from: gcy reason: default package */
public final class gcy extends LoginState {
    private final Type a;

    public gcy(Type type) {
        if (type != null) {
            this.a = type;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final Type a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginState{type=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginState)) {
            return false;
        }
        return this.a.equals(((LoginState) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
