package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.feature.FeatureService;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.io.Serializable;
import java.util.List;
import rx.Emitter;
import rx.internal.operators.OperatorReplay;

/* renamed from: hmf reason: default package */
public class hmf implements hgy {
    private final Flowable<fqn> a;
    private final gcq<List<vvj>> b;

    public hmf(Context context, vvb vvb) {
        this(wit.a((ObservableSource<T>) vvb.a(new Intent(context, FeatureService.class), hmf.class.getSimpleName()), BackpressureStrategy.BUFFER).b(wit.a(AndroidSchedulers.a())).e((xiy<? super T, ? extends R>) $$Lambda$hmf$i2In7Uy41RM9522DuT8S_STP7Pk.INSTANCE));
    }

    private hmf(xii<hlz> xii) {
        vve vve = new vve(hmf.class.getSimpleName(), wit.b(OperatorReplay.a(xii.d((xiy<? super T, ? extends xii<? extends R>>) $$Lambda$hmf$C2USaIHELzk5kgSNPnm1dhZcXg.INSTANCE), 1).e()));
        this.a = Observable.a((ObservableOnSubscribe<T>) vve).a(BackpressureStrategy.BUFFER);
        vve.getClass();
        this.b = new $$Lambda$2vem5WZMcFRBSZ7kGjGsOn6ys(vve);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hlz hlz, Emitter emitter) {
        emitter.getClass();
        $$Lambda$q8GYsGm65PGbNS2_ARhKG8wvltE r0 = new $$Lambda$q8GYsGm65PGbNS2_ARhKG8wvltE(emitter);
        emitter.a((xiw) new $$Lambda$hmf$dIuBxczkozOCx6EifasxHfu9I(hlz, r0));
        hlz.a(r0);
    }

    public final Flowable<fqn> a() {
        return this.a;
    }

    public final <T extends Serializable> Flowable<T> a(fqm<T> fqm) {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$hmf$XoJ58rmLymabQV7Pwl1POBcg2fo<Object,Object>(fqm)).a(Functions.a());
    }

    public final List<vvj> b() {
        return (List) this.b.call();
    }
}
