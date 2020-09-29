package defpackage;

import com.spotify.nowplaying.core.shuffle.ShuffleState;

/* renamed from: vdb reason: default package */
public final class vdb {
    public static ShuffleState a(boolean z, boolean z2) {
        return z ? ShuffleState.SELECTED : z2 ? ShuffleState.NORMAL : ShuffleState.DISABLED;
    }
}
