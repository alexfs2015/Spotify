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

/* renamed from: mmf reason: default package */
public final class mmf {
    public List<gtz> a;
    public boolean b;
    public a c;
    private final mlv d;
    private final ura e;
    private final Scheduler f;
    private Disposable g = Disposables.b();
    private Disposable h = Disposables.b();

    /* renamed from: mmf$a */
    public interface a {
        void onUpdate(boolean z);
    }

    public mmf(mlv mlv, ura ura, Scheduler scheduler) {
        this.d = mlv;
        this.e = ura;
        this.f = scheduler;
        this.a = new ArrayList(0);
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
            gtz gtz = (gtz) it.next();
            if (!gtz.isActive()) {
                if (gtz.isBeingActivated()) {
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

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(gtz gtz) {
        return !gtz.isSelf();
    }

    public final void a() {
        b();
        this.g = this.e.a.d((Consumer<? super T>) new $$Lambda$mmf$qyA4ZYA42fX3FwvIqSCjjbf0_8Q<Object>(this));
        this.h = this.d.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$mmf$rta54oWCNUHKJS5wN7rL9z_xidk.INSTANCE, false).a(this.f).a(this.f).d((Consumer<? super T>) new $$Lambda$mmf$nZ9O9iYVc67COJZD2dqJMS5t1k<Object>(this));
    }

    public final void b() {
        this.g.bd_();
        this.h.bd_();
    }
}
