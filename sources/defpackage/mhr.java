package defpackage;

import com.spotify.music.connection.OfflineState;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: mhr reason: default package */
public final class mhr {
    public List<grz> a;
    public boolean b;
    public a c;
    private final mhh d;
    private final ufm e;
    private final Scheduler f;
    private Disposable g = Disposables.b();
    private Disposable h = Disposables.b();

    /* renamed from: mhr$a */
    public interface a {
        void onUpdate(boolean z);
    }

    public mhr(mhh mhh, ufm ufm, Scheduler scheduler) {
        this.d = mhh;
        this.e = ufm;
        this.f = scheduler;
        this.a = new ArrayList(0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(grz grz) {
        return !grz.isSelf();
    }

    public final void a() {
        b();
        this.g = this.e.a.d((Consumer<? super T>) new $$Lambda$mhr$6PmbQA658_AWxHV4uvh3u140rnM<Object>(this));
        this.h = this.d.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$mhr$joIguv_PoFYKDjqD7liTNM1iU_I.INSTANCE, false).a(this.f).a(this.f).d((Consumer<? super T>) new $$Lambda$mhr$aryvL6YP8t1RYMvhLQ6As7xIndQ<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfflineState offlineState) {
        this.b = offlineState.offline();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        boolean z;
        this.a = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            grz grz = (grz) it.next();
            if (!grz.isActive()) {
                if (grz.isBeingActivated()) {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        a aVar = this.c;
        if (aVar != null) {
            aVar.onUpdate(z);
        }
    }

    public final void b() {
        this.g.bf_();
        this.h.bf_();
    }
}
