package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Map;
import java.util.Map.Entry;
import rx.internal.operators.EmptyObservableHolder;

/* renamed from: isn reason: default package */
public final class isn {
    private final CollectionStateProvider a;
    private final sso b;
    private final iss c;

    public isn(CollectionStateProvider collectionStateProvider, iss iss, sso sso) {
        this.a = collectionStateProvider;
        this.c = iss;
        this.b = sso;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList a(Map map) {
        a g = ImmutableList.g();
        return map.isEmpty() ? g.a() : g.b(fdd.a(fdd.b(map.entrySet(), $$Lambda$isn$C5191q7OTHXBn5gH2UXNjVroH_o.INSTANCE), (Function<? super F, ? extends T>) $$Lambda$sBLDR7shzwjsWBtu9ExLORa1E.INSTANCE)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str, ImmutableList immutableList) {
        return immutableList.isEmpty() ? EmptyObservableHolder.a() : wit.a((ObservableSource<T>) this.a.a(this.b.toString(), str, (String[]) immutableList.toArray(new String[0])), BackpressureStrategy.BUFFER).f($$Lambda$isn$kFWRJmeijVPn_fj18etqqYbkkfo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Map map) {
        if (map.isEmpty()) {
            return Boolean.FALSE;
        }
        for (Entry value : map.entrySet()) {
            if (!((CollectionStateProvider.a) value.getValue()).a()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public final xii<Map<String, CollectionStateProvider.a>> a(String str) {
        return this.c.a(str).h(new $$Lambda$isn$eYfI4TNoyiz4JPPpLti6fHnT99s(this, str)).f($$Lambda$isn$o77Pg_4bXnk1C7Q5SkX0CmdFlc.INSTANCE);
    }

    public final xii<Boolean> b(String str) {
        return a(str).e((xiy<? super T, ? extends R>) $$Lambda$isn$DbYHERv46CKpQWcmS1ign0Iqpo.INSTANCE).g($$Lambda$isn$RxwBpZcat4qW87g0USvx0hYpE4.INSTANCE);
    }

    public final Observable<ImmutableList<String>> c(String str) {
        return wit.b(a(str)).c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$isn$eeEoFg00JC48j5cAiDQqYCQ10HQ.INSTANCE).f((ObservableSource<? extends T>) Observable.b(ImmutableList.d())).e((io.reactivex.functions.Function<? super Throwable, ? extends T>) $$Lambda$isn$aq1963wUa3KKM2mcGsTbAZXhG5I.INSTANCE);
    }
}
