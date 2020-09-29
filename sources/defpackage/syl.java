package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

/* renamed from: syl reason: default package */
public final class syl implements wig<syk> {
    private final wzi<Activity> a;
    private final wzi<PlayerStateCompat> b;

    private syl(wzi<Activity> wzi, wzi<PlayerStateCompat> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static syl a(wzi<Activity> wzi, wzi<PlayerStateCompat> wzi2) {
        return new syl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new syk((Activity) this.a.get(), (PlayerStateCompat) this.b.get());
    }
}
