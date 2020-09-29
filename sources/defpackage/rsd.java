package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: rsd reason: default package */
public final class rsd implements wig<rsc> {
    private final wzi<Picasso> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<Scheduler> c;
    private final wzi<a> d;

    private rsd(wzi<Picasso> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<Scheduler> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rsd a(wzi<Picasso> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<Scheduler> wzi3, wzi<a> wzi4) {
        return new rsd(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rsc((Picasso) this.a.get(), (Flowable) this.b.get(), (Scheduler) this.c.get(), (a) this.d.get());
    }
}
