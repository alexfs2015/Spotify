package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Collections;
import rx.internal.operators.NeverObservableHolder;

/* renamed from: hql reason: default package */
public final class hql implements hqm {
    private final QueueManager a;
    private final ujp b;
    private final hqy c;
    private final xog<Boolean> d = xog.e();

    public hql(QueueManager queueManager, ujp ujp, hqy hqy) {
        this.a = queueManager;
        this.b = ujp;
        this.c = hqy;
    }

    /* access modifiers changed from: private */
    public static PlayerQueue a(PlayerQueue playerQueue) {
        PlayerTrack[] nextTracks = playerQueue.nextTracks();
        ArrayList arrayList = new ArrayList(nextTracks.length);
        for (PlayerTrack playerTrack : nextTracks) {
            if (a(playerTrack)) {
                arrayList.add(playerTrack);
            }
        }
        PlayerTrack[] prevTracks = playerQueue.prevTracks();
        ArrayList arrayList2 = new ArrayList(prevTracks.length);
        for (PlayerTrack playerTrack2 : prevTracks) {
            if (a(playerTrack2)) {
                arrayList2.add(playerTrack2);
            }
        }
        return new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) arrayList.toArray(new PlayerTrack[arrayList.size()]), (PlayerTrack[]) arrayList2.toArray(new PlayerTrack[arrayList2.size()]));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Boolean bool) {
        return bool.booleanValue() ? wit.a((ObservableSource<T>) this.a.getQueue(), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$hql$ayDOdbZtRseUKg9FDVN_MqbhzLk.INSTANCE) : NeverObservableHolder.a();
    }

    private static boolean a(PlayerTrack playerTrack) {
        if (playerTrack != null) {
            return LinkType.TRACK == jva.a(playerTrack.uri()).b || LinkType.SHOW_EPISODE == jva.a(playerTrack.uri()).b;
        }
        return false;
    }

    public final xii<PlayerQueue> a() {
        return this.d.h(new $$Lambda$hql$xZoHIDv9RFBIUUll2OkfqMkQMv4(this));
    }

    public final void a(Context context, String str, String str2) {
        this.b.a(context, Collections.singletonList(PlayerTrack.create(str)), false);
        this.c.a(str2, "queue_item", "queue_item", str, (byte[]) null);
        Logger.a("LogHelper.logQueueItem uri: %s ", str);
    }

    public final void f() {
        this.d.onNext(Boolean.TRUE);
    }

    public final void g() {
        this.d.onNext(Boolean.FALSE);
    }
}
