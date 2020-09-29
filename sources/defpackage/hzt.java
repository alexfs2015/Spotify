package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.spotlets.ads.marquee.MarqueeService;
import com.spotify.mobile.android.spotlets.ads.marquee.MarqueeService.a;

/* renamed from: hzt reason: default package */
public final class hzt {
    MarqueeService a;
    final Context b;
    final hhc c;
    final ServiceConnection d = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) iBinder;
            hzt.this.a = MarqueeService.this;
        }
    };

    public hzt(Context context, hhc hhc) {
        this.b = context;
        this.c = hhc;
    }
}
