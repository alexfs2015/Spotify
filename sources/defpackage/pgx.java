package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import io.reactivex.Scheduler;

/* renamed from: pgx reason: default package */
public final class pgx implements wig<pgw> {
    private final wzi<String> a;
    private final wzi<QueueManager> b;
    private final wzi<Player> c;
    private final wzi<Scheduler> d;
    private final wzi<Scheduler> e;
    private final wzi<jtz> f;

    private pgx(wzi<String> wzi, wzi<QueueManager> wzi2, wzi<Player> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5, wzi<jtz> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static pgx a(wzi<String> wzi, wzi<QueueManager> wzi2, wzi<Player> wzi3, wzi<Scheduler> wzi4, wzi<Scheduler> wzi5, wzi<jtz> wzi6) {
        pgx pgx = new pgx(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return pgx;
    }

    public final /* synthetic */ Object get() {
        pgw pgw = new pgw((String) this.a.get(), (QueueManager) this.b.get(), (Player) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get(), (jtz) this.f.get());
        return pgw;
    }
}
