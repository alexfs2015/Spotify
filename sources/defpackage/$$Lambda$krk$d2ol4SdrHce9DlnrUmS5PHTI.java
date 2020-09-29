package defpackage;

import com.spotify.music.ads.voice.domain.CueType;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$krk$-d2ol4SdrH-ce9DlnrUmS5PHT-I reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krk$d2ol4SdrHce9DlnrUmS5PHTI implements SingleOnSubscribe {
    private final /* synthetic */ krk f$0;
    private final /* synthetic */ CueType f$1;

    public /* synthetic */ $$Lambda$krk$d2ol4SdrHce9DlnrUmS5PHTI(krk krk, CueType cueType) {
        this.f$0 = krk;
        this.f$1 = cueType;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
