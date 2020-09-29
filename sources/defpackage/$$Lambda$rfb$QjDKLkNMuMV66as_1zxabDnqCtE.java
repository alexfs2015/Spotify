package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$rfb$QjDKLkNMuMV66as_1zxabDnqCtE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rfb$QjDKLkNMuMV66as_1zxabDnqCtE implements Consumer {
    private final /* synthetic */ OffliningLogger f$0;
    private final /* synthetic */ MusicPagesLogger f$1;

    public /* synthetic */ $$Lambda$rfb$QjDKLkNMuMV66as_1zxabDnqCtE(OffliningLogger offliningLogger, MusicPagesLogger musicPagesLogger) {
        this.f$0 = offliningLogger;
        this.f$1 = musicPagesLogger;
    }

    public final void accept(Object obj) {
        rfb.a(this.f$0, this.f$1, (m) obj);
    }
}
