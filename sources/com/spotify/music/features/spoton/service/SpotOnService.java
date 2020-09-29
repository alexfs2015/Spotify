package com.spotify.music.features.spoton.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.music.R;

public class SpotOnService extends vtp implements a {
    private static final String d = SpotOnService.class.getSimpleName();
    public htx a;
    public qhn b;
    public vjo c;
    private boolean e;

    public IBinder onBind(Intent intent) {
        return null;
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
                qhn qhn = this.b;
                String action = intent.getAction();
                String stringExtra = intent.getStringExtra("com.spotify.music.features.spoton.extras.NAME");
                qhn.a = action;
                qhn.b = stringExtra;
                qhn.c = this;
                qhn.d.a((a<hne>) qhn);
                qhn.d.a();
            }
        }
        return 2;
    }

    public void onDestroy() {
        this.e = false;
        this.a.b(this, d);
        this.b.a();
        super.onDestroy();
    }

    public final void a() {
        stopSelf();
    }
}
