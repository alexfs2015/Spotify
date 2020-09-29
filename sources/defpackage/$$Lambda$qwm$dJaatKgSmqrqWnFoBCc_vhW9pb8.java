package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qwm$dJaatKgSmqrqWnFoBCc_vhW9pb8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qwm$dJaatKgSmqrqWnFoBCc_vhW9pb8 implements Consumer {
    private final /* synthetic */ OffliningLogger f$0;
    private final /* synthetic */ MusicPagesLogger f$1;

    public /* synthetic */ $$Lambda$qwm$dJaatKgSmqrqWnFoBCc_vhW9pb8(OffliningLogger offliningLogger, MusicPagesLogger musicPagesLogger) {
        this.f$0 = offliningLogger;
        this.f$1 = musicPagesLogger;
    }

    public final void accept(Object obj) {
        qwm.a(this.f$0, this.f$1, (m) obj);
    }
}
