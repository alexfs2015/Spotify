package com.spotify.music.libs.connect.access;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.Event;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.music.R;
import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver;
import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver.a;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import java.util.HashSet;
import java.util.Set;

public class ConnectAccessViewModel implements ll {
    public final rxw a;
    public final ryr b;
    public final Set<Runnable> c;
    public kk d;
    public Optional<rxs> e = Optional.e();
    public Optional<rxz> f = Optional.e();
    private final rxt g;
    private final ryd h;
    private final rym i;
    private final Scheduler j;
    private final NudgeResolver k;
    private final Observable<Boolean> l;
    private final ryk m;
    private final a n;
    private boolean o;
    private CompositeDisposable p;
    private SerialDisposable q;
    private int r = 0;

    public ConnectAccessViewModel(ryk ryk, rxt rxt, rxw rxw, ryr ryr, ryd ryd, Scheduler scheduler, rym rym, NudgeResolver nudgeResolver, Observable<Boolean> observable) {
        this.g = rxt;
        this.a = rxw;
        this.b = ryr;
        this.h = ryd;
        this.j = scheduler;
        this.i = rym;
        this.k = nudgeResolver;
        this.l = observable;
        this.m = ryk;
        this.p = new CompositeDisposable();
        this.q = new SerialDisposable();
        this.c = new HashSet(2);
        this.n = new a() {
            public final void onFlagsChange(fqn fqn) {
                ConnectAccessViewModel.this.a(fqn);
            }
        };
        this.m.a(this.n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        Fragment a2 = this.d.a((int) R.id.content);
        if (a2 != null) {
            this.p.a(ryw.a(a2).a(this.j).d((Consumer<? super T>) new Consumer(ryl.a(this.r)) {
                private final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ConnectAccessViewModel.this.a(this.f$1, (ho) obj);
                }
            }));
        }
        ryr ryr = this.b;
        if (ryr.c != null) {
            Context context = ryr.a;
            ryt ryt = ryr.c;
            context.startActivity(ryt.a.getIntent(ryt.b, ryt.c));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        if (this.m.a((fqm<?>) ryb.a)) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            if (this.o && a(this.r) && this.f.b()) {
                ((rxz) this.f.c()).a();
            }
            this.o = false;
        } else if (a(this.r)) {
            this.o = true;
        } else {
            this.o = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ho hoVar) {
        rym rym = this.i;
        String str2 = "connect-access-button/tap";
        String str3 = str;
        ah ahVar = new ah(str2, str3, InteractionType.TAP.mInteractionType, "open-device-picker", (String) hoVar.a, (String) hoVar.b);
        rym.a.a(ahVar);
        Logger.b(ahVar.a(), new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ryc ryc) {
        a(ryc.a, (GaiaDevice) ryc.b.d());
    }

    private static boolean a(int i2) {
        return 5 == i2 || 4 == i2;
    }

    private synchronized void b() {
        for (Runnable run : this.c) {
            run.run();
        }
        this.c.clear();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ConnectAccessButton connectAccessButton) {
        connectAccessButton.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ConnectAccessViewModel.this.a(view);
            }
        });
        this.k.a = new a() {
            public final void onNudge() {
                ConnectAccessViewModel.this.c();
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(q qVar) {
        ln lnVar = qVar.a;
        lnVar.a(this);
        lnVar.a(this.k);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (this.f.b() && 1 == this.r) {
            rxz rxz = (rxz) this.f.c();
            rxz.a.postDelayed(rxz.a(7000), 1000);
            rym rym = this.i;
            be beVar = new be(null, "com.spotify.service.connectui", "spotify:connect-access-button", null, 0, null, "connect-access-button-nudge", null, (double) rym.b.a());
            rym.a.a(beVar);
            Logger.b(beVar.a(), new Object[0]);
        }
    }

    public Runnable a(ConnectAccessButton connectAccessButton) {
        return new Runnable(connectAccessButton) {
            private final /* synthetic */ ConnectAccessButton f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ConnectAccessViewModel.this.b(this.f$1);
            }
        };
    }

    public Runnable a(q qVar) {
        return new Runnable(qVar) {
            private final /* synthetic */ q f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ConnectAccessViewModel.this.b(this.f$1);
            }
        };
    }

    public final void a(int i2, GaiaDevice gaiaDevice) {
        if (this.e.b() && this.f.b()) {
            int i3 = this.r;
            if (i3 != i2) {
                if (i3 == 0) {
                    this.i.a();
                }
                this.r = i2;
                ((rxs) this.e.c()).a(this.r, gaiaDevice == null ? null : gaiaDevice.getName());
                ((rxz) this.f.c()).a(this.r);
            }
        }
    }

    public final void a(Runnable runnable) {
        if (a()) {
            runnable.run();
        }
    }

    public boolean a() {
        return this.g.a();
    }

    /* access modifiers changed from: 0000 */
    @lu(a = Event.ON_CREATE)
    public void onCreate() {
        this.q.a(this.l.a(this.j).d((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                ConnectAccessViewModel.this.a((Boolean) obj);
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    @lu(a = Event.ON_DESTROY)
    public void onDestroy() {
        this.q.a(Disposables.a());
        this.m.b(this.n);
    }

    /* access modifiers changed from: 0000 */
    @lu(a = Event.ON_START)
    public void onStart() {
        this.p.a(this.h.e.a(this.j).d((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                ConnectAccessViewModel.this.a((ryc) obj);
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    @lu(a = Event.ON_STOP)
    public void onStop() {
        this.p.c();
    }
}
