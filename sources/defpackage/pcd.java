package defpackage;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: pcd reason: default package */
final class pcd {
    final SerialDisposable a = new SerialDisposable();
    String b;
    private final hgz c;
    private final RxWebToken d;
    private final Scheduler e;
    private final String f;

    public pcd(String str, hgz hgz, RxWebToken rxWebToken, Scheduler scheduler) {
        this.f = str;
        this.c = hgz;
        this.d = rxWebToken;
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.b = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str) {
        String replace = str.replace("{uri}", this.f);
        return this.d.a(Uri.parse(replace)).c((Function<? super T, ? extends R>) $$Lambda$luegRmTnGB7jGDq5_BWX9iAuHi8.INSTANCE).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) new $$Lambda$pcd$GqKgibOTVs35tN3ox724UsTSKr8<Object,Object>(replace));
    }

    public final void a() {
        this.a.a(wit.b(this.c.a("ugc-abuse-report-url")).h(new $$Lambda$pcd$UWtNyKynK14SKknSYN4cYjwALWM(this)).a(this.e).a((Consumer<? super T>) new $$Lambda$pcd$1IBQRynCfPFWtYwwFI91fO9tNzE<Object>(this), (Consumer<? super Throwable>) $$Lambda$pcd$FlkP0lhn6TUqGX43ADWdoNlYXcA.INSTANCE));
    }
}
