package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: srz reason: default package */
public final class srz {
    Disposable a;
    private final a b;

    public srz(a aVar) {
        this.b = aVar;
    }

    public final void a(final stj stj) {
        this.b.a(new c() {
            public final void e() {
                srz srz = srz.this;
                srz.a = stj.e().e(new $$Lambda$srz$kOuKbw5Tmqs26oBEztiDUguSoY(stj)).c((Consumer<? super T>) new $$Lambda$srz$SwW_iMlkdOOFFFFqY7tI5evpeH0<Object>(stj));
            }

            public final void f() {
                srz.this.a.bf_();
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wrf a(stj stj, Boolean bool) {
        return bool.booleanValue() ? Flowable.b() : stj.a();
    }
}
