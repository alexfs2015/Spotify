package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.player.queue.QueueActivity;
import com.spotify.mobile.android.spotlets.player.v2.NowPlayingActivity;

/* renamed from: iwh reason: default package */
public final class iwh implements tcn {
    private final Activity a;

    public iwh(Activity activity) {
        this.a = (Activity) fay.a(activity);
    }

    public final void a() {
        this.a.startActivity(NowPlayingActivity.a((Context) this.a));
    }

    public final void b() {
        Intent intent = new Intent(this.a, QueueActivity.class);
        a.a(intent, rju.q);
        this.a.startActivity(intent);
    }
}
