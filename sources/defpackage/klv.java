package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.features.navigation.BottomTab;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: klv reason: default package */
public final class klv implements a {
    private final CompositeDisposable a;
    private final fnz<rdd> b = fnz.a();

    public klv(CompositeDisposable compositeDisposable) {
        this.a = compositeDisposable;
    }

    public final Observable<rdd> getObservable() {
        return this.b;
    }

    public final void a(Fragment fragment, String str) {
        if (fragment instanceof jol) {
            this.a.a(((jol) fragment).af().a.e(a.a(str)).c((Function<? super T, ? extends R>) new $$Lambda$klv$2r8JPtbVx_froO_DQEXGg5wimnQ<Object,Object>(str, jok.a(fragment))).d((Consumer<? super T>) this.b));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rdd a(String str, BottomTab bottomTab, rdd rdd) {
        if (!(rdd instanceof rde)) {
            return rdd;
        }
        rde rde = (rde) rdd;
        if (rde.b() == null) {
            rde = new rcx(rde.a(), str, rde.c(), rde.d());
        }
        return new rcx(rde.a(), rde.b(), bottomTab.mRootUri, rde.d());
    }
}
