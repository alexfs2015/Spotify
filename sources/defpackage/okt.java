package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.playlist.shelves.Extender;
import com.spotify.mobile.android.playlist.shelves.Extender.Track;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: okt reason: default package */
final class okt {
    final SerialDisposable a = new SerialDisposable();
    final hcj b;
    final CompletableSubject c = CompletableSubject.f();
    okx d;
    ojc e;
    boolean f;
    Bundle g;
    private defpackage.hcj.a h = new a(this, 0);
    private final Scheduler i;
    private final kxz j;
    private final oew k;
    private final BehaviorSubject<ojc> l = BehaviorSubject.a();
    private final CompositeDisposable m = new CompositeDisposable();

    /* renamed from: okt$a */
    class a implements defpackage.hcj.a {
        private a() {
        }

        /* synthetic */ a(okt okt, byte b) {
            this();
        }

        public final boolean a() {
            return !okt.this.e.m();
        }

        public final boolean b() {
            return okt.this.f;
        }

        public final String c() {
            return okt.this.e.a().a();
        }

        public final int d() {
            return okt.this.e.a().t();
        }

        public final void e() {
            okt.this.d.e();
        }

        public final boolean f() {
            return okt.this.e.a().e() && okt.this.e.m();
        }
    }

    public okt(Scheduler scheduler, oew oew, hck hck, kxz kxz, opb opb, gjf gjf) {
        hck hck2 = hck;
        this.i = scheduler;
        this.j = kxz;
        this.k = oew;
        InteractionLogger a2 = opb.a(gjf);
        defpackage.hcj.a aVar = this.h;
        hcj hcj = r4;
        hcj hcj2 = hcj;
        hcj hcj3 = new hcj((Context) hck.a(hck2.a.get(), 1), (fpt) hck.a(hck2.b.get(), 2), (String) hck.a(hck2.c.get(), 3), ((Integer) hck.a(hck2.d.get(), 4)).intValue(), (SpotifyIconDrawable) hck.a(hck2.e.get(), 5), (ObjectAnimator) hck.a(hck2.f.get(), 6), (ObjectMapper) hck.a(hck2.g.get(), 7), (Player) hck.a(hck2.h.get(), 8), (hcf) hck.a(hck2.i.get(), 9), ((Boolean) hck.a(hck2.j.get(), 10)).booleanValue(), (SpSharedPreferences) hck.a(hck2.k.get(), 11), (hcd) hck.a(hck2.l.get(), 12), (fsc) hck.a(hck2.m.get(), 13), (Scheduler) hck.a(hck2.n.get(), 14), (lkn) hck.a(hck2.o.get(), 15), (uxh) hck.a(hck2.p.get(), 16), (hch) hck.a(hck2.q.get(), 17), (jsz) hck.a(hck2.r.get(), 18), (InteractionLogger) hck.a(a2, 19), (defpackage.hcj.a) hck.a(aVar, 20));
        this.b = hcj;
    }

    public final void a(defpackage.ofc.a aVar) {
        SerialDisposable serialDisposable = this.a;
        Observable a2 = aVar.b().c().a(this.i);
        $$Lambda$okt$agiJA5KuLOwCwaGrG9nKmEmFqQ r1 = new $$Lambda$okt$agiJA5KuLOwCwaGrG9nKmEmFqQ(this);
        CompletableSubject completableSubject = this.c;
        completableSubject.getClass();
        serialDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.l.onNext(ojc);
        this.c.onComplete();
    }

    /* access modifiers changed from: private */
    public void a(ojc ojc) {
        this.e = ojc;
        boolean z = true;
        boolean z2 = ojc.n() && ojc.b().a().b();
        boolean h2 = ojc.h();
        okx okx = this.d;
        if (z2 || h2) {
            z = false;
        }
        okx.a(z);
    }

    public final void a(okx okx) {
        this.d = okx;
        if (okx != null) {
            Bundle bundle = this.g;
            if (bundle != null) {
                hcj hcj = this.b;
                Extender extender = hcj.b;
                if (bundle != null) {
                    try {
                        Set set = (Set) bundle.getSerializable("ignored_track_ids");
                        if (set != null) {
                            extender.b.clear();
                            extender.b.addAll(set);
                        }
                    } catch (ClassCastException unused) {
                    }
                    try {
                        ArrayList stringArrayList = bundle.getStringArrayList("added_track_ids");
                        if (stringArrayList != null) {
                            extender.c.clear();
                            extender.c.addAll(stringArrayList);
                        }
                    } catch (ClassCastException unused2) {
                    }
                }
                if (bundle != null) {
                    hcj.o = bundle.getBoolean("got_first_response", false);
                    try {
                        List list = (List) hcj.c.readValue(bundle.getString("tracks", ""), (TypeReference) new TypeReference<List<Track>>() {
                        });
                        hcj.i.a(list);
                        hcj.n = !list.isEmpty();
                    } catch (IOException e2) {
                        Logger.e(e2, "Failed to read extended tracks.", new Object[0]);
                    }
                }
                this.g = null;
            }
            this.m.c();
            this.m.a(this.l.d((Consumer<? super T>) new $$Lambda$okt$5SSaaHGFyiD7ISbn8Hy3RPKrafA<Object>(this)));
            this.m.a(this.j.a.a(Functions.a()).a(this.i).a((Consumer<? super T>) new $$Lambda$okt$OJ48g3qeeV3DMLRMCfzoqiu2Rk<Object>(this), (Consumer<? super Throwable>) $$Lambda$okt$UwIKNSAxkIT3kHfnhPiXMiG3Mqs.INSTANCE));
            this.m.a(this.k.b.a(Functions.a()).a((Predicate<? super T>) $$Lambda$okt$zC9hBMhgH6T3JxLGI_uoHxopwY.INSTANCE).a(this.i).a((Consumer<? super T>) new $$Lambda$okt$brFg89X0SDwaQ4ELIMWWXxi01g<Object>(this), (Consumer<? super Throwable>) $$Lambda$okt$luVPWtemehoaW101rvuvIhbwPTM.INSTANCE));
            this.b.a();
            return;
        }
        this.m.c();
        hcj hcj2 = this.b;
        hcj2.f.unregisterPlayerStateObserver(hcj2.r);
        hcj2.p.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kxx kxx) {
        this.f = kxx.a();
        hcj hcj = this.b;
        boolean z = this.f;
        if (hcj.i != null) {
            boolean z2 = !hcj.i.e;
            hcj.i.b(!z);
            if (z && !z2) {
                hcj.c();
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(Integer num) {
        return num.intValue() <= 5;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        this.b.b();
    }
}
