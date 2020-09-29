package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService;

/* renamed from: ikq reason: default package */
public final class ikq {
    final ServiceConnection a = new a();
    final Context b;
    final ilb c;
    final ikv d;
    final Intent e;
    boolean f;

    /* renamed from: ikq$a */
    static class a implements ServiceConnection {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        a() {
        }
    }

    public ikq(Context context, ilb ilb, ikv ikv) {
        this.b = context;
        this.c = ilb;
        this.d = ikv;
        this.e = new Intent(this.b, BixbyHomeCardService.class);
    }
}
