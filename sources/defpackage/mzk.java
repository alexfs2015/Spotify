package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.video.model.PlayerError;

/* renamed from: mzk reason: default package */
public final class mzk implements vua<String> {
    private final wlc<mzd> a;

    private mzk(wlc<mzd> wlc) {
        this.a = wlc;
    }

    public static mzk a(wlc<mzd> wlc) {
        return new mzk(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Bundle) fay.a(((mzd) this.a.get()).i)).getString(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY), "Cannot return null from a non-@Nullable @Provides method");
    }
}
