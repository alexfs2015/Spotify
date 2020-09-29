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

/* renamed from: itt reason: default package */
public final class itt {
    final itv a;
    final isd b;
    final itp c;
    final itk d;
    String e;
    LocationsHolder f = LocationsHolder.EMPTY;
    private Disposable g;
    private final Predicate<String> h = $$Lambda$itt$qopBjhteLexFq71ahYRx0nLRKsI.INSTANCE;
    private final Function<String, Single<wsj<LocationsHolder>>> i = new Function<String, Single<wsj<LocationsHolder>>>() {
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            itt itt = itt.this;
            itt.e = str;
            return itt.b.a.b(str);
        }
    };

    public itt(itv itv, isd isd, itp itp, itk itk) {
        Assertion.a((Object) itv);
        Assertion.a((Object) isd);
        Assertion.a((Object) itp);
        this.a = itv;
        this.b = isd;
        this.c = itp;
        this.d = itk;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (fax.a(this.e)) {
            this.a.ak();
        } else if (this.f.getLocations().isEmpty()) {
            this.a.al();
        } else {
            this.a.a(this.f);
        }
    }

    public final void a(Flowable<String> flowable) {
        b();
        this.g = flowable.a(this.h).f(this.i).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$itt$6Q4e8ZaUe77obgDY9ldnLGMflIw<Object>(this), (Consumer<? super Throwable>) new $$Lambda$itt$x5Rt7eqry6APs9K4OfcUt0GKzmw<Object>(this));
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wsj wsj) {
        if (!wsj.a() || wsj.b() == null) {
            this.a.am();
            return;
        }
        this.f = (LocationsHolder) wsj.b();
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.am();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Disposable disposable = this.g;
        if (disposable != null && !disposable.b()) {
            this.g.bf_();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str) {
        return !fax.a(str) && str.length() >= 3;
    }
}
