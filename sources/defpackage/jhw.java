package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.System;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.ConnectDevice.DeviceType;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.feature.FeatureService.c;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.model.AdProduct;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.music.R;
import com.spotify.music.internal.receiver.MediaButtonReceiver;
import com.squareup.picasso.Picasso;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/* renamed from: jhw reason: default package */
public class jhw implements c {
    /* access modifiers changed from: private */
    public static final String h = jhw.class.getSimpleName();
    /* access modifiers changed from: private */
    public final vjs A;
    /* access modifiers changed from: private */
    public final Handler B;
    /* access modifiers changed from: private */
    public fpt C;
    /* access modifiers changed from: private */
    public final rku D;
    /* access modifiers changed from: private */
    public final hll E;
    /* access modifiers changed from: private */
    public final iep F;
    /* access modifiers changed from: private */
    public final AdRules G;
    /* access modifiers changed from: private */
    public final pqn H;
    /* access modifiers changed from: private */
    public final gtk I;
    /* access modifiers changed from: private */
    public final kmb J;
    /* access modifiers changed from: private */
    public final gub K;
    /* access modifiers changed from: private */
    public final hwy L;
    public final ifq a;
    public final hyx b;
    public final hxd c;
    public final hgi d;
    public final jgo e;
    public final jij f;
    public final SensorRecorder g;
    /* access modifiers changed from: private */
    public final iga i;
    /* access modifiers changed from: private */
    public final SpotifyService j;
    /* access modifiers changed from: private */
    public final jha k;
    /* access modifiers changed from: private */
    public final BroadcastReceiver l;
    /* access modifiers changed from: private */
    public final hmw m;
    /* access modifiers changed from: private */
    public final jhz n;
    /* access modifiers changed from: private */
    public final AudioManager o = ((AudioManager) this.j.getSystemService("audio"));
    /* access modifiers changed from: private */
    public final vjp p;
    /* access modifiers changed from: private */
    public final rwf q;
    /* access modifiers changed from: private */
    public WifiLock r;
    /* access modifiers changed from: private */
    public WakeLock s;
    /* access modifiers changed from: private */
    public final rur t;
    /* access modifiers changed from: private */
    public final hhs u;
    /* access modifiers changed from: private */
    public final ConnectManager v;
    private final jgj w;
    private final jhy x;
    /* access modifiers changed from: private */
    public final igd y;
    /* access modifiers changed from: private */
    public boolean z;

