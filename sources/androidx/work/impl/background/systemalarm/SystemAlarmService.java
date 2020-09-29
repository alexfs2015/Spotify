package androidx.work.impl.background.systemalarm;

import android.content.Intent;

public class SystemAlarmService extends lp implements b {
    private static final String a = su.a("SystemAlarmService");
    private tq b;
    private boolean c;

    private void b() {
        this.b = new tq(this);
        this.b.a((b) this);
    }

    public final void f_() {
        this.c = true;
        su.a();
        vm.a();
        stopSelf();
    }

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
            su.a();
            this.b.a();
            b();
            this.c = false;
        }
        if (intent != null) {
            this.b.a(intent, i2);
        }
        return 3;
    }
}
