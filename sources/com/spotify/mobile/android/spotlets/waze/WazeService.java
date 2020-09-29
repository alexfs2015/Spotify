package com.spotify.mobile.android.spotlets.waze;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;
import com.spotify.mobile.android.waze.model.WazeBannerModel.a;
import com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection;
import com.spotify.music.R;

public class WazeService extends vtp {
    private static final String g = WazeService.class.getName();
    public kdc a;
    public kcv b;
    public kdf c;
    public kdl d;
    public htx e;
    public vjo f;
    private String h;
    private a i = new a() {
        public final void a(boolean z) {
            if (z) {
                WazeService.this.a.a("");
                WazeService.this.c();
                return;
            }
            WazeService.a(WazeService.this, WazeTransportDrivingDirection.NONE.ordinal());
            WazeService.this.stopSelf();
        }

        public final void a(int i) {
            WazeService.a(WazeService.this, i);
        }

        public final void b(int i) {
            WazeService.this.a.f = String.valueOf(i);
            WazeService.this.c();
        }

        public final void a(String str, String str2) {
            WazeService.this.a.a(str);
            WazeService.this.a.c = str2;
            WazeService.this.c();
        }

        public final void b(boolean z) {
            WazeService.this.a.d = z;
        }

        public final void a(String str) {
            WazeService.this.a.g = str;
        }

        public final void b(String str) {
            WazeService.this.a.h = str;
        }
    };

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        String str;
        if (intent == null) {
            Logger.e("Null intent received. This has happened on broken Motorola XT1225 running 6.0.1", new Object[0]);
            return 2;
        }
        this.e.a((Service) this, g);
        htx htx = this.e;
        String str2 = g;
        if (this.d.d()) {
            str = getString(R.string.waze_notification_is_connected);
        } else {
            str = getString(R.string.waze_notification_is_connecting);
        }
        htx.a(str2, str);
        this.f.b(intent);
        this.h = intent.getAction();
        if ("com.spotify.music.internal.service.waze.LAUNCH".equals(this.h)) {
            a();
            this.c.b();
            c();
        } else {
            if ("com.spotify.music.internal.service.waze.PING".equals(this.h)) {
                c();
            } else {
                if ((!intent.getBooleanExtra("com.spotify.music.internal.service.waze.EXTRA_NO_WAZE_CONNECTION", false)) && !this.d.e()) {
                    a();
                }
                c();
            }
        }
        return 2;
    }

    private void a() {
        if (!this.c.c()) {
            this.c.a(this.i);
        }
    }

    private void b() {
        Logger.b("Cleaning up", new Object[0]);
        if (this.c.c()) {
            this.c.a();
        }
        this.e.b(this, g);
    }

    public void onDestroy() {
        b();
        super.onDestroy();
    }

    public void onTaskRemoved(Intent intent) {
        b();
        super.onTaskRemoved(intent);
    }

    /* access modifiers changed from: private */
    public void c() {
        this.b.a(e());
    }

    private boolean d() {
        return this.a.b == null && this.c.c();
    }

    private WazeBannerModel e() {
        a aVar;
        if (!this.a.a()) {
            boolean e2 = this.d.e();
            if ((e2 || !d()) && this.d.b() && !this.d.a()) {
                if (e2) {
                    aVar = WazeBannerModel.a(Type.CONNECT_BANNER).d(getString(R.string.waze_connect_message_a)).e(getString(R.string.waze_clarification_a));
                } else {
                    aVar = WazeBannerModel.a(Type.GOTO_BANNER).d(getString(R.string.waze_launch_message));
                }
                aVar.f(this.h);
                aVar.a((int) R.drawable.waze_logo);
                aVar.b((int) R.drawable.ic_dialog_close_dark);
                Logger.b("WazeBannerIntent: %s", aVar.a().toString());
                return aVar.a();
            }
            Logger.b("WazeNoBannerIntent needOnboarding: %b, hasEmptyInstructions: %b, wazeIsTurnedOn: %b, wazeBannerClosed: %b", Boolean.valueOf(e2), Boolean.valueOf(d()), Boolean.valueOf(this.d.b()), Boolean.valueOf(this.d.a()));
            return WazeBannerModel.a(Type.NO_BANNER).a();
        } else if (!this.d.b() || d()) {
            Logger.b("WazeNoBannerIntent because shouldHideBanner: true", new Object[0]);
            return WazeBannerModel.a(Type.NO_BANNER).a();
        } else {
            a a2 = WazeBannerModel.a(Type.NAVIGATION_BANNER);
            a2.a(kdl.a(this.a.a, this.a.d));
            a2.b((int) R.drawable.waze_logo);
            a2.a(this.a.b);
            if (this.a.c != null) {
                a2.b(this.a.c);
            }
            if (WazeTransportDrivingDirection.a(this.a.a)) {
                a2.c(this.a.f);
            }
            Logger.b("WazeDirectionIntent: %s", a2.a().toString());
            return a2.a();
        }
    }

    static /* synthetic */ void a(WazeService wazeService, int i2) {
        if (WazeTransportDrivingDirection.a(i2)) {
            WazeTransportDrivingDirection wazeTransportDrivingDirection = (WazeTransportDrivingDirection) WazeTransportDrivingDirection.w.get(i2);
            wazeService.a.e++;
            kdc kdc = wazeService.a;
            kdc.a = wazeTransportDrivingDirection;
            kdc.i.onNext(Boolean.valueOf(kdc.a()));
            if (!WazeTransportDrivingDirection.a(wazeTransportDrivingDirection)) {
                wazeService.a.f = "";
            }
            wazeService.c();
        }
    }
}
