package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: vpj reason: default package */
public final class vpj implements vpv {
    private final vpl a;
    private final CompositeDisposable b = new CompositeDisposable();
    private final vpw c;
    private final vqf d;

    public vpj(vpl vpl, vpw vpw, vqf vqf) {
        this.a = vpl;
        this.c = vpw;
        this.d = vqf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        String format = String.format("Updating token failed with error %s", new Object[]{th.getMessage()});
        Logger.b(format, new Object[0]);
        this.d.a(format);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        String format = String.format("Fetching FCM token failed with error %s", new Object[]{th.getMessage()});
        Logger.d("errorMessage", new Object[0]);
        this.d.a(format);
    }

    public final void a() {
        this.b.a(this.a.a().a(1).a((Consumer<? super T>) new $$Lambda$NhIwxIEsScznmWeBB8Q5JM7Kk8<Object>(this), (Consumer<? super Throwable>) new $$Lambda$vpj$Vs2ommM0_o1ebWOpirqyrwhBEOk<Object>(this)));
    }

    public final void a(String str) {
        this.b.a(this.c.a(str).a((Action) $$Lambda$vpj$Le3k9ES5u3uKVf_zoTq1o6iwbqk.INSTANCE, (Consumer<? super Throwable>) new $$Lambda$vpj$NwGLejNNz2O_ag6bPwzqW_YSt7Q<Object>(this)));
    }

    public final void b() {
        this.b.c();
    }
}
