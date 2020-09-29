package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$tcl$3hAHTD6lOL0iBSddIS1M7P51Dwk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tcl$3hAHTD6lOL0iBSddIS1M7P51Dwk implements Cancellable {
    private final /* synthetic */ WidgetsContainer f$0;
    private final /* synthetic */ OnScrollChangedListener f$1;

    public /* synthetic */ $$Lambda$tcl$3hAHTD6lOL0iBSddIS1M7P51Dwk(WidgetsContainer widgetsContainer, OnScrollChangedListener onScrollChangedListener) {
        this.f$0 = widgetsContainer;
        this.f$1 = onScrollChangedListener;
    }

    public final void cancel() {
        this.f$0.getViewTreeObserver().removeOnScrollChangedListener(this.f$1);
    }
}
