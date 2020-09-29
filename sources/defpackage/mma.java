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

/* renamed from: mma reason: default package */
public final class mma {
    public final mly a;
    public final mlv b;
    public final fbu<Integer> c;
    public final mng d;
    public final CompositeDisposable e = new CompositeDisposable();
    public Observable<PlayerState> f;
    public DisposableObserver<PlayerState> g;
    boolean h;
    private final WeakReference<mmc> i;
    private final Flowable<PlayerState> j;
    private final ryo k;
    private final mmo l;
    private final rym m;
    private final fqn n;

    /* renamed from: mma$a */
    interface a {
        void call(mmc mmc);
    }

    public mma(mmc mmc, mly mly, Flowable<PlayerState> flowable, mlv mlv, ryo ryo, fbu<Integer> fbu, mmo mmo, mng mng, rym rym, fqn fqn) {
        this.i = new WeakReference<>(mmc);
        this.a = mly;
        this.j = flowable;
        this.b = mlv;
        this.k = ryo;
        this.c = fbu;
        this.l = mmo;
        this.d = mng;
        this.m = rym;
        this.n = fqn;
    }

    private static String a(int i2, DeviceType deviceType) {
        StringBuilder sb = new StringBuilder("devices-list/");
        sb.append(i2);
        sb.append("/item/");
        sb.append(deviceType.name());
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gtz gtz, int i2) {
        a((a) new $$Lambda$mma$qMMpCx_57p34vnxzHmPbxhz0tg(this, gtz, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gtz gtz, int i2, mmc mmc) {
        ryo ryo = this.k;
        String identifier = gtz.getIdentifier();
        StringBuilder sb = new StringBuilder();
        int i3 = i2 + 1;
        sb.append(a(i3, gtz.getType()));
        sb.append("/context-menu");
        ryo.a(identifier, sb.toString(), InteractionIntent.NAVIGATE, (gkq) PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bo);
        mmc.a((GaiaDevice) gtz, i3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.k.a("local_device", a(0, this.l.a.a), InteractionIntent.CONNECT, (gkq) PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bo);
        this.e.a(this.b.b());
        a((a) $$Lambda$3vCKtyRd5D7gOuvLh2nX4bshsFI.INSTANCE);
    }

    private void a(a aVar) {
        mmc mmc = (mmc) this.i.get();
        if (mmc != null) {
            aVar.call(mmc);
        }
    }

    /* access modifiers changed from: private */
    public void a(mmc mmc) {
        this.a.a(true);
        this.a.h(mmc.i());
        this.a.h.a.c = new $$Lambda$mma$Vr3IcxtOEdka2YAl9bVVDnLkyTU(this);
        this.a.f.a.d = new $$Lambda$7QnCiNTljLzZdz5WoQulotqVt9c(this);
        mly mly = this.a;
        mmc.getClass();
        mly.i.a = new $$Lambda$QXlPU7ZHif_YSmL21LJLFfxqUg4(mmc);
        mly mly2 = this.a;
        mmc.getClass();
        mly2.j.d = new $$Lambda$p20BbNo5J3dUpiO282z03_xT0o(mmc);
        mly mly3 = this.a;
        mly3.getClass();
        mly3.j.c = new $$Lambda$S2_ENuS8OnTFPENmKXP2zYR7oOY(mly3);
        mly mly4 = this.a;
        mly4.e = this.c;
        mly4.h.b = new $$Lambda$mma$Kjm9uhhJXmoemcA1HDOg9sCubsI(this);
        this.a.h.c = new $$Lambda$mma$91tiDET0iNJ1DeZXeX5eII6vsNI(this);
        this.a.g.a = new $$Lambda$mma$DyCOumJpQuKD89FNQnCv3t_e58(this);
        this.a.k = uok.a(this.n);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        a((a) new $$Lambda$mma$E_TcnScRbTOEnE18IDEqxRFmoFQ(z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, mmc mmc) {
        int i2 = mmc.i();
        this.a.g.b = !z;
        this.a.i(i2);
    }

    /* access modifiers changed from: private */
    public void b(float f2) {
        a((a) new $$Lambda$mma$6r0XlT_WwIAb_ADOSiVY6eV4pOM(f2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(gtz gtz, int i2) {
        this.k.a(gtz.getIdentifier(), a(i2 + 1, gtz.getType()), InteractionIntent.CONNECT, (gkq) PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.bo);
        if (this.h) {
            a((a) $$Lambda$w1NA_XvmRP6lUj3nKauhu66zBk.INSTANCE);
            return;
        }
        this.e.a(this.b.a(gtz));
        a((a) $$Lambda$3vCKtyRd5D7gOuvLh2nX4bshsFI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(mmc mmc) {
        this.a.i(mmc.i());
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        a((a) new $$Lambda$mma$_zVblNzjXNfjIzElUjXmdoYDTW4(this, z));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z, mmc mmc) {
        if (z) {
            mmc.b();
        } else {
            mmc.au_();
        }
    }

    public final void a() {
        this.f = this.j.j();
        a((a) new $$Lambda$mma$JtQn6wDNZ3NCLLuB_NGDtr3ci3k(this));
        mng mng = this.d;
        mng.d = new $$Lambda$mma$Oy1BqT1HaxAV0RIO6zxyDc6WwO0(this);
        mng.e = new $$Lambda$mma$sXcCxUOENWGcnxcgTF39gI9voBQ(this);
    }

    public final void a(float f2) {
        mng mng = this.d;
        if (mng.f) {
            AudioManager a2 = mng.b.a();
            a2.setStreamVolume(3, Math.round(((float) a2.getStreamMaxVolume(3)) * f2), 0);
        } else {
            mng.c.a(mng.a.a(f2));
        }
        rym rym = this.m;
        StringBuilder sb = new StringBuilder("connect-volume-slider-update/");
        sb.append(f2);
        ah ahVar = new ah(null, sb.toString(), null, "update-volume", PageIdentifiers.CONNECT_DEVICEPICKER.mPageIdentifier, ViewUris.bo.toString());
        rym.a.a(ahVar);
        Logger.b(ahVar.a(), new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a((a) new $$Lambda$mma$qUDh40WNEyZPH7ucJkvIyjpi4w8(this));
    }

    public final void c() {
        DisposableObserver<PlayerState> disposableObserver = this.g;
        if (disposableObserver != null && !disposableObserver.b()) {
            this.g.bd_();
        }
    }
}
