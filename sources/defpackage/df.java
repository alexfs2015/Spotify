package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: df reason: default package */
public abstract class df implements ServiceConnection {
    public abstract void a(ComponentName componentName, dd ddVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(componentName, new dd(a.a(iBinder), componentName) {
        });
    }
}
