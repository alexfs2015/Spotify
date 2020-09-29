package defpackage;

import com.google.common.collect.Lists;
import com.spotify.music.features.assistedcuration.provider.CardAction;
import com.spotify.music.features.assistedcuration.provider.CardAction.Action;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: lrl reason: default package */
public final class lrl {
    public final HashMap<String, lrg> a = new HashMap<>();
    private final lrg b;
    private final lrg c;
    private final lrg d;
    private final lrg e;
    private final lrr f;
    private final jwe<uzc> g;

    public lrl(lrn lrn, lrp lrp, lrw lrw, lrt lrt, lrr lrr, jwe<uzc> jwe) {
        this.b = lrn;
        this.c = lrp;
        this.d = lrw;
        this.e = lrt;
        this.f = lrr;
        this.g = jwe;
        this.a.put(this.b.a(), this.b);
        this.a.put(this.c.a(), this.c);
        this.a.put(this.d.a(), this.d);
        this.a.put(this.e.a(), this.e);
        this.a.put("similar_to", this.f);
    }

    public final wud<List<lqy>> a(Set<String> set, String str) {
        wud a2 = wud.a((wud<? extends T>) ScalarSynchronousObservable.d(Collections.emptyList()), this.f.a(set, str));
        wud a3 = this.e.a(set, str);
        wud a4 = this.d.a(set, str);
        wud a5 = this.c.a(set, str);
        wud a6 = this.b.a(set, str);
        return wud.a(Arrays.asList(new wud[]{a2, a3, a4, a5, a6}), (wux<? extends R>) new wux<R>($$Lambda$lrl$Wy8qMSmDNClizDKUezEoNR3wy7s.INSTANCE) {
            private /* synthetic */ wuw a;

            {
                this.a = r1;
            }

            public final R a(Object... objArr) {
                if (objArr.length == 5) {
                    return this.a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                }
                throw new IllegalArgumentException("Func5 expecting 5 arguments.");
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(List list, List list2, List list3, List list4, List list5) {
        ArrayList a2 = Lists.a();
        a2.addAll(list);
        a2.addAll(list2);
        a2.addAll(list3);
        a2.addAll(list4);
        a2.addAll(list5);
        return a2;
    }

    public final void a(Set<String> set) {
        for (lrg a2 : this.a.values()) {
            a2.a(set);
        }
    }

    public final void a(String str, Set<String> set, String str2) {
        vun.a((ObservableSource<T>) this.g.a(str2, str), BackpressureStrategy.BUFFER).a((wun<? super T>) new $$Lambda$lrl$7icawmuXvxi3ln7xnHFMcG_IP0<Object>(this, set), (wun<Throwable>) $$Lambda$lrl$cisRhNx7tv7t9HOc3RNJHYsrkoc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Set set, uzc uzc) {
        this.f.e.a.onNext(new CardAction(null, Action.ADD_CARDS_BASED_ON_TRACK, lqv.a(uzc), set));
    }

    public final void a(List<byte[]> list) {
        if (list.size() == this.a.values().size()) {
            int i = 0;
            for (lrg a2 : this.a.values()) {
                a2.a((byte[]) list.get(i));
                i++;
            }
        }
    }
}
