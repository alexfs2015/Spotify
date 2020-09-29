package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: rlz reason: default package */
public final class rlz implements a {
    private final fot<rmb> a = fot.a();
    /* access modifiers changed from: private */
    public Disposable b = Disposables.b();

    public rlz(final a aVar) {
        aVar.a(new c() {
            public final void aN_() {
                rlz.this.b.bd_();
                aVar.b(this);
            }
        });
    }

    private void a(Observable<rmb> observable) {
        this.b.bd_();
        this.b = observable.a((Consumer<? super T>) this.a, (Consumer<? super Throwable>) $$Lambda$rlz$SE2TK9KcGauWZA_hq458u1nbg.INSTANCE);
    }

    public final void a(Fragment fragment) {
        if (fragment instanceof b) {
            a(((b) fragment).af().a);
        } else {
            this.a.accept(rmc.a(PageIdentifiers.UNKNOWN.mPageIdentifier, null));
        }
    }

    public final Observable<rmb> getObservable() {
        return this.a;
    }
}
