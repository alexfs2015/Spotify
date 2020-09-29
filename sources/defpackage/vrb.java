package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: vrb reason: default package */
final class vrb extends vrg {
    private final PlayerState a;
    private final String b;
    private final boolean c;

    vrb(PlayerState playerState, String str, boolean z) {
        if (playerState != null) {
            this.a = playerState;
            if (str != null) {
                this.b = str;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null authToken");
        }
        throw new NullPointerException("Null playerState");
    }

    public final PlayerState a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeechProxyDependenciesHolder{playerState=");
        sb.append(this.a);
        sb.append(", authToken=");
        sb.append(this.b);
        sb.append(", nftDisabled=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrg) {
            vrg vrg = (vrg) obj;
            return this.a.equals(vrg.a()) && this.b.equals(vrg.b()) && this.c == vrg.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }
}
