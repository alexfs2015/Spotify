package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: lp reason: default package */
public class lp extends Service implements lm {
    private final lx a = new lx(this);

    public final Lifecycle Y_() {
        return this.a.a;
    }

    public IBinder onBind(Intent intent) {
        this.a.a(Event.ON_START);
        return null;
    }

    public void onCreate() {
        this.a.a(Event.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        lx lxVar = this.a;
        lxVar.a(Event.ON_STOP);
        lxVar.a(Event.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.a.a(Event.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
