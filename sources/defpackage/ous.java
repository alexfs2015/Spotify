package defpackage;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: ous reason: default package */
final class ous {
    final SerialDisposable a = new SerialDisposable();
    String b;
    private final hed c;
    private final RxWebToken d;
    private final Scheduler e;
    private final String f;

    public ous(String str, hed hed, RxWebToken rxWebToken, Scheduler scheduler) {
        this.f = str;
        this.c = hed;
        this.d = rxWebToken;
        this.e = scheduler;
    }

    public final void a() {
        this.a.a(vun.b(this.c.a("ugc-abuse-report-url")).h(new $$Lambda$ous$E3lAyEqbEXBCtwryBa7WoxRQ8Wo(this)).a(this.e).a((Consumer<? super T>) new $$Lambda$ous$hnSPKG7tbBWfzr0n9nT28i5oIE<Object>(this), (Consumer<? super Throwable>) $$Lambda$ous$_J7Dq5xgthLy4sVHmJ8Bt4UglsI.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str) {
        String replace = str.replace("{uri}", this.f);
        return this.d.a(Uri.parse(replace)).c((Function<? super T, ? extends R>) $$Lambda$luegRmTnGB7jGDq5_BWX9iAuHi8.INSTANCE).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) new $$Lambda$ous$7mlH4hgEIuLAcld06dkG0p6k5Y<Object,Object>(replace));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.b = str;
    }
}
