package com.spotify.music.spotlets.radio.formatlist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.google.common.base.Optional;
import com.spotify.music.R;
import java.util.concurrent.TimeUnit;

public class RadioFormatListService extends whv {
    public urs a;
    public hhc b;
    public jvf c;
    private xip d = xon.b();

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, RadioFormatListService.class);
        intent.putExtra(".seed_uri", str);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, Optional optional) {
        if (optional.b()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) optional.c()));
            intent.setFlags(335544320);
            context.startActivity(intent);
        } else {
            this.c.a((int) R.string.toast_unable_to_load_radio_formatlist, 1, new Object[0]);
        }
        stopSelf();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c.a((int) R.string.toast_unable_to_load_radio_formatlist, 1, new Object[0]);
        stopSelf();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        this.d.unsubscribe();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String str = ".seed_uri";
            if (intent.hasExtra(str)) {
                this.d = this.a.a(intent.getExtras().getString(str)).d(15, TimeUnit.SECONDS).a(wit.a(this.b.c())).a((xis<? super T>) new xis(getApplicationContext()) {
                    private final /* synthetic */ Context f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void call(Object obj) {
                        RadioFormatListService.this.a(this.f$1, (Optional) obj);
                    }
                }, (xis<Throwable>) new xis() {
                    public final void call(Object obj) {
                        RadioFormatListService.this.a((Throwable) obj);
                    }
                });
                return 2;
            }
        }
        stopSelf();
        return 2;
    }
}
