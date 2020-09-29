package defpackage;

import android.content.Context;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;

/* renamed from: ocj reason: default package */
public final class ocj {
    private final Observable<String> a;
    private final Context b;
    private final jyg c;

    public ocj(xii<String> xii, Context context, jyg jyg) {
        this.a = wit.b(xii);
        this.b = context;
        this.c = jyg;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z, String str) {
        return Completable.a((Action) new $$Lambda$ocj$qUq1OHOcweV5tmnX2oSUMexO_U(this, str, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str) {
        return Observable.b(Boolean.valueOf(this.c.a(this.b, str).a(obr.a, true)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, boolean z) {
        this.c.a(this.b, str).a().a(obr.a, z).a();
    }

    public final Completable a(boolean z) {
        return this.a.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$ocj$HIRFPiWfZjAuNiAkFHTMnLW4FFg<Object,Object>(this, z), false);
    }

    public final Observable<Boolean> a() {
        return this.a.h(new $$Lambda$ocj$iB_mOSkPCDiRYeWqCLXHr1M3EXc(this));
    }
}
