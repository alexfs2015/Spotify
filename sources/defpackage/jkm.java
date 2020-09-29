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

/* renamed from: jkm reason: default package */
public class jkm implements c {
    /* access modifiers changed from: private */
    public static final String h = jkm.class.getSimpleName();
    /* access modifiers changed from: private */
    public final vwy A;
    /* access modifiers changed from: private */
    public final Handler B;
    /* access modifiers changed from: private */
    public fqn C;
    /* access modifiers changed from: private */
    public final rua D;
    /* access modifiers changed from: private */
    public final hod E;
    /* access modifiers changed from: private */
    public final ihc F;
    /* access modifiers changed from: private */
    public final AdRules G;
    /* access modifiers changed from: private */
    public final pzj H;
    /* access modifiers changed from: private */
    public final gvk I;
    /* access modifiers changed from: private */
    public final kpk J;
    /* access modifiers changed from: private */
    public final gwb K;
    /* access modifiers changed from: private */
    public final hzk L;
    public final iid a;
    public final ibj b;
    public final hzp c;
    public final hje d;
    public final jjd e;
    public final jkz f;
    public final SensorRecorder g;
    /* access modifiers changed from: private */
    public final iin i;
    /* access modifiers changed from: private */
    public final SpotifyService j;
    /* access modifiers changed from: private */
    public final jjp k;
    /* access modifiers changed from: private */
    public final BroadcastReceiver l;
    /* access modifiers changed from: private */
    public final hpn m;
    /* access modifiers changed from: private */
    public final jkp n;
    /* access modifiers changed from: private */
    public final AudioManager o = ((AudioManager) this.j.getSystemService("audio"));
    /* access modifiers changed from: private */
    public final vwv p;
    /* access modifiers changed from: private */
    public final sfp q;
    /* access modifiers changed from: private */
    public WifiLock r;
    /* access modifiers changed from: private */
    public WakeLock s;
    /* access modifiers changed from: private */
    public final seb t;
    /* access modifiers changed from: private */
    public final hkm u;
    /* access modifiers changed from: private */
    public final ConnectManager v;
    private final jiy w;
    private final jko x;
    /* access modifiers changed from: private */
    public final iiq y;
    /* access modifiers changed from: private */
    public boolean z;