    public jhw(SpotifyService spotifyService, Handler handler, vjs vjs, hmw hmw, jhz jhz, jhu jhu, rur rur, hhs hhs, ConnectManager connectManager, jha jha, igd igd, iga iga, ifq ifq, hyx hyx, jgj jgj, jgo jgo, hll hll, SensorRecorder sensorRecorder, iep iep, AdRules adRules, pqn pqn, gtk gtk, kmb kmb, tjv tjv, hxd hxd, Picasso picasso, gub gub, hzb hzb, hyv hyv, ugk ugk, rlj rlj, rku rku, hwy hwy, vjp vjp, rwf rwf, ggk ggk) {
        final SpotifyService spotifyService2 = spotifyService;
        final jhz jhz2 = jhz;
        final hyv hyv2 = hyv;
        final rlj rlj2 = rlj;
        final ggk ggk2 = ggk;
        this.j = spotifyService2;
        this.B = (Handler) fay.a(handler);
        this.A = (vjs) fay.a(vjs);
        this.m = hmw;
        this.n = jhz2;
        this.t = rur;
        this.u = hhs;
        this.v = (ConnectManager) fay.a(connectManager);
        this.k = jha;
        this.D = rku;
        this.E = hll;
        this.g = sensorRecorder;
        this.F = iep;
        this.G = adRules;
        this.H = pqn;
        this.I = gtk;
        this.J = kmb;
        this.c = hxd;
        this.p = vjp;
        this.q = rwf;
        this.i = iga;
        this.a = ifq;
        this.b = hyx;
        this.y = igd;
        this.d = jhu.b;
        this.l = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Logger.d("Audio has become noisy - headset probably removed", new Object[0]);
                jhw.this.m.a(true);
            }
        };
        this.K = gub;
        this.L = hwy;
        AnonymousClass12 r6 = new jhy() {
            public final void a() {
                if (jhw.this.n.p.e) {
                    jhw.c(jhw.this);
                }
            }

            public final void b() {
                jhw.this.z = false;
            }
        };
        AnonymousClass20 r7 = new jfx() {
            public final void a() {
                e();
                jhw.this.j.registerReceiver(jhw.this.l, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }

            public final void b() {
                try {
                    jhw.this.j.unregisterReceiver(jhw.this.l);
                } catch (IllegalArgumentException e) {
                    Assertion.a("Should have been registered", (Throwable) e);
                }
            }

            public final void c() {
                e();
            }

            public final void d() {
                e();
            }

            private void e() {
                Logger.b("Request audio focus", new Object[0]);
                jhw.this.d.a(jhw.this.n.r.a, jhw.this.n.r.b);
            }
        };
        AnonymousClass21 r8 = new jgb() {
            public final void a() {
                Logger.b("Ad Playing State Enabled", new Object[0]);
                jhw.this.G.a(StateType.STREAMING_AD_IN_PROGRESS, true);
                jhw.this.j.getApplicationContext().getContentResolver().registerContentObserver(System.CONTENT_URI, true, jhw.this.y);
                jhw.this.y.a(jhw.this.n.q.a, jhw.this.n.q.b);
            }

            public final void b() {
                Logger.b("Ad Playing State Disabled", new Object[0]);
                jhw.this.G.a(StateType.STREAMING_AD_IN_PROGRESS, false);
                jhw.this.j.getApplicationContext().getContentResolver().unregisterContentObserver(jhw.this.y);
            }

            public final void a(String str, String str2) {
                Logger.b("Ad Playing State Ad Changed", new Object[0]);
                jhw.this.y.a(str, str2);
            }
        };
        final hzb hzb2 = hzb;
        this.x = new jhy() {
            public final void a() {
                boolean z = false;
                Logger.a("foregroundStateListener.onEnabled", new Object[0]);
                hgi f = jhw.this.d;
                if (f.g && f.c == null) {
                    f.c = new ComponentName(f.a.getPackageName(), MediaButtonReceiver.class.getName());
                    f.d.registerMediaButtonEventReceiver(f.c);
                }
                for (b a2 : f.b) {
                    a2.a();
                }
                ifq i = jhw.this.a;
                i.b.a(i.a.a("focus", "true").h().a(ifq.c, ifq.d));
                if (jhw.this.n.q.e) {
                    jhw.this.i.a("foregrounded", jhw.this.n.q.a, jhw.this.n.q.b);
                }
                jhw jhw = jhw.this;
                jhw.z = jhw.o.isWiredHeadsetOn() || jhw.this.o.isBluetoothA2dpOn();
                Logger.a("mWasForegroundedWithHeadsetPlugged.mWasForegroundedWithHeadsetPlugged = %s", String.valueOf(jhw.this.z));
                if (jhw.this.z && jhz2.p.e && jhz2.b.g() && ggk2.a) {
                    Logger.a("foregroundStateListener.switchToLocal", new Object[0]);
                    jhw.c(jhw.this);
                }
                jhw.this.E.a();
                iep n = jhw.this.F;
                Logger.b("Opportunity to render: isFeatureEnabled:%s, isAudioPlusFetchEnabled:%s, isPermitted:%s, hasConsumer:%s, hasPendingAd:%s, isInPortraitMode:%s", Boolean.valueOf(n.c), Boolean.valueOf(n.f), Boolean.valueOf(n.d), Boolean.valueOf(n.h()), Boolean.valueOf(n.f()), Boolean.valueOf(n.g()));
                n.d();
                n.e();
                if (n.f() && n.d && n.h() && n.g()) {
                    z = true;
                }
                if (z) {
                    n.a();
                }
                jhw.this.v.s();
                hzb hzb = hzb2;
                if (hzb.a.b() && hzb.b.b()) {
                    hzb.a((AdProduct) hzb.b.c(), (hza) hzb.a.c()).a();
                }
                hwy p = jhw.this.L;
                if (p.a.a(p.b.a, "android.permission.RECORD_AUDIO") != p.c) {
                    p.c = !p.c;
                    p.a(p.c);
                }
            }

            public final void b() {
                Logger.a("foregroundStateListener.onDisabled", new Object[0]);
                jhw.this.z = false;
                ifq i = jhw.this.a;
                i.b.a(i.a.a("focus", "false").h().a(ifq.c, ifq.d));
                if (jhw.this.n.q.e) {
                    jhw.this.i.a("backgrounded", jhw.this.n.q.a, jhw.this.n.q.b);
                }
                jhw.this.E.b();
                jhw.this.F.b();
            }
        };
        AnonymousClass23 r9 = new jhy() {
            public final void a() {
                jhw.this.r = ((WifiManager) jhw.this.j.getApplicationContext().getSystemService("wifi")).createWifiLock("Spotify Wifi Lock");
                jhw.this.r.acquire();
            }

            public final void b() {
                jhw.this.r.release();
                jhw.this.r = null;
            }
        };
        AnonymousClass24 r10 = new jhy() {
            private boolean a;

            public final void a() {
                if (this.a && jhw.this.n.a.e) {
                    jhw.this.m.a(false);
                }
            }

            public final void b() {
                if (!jhw.this.n.r.e) {
                    this.a = false;
                } else if (jhw.this.n.b.e) {
                    jhw.this.m.a(true);
                    this.a = true;
                }
            }
        };
        AnonymousClass25 r11 = new jhy() {
            public final void a() {
                Logger.e("The application has been idle too long, stopping service", new Object[0]);
                jhw.this.j.b();
            }

            public final void b() {
                jhw.this.j.E.a();
            }
        };
        AnonymousClass26 r12 = new jhy() {
            public final void a() {
                if (!jhw.this.p.a()) {
                    c a2 = new c(spotifyService2, "spotify_updates_channel").b((CharSequence) spotifyService2.getString(R.string.notification_service_is_running)).a((int) R.drawable.icn_notification).a(new long[]{0});
                    a2.h = -1;
                    jhw.this.A.a(R.id.notification_service_starting, a2.b(), true);
                }
            }

            public final void b() {
                if (!jhw.this.p.a()) {
                    Logger.e("InitState disabled, hiding notification", new Object[0]);
                    jhw.this.A.a((int) R.id.notification_service_starting);
                    if (jhz2.d.g() && jhz2.j.g() && jhz2.k.g()) {
                        Logger.e("InitState disabled and no foreground/notification state enabled, dispatching shutdown", new Object[0]);
                        jhw.this.j.b();
                    }
                }
            }
        };
        AnonymousClass2 r1 = new jhy() {
            public final void a() {
                jhw.this.t.g();
            }

            public final void b() {
                jhw.this.t.h();
            }
        };
        AnonymousClass3 r13 = new jhy() {
            public final void a() {
                jhw.this.u.d = true;
            }

            public final void b() {
                hhs u = jhw.this.u;
                u.d = false;
                u.c();
            }
        };
        final ConnectManager connectManager2 = connectManager;
        final tjv tjv2 = tjv;
        final Picasso picasso2 = picasso;
        final ugk ugk2 = ugk;
        AnonymousClass4 r33 = new jhy() {
            public final void a() {
                hua hua = new hua(jhw.this.j, jhw.this.A, new hug(), jhw.this.B, jhw.this.C, jhw.this.t, connectManager2, tjv2, picasso2, ugk2);
                jhw.this.u.a((huf) hua);
            }

            public final void b() {
                jhw.this.u.a((huf) null);
            }
        };
        AnonymousClass5 r15 = new jhy() {
            public final void b() {
            }

            public final void a() {
                if (jhw.this.z && jhw.this.n.b.g() && ggk2.a) {
                    jhw.this.z = false;
                    jhw.c(jhw.this);
                }
            }
        };
        AnonymousClass6 r17 = new jhy() {
            public final void a() {
                if (jhw.this.q.a.f()) {
                    jhw.this.s = ((PowerManager) jhw.this.j.getSystemService("power")).newWakeLock(1, jhw.h);
                    jhw.this.s.acquire();
                }
            }

            public final void b() {
                if (jhw.this.s != null) {
                    jhw.this.s.release();
                    jhw.this.s = null;
                }
            }
        };
        AnonymousClass7 r18 = new jhy() {
            public final void a() {
                hyx z = jhw.this.b;
                CompositeDisposable compositeDisposable = z.c;
                String str = "false";
                String str2 = "slot_enabled";
                Observable a2 = z.a.a(AdSlot.WATCHNOW.getSlotId(), str2, str);
                a aVar = new a("disableWatchNow", 0);
                a2.subscribe(aVar);
                compositeDisposable.a((Disposable) aVar);
                CompositeDisposable compositeDisposable2 = z.c;
                Observable a3 = z.a.a(AdSlot.MIDROLL_WATCHNOW.getSlotId(), str2, str);
                a aVar2 = new a("disableMidrollWatchNow", 0);
                a3.subscribe(aVar2);
                compositeDisposable2.a((Disposable) aVar2);
                z.b.a(AdSlot.STREAM.getSlotId(), SlotApi.Intent.CLEAR).a((CompletableObserver) new b("ClearStream"));
                z.b.a(AdSlot.PREROLL.getSlotId(), SlotApi.Intent.CLEAR).a((CompletableObserver) new b("ClearPreroll"));
                ifq i = jhw.this.a;
                i.b.a(i.a.a("ad-product", "no-midroll-watch-now").h().a(ifq.c, ifq.d));
                jhw.this.H.a(true);
                jhw.this.I.a(true);
                mc.a(jhw.this.j.getApplicationContext()).a(new Intent("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_ON"));
            }

            public final void b() {
                hyx z = jhw.this.b;
                CompositeDisposable compositeDisposable = z.c;
                String str = "true";
                String str2 = "slot_enabled";
                Observable a2 = z.a.a(AdSlot.WATCHNOW.getSlotId(), str2, str);
                a aVar = new a("enableWatchNow", 0);
                a2.subscribe(aVar);
                compositeDisposable.a((Disposable) aVar);
                CompositeDisposable compositeDisposable2 = z.c;
                Observable a3 = z.a.a(AdSlot.MIDROLL_WATCHNOW.getSlotId(), str2, str);
                a aVar2 = new a("enableMidrollWatchNow", 0);
                a3.subscribe(aVar2);
                compositeDisposable2.a((Disposable) aVar2);
                ifq i = jhw.this.a;
                i.b.a(i.a.a("ad-product", "midroll-watch-now").h().a(ifq.c, ifq.d));
                jhw.this.H.a(false);
                jhw.this.I.a(false);
                mc.a(jhw.this.j.getApplicationContext()).a(new Intent("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_OFF"));
            }
        };
        AnonymousClass8 r19 = new jhy() {
            public final void a() {
                jhw.this.K.a(true);
            }

            public final void b() {
                jhw.this.K.a(false);
            }
        };
        AnonymousClass9 r20 = new jhy() {
            public final void a() {
                jhw.this.k.a(true);
            }

            public final void b() {
                jhw.this.k.a(false);
            }
        };
        AnonymousClass10 r22 = new jhy() {
            public final void a() {
                hyv hyv = hyv2;
                if (hyv.c && !hyv.b) {
                    hyv.a.sendEmptyMessage(1);
                }
            }

            public final void b() {
                hyv hyv = hyv2;
                if (hyv.c && hyv.b) {
                    hyv.a.sendEmptyMessage(2);
                }
            }
        };
        AnonymousClass11 r5 = new jhy() {
            public final void a() {
                hyv hyv = hyv2;
                if (hyv.c) {
                    hyv.a.sendEmptyMessage(3);
                }
            }

            public final void b() {
                hyv hyv = hyv2;
                if (hyv.c) {
                    hyv.a.sendEmptyMessage(4);
                }
            }
        };
        AnonymousClass13 r3 = new jhy() {
            public final void a() {
                rku E = jhw.this.D;
                E.a.a(new g("foreground", E.b.a()));
                E.c = true;
            }

            public final void b() {
                rku E = jhw.this.D;
                if (E.d) {
                    E.a.a(new g("background-playing", E.b.a()));
                } else {
                    E.a.a(new g("suspended", E.b.a()));
                }
                E.c = false;
            }
        };
        AnonymousClass21 r23 = r8;
        AnonymousClass14 r82 = new jhy() {
            public final void a() {
                rku E = jhw.this.D;
                if (!E.c) {
                    E.a.a(new g("background-playing", E.b.a()));
                }
                E.d = true;
            }

            public final void b() {
                rku E = jhw.this.D;
                if (!E.c) {
                    E.a.a(new g("suspended", E.b.a()));
                }
                E.d = false;
            }
        };
        AnonymousClass5 r24 = r15;
        AnonymousClass15 r152 = new jhy() {
            public final void a() {
                rlj2.b = true;
            }

            public final void b() {
                rlj2.b = false;
            }
        };
        AnonymousClass4 r26 = r33;
        AnonymousClass16 r14 = new jhy() {
            public final void a() {
                rlj2.c = true;
            }

            public final void b() {
                rlj2.c = false;
            }
        };
        AnonymousClass17 r4 = new jhy() {
            public final void a() {
                jhw.this.J.a(true);
            }

            public final void b() {
                jhw.this.J.a(false);
            }
        };
        AnonymousClass3 r27 = r13;
        AnonymousClass18 r132 = new jhy() {
            public final void a() {
                jhw.this.J.b(true);
            }

            public final void b() {
                jhw.this.J.b(false);
            }
        };
        AnonymousClass2 r28 = r1;
        AnonymousClass19 r16 = new jhy() {
            public final void a() {
                hxd G = jhw.this.c;
                jhz jhz = jhz2;
                if (jhz.d != null) {
                    G.a.a("focus", Boolean.toString(jhz.d.e));
                    jhz.d.a(G.b);
                }
                if (jhz.B != null) {
                    G.a.a("screen_lock", Boolean.toString(jhz.B.e));
                    jhz.B.a(G.c);
                }
                jgx f = jhz.f();
                String str = "moving";
                if (f != null) {
                    G.a.a(str, Boolean.toString(jhz.d.e));
                    f.a(G.d);
                } else {
                    G.a.a(str, "Not Supported");
                }
                if (jhz.n != null) {
                    G.a.a("active_connected_device", "[]");
                }
            }

            public final void b() {
                jhw.this.c.a.a();
            }
        };
        this.w = jgj;
        this.e = jgo;
        AnonymousClass19 r25 = r16;
        AnonymousClass26 r29 = r12;
        this.f = new jij(this.n.f, this.g);
        this.n.f.a(this.f);
        this.n.s.a(this.w);
        this.n.m.a(r6);
        this.n.r.a(r7);
        this.n.r.a(r82);
        this.n.d.a(this.x);
        this.n.d.a(r5);
        this.n.d.a(r3);
        this.n.d.a(r152);
        this.n.d.a(r4);
        this.n.e.a(r9);
        this.n.g.a(r10);
        this.n.h.a(r11);
        this.n.h.a(r14);
        this.n.h.a(r132);
        this.n.C.a(r29);
        this.n.i.a(r28);
        this.n.j.a(r27);
        this.n.k.a(r26);
        this.n.p.a(r24);
        this.n.q.a(r23);
        this.n.v.a(r17);
        this.n.u.a(r20);
        this.n.n.a(r18);
        this.n.b.a(r22);
        this.n.z.a(r25);
        this.n.t.a(r19);
        this.n.d();
        this.n.e();
        Logger.b("State Handler Created", new Object[0]);
    }

    public void onFlagsChanged(fpt fpt) {
        Logger.b("State Handler On Flags Changed", new Object[0]);
        this.C = fpt;
    }

    static /* synthetic */ void c(jhw jhw) {
        if (!jhw.n.b.e || jhw.v.q() == null || jhw.v.q().d != DeviceType.AUTOMOBILE) {
            jhw.v.t();
        }
    }
}
