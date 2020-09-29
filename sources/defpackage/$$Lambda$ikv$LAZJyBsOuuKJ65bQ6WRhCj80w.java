package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ikv$LAZJyBsOuuKJ-65-bQ6WRhCj80w reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$LAZJyBsOuuKJ65bQ6WRhCj80w implements SingleOnSubscribe {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ PlaybackPosition f$1;

    public /* synthetic */ $$Lambda$ikv$LAZJyBsOuuKJ65bQ6WRhCj80w(ikv ikv, PlaybackPosition playbackPosition) {
        this.f$0 = ikv;
        this.f$1 = playbackPosition;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