    public jkm(SpotifyService spotifyService, Handler handler, vwy vwy, hpn hpn, jkp jkp, jkk jkk, seb seb, hkm hkm, ConnectManager connectManager, jjp jjp, iiq iiq, iin iin, iid iid, ibj ibj, jiy jiy, jjd jjd, hod hod, SensorRecorder sensorRecorder, ihc ihc, AdRules adRules, pzj pzj, gvk gvk, kpk kpk, tvn tvn, hzp hzp, Picasso picasso, gwb gwb, ibn ibn, ibh ibh, ury ury, rup rup, rua rua, hzk hzk, vwv vwv, sfp sfp, ghv ghv) {
        final SpotifyService spotifyService2 = spotifyService;
        final jkp jkp2 = jkp;
        final ibh ibh2 = ibh;
        final rup rup2 = rup;
        final ghv ghv2 = ghv;
        this.j = spotifyService2;
        this.B = (Handler) fbp.a(handler);
        this.A = (vwy) fbp.a(vwy);
        this.m = hpn;
        this.n = jkp2;
        this.t = seb;
        this.u = hkm;
        this.v = (ConnectManager) fbp.a(connectManager);
        this.k = jjp;
        this.D = rua;
        this.E = hod;
        this.g = sensorRecorder;
        this.F = ihc;
        this.G = adRules;
        this.H = pzj;
        this.I = gvk;
        this.J = kpk;
        this.c = hzp;
        this.p = vwv;
        this.q = sfp;
        this.i = iin;
        this.a = iid;
        this.b = ibj;
        this.y = iiq;
        this.d = jkk.b;
        this.l = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Logger.d("Audio has become noisy - headset probably removed", new Object[0]);
                jkm.this.m.a(true);
            }
        };
        this.K = gwb;
        this.L = hzk;
        AnonymousClass12 r6 = new jko() {
            public final void a() {
                if (jkm.this.n.p.e) {
                    jkm.c(jkm.this);
                }
            }

            public final void b() {
                jkm.this.z = false;
            }
        };
        AnonymousClass20 r7 = new jim() {
            private void e() {
                Logger.b("Request audio focus", new Object[0]);
                jkm.this.d.a(jkm.this.n.r.a, jkm.this.n.r.b);
            }

            public final void a() {
                e();
                jkm.this.j.registerReceiver(jkm.this.l, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }

            public final void b() {
                try {
                    jkm.this.j.unregisterReceiver(jkm.this.l);
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
        };
        AnonymousClass21 r8 = new jiq() {
            public final void a() {
                Logger.b("Ad Playing State Enabled", new Object[0]);
                jkm.this.G.a(StateType.STREAMING_AD_IN_PROGRESS, true);
                jkm.this.j.getApplicationContext().getContentResolver().registerContentObserver(System.CONTENT_URI, true, jkm.this.y);
                jkm.this.y.a(jkm.this.n.q.a, jkm.this.n.q.b);
            }

            public final void a(String str, String str2) {
                Logger.b("Ad Playing State Ad Changed", new Object[0]);
                jkm.this.y.a(str, str2);
            }

            public final void b() {
                Logger.b("Ad Playing State Disabled", new Object[0]);
                jkm.this.G.a(StateType.STREAMING_AD_IN_PROGRESS, false);
                jkm.this.j.getApplicationContext().getContentResolver().unregisterContentObserver(jkm.this.y);
            }
        };
        final ibn ibn2 = ibn;
        this.x = new jko() {
            public final void a() {
                boolean z = false;
                Logger.a("foregroundStateListener.onEnabled", new Object[0]);
                hje f = jkm.this.d;
                if (f.g && f.c == null) {
                    f.c = new ComponentName(f.a.getPackageName(), MediaButtonReceiver.class.getName());
                    f.d.registerMediaButtonEventReceiver(f.c);
                }
                for (b a2 : f.b) {
                    a2.a();
                }
                iid i = jkm.this.a;
                i.b.a(i.a.a("focus", "true").h().a(iid.c, iid.d));
                if (jkm.this.n.q.e) {
                    jkm.this.i.a("foregrounded", jkm.this.n.q.a, jkm.this.n.q.b);
                }
                jkm jkm = jkm.this;
                jkm.z = jkm.o.isWiredHeadsetOn() || jkm.this.o.isBluetoothA2dpOn();
                Logger.a("mWasForegroundedWithHeadsetPlugged.mWasForegroundedWithHeadsetPlugged = %s", String.valueOf(jkm.this.z));
                if (jkm.this.z && jkp2.p.e && jkp2.b.g() && ghv2.a) {
                    Logger.a("foregroundStateListener.switchToLocal", new Object[0]);
                    jkm.c(jkm.this);
                }
                jkm.this.E.a();
                ihc n = jkm.this.F;
                Logger.b("Opportunity to render: isFeatureEnabled:%s, isAudioPlusFetchEnabled:%s, isPermitted:%s, hasConsumer:%s, hasPendingAd:%s, isInPortraitMode:%s", Boolean.valueOf(n.c), Boolean.valueOf(n.f), Boolean.valueOf(n.d), Boolean.valueOf(n.h()), Boolean.valueOf(n.f()), Boolean.valueOf(n.g()));
                n.d();
                n.e();
                if (n.f() && n.d && n.h() && n.g()) {
                    z = true;
                }
                if (z) {
                    n.a();
                }
                jkm.this.v.s();
                ibn ibn = ibn2;
                if (ibn.a.b() && ibn.b.b()) {
                    ibn.a((AdProduct) ibn.b.c(), (ibm) ibn.a.c()).a();
                }
                hzk p = jkm.this.L;
                if (p.a.a(p.b.a, "android.permission.RECORD_AUDIO") != p.c) {
                    p.c = !p.c;
                    p.a(p.c);
                }
            }

            public final void b() {
                Logger.a("foregroundStateListener.onDisabled", new Object[0]);
                jkm.this.z = false;
                iid i = jkm.this.a;
                i.b.a(i.a.a("focus", "false").h().a(iid.c, iid.d));
                if (jkm.this.n.q.e) {
                    jkm.this.i.a("backgrounded", jkm.this.n.q.a, jkm.this.n.q.b);
                }
                jkm.this.E.b();
                jkm.this.F.b();
            }
        };
        AnonymousClass23 r9 = new jko() {
            public final void a() {
                jkm.this.r = ((WifiManager) jkm.this.j.getApplicationContext().getSystemService("wifi")).createWifiLock("Spotify Wifi Lock");
                jkm.this.r.acquire();
            }

            public final void b() {
                jkm.this.r.release();
                jkm.this.r = null;
            }
        };
        AnonymousClass24 r10 = new jko() {
            private boolean a;

            public final void a() {
                if (this.a && jkm.this.n.a.e) {
                    jkm.this.m.a(false);
                }
            }

            public final void b() {
                if (!jkm.this.n.r.e) {
                    this.a = false;
                } else if (jkm.this.n.b.e) {
                    jkm.this.m.a(true);
                    this.a = true;
                }
            }
        };
        AnonymousClass25 r11 = new jko() {
            public final void a() {
                Logger.e("The application has been idle too long, stopping service", new Object[0]);
                jkm.this.j.b();
            }

            public final void b() {
                jkm.this.j.E.a();
            }
        };
        AnonymousClass26 r12 = new jko() {
            public final void a() {
                if (!jkm.this.p.a()) {
                    c a2 = new c(spotifyService2, "spotify_updates_channel").b((CharSequence) spotifyService2.getString(R.string.notification_service_is_running)).a((int) R.drawable.icn_notification).a(new long[]{0});
                    a2.h = -1;
                    jkm.this.A.a(R.id.notification_service_starting, a2.b(), true);
                }
            }

            public final void b() {
                if (!jkm.this.p.a()) {
                    Logger.e("InitState disabled, hiding notification", new Object[0]);
                    jkm.this.A.a((int) R.id.notification_service_starting);
                    if (jkp2.d.g() && jkp2.j.g() && jkp2.k.g()) {
                        Logger.e("InitState disabled and no foreground/notification state enabled, dispatching shutdown", new Object[0]);
                        jkm.this.j.b();
                    }
                }
            }
        };
        AnonymousClass2 r1 = new jko() {
            public final void a() {
                jkm.this.t.g();
            }

            public final void b() {
                jkm.this.t.h();
            }
        };
        AnonymousClass3 r13 = new jko() {
            public final void a() {
                jkm.this.u.d = true;
            }

            public final void b() {
                hkm u = jkm.this.u;
                u.d = false;
                u.c();
            }
        };
        final ConnectManager connectManager2 = connectManager;
        final tvn tvn2 = tvn;
        final Picasso picasso2 = picasso;
        final ury ury2 = ury;
        AnonymousClass4 r33 = new jko() {
            public final void a() {
                hwm hwm = new hwm(jkm.this.j, jkm.this.A, new hws(), jkm.this.B, jkm.this.C, jkm.this.t, connectManager2, tvn2, picasso2, ury2);
                jkm.this.u.a((hwr) hwm);
            }

            public final void b() {
                jkm.this.u.a((hwr) null);
            }
        };
        AnonymousClass5 r15 = new jko() {
            public final void a() {
                if (jkm.this.z && jkm.this.n.b.g() && ghv2.a) {
                    jkm.this.z = false;
                    jkm.c(jkm.this);
                }
            }

            public final void b() {
            }
        };
        AnonymousClass6 r17 = new jko() {
            public final void a() {
                if (jkm.this.q.a.f()) {
                    jkm.this.s = ((PowerManager) jkm.this.j.getSystemService("power")).newWakeLock(1, jkm.h);
                    jkm.this.s.acquire();
                }
            }

            public final void b() {
                if (jkm.this.s != null) {
                    jkm.this.s.release();
                    jkm.this.s = null;
                }
            }
        };
        AnonymousClass7 r18 = new jko() {
            public final void a() {
                ibj z = jkm.this.b;
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
                iid i = jkm.this.a;
                i.b.a(i.a.a("ad-product", "no-midroll-watch-now").h().a(iid.c, iid.d));
                jkm.this.H.a(true);
                jkm.this.I.a(true);
                mh.a(jkm.this.j.getApplicationContext()).a(new Intent("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_ON"));
            }

            public final void b() {
                ibj z = jkm.this.b;
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
                iid i = jkm.this.a;
                i.b.a(i.a.a("ad-product", "midroll-watch-now").h().a(iid.c, iid.d));
                jkm.this.H.a(false);
                jkm.this.I.a(false);
                mh.a(jkm.this.j.getApplicationContext()).a(new Intent("com.spotify.mobile.android.service.broadcast.driver.DISTRACTION_MODE_OFF"));
            }
        };
        AnonymousClass8 r19 = new jko() {
            public final void a() {
                jkm.this.K.a(true);
            }

            public final void b() {
                jkm.this.K.a(false);
            }
        };
        AnonymousClass9 r20 = new jko() {
            public final void a() {
                jkm.this.k.a(true);
            }

            public final void b() {
                jkm.this.k.a(false);
            }
        };
        AnonymousClass10 r22 = new jko() {
            public final void a() {
                ibh ibh = ibh2;
                if (ibh.c && !ibh.b) {
                    ibh.a.sendEmptyMessage(1);
                }
            }

            public final void b() {
                ibh ibh = ibh2;
                if (ibh.c && ibh.b) {
                    ibh.a.sendEmptyMessage(2);
                }
            }
        };
        AnonymousClass11 r5 = new jko() {
            public final void a() {
                ibh ibh = ibh2;
                if (ibh.c) {
                    ibh.a.sendEmptyMessage(3);
                }
            }

            public final void b() {
                ibh ibh = ibh2;
                if (ibh.c) {
                    ibh.a.sendEmptyMessage(4);
                }
            }
        };
        AnonymousClass13 r3 = new jko() {
            public final void a() {
                rua E = jkm.this.D;
                E.a.a(new g("foreground", E.b.a()));
                E.c = true;
            }

            public final void b() {
                rua E = jkm.this.D;
                if (E.d) {
                    E.a.a(new g("background-playing", E.b.a()));
                } else {
                    E.a.a(new g("suspended", E.b.a()));
                }
                E.c = false;
            }
        };
        AnonymousClass21 r23 = r8;
        AnonymousClass14 r82 = new jko() {
            public final void a() {
                rua E = jkm.this.D;
                if (!E.c) {
                    E.a.a(new g("background-playing", E.b.a()));
                }
                E.d = true;
            }

            public final void b() {
                rua E = jkm.this.D;
                if (!E.c) {
                    E.a.a(new g("suspended", E.b.a()));
                }
                E.d = false;
            }
        };
        AnonymousClass5 r24 = r15;
        AnonymousClass15 r152 = new jko() {
            public final void a() {
                rup2.b = true;
            }

            public final void b() {
                rup2.b = false;
            }
        };
        AnonymousClass4 r26 = r33;
        AnonymousClass16 r14 = new jko() {
            public final void a() {
                rup2.c = true;
            }

            public final void b() {
                rup2.c = false;
            }
        };
        AnonymousClass17 r4 = new jko() {
            public final void a() {
                jkm.this.J.a(true);
            }

            public final void b() {
                jkm.this.J.a(false);
            }
        };
        AnonymousClass3 r27 = r13;
        AnonymousClass18 r132 = new jko() {
            public final void a() {
                jkm.this.J.b(true);
            }

            public final void b() {
                jkm.this.J.b(false);
            }
        };
        AnonymousClass2 r28 = r1;
        AnonymousClass19 r16 = new jko() {
            public final void a() {
                hzp G = jkm.this.c;
                jkp jkp = jkp2;
                if (jkp.d != null) {
                    G.a.a("focus", Boolean.toString(jkp.d.e));
                    jkp.d.a(G.b);
                }
                if (jkp.B != null) {
                    G.a.a("screen_lock", Boolean.toString(jkp.B.e));
                    jkp.B.a(G.c);
                }
                jjm f = jkp.f();
                String str = "moving";
                if (f != null) {
                    G.a.a(str, Boolean.toString(jkp.d.e));
                    f.a(G.d);
                } else {
                    G.a.a(str, "Not Supported");
                }
                if (jkp.n != null) {
                    G.a.a("active_connected_device", "[]");
                }
            }

            public final void b() {
                jkm.this.c.a.a();
            }
        };
        this.w = jiy;
        this.e = jjd;
        AnonymousClass19 r25 = r16;
        AnonymousClass26 r29 = r12;
        this.f = new jkz(this.n.f, this.g);
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

    static /* synthetic */ void c(jkm jkm) {
        if (!jkm.n.b.e || jkm.v.q() == null || jkm.v.q().d != DeviceType.AUTOMOBILE) {
            jkm.v.t();
        }
    }

    public void onFlagsChanged(fqn fqn) {
        Logger.b("State Handler On Flags Changed", new Object[0]);
        this.C = fqn;
    }
}
