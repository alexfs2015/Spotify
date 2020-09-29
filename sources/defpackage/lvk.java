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

/* renamed from: lvk reason: default package */
public final class lvk {
    public final HashMap<String, lvf> a = new HashMap<>();
    private final lvf b;
    private final lvf c;
    private final lvf d;
    private final lvf e;
    private final lvq f;
    private final jym<vlf> g;

    public lvk(lvm lvm, lvo lvo, lvv lvv, lvs lvs, lvq lvq, jym<vlf> jym) {
        this.b = lvm;
        this.c = lvo;
        this.d = lvv;
        this.e = lvs;
        this.f = lvq;
        this.g = jym;
        this.a.put(this.b.a(), this.b);
        this.a.put(this.c.a(), this.c);
        this.a.put(this.d.a(), this.d);
        this.a.put(this.e.a(), this.e);
        this.a.put("similar_to", this.f);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Set set, vlf vlf) {
        this.f.e.a.onNext(new CardAction(null, Action.ADD_CARDS_BASED_ON_TRACK, luu.a(vlf), set));
    }

    public final xii<List<lux>> a(Set<String> set, String str) {
        xii a2 = xii.a((xii<? extends T>) ScalarSynchronousObservable.d(Collections.emptyList()), this.f.a(set, str));
        xii a3 = this.e.a(set, str);
        xii a4 = this.d.a(set, str);
        xii a5 = this.c.a(set, str);
        xii a6 = this.b.a(set, str);
        return xii.a(Arrays.asList(new xii[]{a2, a3, a4, a5, a6}), (xjc<? extends R>) new xjc<R>($$Lambda$lvk$tbtTMGeM3s4sCu6h1WeH2Ln01JE.INSTANCE) {
            private /* synthetic */ xjb a;

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

    public final void a(String str, Set<String> set, String str2) {
        wit.a((ObservableSource<T>) this.g.a(str2, str), BackpressureStrategy.BUFFER).a((xis<? super T>) new $$Lambda$lvk$gwtdxugeYHodxFRAT6GZRaLKE58<Object>(this, set), (xis<Throwable>) $$Lambda$lvk$pIV3hbIdAoKIcyqv0EhRP3F9x4Q.INSTANCE);
    }

    public final void a(List<byte[]> list) {
        if (list.size() == this.a.values().size()) {
            int i = 0;
            for (lvf a2 : this.a.values()) {
                a2.a((byte[]) list.get(i));
                i++;
            }
        }
    }

    public final void a(Set<String> set) {
        for (lvf a2 : this.a.values()) {
            a2.a(set);
        }
    }
}
