package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.spotlets.ads.marquee.MarqueeService;
import com.spotify.mobile.android.spotlets.ads.marquee.MarqueeService.a;

/* renamed from: icf reason: default package */
public final class icf {
    MarqueeService a;
    final Context b;
    final hjw c;
    final ServiceConnection d = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) iBinder;
            icf.this.a = MarqueeService.this;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public icf(Context context, hjw hjw) {
        this.b = context;
        this.c = hjw;
    }
}
