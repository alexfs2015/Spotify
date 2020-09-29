package defpackage;

import android.app.IntentService;
import android.app.Service;

/* renamed from: whu reason: default package */
public abstract class whu extends IntentService {
    public whu(String str) {
        super(str);
    }

    public void onCreate() {
        whp.a((Service) this);
        super.onCreate();
    }
}
