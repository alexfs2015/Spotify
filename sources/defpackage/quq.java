package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.d;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Map.Entry;

/* renamed from: quq reason: default package */
public final class quq implements qul {
    private final BehaviorSubject<qun> a = BehaviorSubject.a();
    private final qxq b;
    private final qwz c;

    public quq(qxq qxq, qwz qwz) {
        this.b = qxq;
        this.c = qwz;
    }

    public final Observable<Boolean> a() {
        return this.a.c((Function<? super T, ? extends R>) $$Lambda$quq$ra62RTxWcUPO53Bm4ZE6mvV_WF8.INSTANCE);
    }

    public final Observable<qun> b() {
        return this.a;
    }

    public final Observable<qun> a(Observable<qum> observable) {
        Observable c2 = observable.c((Function<? super T, ? extends R>) $$Lambda$quq$Szj83KSQITqiHKz5qYqOUwOBU.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$quq$z9cqAQCusTZDco0Miw8Lqg2uss8<Object,Object>(this));
        BehaviorSubject<qun> behaviorSubject = this.a;
        behaviorSubject.getClass();
        return c2.b((Consumer<? super T>) new $$Lambda$iBlraNS07O0t6dvCiDvXFSqAkk<Object>(behaviorSubject));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun a(ImmutableMap immutableMap) {
        if (!fcl.c(immutableMap.entrySet(), $$Lambda$cEb02ZKol7TNXaHRTrgBdFNqfs.INSTANCE)) {
            return qun.h;
        }
        return quo.b(ImmutableList.a((E[]) new MusicItem[]{MusicItem.z().a(this.b.c.a((CharSequence) Type.FILTER_INDICATOR.toString()).c()).a(Type.FILTER_INDICATOR).a((b) d.b().a(ImmutableList.a(fcl.a(fcl.b(immutableMap.entrySet(), $$Lambda$cEb02ZKol7TNXaHRTrgBdFNqfs.INSTANCE), (com.google.common.base.Function<? super F, ? extends T>) new $$Lambda$quq$eiZsztxGe4Yg5qSRUWjFJdJPb5M<Object,Object>(this)))).a()).a()}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qxd a(Entry entry) {
        String str = (String) entry.getKey();
        return qxd.c().a(str).b(this.c.a(str)).a();
    }
}
