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

public class WazeService extends whv {
    private static final String g = WazeService.class.getName();
    public kfd a;
    public kew b;
    public kfg c;
    public kfm d;
    public hwj e;
    public vwu f;
    private String h;
    private a i = new a() {
        public final void a(int i) {
            WazeService.a(WazeService.this, i);
        }

        public final void a(String str) {
            WazeService.this.a.g = str;
        }

        public final void a(String str, String str2) {
            WazeService.this.a.a(str);
            WazeService.this.a.c = str2;
            WazeService.this.c();
        }

        public final void a(boolean z) {
            if (z) {
                WazeService.this.a.a("");
                WazeService.this.c();
                return;
            }
            WazeService.a(WazeService.this, WazeTransportDrivingDirection.NONE.ordinal());
            WazeService.this.stopSelf();
        }

        public final void b(int i) {
            WazeService.this.a.f = String.valueOf(i);
            WazeService.this.c();
        }

        public final void b(String str) {
            WazeService.this.a.h = str;
        }

        public final void b(boolean z) {
            WazeService.this.a.d = z;
        }
    };

    private void a() {
        if (!this.c.c()) {
            this.c.a(this.i);
        }
    }

    static /* synthetic */ void a(WazeService wazeService, int i2) {
        if (WazeTransportDrivingDirection.a(i2)) {
            WazeTransportDrivingDirection wazeTransportDrivingDirection = (WazeTransportDrivingDirection) WazeTransportDrivingDirection.w.get(i2);
            wazeService.a.e++;
            kfd kfd = wazeService.a;
            kfd.a = wazeTransportDrivingDirection;
            kfd.i.onNext(Boolean.valueOf(kfd.a()));
            if (!WazeTransportDrivingDirection.a(wazeTransportDrivingDirection)) {
                String str = "";
                wazeService.a.f = "";
            }
            wazeService.c();
        }
    }

    private void b() {
        String str = "iaslgn uenp";
        Logger.b("Cleaning up", new Object[0]);
        if (this.c.c()) {
            this.c.a();
        }
        this.e.b(this, g);
    }

    /* access modifiers changed from: private */
    public void c() {
        this.b.a(e());
    }

    private boolean d() {
        if (this.a.b != null || !this.c.c()) {
            return false;
        }
        boolean z = !true;
        return true;
    }

    private WazeBannerModel e() {
        if (!this.a.a()) {
            boolean e2 = this.d.e();
            if ((e2 || !d()) && this.d.b()) {
                if (!this.d.a()) {
                    a e3 = e2 ? WazeBannerModel.a(Type.CONNECT_BANNER).d(getString(R.string.waze_connect_message_a)).e(getString(R.string.waze_clarification_a)) : WazeBannerModel.a(Type.GOTO_BANNER).d(getString(R.string.waze_launch_message));
                    e3.f(this.h);
                    e3.a((int) R.drawable.waze_logo);
                    e3.b((int) R.drawable.ic_dialog_close_dark);
                    Logger.b("WazeBannerIntent: %s", e3.a().toString());
                    return e3.a();
                }
            }
            Logger.b("WazeNoBannerIntent needOnboarding: %b, hasEmptyInstructions: %b, wazeIsTurnedOn: %b, wazeBannerClosed: %b", Boolean.valueOf(e2), Boolean.valueOf(d()), Boolean.valueOf(this.d.b()), Boolean.valueOf(this.d.a()));
            return WazeBannerModel.a(Type.NO_BANNER).a();
        } else if (!this.d.b() || d()) {
            String str = "ens onaBdattertz unrunee:ldnaiHBhesoNeor abneceuW";
            Logger.b("WazeNoBannerIntent because shouldHideBanner: true", new Object[0]);
            return WazeBannerModel.a(Type.NO_BANNER).a();
        } else {
            a a2 = WazeBannerModel.a(Type.NAVIGATION_BANNER);
            a2.a(kfm.a(this.a.a, this.a.d));
            a2.b((int) R.drawable.waze_logo);
            a2.a(this.a.b);
            if (this.a.c != null) {
                a2.b(this.a.c);
            }
            if (WazeTransportDrivingDirection.a(this.a.a)) {
                a2.c(this.a.f);
            }
            String str2 = "tWomDsrn:ia%enceenzt It";
            Logger.b("WazeDirectionIntent: %s", a2.a().toString());
            return a2.a();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        b();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent == null) {
            String str = "ri vlbdlTn oc1nohTnthge bt a2a uoe.ohre t nnp sd6sein opaei0Xlnu5rM.2N1 k.enrie";
            Logger.e("Null intent received. This has happened on broken Motorola XT1225 running 6.0.1", new Object[0]);
            return 2;
        }
        this.e.a((Service) this, g);
        this.e.a(g, this.d.d() ? getString(R.string.waze_notification_is_connected) : getString(R.string.waze_notification_is_connecting));
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

    public void onTaskRemoved(Intent intent) {
        b();
        super.onTaskRemoved(intent);
    }
}
