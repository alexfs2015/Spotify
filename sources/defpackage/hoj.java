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

/* renamed from: hoj reason: default package */
public final class hoj implements hok {
    private final QueueManager a;
    private final txm b;
    private final hou c;
    private final xac<Boolean> d = xac.e();

    public hoj(QueueManager queueManager, txm txm, hou hou) {
        this.a = queueManager;
        this.b = txm;
        this.c = hou;
    }

    public final void f() {
        this.d.onNext(Boolean.TRUE);
    }

    public final void g() {
        this.d.onNext(Boolean.FALSE);
    }

    public final wud<PlayerQueue> a() {
        return this.d.i(new $$Lambda$hoj$RWc1a1VlUMPEEJ5OREsMS0H_YEI(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Boolean bool) {
        if (bool.booleanValue()) {
            return vun.a((ObservableSource<T>) this.a.getQueue(), BackpressureStrategy.BUFFER).f($$Lambda$hoj$8IpjzCKP_BPGKl6BgBsqHwp3msQ.INSTANCE);
        }
        return NeverObservableHolder.a();
    }

    public final void a(Context context, String str, String str2) {
        this.b.a(context, Collections.singletonList(PlayerTrack.create(str)), false);
        this.c.a(str2, "queue_item", "queue_item", str, (byte[]) null);
        Logger.a("LogHelper.logQueueItem uri: %s ", str);
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

    private static boolean a(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        if (LinkType.TRACK == jst.a(playerTrack.uri()).b || LinkType.SHOW_EPISODE == jst.a(playerTrack.uri()).b) {
            return true;
        }
        return false;
    }
}
