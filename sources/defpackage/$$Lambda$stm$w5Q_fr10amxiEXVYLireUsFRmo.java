package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.newplaying.scroll.view.PeekScrollView.a;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$stm$w5Q_fr10amxi-EXVYLireUsFRmo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$stm$w5Q_fr10amxiEXVYLireUsFRmo implements Cancellable {
    private final /* synthetic */ PeekScrollView f$0;
    private final /* synthetic */ a f$1;

    public /* synthetic */ $$Lambda$stm$w5Q_fr10amxiEXVYLireUsFRmo(PeekScrollView peekScrollView, a aVar) {
        this.f$0 = peekScrollView;
        this.f$1 = aVar;
    }

    public final void cancel() {
        this.f$0.a.remove(fay.a(this.f$1));
    }
}
