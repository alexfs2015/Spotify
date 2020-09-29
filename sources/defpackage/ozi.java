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

/* renamed from: ozi reason: default package */
public final class ozi extends c {
    public final defpackage.tlt.a a;
    public final boolean b;
    private final CETopicsRolloutHelper c;
    private final SerialDisposable d = new SerialDisposable();
    private final ozk e;
    private final Scheduler f;
    private final String g;
    private final vti<a> h;

    /* renamed from: ozi$a */
    public interface a {
        void d();
    }

    public ozi(CETopicsRolloutHelper cETopicsRolloutHelper, vti<a> vti, tse tse, ozk ozk, Scheduler scheduler, String str, defpackage.tlt.a aVar, boolean z) {
        this.c = cETopicsRolloutHelper;
        this.h = vti;
        this.e = ozk;
        this.f = scheduler;
        this.g = str;
        this.a = aVar;
        this.b = z;
        this.a.b = tse;
    }

    public final void c() {
        this.d.a(this.e.a(this.g).d((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$ozi$lY9takDeQbiaf8Lf1bF2Lgxgsw.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ozi$Xvh7zzJiXKc6dreCqOSGGwsxPkE.INSTANCE).b(16).a(this.f).a((Consumer<? super T>) new $$Lambda$ozi$4ykgaexg7dJFsY3jhWLYsPDPrg<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ozi$xRyohruR5gC42Dt41liy4OCY9XI<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        a(list, Source.WEBGATE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        this.a.g = false;
        ((a) this.h.get()).d();
    }

    public final void a() {
        this.d.a(Disposables.a());
    }

    public static List<tsf> a(uzw uzw) {
        ArrayList arrayList = new ArrayList(0);
        if (uzw != null) {
            List<uzv> topics = uzw.getTopics();
            if (topics != null) {
                for (uzv uzv : topics) {
                    arrayList.add(tsf.a(uzv.a(), uzv.b()));
                }
            }
        }
        return arrayList;
    }

    public void a(List<tsf> list, Source source) {
        if (this.b) {
            this.c.a(list, source);
        }
        if (source == Source.WEBGATE) {
            this.a.g = !list.isEmpty();
            this.a.a = list;
            ((a) this.h.get()).d();
        }
    }
}
