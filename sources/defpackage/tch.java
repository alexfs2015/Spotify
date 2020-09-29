package defpackage;

import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: tch reason: default package */
public final class tch implements a {
    private final Flowable<Integer> a;
    private final jyt b;
    private boolean c;
    private final CompositeDisposable d = new CompositeDisposable();
    private vdc e;

    public tch(Flowable<Integer> flowable, jyu jyu) {
        this.a = flowable;
        this.b = jyu.a(0, 500, this);
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

    public final void a() {
        this.d.c();
        this.e = null;
    }

    public final void a(int i) {
        vdc vdc = this.e;
        if (vdc != null) {
            vdc.a(i);
        }
    }

    public final void a(vdc vdc) {
        if (this.e == null) {
            this.c = true;
            this.e = (vdc) fbp.a(vdc);
            this.d.a(this.a.a((Consumer<? super T>) new $$Lambda$tch$hJf6sGvprVraY0gd5erpfcoqi1E<Object>(this), (Consumer<? super Throwable>) $$Lambda$tch$s5FvSz5tZ7nBT9uUdNAz2gumhu8.INSTANCE));
            return;
        }
        throw new IllegalStateException("There's already a widget attached to this controller. Make sure you use a unique WidgetColorTransitionController per widget or don't call `setColorSetter` again before `removeColorSetter`.");
    }
}
