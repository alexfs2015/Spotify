package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.video.model.PlayerError;

/* renamed from: mzs reason: default package */
public final class mzs implements vua<String> {
    private final wlc<mzd> a;

    private mzs(wlc<mzd> wlc) {
        this.a = wlc;
    }

    public static mzs a(wlc<mzd> wlc) {
        return new mzs(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((Bundle) fay.a(((mzd) this.a.get()).i)).getString(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY), "Cannot return null from a non-@Nullable @Provides method");
    }
}
