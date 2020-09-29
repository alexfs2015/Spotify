package com.spotify.music.features.bmw.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

public class BmwService extends whv {
    private static final String e = BmwService.class.getName();
    public hpy a;
    public lxu b;
    public hwj c;
    public vwu d;
    private boolean f;

    class a implements defpackage.hjy.a<hpt> {
        private final lxt a;

        public a(lxt lxt) {
            this.a = lxt;
        }

        public final /* bridge */ /* synthetic */ void a(Object obj) {
            this.a.a((hpt) obj);
        }

        public final void e() {
            this.a.e();
            BmwService.this.stopSelf();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        this.f = false;
        this.c.b(this, e);
        if (this.a.c()) {
            this.a.b();
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        defpackage.rzt.a aVar;
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
            lxu lxu = this.b;
            String str = "MINI";
            String str2 = "bmwgroup_connected_car";
            if (str.equalsIgnoreCase(stringExtra)) {
                defpackage.rzt.a aVar2 = new defpackage.rzt.a(str2);
                String str3 = "Mini";
                aVar = aVar2.a(str3).d(str).e(str3);
            } else {
                String str4 = "Bmw";
                aVar = new defpackage.rzt.a(str2).a(str4).d("BMW").e(str4);
            }
            lxt lxt = new lxt((Context) lxu.a(lxu.a.get(), 1), (lyh) lxu.a(lxu.b.get(), 2), (lxy) lxu.a(lxu.c.get(), 3), (rzt) lxu.a(aVar.b("bluetooth_or_usb").c("car").a(), 4), (hhc) lxu.a(lxu.d.get(), 5), (Picasso) lxu.a(lxu.e.get(), 6), (lxw) lxu.a(lxu.f.get(), 7));
            this.a.a((defpackage.hjy.a<hpt>) new a<hpt>(lxt));
            this.a.a();
        }
        return 2;
    }
}
