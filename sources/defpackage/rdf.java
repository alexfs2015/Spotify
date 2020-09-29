package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Map.Entry;

/* renamed from: rdf reason: default package */
public final class rdf implements rda {
    private final BehaviorSubject<rdc> a = BehaviorSubject.a();
    private final rgf b;
    private final rfo c;

    public rdf(rgf rgf, rfo rfo) {
        this.b = rgf;
        this.c = rfo;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc a(ImmutableMap immutableMap) {
        if (!fdd.c(immutableMap.entrySet(), $$Lambda$PDb3NNFlyM0XXYgD1roGTbZgRBQ.INSTANCE)) {
            return rdc.h;
        }
        return rdd.b(ImmutableList.a((E[]) new MusicItem[]{MusicItem.z().a(this.b.c.a((CharSequence) Type.FILTER_INDICATOR.toString()).c()).a(Type.FILTER_INDICATOR).a((b) d.b().a(ImmutableList.a(fdd.a(fdd.b(immutableMap.entrySet(), $$Lambda$PDb3NNFlyM0XXYgD1roGTbZgRBQ.INSTANCE), (Function<? super F, ? extends T>) new $$Lambda$rdf$_b98fZ10JJuTURkXMLSH5mn9qGw<Object,Object>(this)))).a()).a()}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rfs a(Entry entry) {
        String str = (String) entry.getKey();
        return rfs.c().a(str).b(this.c.a(str)).a();
    }

    public final Observable<Boolean> a() {
        return this.a.c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$rdf$9BDfr2a_tglsXJ9OYdUXdXvI.INSTANCE);
    }

    public final Observable<rdc> a(Observable<rdb> observable) {
        Observable c2 = observable.c((io.reactivex.functions.Function<? super T, ? extends R>) $$Lambda$rdf$P4x7E_LvGBCqQLeN4FKTdrkFHg.INSTANCE).a(Functions.a()).c((io.reactivex.functions.Function<? super T, ? extends R>) new $$Lambda$rdf$qlobB_EIhII0leVc8aS8l3dpJBw<Object,Object>(this));
        BehaviorSubject<rdc> behaviorSubject = this.a;
        behaviorSubject.getClass();
        return c2.b((Consumer<? super T>) new $$Lambda$nLJsih1HAzoaXsxSIRArfpzhYlM<Object>(behaviorSubject));
    }

    public final Observable<rdc> b() {
        return this.a;
    }
}
