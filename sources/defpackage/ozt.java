package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: ozt reason: default package */
public class ozt {
    public final SerialDisposable a = new SerialDisposable();
    public boolean b;
    private final vjj c;
    private final String d;

    public ozt(vjj vjj, String str) {
        this.c = vjj;
        this.d = str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource c() {
        return this.b ? Completable.a() : this.c.a(this.d).b((Action) new $$Lambda$ozt$0U_K1r8VScNg5319RDY9vXzIc3w(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.b = true;
    }

    public final void a() {
        this.a.a(Completable.a((Callable<? extends CompletableSource>) new $$Lambda$ozt$uPdtK6vGGwKJyw3Wa3H4dkz0658<Object>(this)).a(Functions.c()).a((Action) $$Lambda$ozt$phfA4P9i0ixEQm69rnlYttcLKqc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$ozt$LU6pIwX_cwcYyNFRXrhwpqJfek.INSTANCE));
    }
}
