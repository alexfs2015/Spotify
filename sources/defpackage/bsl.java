package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: bsl reason: default package */
public final class bsl implements ServiceConnection {
    public boolean a = false;
    public final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
