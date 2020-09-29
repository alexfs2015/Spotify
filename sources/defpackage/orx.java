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

/* renamed from: orx reason: default package */
final class orx {
    final SerialDisposable a = new SerialDisposable();
    final hff b;
    final CompletableSubject c = CompletableSubject.f();
    osb d;
    oqg e;
    boolean f;
    Bundle g;
    private defpackage.hff.a h = new a(this, 0);
    private final Scheduler i;
    private final lbi j;
    private final omc k;
    private final BehaviorSubject<oqg> l = BehaviorSubject.a();
    private final CompositeDisposable m = new CompositeDisposable();

    /* renamed from: orx$a */
    class a implements defpackage.hff.a {
        private a() {
        }

        /* synthetic */ a(orx orx, byte b) {
            this();
        }

        public final boolean a() {
            return !orx.this.e.m();
        }

        public final boolean b() {
            return orx.this.f;
        }

        public final String c() {
            return orx.this.e.a().a();
        }

        public final int d() {
            return orx.this.e.a().t();
        }

        public final void e() {
            orx.this.d.e();
        }

        public final boolean f() {
            return orx.this.e.a().e() && orx.this.e.m();
        }
    }

    public orx(Scheduler scheduler, omc omc, hfg hfg, lbi lbi, owh owh, gkq gkq) {
        hfg hfg2 = hfg;
        this.i = scheduler;
        this.j = lbi;
        this.k = omc;
        InteractionLogger a2 = owh.a(gkq);
        defpackage.hff.a aVar = this.h;
        hff hff = r4;
        hff hff2 = hff;
        hff hff3 = new hff((Context) hfg.a(hfg2.a.get(), 1), (fqn) hfg.a(hfg2.b.get(), 2), (String) hfg.a(hfg2.c.get(), 3), ((Integer) hfg.a(hfg2.d.get(), 4)).intValue(), (SpotifyIconDrawable) hfg.a(hfg2.e.get(), 5), (ObjectAnimator) hfg.a(hfg2.f.get(), 6), (ObjectMapper) hfg.a(hfg2.g.get(), 7), (Player) hfg.a(hfg2.h.get(), 8), (hfb) hfg.a(hfg2.i.get(), 9), ((Boolean) hfg.a(hfg2.j.get(), 10)).booleanValue(), (SpSharedPreferences) hfg.a(hfg2.k.get(), 11), (hez) hfg.a(hfg2.l.get(), 12), (fsw) hfg.a(hfg2.m.get(), 13), (Scheduler) hfg.a(hfg2.n.get(), 14), (lon) hfg.a(hfg2.o.get(), 15), (vjj) hfg.a(hfg2.p.get(), 16), (hfd) hfg.a(hfg2.q.get(), 17), (jvf) hfg.a(hfg2.r.get(), 18), (InteractionLogger) hfg.a(a2, 19), (defpackage.hff.a) hfg.a(aVar, 20));
        this.b = hff;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lbg lbg) {
        this.f = lbg.a();
        hff hff = this.b;
        boolean z = this.f;
        if (hff.i != null) {
            boolean z2 = !hff.i.e;
            hff.i.b(!z);
            if (z && !z2) {
                hff.c();
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(oqg oqg) {
        this.e = oqg;
        boolean z = true;
        boolean z2 = oqg.n() && oqg.b().a().b();
        boolean h2 = oqg.h();
        osb osb = this.d;
        if (z2 || h2) {
            z = false;
        }
        osb.a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.l.onNext(oqg);
        this.c.onComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(Integer num) {
        return num.intValue() <= 5;
    }

    public final void a(defpackage.omg.a aVar) {
        SerialDisposable serialDisposable = this.a;
        Observable a2 = aVar.b().c().a(this.i);
        $$Lambda$orx$aRokjkTSRo71hp02OYrn4L7yqfc r1 = new $$Lambda$orx$aRokjkTSRo71hp02OYrn4L7yqfc(this);
        CompletableSubject completableSubject = this.c;
        completableSubject.getClass();
        serialDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(osb osb) {
        this.d = osb;
        if (osb != null) {
            Bundle bundle = this.g;
            if (bundle != null) {
                hff hff = this.b;
                Extender extender = hff.b;
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
                    hff.o = bundle.getBoolean("got_first_response", false);
                    try {
                        List list = (List) hff.c.readValue(bundle.getString("tracks", ""), (TypeReference) new TypeReference<List<Track>>() {
                        });
                        hff.i.a(list);
                        hff.n = !list.isEmpty();
                    } catch (IOException e2) {
                        Logger.e(e2, "Failed to read extended tracks.", new Object[0]);
                    }
                }
                this.g = null;
            }
            this.m.c();
            this.m.a(this.l.d((Consumer<? super T>) new $$Lambda$orx$mNThcI1objezhSIabbhFdhRWQc<Object>(this)));
            this.m.a(this.j.a.a(Functions.a()).a(this.i).a((Consumer<? super T>) new $$Lambda$orx$FNktt1vEYlvXSyklv_GNdPkDj4<Object>(this), (Consumer<? super Throwable>) $$Lambda$orx$83rDPJsk4VJWhgarLy3QsnpCDo.INSTANCE));
            this.m.a(this.k.b.a(Functions.a()).a((Predicate<? super T>) $$Lambda$orx$onnZpjhyHHKbPA6AnHUCduPLvbw.INSTANCE).a(this.i).a((Consumer<? super T>) new $$Lambda$orx$KyUuTmrdvnypVVEHFxdmjXz275c<Object>(this), (Consumer<? super Throwable>) $$Lambda$orx$kZwgI7hrDpmk86jc9eJnyromydI.INSTANCE));
            this.b.a();
            return;
        }
        this.m.c();
        hff hff2 = this.b;
        hff2.f.unregisterPlayerStateObserver(hff2.r);
        hff2.p.c();
    }
}
