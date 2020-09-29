package defpackage;

import com.spotify.nowplaying.core.shuffle.ShuffleState;

/* renamed from: urw reason: default package */
public final class urw {
    public static ShuffleState a(boolean z, boolean z2) {
        if (z) {
            return ShuffleState.SELECTED;
        }
        if (z2) {
            return ShuffleState.NORMAL;
        }
        return ShuffleState.DISABLED;
    }
}
