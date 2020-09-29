package defpackage;

import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ssa reason: default package */
public final class ssa implements a {
    private final Flowable<Integer> a;
    private final jwr b;
    private boolean c;
    private final CompositeDisposable d = new CompositeDisposable();
    private urx e;

    public ssa(Flowable<Integer> flowable, jws jws) {
        this.a = flowable;
        this.b = jws.a(0, 500, this);
    }

    public final void a(int i) {
        urx urx = this.e;
        if (urx != null) {
            urx.a(i);
        }
    }

    public final void a(urx urx) {
        if (this.e == null) {
            this.c = true;
            this.e = (urx) fay.a(urx);
            this.d.a(this.a.a((Consumer<? super T>) new $$Lambda$ssa$RKij4LJy8RD2O6LT1j78eqczV0<Object>(this), (Consumer<? super Throwable>) $$Lambda$ssa$O1yWRUNZ96tpAuGDWdGqFBPcqpc.INSTANCE));
            return;
        }
        throw new IllegalStateException("There's already a widget attached to this controller. Make sure you use a unique WidgetColorTransitionController per widget or don't call `setColorSetter` again before `removeColorSetter`.");
    }

    public final void a() {
        this.d.c();
        this.e = null;
    }

    /* access modifiers changed from: private */
    public void b(int i) {
        if (this.c) {
            this.c = false;
            this.b.a(i);
            return;
        }
        this.b.b(i);
    }
}
