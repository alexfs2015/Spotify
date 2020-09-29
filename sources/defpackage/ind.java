package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;

/* renamed from: ind reason: default package */
public final class ind {
    final ServiceConnection a = new a();
    final Context b;
    final ino c;
    final ini d;
    final Intent e;
    boolean f;

    /* renamed from: ind$a */
    static class a implements ServiceConnection {
        a() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public ind(Context context, ino ino, ini ini) {
        this.b = context;
        this.c = ino;
        this.d = ini;
        this.e = new Intent(this.b, BixbyHomeCardService.class);
    }
}
