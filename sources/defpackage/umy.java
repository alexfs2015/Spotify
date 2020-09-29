package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

/* renamed from: umy reason: default package */
final class umy extends a {
    private final PlayerContext a;
    private final boolean b;

    umy(PlayerContext playerContext, boolean z) {
        this.a = playerContext;
        this.b = z;
    }

    /* access modifiers changed from: 0000 */
    public final PlayerContext a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryPlayerContext{playerContext=");
        sb.append(this.a);
        sb.append(", isQbd=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            PlayerContext playerContext = this.a;
            if (playerContext != null ? playerContext.equals(aVar.a()) : aVar.a() == null) {
                if (this.b == aVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        PlayerContext playerContext = this.a;
        return (((playerContext == null ? 0 : playerContext.hashCode()) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}
