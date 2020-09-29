package com.spotify.music.features.spoton.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.music.R;

public class SpotOnService extends whv implements a {
    private static final String d = SpotOnService.class.getSimpleName();
    public hwj a;
    public qqb b;
    public vwu c;
    private boolean e;

    public final void a() {
        stopSelf();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        this.e = false;
        this.a.b(this, d);
        this.b.a();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!this.e) {
            this.a.a((Service) this, d);
            this.c.b(intent);
            this.a.a(d, getString(R.string.spot_on_notification_is_connecting));
            this.e = true;
            if (intent == null || intent.getAction() == null) {
                stopSelf();
            } else {
                qqb qqb = this.b;
                String action = intent.getAction();
                String stringExtra = intent.getStringExtra("com.spotify.music.features.spoton.extras.NAME");
                qqb.a = action;
                qqb.b = stringExtra;
                qqb.c = this;
                qqb.d.a((a<hpt>) qqb);
                qqb.d.a();
            }
        }
        return 2;
    }
}
