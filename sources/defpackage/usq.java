package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.ThumbState;

/* renamed from: usq reason: default package */
public final class usq implements xis<Throwable> {
    private final usj a;
    private final jvf b;

    public usq(usj usj, jvf jvf) {
        this.a = usj;
        this.b = jvf;
    }

    public final /* synthetic */ void call(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.a(ThumbState.NONE);
        this.a.c();
        this.b.a((int) R.string.toast_unable_to_thumb_radio, 1, new Object[0]);
        Logger.e(th, "(dailymix) problem thukbing track", new Object[0]);
    }
}
