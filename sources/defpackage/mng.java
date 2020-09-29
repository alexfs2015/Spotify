package defpackage;

import android.media.AudioManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;

/* renamed from: mng reason: default package */
public final class mng {
    public final mlv a;
    public final rzf b;
    public final CompositeDisposable c;
    public a d;
    public b e;
    public boolean f = true;
    private final Scheduler g;
    private final Scheduler h;

    /* renamed from: mng$a */
    public interface a {
        void onVolumeChanged(float f);
    }

    /* renamed from: mng$b */
    public interface b {
        void onSupportsVolumeChange(boolean z);
    }

    public mng(mlv mlv, rzf rzf, hhc hhc) {
        this.a = mlv;
        this.b = rzf;
        this.c = new CompositeDisposable();
        this.g = hhc.a();
        this.h = hhc.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gtz a(gtz gtz) {
        this.f = gtz.isSelf();
        return gtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(List list) {
        return Observable.a((Iterable<? extends T>) list).a((Predicate<? super T>) $$Lambda$60vmWnwR2jqC6R13LxbVB6ekPZY.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$mng$27hcnxNCdcgIgkp1yGUXMCydgx4<Object,Object>(this)).a(GaiaDevice.class);
    }

    /* access modifiers changed from: private */
    public void a(float f2) {
        Logger.b("New volume: %.2f", Float.valueOf(f2));
        a aVar = this.d;
        if (aVar != null) {
            aVar.onVolumeChanged(f2);
        }
    }

    /* access modifiers changed from: private */
    public void a(GaiaDevice gaiaDevice) {
        boolean supportsVolume = gaiaDevice.supportsVolume();
        Logger.b("Active device %s supports volume: %b", gaiaDevice.getName(), Boolean.valueOf(supportsVolume));
        b bVar = this.e;
        if (bVar != null) {
            bVar.onSupportsVolumeChange(supportsVolume);
        }
        if (gaiaDevice.isSelf()) {
            AudioManager a2 = this.b.a();
            a(((float) a2.getStreamVolume(3)) / ((float) a2.getStreamMaxVolume(3)));
        }
    }

    public final void a() {
        rzf rzf = this.b;
        $$Lambda$mng$Yu34Tt8KHXQwFyJHQh2R0DM7hN8 r1 = new $$Lambda$mng$Yu34Tt8KHXQwFyJHQh2R0DM7hN8(this);
        rzf.a.getContentResolver().registerContentObserver(ryx.a, true, rzf.b);
        rzf.b.b = r1;
        this.c.a(this.a.c().b(this.g).a(this.h).a((Consumer<? super T>) new $$Lambda$mng$s_FiZi3i0g4D_u2LgS7JPtojTUk<Object>(this), (Consumer<? super Throwable>) $$Lambda$mng$wzkOpMBXpJ_9KG95NBZDTTnZk4U.INSTANCE));
        this.c.a(this.a.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mng$ZKrPSdDXZW1YwOAAtR0q54HKoww<Object,Object>(this), false).b(this.g).a(this.h).a((Consumer<? super T>) new $$Lambda$mng$H4m_h1Y8ev0cSHcqSwWiGFi25C8<Object>(this), (Consumer<? super Throwable>) $$Lambda$mng$WbmXfQaK_4U3h3mg5GCs2U25CbM.INSTANCE));
    }
}
