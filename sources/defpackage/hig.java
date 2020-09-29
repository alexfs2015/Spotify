package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.core.orbit.OrbitServiceObserver;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter;
import com.spotify.mobile.android.service.StateRestoreFileDeleter;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.MainActivity;
import com.spotify.music.R;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* renamed from: hig reason: default package */
public final class hig {
    final Context a;
    public final hip b;
    public final hiq c;
    public final hie d;
    final hiw e;
    final hkm f;
    final hit g;
    final gnb h;
    public final rug i;
    public final Looper j;
    final hjk k;
    final CountDownLatch l = new CountDownLatch(1);
    final Object m = new Object();
    final SerialDisposable n = new SerialDisposable();
    RxRouter o;
    public QueuingRemoteNativeRouter p;
    private final uyx q;
    private final StateRestoreFileDeleter r;
    private final hju s;
    private final hko t;
    private final hid u;
    private final Handler v;
    private final Optional<OrbitServiceInterface> w;
    private final OrbitServiceObserver x = new OrbitServiceObserver() {
        public final void onForgetCredentials() {
            super.onForgetCredentials();
            for (b bVar : hig.this.k.a) {
                gnb gnb = hig.this.h;
                bVar.getClass();
                $$Lambda$mZYNFYJz_My_EZ221_iPXmKac0 r3 = new $$Lambda$mZYNFYJz_My_EZ221_iPXmKac0(bVar);
                StringBuilder sb = new StringBuilder("dssfc_");
                sb.append(bVar.c().toLowerCase(Locale.US));
                gnb.a((Runnable) r3, sb.toString());
            }
        }

        public final void onIncognitoModeDisabledByTimer() {
            Logger.b("onIncognitoModeDisabledByTimer()", new Object[0]);
            PendingIntent b = hig.this.g.b(hig.this.a);
            hkm hkm = hig.this.f;
            Resources resources = hkm.a.getResources();
            String string = resources.getString(R.string.notification_incognito_mode_disabled_title);
            String string2 = resources.getString(R.string.notification_incognito_mode_disabled_message);
            c cVar = new c(hkm.a, "spotify_updates_channel");
            cVar.f = b;
            cVar.a((CharSequence) string);
            cVar.d(string);
            cVar.b((CharSequence) string2);
            cVar.a((int) R.drawable.icn_notification);
            cVar.b(true);
            ((NotificationManager) hkm.a.getSystemService("notification")).notify(R.id.notification_incognito_mode_disabled, cVar.b());
        }

        public final void onLoginError(int i) {
            Logger.b("Login error: %d", Integer.valueOf(i));
            hig.this.a.sendBroadcast(hig.this.g.a(i));
        }

        public final void onMainSchedulerIdle(int i) {
        }

        public final void onOfflineSyncError(int i) {
        }

        public final void onOrbitStarted() {
            Logger.b("onOrbitStarted", new Object[0]);
            hig.this.b.a();
            Logger.c("Orbit started", new Object[0]);
            hig.this.l.countDown();
        }

        public final void onOrbitStartupFailed(int i) {
            Logger.b("onOrbitStartupFailed: %d", Integer.valueOf(i));
            hiw hiw = hig.this.e;
            if (i == 1301) {
                Logger.e("There is no cache location, giving up starting Core.", new Object[0]);
                Intent intent = new Intent(hiw.a, MainActivity.class);
                intent.addFlags(268435456);
                PendingIntent activity = PendingIntent.getActivity(hiw.a.getApplicationContext(), 0, intent, 0);
                c cVar = new c(hiw.a);
                c a2 = cVar.a((CharSequence) hiw.a.getString(R.string.alert_title_no_sd_card_found)).b((CharSequence) hiw.a.getString(R.string.alert_text_no_sd_card_found)).a((int) R.drawable.icn_notification).a(true).a(0);
                a2.p = "err";
                a2.h = 0;
                a2.f = activity;
                a2.b(true);
                hiw.b.notify(R.id.notification_no_storage_device, cVar.b());
                if (hiw.c.nextDouble() >= 0.99d) {
                    Assertion.c("Could not find valid cache location. (Throttled 99%)");
                }
            }
            hig.this.b.c = true;
            synchronized (hig.this.b.a) {
                hig.this.b.c();
            }
            StringBuilder sb = new StringBuilder("Orbit failed to start. Error: ");
            sb.append(i);
            Assertion.c(sb.toString());
            hig.this.l.countDown();
        }

        public final void onOrbitStopped() {
            Logger.b("onOrbitStopped", new Object[0]);
            synchronized (hig.this.m) {
                if (hig.this.p != null) {
                    hig.this.o = null;
                    hig.this.p.destroy();
                    hig.this.p = null;
                    hig.this.n.a(Disposables.b());
                }
            }
            synchronized (hig.this.b.a) {
                hig.this.b.c();
            }
        }

        public final void onPlaybackError(int i, String str) {
        }
    };

