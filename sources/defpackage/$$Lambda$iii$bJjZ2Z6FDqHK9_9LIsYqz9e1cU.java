package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$iii$bJjZ2Z6F-DqHK9_9LIsYqz9e1cU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$bJjZ2Z6FDqHK9_9LIsYqz9e1cU implements SingleOnSubscribe {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ PlaybackPosition f$1;

    public /* synthetic */ $$Lambda$iii$bJjZ2Z6FDqHK9_9LIsYqz9e1cU(iii iii, PlaybackPosition playbackPosition) {
        this.f$0 = iii;
        this.f$1 = playbackPosition;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}
