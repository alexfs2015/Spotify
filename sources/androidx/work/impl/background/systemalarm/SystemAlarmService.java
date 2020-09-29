package androidx.work.impl.background.systemalarm;

import android.content.Intent;

public class SystemAlarmService extends lk implements b {
    private static final String a = sg.a("SystemAlarmService");
    private tc b;
    private boolean c;

    public void onCreate() {
        super.onCreate();
        b();
        this.c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            sg.a();
            this.b.a();
            b();
            this.c = false;
        }
        if (intent != null) {
            this.b.a(intent, i2);
        }
        return 3;
    }

    public final void f_() {
        this.c = true;
        sg.a();
        uy.a();
        stopSelf();
    }

    private void b() {
        this.b = new tc(this);
        this.b.a((b) this);
    }
}
