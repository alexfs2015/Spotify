package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.podcast.entity.topic.CETopicsRolloutHelper;
import com.spotify.music.features.podcast.entity.topic.CETopicsRolloutHelper.Source;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pgr reason: default package */
public final class pgr extends c {
    public final defpackage.txf.a a;
    public final boolean b;
    private final CETopicsRolloutHelper c;
    private final SerialDisposable d = new SerialDisposable();
    private final pgt e;
    private final Scheduler f;
    private final String g;
    private final who<a> h;

    /* renamed from: pgr$a */
    public interface a {
        void d();
    }

    public pgr(CETopicsRolloutHelper cETopicsRolloutHelper, who<a> who, ueh ueh, pgt pgt, Scheduler scheduler, String str, defpackage.txf.a aVar, boolean z) {
        this.c = cETopicsRolloutHelper;
        this.h = who;
        this.e = pgt;
        this.f = scheduler;
        this.g = str;
        this.a = aVar;
        this.b = z;
        this.a.b = ueh;
    }

    public static List<uei> a(vmk vmk) {
        ArrayList arrayList = new ArrayList(0);
        if (vmk != null) {
            List<vmj> topics = vmk.getTopics();
            if (topics != null) {
                for (vmj vmj : topics) {
                    arrayList.add(uei.a(vmj.a(), vmj.b()));
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        this.a.g = false;
        ((a) this.h.get()).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        a(list, Source.WEBGATE);
    }

    public final void a() {
        this.d.a(Disposables.a());
    }

    public void a(List<uei> list, Source source) {
        if (this.b) {
            this.c.a(list, source);
        }
        if (source == Source.WEBGATE) {
            this.a.g = !list.isEmpty();
            this.a.a = list;
            ((a) this.h.get()).d();
        }
    }

    public final void c() {
        this.d.a(this.e.a(this.g).d((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$pgr$Ov2rcX0DRispbt0IFNur_5kPeJ4.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$pgr$jenvSG2AGaQkVve5xVnFTojCFo.INSTANCE).b(16).a(this.f).a((Consumer<? super T>) new $$Lambda$pgr$o4cD8E9brvjoEAuvkiXWOFpr4I<Object>(this), (Consumer<? super Throwable>) new $$Lambda$pgr$5bo8fdx_M8FHhGrerYuJKJpedVc<Object>(this)));
    }
}