    hig(Context context, hip hip, hiq hiq, hie hie, hiw hiw, hkm hkm, hjk hjk, hit hit, gnb gnb, uyx uyx, StateRestoreFileDeleter stateRestoreFileDeleter, hju hju, hko hko, hid hid, rug rug, Looper looper, Handler handler, Optional<OrbitServiceInterface> optional) {
        this.a = context;
        this.b = hip;
        this.c = hiq;
        this.d = hie;
        this.e = hiw;
        this.f = hkm;
        this.k = hjk;
        this.g = hit;
        this.h = gnb;
        this.q = uyx;
        this.r = stateRestoreFileDeleter;
        this.s = hju;
        this.t = hko;
        this.u = hid;
        this.i = rug;
        this.j = looper;
        this.v = handler;
        this.w = optional;
        if (!optional.b()) {
            this.b.c = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        Logger.b("Flushing core caches ...", new Object[0]);
        a().getOrbitSession().flushCaches();
        Logger.b("Core caches are flushed", new Object[0]);
    }

    public OrbitServiceInterface a() {
        if (this.w.b()) {
            return (OrbitServiceInterface) this.w.c();
        }
        throw new IllegalStateException("OrbitService unavailable.");
    }

    public final void b() {
        this.v.post(new $$Lambda$hig$Az5hiNF9erG5vSK0ChwkLQR7eU(this));
    }

    /* JADX INFO: used method not loaded: uyx.b(java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: uyx.a(java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.spotify.mobile.android.service.StateRestoreFileDeleter.DeletionPolicy.a(int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.spotify.mobile.android.service.StateRestoreFileDeleter.a(com.spotify.mobile.android.util.prefs.SpSharedPreferences, com.spotify.mobile.android.service.StateRestoreFileDeleter$DeletionPolicy):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.spotify.mobile.android.service.StateRestoreFileDeleter.a(java.lang.String, com.spotify.mobile.android.service.StateRestoreFileDeleter$DeletionPolicy):null, types can be incorrect */
    /* JADX INFO: used method not loaded: hid.a(com.spotify.cosmos.router.RxRouter):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        com.spotify.base.java.logging.Logger.e(r0, "Orbit start-up latch was interrupted.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e5, code lost:
        r1.i.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r2 = new com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter();
        r1.p = r2;
        com.spotify.base.java.logging.Logger.c("Starting core.", new java.lang.Object[0]);
        r12 = a();
        r0 = (defpackage.uyx) defpackage.fbp.a(r1.q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        if (r0.c != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
        r6 = defpackage.uyx.b.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00de, code lost:
        if (r0.e.e(defpackage.uyx.g) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e0, code lost:
        r7 = r0.e.c(defpackage.uyx.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        if (r0.e.e(defpackage.uyx.h) == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r7 = r0.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        r7 = new java.io.File(r0.f(), r0.f.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        if (r7.isDirectory() == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        if (r0.b(r7.toString()) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0117, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (r7 == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        r7 = new java.io.File(r0.f(), r0.f.b()).getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0134, code lost:
        if (r0.d() == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        if (r0.b("/sdcard/spotify2/") == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013e, code lost:
        r7 = "/sdcard/spotify2/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0141, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0147, code lost:
        if (r6 != defpackage.uyx.b.e()) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014f, code lost:
        if ("".equals(r7) == false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
        r6 = r0.c();
        r7 = r6.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        r6 = new java.io.File(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0167, code lost:
        if (defpackage.uyx.c(r6.toString()) == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0171, code lost:
        if (r0.b(r6.toString()) == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0173, code lost:
        com.spotify.base.java.logging.Logger.c("Will migrate settings dir in %s", r6);
        r6 = r0.c();
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0182, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0187, code lost:
        if (r6.isDirectory() == false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0189, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018b, code lost:
        r9 = r6.mkdirs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018f, code lost:
        if (r9 == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0191, code lost:
        if (r8 == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0197, code lost:
        if (r0.a(r7) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
        r7 = r6.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019f, code lost:
        com.spotify.base.java.logging.Logger.e("Failed to migrate settings directory, possibly because of full or inaccessible file system: %s", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a9, code lost:
        r0.e.a().a(defpackage.uyx.g, r7).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b9, code lost:
        com.spotify.base.java.logging.Logger.c("Failed to create settings directory, possibly because of full file system: %s", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c2, code lost:
        r0.d = r7;
        com.spotify.base.java.logging.Logger.c("Using settings location %s", r0.d);
        r0.c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d1, code lost:
        r14 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d5, code lost:
        if (r0.b != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d7, code lost:
        r0.a = r0.a();
        com.spotify.base.java.logging.Logger.c("Using cache location %s", r0.a);
        r0.b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ea, code lost:
        r13 = r0.a;
        com.spotify.base.java.logging.Logger.c("Cache path: %s\nSettings path: %s", r13, r14);
        r0 = r1.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f9, code lost:
        if (r14 == null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01fb, code lost:
        r3 = r0.c.a(com.spotify.mobile.android.service.StateRestoreFileDeleter.a, 0) + 1;
        r0.c.a().a(com.spotify.mobile.android.service.StateRestoreFileDeleter.a, r3).a();
        com.spotify.base.java.logging.Logger.c("Current startup count is %d", java.lang.Integer.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0221, code lost:
        if (r3 <= 5) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0223, code lost:
        r3 = com.spotify.mobile.android.service.StateRestoreFileDeleter.DeletionPolicy.a(r0.c.a(com.spotify.mobile.android.service.StateRestoreFileDeleter.b, com.spotify.mobile.android.service.StateRestoreFileDeleter.DeletionPolicy.a.ordinal()));
        com.spotify.mobile.android.service.StateRestoreFileDeleter.a((com.spotify.mobile.android.util.prefs.SpSharedPreferences) r0.c, r3);
        com.spotify.mobile.android.service.StateRestoreFileDeleter.a(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0245, code lost:
        if (r0.d.nextDouble() < 0.99d) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0247, code lost:
        r0 = new java.lang.StringBuilder("Cleaning state restore files (Throttled 99%), policy \"");
        r0.append(r3);
        r0.append('\"');
        com.spotify.mobile.android.util.Assertion.b(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025d, code lost:
        r12.setObserver(r1.x);
        com.spotify.base.java.logging.Logger.c("Starting Orbit", new java.lang.Object[0]);
        com.spotify.base.java.logging.Logger.c("Core hash: %s", "9a0fa43d169ed29943894f0ac96881e68cb5355c");
        r12.start(r13, r14, com.spotify.localization.SpotifyLocale.a(r1.a), false, defpackage.hko.a(), r2.getNativeRouter());
        r1.o = new com.spotify.cosmos.router.internal.RemoteNativeRxRouter(r2);
        r1.n.a(r1.u.a(r1.o));
        com.spotify.base.java.logging.Logger.c("Waiting for Orbit to start...", new java.lang.Object[0]);
        r1.i.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b1, code lost:
        if (r1.l.await(10, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b3, code lost:
        com.spotify.base.java.logging.Logger.d("Orbit failed to signal startup after 10s.", new java.lang.Object[0]);
        r1.b.c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c4, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r19 = this;
            r1 = r19
            hip r0 = r1.b
            hka r2 = r0.a
            monitor-enter(r2)
            hiq r0 = r1.c     // Catch:{ all -> 0x02eb }
            hip r3 = r0.a     // Catch:{ all -> 0x02eb }
            jtz r4 = r0.b     // Catch:{ all -> 0x02eb }
            long r4 = r4.c()     // Catch:{ all -> 0x02eb }
            long r6 = r3.d     // Catch:{ all -> 0x02eb }
            r8 = 0
            r10 = 1
            r11 = 0
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0026
            long r6 = r3.d     // Catch:{ all -> 0x02eb }
            long r4 = r4 - r6
            r6 = 250(0xfa, double:1.235E-321)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            r4 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            if (r3 == 0) goto L_0x003d
            java.util.Random r0 = r0.c     // Catch:{ all -> 0x02eb }
            double r6 = r0.nextDouble()     // Catch:{ all -> 0x02eb }
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x003d
            java.lang.String r0 = "SpotifyService was stopped but was restarted. This is indicative of a leak. (Throttled 99% on release, throttled 0% on other variants)"
            com.spotify.mobile.android.util.Assertion.b(r0)     // Catch:{ all -> 0x02eb }
        L_0x003d:
            hip r0 = r1.b     // Catch:{ all -> 0x02eb }
            r0.d = r8     // Catch:{ all -> 0x02eb }
            hiq r0 = r1.c     // Catch:{ all -> 0x02eb }
            hip r3 = r0.a     // Catch:{ all -> 0x02eb }
            hka r3 = r3.a     // Catch:{ all -> 0x02eb }
            int r3 = r3.a()     // Catch:{ all -> 0x02eb }
            if (r3 != r10) goto L_0x004f
            r3 = 1
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            r3 = r3 ^ r10
            if (r3 == 0) goto L_0x0060
            java.lang.String r6 = "Not performing startup. Service lifecycle state: %s."
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x02eb }
            hip r0 = r0.a     // Catch:{ all -> 0x02eb }
            hka r0 = r0.a     // Catch:{ all -> 0x02eb }
            r7[r11] = r0     // Catch:{ all -> 0x02eb }
            com.spotify.base.java.logging.Logger.c(r6, r7)     // Catch:{ all -> 0x02eb }
        L_0x0060:
            if (r3 == 0) goto L_0x0064
            monitor-exit(r2)     // Catch:{ all -> 0x02eb }
            return
        L_0x0064:
            hiq r0 = r1.c     // Catch:{ all -> 0x02eb }
            hip r0 = r0.a     // Catch:{ all -> 0x02eb }
            boolean r0 = r0.c     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "Service is permanently stopped. Killing self...."
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x02eb }
            com.spotify.base.java.logging.Logger.e(r0, r3)     // Catch:{ all -> 0x02eb }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x02eb }
            android.os.Process.killProcess(r0)     // Catch:{ all -> 0x02eb }
        L_0x007a:
            hiq r0 = r1.c     // Catch:{ all -> 0x02eb }
            hip r3 = r0.a     // Catch:{ all -> 0x02eb }
            hka r3 = r3.a     // Catch:{ all -> 0x02eb }
            int r3 = r3.a()     // Catch:{ all -> 0x02eb }
            if (r3 != 0) goto L_0x0088
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            if (r3 == 0) goto L_0x00a8
            java.lang.String r3 = "Service is shutting down. Need to wait before restarting..."
            java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch:{ all -> 0x02eb }
            com.spotify.base.java.logging.Logger.c(r3, r6)     // Catch:{ all -> 0x02eb }
            hip r0 = r0.a     // Catch:{ all -> 0x02eb }
            r6 = 4000(0xfa0, double:1.9763E-320)
            boolean r0 = r0.a(r6)     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "Failed to shutdown Orbit in a timely fashion"
            com.spotify.mobile.android.util.Assertion.b(r0)     // Catch:{ all -> 0x02eb }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x02eb }
            android.os.Process.killProcess(r0)     // Catch:{ all -> 0x02eb }
        L_0x00a8:
            hip r0 = r1.b     // Catch:{ all -> 0x02eb }
            hka r0 = r0.a     // Catch:{ all -> 0x02eb }
            r3 = 2
            r0.a(r3)     // Catch:{ all -> 0x02eb }
            monitor-exit(r2)     // Catch:{ all -> 0x02eb }
            com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter r0 = new com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter
            r0.<init>()
            r2 = r0
            com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter r2 = (com.spotify.mobile.android.cosmos.router.QueuingRemoteNativeRouter) r2
            r1.p = r2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r6 = "Starting core."
            com.spotify.base.java.logging.Logger.c(r6, r0)
            com.spotify.core.orbit.OrbitServiceInterface r12 = r19.a()
            uyx r0 = r1.q
            java.lang.Object r0 = defpackage.fbp.a(r0)
            uyx r0 = (defpackage.uyx) r0
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x01d1
        L_0x00d2:
            boolean r6 = defpackage.uyx.b.e()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r7 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = defpackage.uyx.g
            boolean r7 = r7.e(r8)
            if (r7 == 0) goto L_0x00e9
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r7 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = defpackage.uyx.g
            java.lang.String r7 = r7.c(r8)
            goto L_0x0143
        L_0x00e9:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r7 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = defpackage.uyx.h
            boolean r7 = r7.e(r8)
            if (r7 == 0) goto L_0x00f8
            boolean r7 = r0.e()
            goto L_0x011a
        L_0x00f8:
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r0.f()
            uyx$b r9 = r0.f
            java.lang.String r9 = r9.b()
            r7.<init>(r8, r9)
            boolean r8 = r7.isDirectory()
            if (r8 == 0) goto L_0x0119
            java.lang.String r7 = r7.toString()
            boolean r7 = r0.b(r7)
            if (r7 == 0) goto L_0x0119
            r7 = 1
            goto L_0x011a
        L_0x0119:
            r7 = 0
        L_0x011a:
            if (r7 == 0) goto L_0x0130
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r0.f()
            uyx$b r9 = r0.f
            java.lang.String r9 = r9.b()
            r7.<init>(r8, r9)
            java.lang.String r7 = r7.getAbsolutePath()
            goto L_0x0143
        L_0x0130:
            boolean r7 = r0.d()
            if (r7 == 0) goto L_0x0141
            java.lang.String r7 = "/sdcard/spotify2/"
            boolean r7 = r0.b(r7)
            if (r7 == 0) goto L_0x0141
            java.lang.String r7 = "/sdcard/spotify2/"
            goto L_0x0143
        L_0x0141:
            java.lang.String r7 = ""
        L_0x0143:
            boolean r8 = defpackage.uyx.b.e()
            if (r6 != r8) goto L_0x00d2
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x015a
            java.io.File r6 = r0.c()
            java.lang.String r7 = r6.getAbsolutePath()
            goto L_0x0182
        L_0x015a:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            java.lang.String r8 = r6.toString()
            boolean r8 = defpackage.uyx.c(r8)
            if (r8 == 0) goto L_0x0182
            java.lang.String r8 = r6.toString()
            boolean r8 = r0.b(r8)
            if (r8 == 0) goto L_0x0182
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r8[r11] = r6
            java.lang.String r6 = "Will migrate settings dir in %s"
            com.spotify.base.java.logging.Logger.c(r6, r8)
            java.io.File r6 = r0.c()
            r8 = 1
            goto L_0x0183
        L_0x0182:
            r8 = 0
        L_0x0183:
            boolean r9 = r6.isDirectory()
            if (r9 == 0) goto L_0x018b
            r9 = 1
            goto L_0x018f
        L_0x018b:
            boolean r9 = r6.mkdirs()
        L_0x018f:
            if (r9 == 0) goto L_0x01b9
            if (r8 == 0) goto L_0x01a9
            boolean r8 = r0.a(r7)
            if (r8 == 0) goto L_0x019f
            java.lang.String r6 = r6.getAbsolutePath()
            r7 = r6
            goto L_0x01a9
        L_0x019f:
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r8[r11] = r6
            java.lang.String r6 = "Failed to migrate settings directory, possibly because of full or inaccessible file system: %s"
            com.spotify.base.java.logging.Logger.e(r6, r8)
            goto L_0x01c2
        L_0x01a9:
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r6 = r0.e
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r6 = r6.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r8 = defpackage.uyx.g
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r6 = r6.a(r8, r7)
            r6.b()
            goto L_0x01c2
        L_0x01b9:
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r8[r11] = r6
            java.lang.String r6 = "Failed to create settings directory, possibly because of full file system: %s"
            com.spotify.base.java.logging.Logger.c(r6, r8)
        L_0x01c2:
            r0.d = r7
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = r0.d
            r6[r11] = r7
            java.lang.String r7 = "Using settings location %s"
            com.spotify.base.java.logging.Logger.c(r7, r6)
            r0.c = r10
        L_0x01d1:
            java.lang.String r14 = r0.d
            boolean r6 = r0.b
            if (r6 != 0) goto L_0x01ea
            java.lang.String r6 = r0.a()
            r0.a = r6
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = r0.a
            r6[r11] = r7
            java.lang.String r7 = "Using cache location %s"
            com.spotify.base.java.logging.Logger.c(r7, r6)
            r0.b = r10
        L_0x01ea:
            java.lang.String r13 = r0.a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r11] = r13
            r0[r10] = r14
            java.lang.String r3 = "Cache path: %s\nSettings path: %s"
            com.spotify.base.java.logging.Logger.c(r3, r0)
            com.spotify.mobile.android.service.StateRestoreFileDeleter r0 = r1.r
            if (r14 == 0) goto L_0x025d
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r3 = r0.c
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Integer> r6 = com.spotify.mobile.android.service.StateRestoreFileDeleter.a
            int r3 = r3.a(r6, r11)
            int r3 = r3 + r10
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r6 = r0.c
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r6 = r6.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Integer> r7 = com.spotify.mobile.android.service.StateRestoreFileDeleter.a
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r6 = r6.a(r7, r3)
            r6.a()
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r11] = r7
            java.lang.String r7 = "Current startup count is %d"
            com.spotify.base.java.logging.Logger.c(r7, r6)
            r6 = 5
            if (r3 <= r6) goto L_0x025d
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r3 = r0.c
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Integer> r6 = com.spotify.mobile.android.service.StateRestoreFileDeleter.b
            com.spotify.mobile.android.service.StateRestoreFileDeleter$DeletionPolicy r7 = com.spotify.mobile.android.service.StateRestoreFileDeleter.DeletionPolicy.BASIC
            int r7 = r7.ordinal()
            int r3 = r3.a(r6, r7)
            com.spotify.mobile.android.service.StateRestoreFileDeleter$DeletionPolicy r3 = com.spotify.mobile.android.service.StateRestoreFileDeleter.DeletionPolicy.a(r3)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r6 = r0.c
            com.spotify.mobile.android.service.StateRestoreFileDeleter.a(r6, r3)
            com.spotify.mobile.android.service.StateRestoreFileDeleter.a(r14, r3)
            java.util.Random r0 = r0.d
            double r6 = r0.nextDouble()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x025d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Cleaning state restore files (Throttled 99%), policy \""
            r0.<init>(r4)
            r0.append(r3)
            r3 = 34
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.spotify.mobile.android.util.Assertion.b(r0)
        L_0x025d:
            com.spotify.core.orbit.OrbitServiceObserver r0 = r1.x
            r12.setObserver(r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r3 = "Starting Orbit"
            com.spotify.base.java.logging.Logger.c(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r3 = "9a0fa43d169ed29943894f0ac96881e68cb5355c"
            r0[r11] = r3
            java.lang.String r3 = "Core hash: %s"
            com.spotify.base.java.logging.Logger.c(r3, r0)
            android.content.Context r0 = r1.a
            java.lang.String r15 = com.spotify.localization.SpotifyLocale.a(r0)
            r16 = 0
            boolean r17 = defpackage.hko.a()
            com.spotify.cosmos.router.Router r18 = r2.getNativeRouter()
            r12.start(r13, r14, r15, r16, r17, r18)
            com.spotify.cosmos.router.internal.RemoteNativeRxRouter r0 = new com.spotify.cosmos.router.internal.RemoteNativeRxRouter
            r0.<init>(r2)
            r1.o = r0
            io.reactivex.disposables.SerialDisposable r0 = r1.n
            hid r3 = r1.u
            com.spotify.cosmos.router.RxRouter r4 = r1.o
            io.reactivex.disposables.Disposable r3 = r3.a(r4)
            r0.a(r3)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r3 = "Waiting for Orbit to start..."
            com.spotify.base.java.logging.Logger.c(r3, r0)
            rug r0 = r1.i
            r0.a()
            java.util.concurrent.CountDownLatch r0 = r1.l     // Catch:{ InterruptedException -> 0x02c6 }
            r3 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x02c6 }
            boolean r0 = r0.await(r3, r5)     // Catch:{ InterruptedException -> 0x02c6 }
            if (r0 != 0) goto L_0x02be
            java.lang.String r0 = "Orbit failed to signal startup after 10s."
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ InterruptedException -> 0x02c6 }
            com.spotify.base.java.logging.Logger.d(r0, r3)     // Catch:{ InterruptedException -> 0x02c6 }
            hip r0 = r1.b     // Catch:{ InterruptedException -> 0x02c6 }
            r0.c = r10     // Catch:{ InterruptedException -> 0x02c6 }
        L_0x02be:
            rug r0 = r1.i
            r0.b()
            goto L_0x02cf
        L_0x02c4:
            r0 = move-exception
            goto L_0x02e5
        L_0x02c6:
            r0 = move-exception
            java.lang.String r3 = "Orbit start-up latch was interrupted."
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x02c4 }
            com.spotify.base.java.logging.Logger.e(r0, r3, r4)     // Catch:{ all -> 0x02c4 }
            goto L_0x02be
        L_0x02cf:
            hip r0 = r1.b
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x02d6
            return
        L_0x02d6:
            hie r0 = r1.d
            com.spotify.core.orbit.OrbitServiceInterface r3 = r19.a()
            r0.a(r2, r3)
            hip r0 = r1.b
            r0.a()
            return
        L_0x02e5:
            rug r2 = r1.i
            r2.b()
            throw r0
        L_0x02eb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02eb }
            goto L_0x02ef
        L_0x02ee:
            throw r0
        L_0x02ef:
            goto L_0x02ee
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hig.c():void");
    }
}
