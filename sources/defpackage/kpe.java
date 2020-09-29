package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.features.navigation.BottomTab;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: kpe reason: default package */
public final class kpe implements a {
    private final CompositeDisposable a;
    private final fot<rmb> b = fot.a();

    public kpe(CompositeDisposable compositeDisposable) {
        this.a = compositeDisposable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rmb a(String str, BottomTab bottomTab, rmb rmb) {
        if (!(rmb instanceof rmc)) {
            return rmb;
        }
        rmc rmc = (rmc) rmb;
        if (rmc.b() == null) {
            rmc = new rlv(rmc.a(), str, rmc.c(), rmc.d());
        }
        return new rlv(rmc.a(), rmc.b(), bottomTab.mRootUri, rmc.d());
    }

    public final void a(Fragment fragment, String str) {
        if (fragment instanceof jqx) {
            this.a.a(((jqx) fragment).af().a.e(a.a(str)).c((Function<? super T, ? extends R>) new $$Lambda$kpe$6iiGgaUK0pLBFz_1fWUgGylwvY<Object,Object>(str, jqw.a(fragment))).d((Consumer<? super T>) this.b));
        }
    }

    public final Observable<rmb> getObservable() {
        return this.b;
    }
}
