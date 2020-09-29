package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: rdb reason: default package */
public final class rdb implements a {
    private final fnz<rdd> a = fnz.a();
    /* access modifiers changed from: private */
    public Disposable b = Disposables.b();

    public rdb(final a aVar) {
        aVar.a(new c() {
            public final void aP_() {
                rdb.this.b.bf_();
                aVar.b(this);
            }
        });
    }

    public final Observable<rdd> getObservable() {
        return this.a;
    }

    public final void a(Fragment fragment) {
        if (fragment instanceof b) {
            a(((b) fragment).af().a);
        } else {
            this.a.accept(rde.a(PageIdentifiers.UNKNOWN.mPageIdentifier, null));
        }
    }

    private void a(Observable<rdd> observable) {
        this.b.bf_();
        this.b = observable.a((Consumer<? super T>) this.a, (Consumer<? super Throwable>) $$Lambda$rdb$i1dWYSL61r87XQebg8y2jcjiYfs.INSTANCE);
    }
}
