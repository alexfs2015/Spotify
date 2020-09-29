package defpackage;

import android.content.Context;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;

/* renamed from: nvw reason: default package */
public final class nvw {
    private final Observable<String> a;
    private final Context b;
    private final jvy c;

    public nvw(wud<String> wud, Context context, jvy jvy) {
        this.a = vun.b(wud);
        this.b = context;
        this.c = jvy;
    }

    public final Observable<Boolean> a() {
        return this.a.h(new $$Lambda$nvw$F8GJRB4TBjSCxm7eQSjd59JZ7CQ(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str) {
        return Observable.b(Boolean.valueOf(this.c.a(this.b, str).a(nve.a, true)));
    }

    public final Completable a(boolean z) {
        return this.a.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$nvw$zvyrFAewtThAdxiP2aIKDGzlCt4<Object,Object>(this, z), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z) {
        this.c.a(this.b, str).a().a(nve.a, z).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z, String str) {
        return Completable.a((Action) new $$Lambda$nvw$ajnPqs8LXPuotnnD72A3Iy0yUTk(this, str, z));
    }
}
