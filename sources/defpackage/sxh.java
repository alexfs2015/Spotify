package defpackage;

import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.UserIntent;

/* renamed from: sxh reason: default package */
public abstract class sxh extends jor implements tcc {
    public tad as;

    public final void ae() {
        this.as.a(null, SectionId.BACK_BUTTON, UserIntent.CLOSE, InteractionType.HIT);
    }
}
