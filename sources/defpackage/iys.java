package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.player.queue.QueueActivity;
import com.spotify.mobile.android.spotlets.player.v2.NowPlayingActivity;

/* renamed from: iys reason: default package */
public final class iys implements tmu {
    private final Activity a;

    public iys(Activity activity) {
        this.a = (Activity) fbp.a(activity);
    }

    public final void a() {
        this.a.startActivity(NowPlayingActivity.a((Context) this.a));
    }

    public final void b() {
        Intent intent = new Intent(this.a, QueueActivity.class);
        a.a(intent, rta.q);
        this.a.startActivity(intent);
    }
}
