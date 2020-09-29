package defpackage;

import android.app.IntentService;
import android.app.Service;

/* renamed from: vto reason: default package */
public abstract class vto extends IntentService {
    public vto(String str) {
        super(str);
    }

    public void onCreate() {
        vtj.a((Service) this);
        super.onCreate();
    }
}
