package defpackage;

import android.media.AudioManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import java.lang.ref.WeakReference;

/* renamed from: mhm reason: default package */
public final class mhm {
    public final mhk a;
    public final mhh b;
    public final fbd<Integer> c;
    public final min d;
    public final CompositeDisposable e = new CompositeDisposable();
    public Observable<PlayerState> f;
    public DisposableObserver<PlayerState> g;
    boolean h;
    private final WeakReference<mho> i;
    private final Flowable<PlayerState> j;
    private final iqw k;
    private final mia l;
    private final rpg m;
    private final fpt n;

    /* renamed from: mhm$a */
    interface a {
        void call(mho mho);
    }

    public mhm(mho mho, mhk mhk, Flowable<PlayerState> flowable, mhh mhh, iqw iqw, fbd<Integer> fbd, mia mia, min min, rpg rpg, fpt fpt) {
        this.i = new WeakReference<>(mho);
        this.a = mhk;
        this.j = flowable;
        this.b = mhh;
        this.k = iqw;
        this.c = fbd;
        this.l = mia;
        this.d = min;
        this.m = rpg;
        this.n = fpt;
    }

    public final void a(float f2) {
        min min = this.d;
        if (min.f) {
            AudioManager a2 = min.b.a();
            a2.setStreamVolume(3, Math.round(((float) a2.getStreamMaxVolume(3)) * f2), 0);
        } else {
            min.c.a(min.a.a(f2));
        }
        rpg rpg = this.m;
        StringBuilder sb = new StringBuilder("connect-volume-slider-update/");
        sb.append(f2);
        ai aiVar = new ai(null, sb.toString(), null, "update-volume", PageIdentifiers.CONNECT_DEVICEPICKER.mPageIdentifier, ViewUris.bp.toString());
        rpg.a.a(aiVar);
        Logger.b(aiVar.a(), new Object[0]);
    }

    /* access modifiers changed from: private */
    public void a(mho mho) {
        this.a.a(true);
        this.a.h(mho.i());
        this.a.h.a.c = new $$Lambda$mhm$RvKnAG5KoEQoTY131BiIhnjxGcw(this);
        this.a.f.a.d = new $$Lambda$_fMJuN2zXO9Og2A7BaiUcLRUsEc(this);
        mhk mhk = this.a;
        mho.getClass();
        mhk.i.a = new $$Lambda$MmBarpjX75pv1lufsxEwj2s3njA(mho);
        mhk mhk2 = this.a;
        mho.getClass();
        mhk2.j.d = new $$Lambda$s2G905u66ADLSVs0TECJ1tj5BGQ(mho);
        mhk mhk3 = this.a;
        mhk3.getClass();
        mhk3.j.c = new $$Lambda$gQAGznDtjku9fbHI7Zfc6FRHsz0(mhk3);
        mhk mhk4 = this.a;
        mhk4.e = this.c;
        mhk4.h.b = new $$Lambda$mhm$dyIhQTKbkY9xFHNOUqw6oTj7W90(this);
        this.a.h.c = new $$Lambda$mhm$D8I7grv4vkRugdwElER8Pyw4rfU(this);
        this.a.g.a = new $$Lambda$mhm$HKufrWyx1R_HfuoCtjCqwarIwQ(this);
        this.a.k = ubp.a(this.n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(grz grz, int i2) {
        this.k.a(a(i2 + 1, grz.getType()), InteractionIntent.CONNECT, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bp);
        if (this.h) {
            a((a) $$Lambda$bzhIrfTNXq_XqPVgIGNShtPIGck.INSTANCE);
            return;
        }
        this.e.a(this.b.a(grz));
        a((a) $$Lambda$0YeDEPdNU5b6w_FwQKzJEN8DN_Q.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(grz grz, int i2) {
        a((a) new $$Lambda$mhm$z7W0NUhED7Jmok8DU3hxLdyfJck(this, i2, grz));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, grz grz, mho mho) {
        iqw iqw = this.k;
        StringBuilder sb = new StringBuilder();
        int i3 = i2 + 1;
        sb.append(a(i3, grz.getType()));
        sb.append("/context-menu");
        iqw.a(sb.toString(), InteractionIntent.NAVIGATE, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bp);
        mho.a((GaiaDevice) grz, i3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.k.a(a(0, this.l.a()), InteractionIntent.CONNECT, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bp);
        this.e.a(this.b.b());
        a((a) $$Lambda$0YeDEPdNU5b6w_FwQKzJEN8DN_Q.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void b(float f2) {
        a((a) new $$Lambda$mhm$rzumuk2i5e2LcyHOkg6DZNyXRmg(f2));
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        a((a) new $$Lambda$mhm$ENPzFc2gMgMtDvgPNSJUTXo4MI(z));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z, mho mho) {
        if (z) {
            mho.b();
        } else {
            mho.av_();
        }
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        a((a) new $$Lambda$mhm$mPan5wpvTx6l4_IfLowes4sbS34(this, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, mho mho) {
        int i2 = mho.i();
        this.a.g.b = !z;
        this.a.i(i2);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a((a) new $$Lambda$mhm$2d522MlSOGTETkmN0P93ZzMSQ0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(mho mho) {
        this.a.i(mho.i());
    }

    public final void c() {
        DisposableObserver<PlayerState> disposableObserver = this.g;
        if (disposableObserver != null && !disposableObserver.b()) {
            this.g.bf_();
        }
    }

    private void a(a aVar) {
        mho mho = (mho) this.i.get();
        if (mho != null) {
            aVar.call(mho);
        }
    }

    private static String a(int i2, DeviceType deviceType) {
        StringBuilder sb = new StringBuilder("devices-list/");
        sb.append(i2);
        sb.append("/item/");
        sb.append(deviceType.name());
        return sb.toString();
    }

    public final void a() {
        this.f = this.j.j();
        a((a) new $$Lambda$mhm$WwnV4qrwo89RCyMUfVZCJh1xH_Y(this));
        min min = this.d;
        min.d = new $$Lambda$mhm$y43DO2x4vOIdFgfN423eb7N98m0(this);
        min.e = new $$Lambda$mhm$9XBQkIRgOtlw4Aq6TQGPA1ilaW0(this);
    }
}
