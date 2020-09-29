package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: lk reason: default package */
public class lk extends Service implements lh {
    private final ls a = new ls(this);

    public void onCreate() {
        this.a.a(Event.ON_CREATE);
        super.onCreate();
    }

    public IBinder onBind(Intent intent) {
        this.a.a(Event.ON_START);
        return null;
    }

    public void onStart(Intent intent, int i) {
        this.a.a(Event.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public void onDestroy() {
        ls lsVar = this.a;
        lsVar.a(Event.ON_STOP);
        lsVar.a(Event.ON_DESTROY);
        super.onDestroy();
    }

    public final Lifecycle Y_() {
        return this.a.a;
    }
}
