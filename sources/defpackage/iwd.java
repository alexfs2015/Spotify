package defpackage;

import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.LocationsHolder;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: iwd reason: default package */
public final class iwd {
    final iwf a;
    final iug b;
    final ivz c;
    final ivt d;
    String e;
    LocationsHolder f = LocationsHolder.EMPTY;
    private Disposable g;
    private final Predicate<String> h = $$Lambda$iwd$i3goCqNw4qe56EhFh63bJqaDAjA.INSTANCE;
    private final Function<String, Single<xgo<LocationsHolder>>> i = new Function<String, Single<xgo<LocationsHolder>>>() {
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            iwd iwd = iwd.this;
            iwd.e = str;
            return iwd.b.a.b(str);
        }
    };

    public iwd(iwf iwf, iug iug, ivz ivz, ivt ivt) {
        Assertion.a((Object) iwf);
        Assertion.a((Object) iug);
        Assertion.a((Object) ivz);
        this.a = iwf;
        this.b = iug;
        this.c = ivz;
        this.d = ivt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.am();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(xgo xgo) {
        if (!xgo.a() || xgo.b() == null) {
            this.a.am();
            return;
        }
        this.f = (LocationsHolder) xgo.b();
        a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str) {
        return !fbo.a(str) && str.length() >= 3;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (fbo.a(this.e)) {
            this.a.ak();
        } else if (this.f.getLocations().isEmpty()) {
            this.a.al();
        } else {
            this.a.a(this.f);
        }
    }

    public final void a(Flowable<String> flowable) {
        b();
        this.g = flowable.a(this.h).f(this.i).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$iwd$0hWq4PayykP1BkokV0N7NsCFnsY<Object>(this), (Consumer<? super Throwable>) new $$Lambda$iwd$e0ANpbZQe6as8tSNtHC_cmcBz8<Object>(this));
        a();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Disposable disposable = this.g;
        if (disposable != null && !disposable.b()) {
            this.g.bd_();
        }
    }
}
