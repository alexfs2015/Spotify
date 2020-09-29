package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.newplaying.scroll.view.PeekScrollView.a;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$tdt$aRc7CBmyIP3Q1Q9r6pjYsL3YLp8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tdt$aRc7CBmyIP3Q1Q9r6pjYsL3YLp8 implements Cancellable {
    private final /* synthetic */ PeekScrollView f$0;
    private final /* synthetic */ a f$1;

    public /* synthetic */ $$Lambda$tdt$aRc7CBmyIP3Q1Q9r6pjYsL3YLp8(PeekScrollView peekScrollView, a aVar) {
        this.f$0 = peekScrollView;
        this.f$1 = aVar;
    }

    public final void cancel() {
        this.f$0.a.remove(fbp.a(this.f$1));
    }
}
