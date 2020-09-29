package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$sse$UxJ9-reqLMERQia8xFr2lOEJ9rk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sse$UxJ9reqLMERQia8xFr2lOEJ9rk implements Cancellable {
    private final /* synthetic */ WidgetsContainer f$0;
    private final /* synthetic */ OnScrollChangedListener f$1;

    public /* synthetic */ $$Lambda$sse$UxJ9reqLMERQia8xFr2lOEJ9rk(WidgetsContainer widgetsContainer, OnScrollChangedListener onScrollChangedListener) {
        this.f$0 = widgetsContainer;
        this.f$1 = onScrollChangedListener;
    }

    public final void cancel() {
        this.f$0.getViewTreeObserver().removeOnScrollChangedListener(this.f$1);
    }
}
