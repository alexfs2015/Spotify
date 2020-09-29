package defpackage;

import com.spotify.effortlesslogin.LoginState;
import com.spotify.effortlesslogin.LoginState.Type;

/* renamed from: gej reason: default package */
public final class gej extends LoginState {
    private final Type a;
    private final String b;

    public gej(Type type, String str) {
        if (type != null) {
            this.a = type;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null errorMessage");
        }
        throw new NullPointerException("Null getType");
    }

    public final Type a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoginState) {
            LoginState loginState = (LoginState) obj;
            return this.a.equals(loginState.a()) && this.b.equals(loginState.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginState{getType=");
        sb.append(this.a);
        sb.append(", errorMessage=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
