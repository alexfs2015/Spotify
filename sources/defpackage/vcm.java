package defpackage;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: vcm reason: default package */
public final class vcm implements vcy {
    private final vco a;
    private final CompositeDisposable b = new CompositeDisposable();
    private final vcz c;

    public vcm(vco vco, vcz vcz) {
        this.a = vco;
        this.c = vcz;
    }

    public final void a() {
        this.b.a(this.a.a().a(1).a((Consumer<? super T>) new $$Lambda$PJQv5VTHokhVa06CKme4R6kbB0<Object>(this), (Consumer<? super Throwable>) $$Lambda$vcm$gzU8HA1tF7X89iPr8uhbdgYS4ro.INSTANCE));
    }

    public final void a(String str) {
        this.b.a(this.c.a(str).a((Action) $$Lambda$vcm$UbOT3hh0qHLMYyN27PFioJsg4fM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$vcm$wl9MoGLlonLVfDa3WV4j1wTI28.INSTANCE));
    }

    public final void b() {
        this.b.c();
    }
}
