package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: tcl reason: default package */
public final class tcl {
    private final WidgetsContainer a;
    private final Rect b = new Rect();

    public tcl(WidgetsContainer widgetsContainer) {
        this.a = widgetsContainer;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(WidgetsContainer widgetsContainer, FlowableEmitter flowableEmitter) {
        for (int i = 0; i < widgetsContainer.getChildCount(); i++) {
            View childAt = widgetsContainer.getChildAt(i);
            flowableEmitter.a(new tcj((Type) childAt.getTag(), i, childAt.getGlobalVisibleRect(this.b) ? ((float) this.b.height()) / ((float) childAt.getMeasuredHeight()) : 0.0f));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(WidgetsContainer widgetsContainer, FlowableEmitter flowableEmitter) {
        $$Lambda$tcl$AqNTH45iMF4MoE4bjQT9Zd9QGtI r0 = new $$Lambda$tcl$AqNTH45iMF4MoE4bjQT9Zd9QGtI(this, widgetsContainer, flowableEmitter);
        widgetsContainer.getViewTreeObserver().addOnScrollChangedListener(r0);
        flowableEmitter.a(new $$Lambda$tcl$3hAHTD6lOL0iBSddIS1M7P51Dwk(widgetsContainer, r0));
    }

    public final Flowable<tck> a() {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$tcl$EN75l4vGoACSJNbzm0NXT2gAww<T>(this, this.a), BackpressureStrategy.LATEST);
    }
}
