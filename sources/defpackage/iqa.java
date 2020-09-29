package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.Map.Entry;
import rx.internal.operators.EmptyObservableHolder;

/* renamed from: iqa reason: default package */
public final class iqa {
    private final CollectionStateProvider a;
    private final sih b;
    private final iqf c;

    public iqa(CollectionStateProvider collectionStateProvider, iqf iqf, sih sih) {
        this.a = collectionStateProvider;
        this.c = iqf;
        this.b = sih;
    }

    public final wud<Map<String, a>> a(String str) {
        return this.c.a(str).i(new $$Lambda$iqa$iaWm70d7m97WnJmKaLfyK6WF6t4(this, str)).g($$Lambda$iqa$G2jXeaUZeVQAMWtqkNfPNa_GMQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str, ImmutableList immutableList) {
        if (immutableList.isEmpty()) {
            return EmptyObservableHolder.a();
        }
        return vun.a((ObservableSource<T>) this.a.a(this.b.toString(), str, (String[]) immutableList.toArray(new String[0])), BackpressureStrategy.BUFFER).g($$Lambda$iqa$GWlrlLXwbGGJTbAvq9gCRWe3DtY.INSTANCE);
    }

    public final wud<Boolean> b(String str) {
        return a(str).f($$Lambda$iqa$VBo3DwBZZsraoshceVZJIdmBLAo.INSTANCE).h($$Lambda$iqa$3a2KRaT71stkzpQ86lJFnuAen6s.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Map map) {
        if (map.isEmpty()) {
            return Boolean.FALSE;
        }
        for (Entry value : map.entrySet()) {
            if (!((a) value.getValue()).a()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public final Observable<ImmutableList<String>> c(String str) {
        return vun.b(a(str)).c((Function<? super T, ? extends R>) $$Lambda$iqa$ry_XGyCAj5XVRqBAccrfkJLyA94.INSTANCE).f((ObservableSource<? extends T>) Observable.b(ImmutableList.d())).e((Function<? super Throwable, ? extends T>) $$Lambda$iqa$pVUnDXh3GP3dyXUOWsPwgL3Otjs.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList a(Map map) {
        ImmutableList.a g = ImmutableList.g();
        if (map.isEmpty()) {
            return g.a();
        }
        return g.b(fcl.a(fcl.b(map.entrySet(), $$Lambda$iqa$FT24VfKArOQ5Tgj_NfpmSow1rWA.INSTANCE), (com.google.common.base.Function<? super F, ? extends T>) $$Lambda$sBLDR7shzwjsWBtu9ExLORa1E.INSTANCE)).a();
    }
}
