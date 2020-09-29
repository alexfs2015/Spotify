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

/* renamed from: min reason: default package */
public final class min {
    public final mhh a;
    public final iqy b;
    public final CompositeDisposable c;
    public a d;
    public b e;
    public boolean f = true;
    private final Scheduler g;
    private final Scheduler h;

    /* renamed from: min$a */
    public interface a {
        void onVolumeChanged(float f);
    }

    /* renamed from: min$b */
    public interface b {
        void onSupportsVolumeChange(boolean z);
    }

    public min(mhh mhh, iqy iqy, heg heg) {
        this.a = mhh;
        this.b = iqy;
        this.c = new CompositeDisposable();
        this.g = heg.a();
        this.h = heg.c();
    }

    public final void a() {
        iqy iqy = this.b;
        $$Lambda$min$FUrBKpmNf5I4ogNGdGByUWi2DMs r1 = new $$Lambda$min$FUrBKpmNf5I4ogNGdGByUWi2DMs(this);
        iqy.a.getContentResolver().registerContentObserver(jsy.a, true, iqy.b);
        iqy.b.b = r1;
        this.c.a(this.a.c().b(this.g).a(this.h).a((Consumer<? super T>) new $$Lambda$min$4a_HHW_hfJsSeaEnspmnNbtH4ak<Object>(this), (Consumer<? super Throwable>) $$Lambda$min$WcLyGFECDc7Ob8YFqR5u4CoEOE.INSTANCE));
        this.c.a(this.a.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$min$sqUke8N7qcRdAL8wUCRWV_w9KW0<Object,Object>(this), false).b(this.g).a(this.h).a((Consumer<? super T>) new $$Lambda$min$ngpjpl6HRZv52cZGnWYcv29wA0A<Object>(this), (Consumer<? super Throwable>) $$Lambda$min$ZgECqlXB0m7jlF961Cb_ym7YJGA.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(List list) {
        return Observable.a((Iterable<? extends T>) list).a((Predicate<? super T>) $$Lambda$q0PXM4oAh_D4ednlvhkUi1tcKI.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$min$IkhpzA_oxxa2aptmEWhDUc4QtzA<Object,Object>(this)).a(GaiaDevice.class);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ grz a(grz grz) {
        this.f = grz.isSelf();
        return grz;
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

    /* access modifiers changed from: private */
    public void a(float f2) {
        Logger.b("New volume: %.2f", Float.valueOf(f2));
        a aVar = this.d;
        if (aVar != null) {
            aVar.onVolumeChanged(f2);
        }
    }
}
