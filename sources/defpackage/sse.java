package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: sse reason: default package */
public final class sse {
    private final WidgetsContainer a;
    private final Rect b = new Rect();

    public sse(WidgetsContainer widgetsContainer) {
        this.a = widgetsContainer;
    }

    public final Flowable<ssd> a() {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sse$QEvzzQys0dkwDy6CtbqSq6OYbQI<T>(this, this.a), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(WidgetsContainer widgetsContainer, FlowableEmitter flowableEmitter) {
        for (int i = 0; i < widgetsContainer.getChildCount(); i++) {
            View childAt = widgetsContainer.getChildAt(i);
            flowableEmitter.a(new ssc((Type) childAt.getTag(), i, childAt.getGlobalVisibleRect(this.b) ? ((float) this.b.height()) / ((float) childAt.getMeasuredHeight()) : 0.0f));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(WidgetsContainer widgetsContainer, FlowableEmitter flowableEmitter) {
        $$Lambda$sse$VHFeoMAJnnN3Fos7QtK5a7d8CcE r0 = new $$Lambda$sse$VHFeoMAJnnN3Fos7QtK5a7d8CcE(this, widgetsContainer, flowableEmitter);
        widgetsContainer.getViewTreeObserver().addOnScrollChangedListener(r0);
        flowableEmitter.a(new $$Lambda$sse$UxJ9reqLMERQia8xFr2lOEJ9rk(widgetsContainer, r0));
    }
}
