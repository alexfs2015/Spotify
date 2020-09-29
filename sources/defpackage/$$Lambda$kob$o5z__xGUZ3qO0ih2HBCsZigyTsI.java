package defpackage;

import com.spotify.music.ads.voice.domain.CueType;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$kob$o5z__xGUZ3qO0ih2HBCsZigyTsI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kob$o5z__xGUZ3qO0ih2HBCsZigyTsI implements SingleOnSubscribe {
    private final /* synthetic */ kob f$0;
    private final /* synthetic */ CueType f$1;

    public /* synthetic */ $$Lambda$kob$o5z__xGUZ3qO0ih2HBCsZigyTsI(kob kob, CueType cueType) {
        this.f$0 = kob;
        this.f$1 = cueType;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
