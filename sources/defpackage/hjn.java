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

/* renamed from: hjn reason: default package */
public class hjn implements hec {
    private final Flowable<fpt> a;
    private final gbs<List<vie>> b;

    public hjn(Context context, vhw vhw) {
        this(vun.a((ObservableSource<T>) vhw.a(new Intent(context, FeatureService.class), hjn.class.getSimpleName()), BackpressureStrategy.BUFFER).b(vun.a(AndroidSchedulers.a())).f($$Lambda$hjn$3z3ySEAeWmdoutPKdO9LvSpQY0.INSTANCE));
    }

    private hjn(wud<hjh> wud) {
        vhz vhz = new vhz(hjn.class.getSimpleName(), vun.b(OperatorReplay.a(wud.d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$hjn$TiWl2pp4zI94lOxChNKjNa8QjFM.INSTANCE), 1).e()));
        this.a = Observable.a((ObservableOnSubscribe<T>) vhz).a(BackpressureStrategy.BUFFER);
        vhz.getClass();
        this.b = new $$Lambda$BuNwhbsTb4KdGOz9_ch31bpJKQ0(vhz);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hjh hjh, Emitter emitter) {
        emitter.getClass();
        $$Lambda$ZSzLtD190ZVmQI6TbA2yZ_wyJm4 r0 = new $$Lambda$ZSzLtD190ZVmQI6TbA2yZ_wyJm4(emitter);
        emitter.a((wur) new $$Lambda$hjn$Qhp2CVO7jvEQmcqw_VWxhZa_iX8(hjh, r0));
        hjh.a(r0);
    }

    public final Flowable<fpt> a() {
        return this.a;
    }

    public final List<vie> b() {
        return (List) this.b.call();
    }

    public final <T extends Serializable> Flowable<T> a(fps<T> fps) {
        return this.a.c((Function<? super T, ? extends R>) new $$Lambda$hjn$oJRXZsiNYT9grQUb7qp40n1rpU<Object,Object>(fps)).a(Functions.a());
    }
}
