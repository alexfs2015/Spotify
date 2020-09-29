package com.spotify.music.features.bmw.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

public class BmwService extends vtp {
    private static final String e = BmwService.class.getName();
    public hnj a;
    public ltv b;
    public htx c;
    public vjo d;
    private boolean f;

    class a implements defpackage.hhe.a<hne> {
        private final ltu a;

        public final /* bridge */ /* synthetic */ void a(Object obj) {
            this.a.a((hne) obj);
        }

        public a(ltu ltu) {
            this.a = ltu;
        }

        public final void e() {
            this.a.e();
            BmwService.this.stopSelf();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        defpackage.rqi.a aVar;
        if (!this.f && intent != null) {
            String stringExtra = intent.getStringExtra("com.bmwgroup.connected.extras.vehicle.brand");
            if (stringExtra == null) {
                Assertion.b("Brand can't be null");
                return super.onStartCommand(intent, i, i2);
            }
            this.c.a((Service) this, e);
            this.d.b(intent);
            this.c.a(e, getString(R.string.bmw_notification_is_connected));
            this.f = true;
            ltv ltv = this.b;
            String str = "MINI";
            String str2 = "bmwgroup_connected_car";
            if (str.equalsIgnoreCase(stringExtra)) {
                defpackage.rqi.a aVar2 = new defpackage.rqi.a(str2);
                String str3 = "Mini";
                aVar = aVar2.a(str3).d(str).e(str3);
            } else {
                String str4 = "Bmw";
                aVar = new defpackage.rqi.a(str2).a(str4).d("BMW").e(str4);
            }
            ltu ltu = new ltu((Context) ltv.a(ltv.a.get(), 1), (lui) ltv.a(ltv.b.get(), 2), (ltz) ltv.a(ltv.c.get(), 3), (rqi) ltv.a(aVar.b("bluetooth_or_usb").c("car").a(), 4), (heg) ltv.a(ltv.d.get(), 5), (Picasso) ltv.a(ltv.e.get(), 6), (ltx) ltv.a(ltv.f.get(), 7));
            this.a.a((defpackage.hhe.a<hne>) new a<hne>(ltu));
            this.a.a();
        }
        return 2;
    }

    public void onDestroy() {
        this.f = false;
        this.c.b(this, e);
        if (this.a.d()) {
            this.a.b();
        }
        super.onDestroy();
    }
}
