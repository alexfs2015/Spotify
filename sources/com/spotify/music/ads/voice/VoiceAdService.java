package com.spotify.music.ads.voice;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

public class VoiceAdService extends vtp {
    public knl a;
    private final a b = new a();

    public class a extends Binder {
        public a() {
        }
    }

    public static void a(Context context, Ad ad) {
        a(context);
        Intent intent = new Intent(context, VoiceAdService.class);
        intent.putExtra("voice_ad", ad);
        fr.a(context, intent);
    }

    public static void a(Context context) {
        context.stopService(new Intent(context, VoiceAdService.class));
    }

    public IBinder onBind(Intent intent) {
        return this.b;
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                String str = "voice_ad";
                if (notificationManager.getNotificationChannel(str) == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel(str, "Voice Ad", 3));
                }
                startForeground(1, new c(this, str).b());
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Logger.b("[VoiceAd] Started VoiceAdService", new Object[0]);
        Ad ad = (Ad) intent.getParcelableExtra("voice_ad");
        knl knl = this.a;
        if (knl.b == null) {
            Logger.b("[VoiceAd] startVoiceAd adType %s advertiser %s metadata %s", Integer.valueOf(ad.adType()), ad.advertiser(), ad.metadata());
            c cVar = (c) knl.a.get();
            String id = ad.id();
            String lineItemId = ad.lineItemId();
            String creativeId = ad.creativeId();
            String adPlaybackId = ad.adPlaybackId();
            long parseLong = Long.parseLong((String) fay.a(ad.metadata().get(Ad.METADATA_VOICE_MICROPHONE_DELAY)));
            knl.b = cVar.a(knw.h().a((knx) new c()).a(knv.a(id, lineItemId, creativeId, adPlaybackId, parseLong, (String) ad.metadata().get(Ad.METADATA_VOICE_INTENT), (String) ad.metadata().get(Ad.METADATA_VOICE_ACTION_URI), Math.min(8000, ((ad.duration() * 1000) - parseLong) - 2000))).a(0).a("").a(false).b(false).a());
            knl.c.accept(Optional.c(knl.b));
        }
        return 2;
    }

    public void onDestroy() {
        super.onDestroy();
        Logger.b("[VoiceAd] Destroyed VoiceAdService", new Object[0]);
        knl knl = this.a;
        if (knl.b != null) {
            Logger.b("[VoiceAd] finishVoiceAd", new Object[0]);
            knl.b.dispose();
            knl.b = null;
            knl.c.accept(Optional.e());
            knl.d.c();
        }
    }
}
