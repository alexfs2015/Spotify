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

public class ConnectAccessViewModel implements lg {
    public final roq a;
    public final rpm b;
    public final Set<Runnable> c;
    public kf d;
    public Optional<rom> e = Optional.e();
    public Optional<rot> f = Optional.e();
    private final ron g;
    private final rox h;
    private final rpg i;
    private final Scheduler j;
    private final NudgeResolver k;
    private final Observable<Boolean> l;
    private final rpe m;
    private final a n;
    private boolean o;
    private CompositeDisposable p;
    private SerialDisposable q;
    private int r = 0;

    private static boolean a(int i2) {
        return 5 == i2 || 4 == i2;
    }

    public ConnectAccessViewModel(rpe rpe, ron ron, roq roq, rpm rpm, rox rox, Scheduler scheduler, rpg rpg, NudgeResolver nudgeResolver, Observable<Boolean> observable) {
        this.g = ron;
        this.a = roq;
        this.b = rpm;
        this.h = rox;
        this.j = scheduler;
        this.i = rpg;
        this.k = nudgeResolver;
        this.l = observable;
        this.m = rpe;
        this.p = new CompositeDisposable();
        this.q = new SerialDisposable();
        this.c = new HashSet(2);
        this.n = new a() {
            public final void onFlagsChange(fpt fpt) {
                ConnectAccessViewModel.this.a(fpt);
            }
        };
        this.m.a(this.n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        if (this.m.a((fps<?>) rov.a)) {
            b();
        }
    }

    public final void a(Runnable runnable) {
        if (a()) {
            runnable.run();
        }
    }

    public final void a(int i2, GaiaDevice gaiaDevice) {
        if (this.e.b() && this.f.b()) {
            int i3 = this.r;
            if (i3 != i2) {
                if (i3 == 0) {
                    this.i.a();
                }
                this.r = i2;
                ((rom) this.e.c()).a(this.r, gaiaDevice == null ? null : gaiaDevice.getName());
                ((rot) this.f.c()).a(this.r);
            }
        }
    }

    public boolean a() {
        return this.g.a();
    }

    private synchronized void b() {
        for (Runnable run : this.c) {
            run.run();
        }
        this.c.clear();
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
    public /* synthetic */ void c() {
        if (this.f.b() && 1 == this.r) {
            rot rot = (rot) this.f.c();
            rot.a.postDelayed(rot.a(7000), 1000);
            rpg rpg = this.i;
            jrf jrf = rpg.b;
            bf bfVar = new bf(null, "com.spotify.service.connectui", "spotify:connect-access-button", null, 0, null, "connect-access-button-nudge", null, (double) System.currentTimeMillis());
            rpg.a.a(bfVar);
            Logger.b(bfVar.a(), new Object[0]);
        }
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

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_CREATE)
    public void onCreate() {
        this.q.a(this.l.a(this.j).d((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                ConnectAccessViewModel.this.a((Boolean) obj);
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_START)
    public void onStart() {
        this.p.a(this.h.e.a(this.j).d((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                ConnectAccessViewModel.this.a((row) obj);
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_STOP)
    public void onStop() {
        this.p.c();
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_DESTROY)
    public void onDestroy() {
        this.q.a(Disposables.a());
        this.m.b(this.n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ho hoVar) {
        rpg rpg = this.i;
        String str2 = "connect-access-button/tap";
        String str3 = str;
        ai aiVar = new ai(str2, str3, InteractionType.TAP.mInteractionType, "open-device-picker", (String) hoVar.a, (String) hoVar.b);
        rpg.a.a(aiVar);
        Logger.b(aiVar.a(), new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            if (this.o && a(this.r) && this.f.b()) {
                ((rot) this.f.c()).a();
            }
            this.o = false;
        } else if (a(this.r)) {
            this.o = true;
        } else {
            this.o = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(row row) {
        a(row.a, (GaiaDevice) row.b.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(q qVar) {
        li liVar = qVar.a;
        liVar.a(this);
        liVar.a(this.k);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        Fragment a2 = this.d.a((int) R.id.content);
        if (a2 != null) {
            this.p.a(rpo.a(a2).a(this.j).d((Consumer<? super T>) new Consumer(rpf.a(this.r)) {
                private final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ConnectAccessViewModel.this.a(this.f$1, (ho) obj);
                }
            }));
        }
        rpm rpm = this.b;
        if (rpm.c != null) {
            Context context = rpm.a;
            rpj rpj = rpm.c;
            context.startActivity(rpj.a.getIntent(rpj.b, rpj.c));
        }
    }
}
