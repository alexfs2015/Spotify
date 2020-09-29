package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayTrackQueueUtils;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.queue.logging.QueueLogConstants.SectionId;
import com.spotify.music.features.queue.logging.QueueLogConstants.UserIntent;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pug reason: default package */
public final class pug implements puw, pux, puz, pva {
    public final pue a;
    public final pvi b;
    public final gug c;
    public final pvc d;
    public final Map<String, pvh> e = new HashMap();
    public pui f;
    public xip g;
    public xip h;
    private final lon i;
    private fqn j;
    private final hgy k;
    private boolean l;

    public pug(gug gug, pue pue, pvi pvi, pvc pvc, hgy hgy, lon lon) {
        this.c = (gug) fbp.a(gug);
        this.a = (pue) fbp.a(pue);
        this.b = (pvi) fbp.a(pvi);
        this.d = (pvc) fbp.a(pvc);
        this.k = (hgy) fbp.a(hgy);
        this.i = lon;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        this.j = fqn;
        this.j = fqn;
        this.a.a(jus.c(this.j));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.l = bool.booleanValue();
        this.f.j(bool.booleanValue());
    }

    public final void a() {
        this.g = wit.a((xfk<T>) this.k.a()).a((xis<? super T>) new $$Lambda$pug$N_WmXsiOsdNrUldSMAW_WswOAY<Object>(this), (xis<Throwable>) $$Lambda$pug$HvZlewC53zLFyDOESvnlYAoBYU.INSTANCE);
        this.c.a();
        pue pue = this.a;
        pue.a.registerPlayerStateObserver(pue.i);
        pue.k.a(wit.a((ObservableSource<T>) pue.d.getQueue(), BackpressureStrategy.BUFFER).a(pue.c).a(pue.h));
        this.f.a(this.b);
        this.b.a();
        this.h = this.i.a().a((xis<? super T>) new $$Lambda$pug$SwMIVIrofiZvoiBIXuIzzVojExg<Object>(this), (xis<Throwable>) $$Lambda$pug$mmRlLPKgfVzOUaFBKhMwEFgU.INSTANCE);
    }

    public final void a(int i2) {
        this.f.d(i2);
    }

    public final void a(int i2, int i3) {
        this.f.a(i2, i3);
    }

    public final void a(PlayerTrack playerTrack) {
        if (this.l && PlayerTrackUtil.isExplicit(playerTrack)) {
            this.i.a(playerTrack.uri(), null);
        } else if (playerTrack.equals(this.a.e.e())) {
            this.f.ah();
        } else if (jya.a(playerTrack, "availability_restrictions").isEmpty()) {
            boolean a2 = this.a.e.a(playerTrack);
            this.a.a.skipToFutureTrack(playerTrack, null);
            if (a2) {
                this.f.ah();
            }
        }
    }

    public final void a(pvh pvh, boolean z) {
        String globallyUniqueUid = PlayTrackQueueUtils.getGloballyUniqueUid(pvh.a);
        if (z) {
            this.d.a(pvh.a.uri(), SectionId.TRACKS, UserIntent.SELECT_TRACK, InteractionType.HIT);
            this.e.put(globallyUniqueUid, pvh);
        } else {
            this.d.a(pvh.a.uri(), SectionId.TRACKS, UserIntent.DESELECT_TRACK, InteractionType.HIT);
            this.e.remove(globallyUniqueUid);
        }
        b();
    }

    public void b() {
        if (this.e.isEmpty()) {
            this.f.ak();
            return;
        }
        boolean z = true;
        boolean z2 = true;
        for (pvh pvh : this.e.values()) {
            if (!pvh.c) {
                z = false;
            }
            if (!pvh.b) {
                z2 = false;
            }
        }
        this.f.a(z);
        this.f.i(z2);
        this.f.ai();
    }

    public final void b(int i2) {
        this.f.e(i2);
    }

    public final void b(int i2, int i3) {
        this.f.c(i2, i3);
    }

    public void c() {
        this.e.clear();
        this.f.al();
    }

    public final void c(int i2, int i3) {
        a aVar;
        boolean a2 = this.a.a(i2);
        pue pue = this.a;
        PlayerQueue playerQueue = pue.f;
        if (playerQueue == null) {
            Assertion.b("Queue is null");
        } else {
            PlayerQueueUtil playerQueueUtil = new PlayerQueueUtil();
            pud pud = pue.b;
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 < pud.a.size()) {
                a aVar2 = (a) pud.a.get(i4);
                boolean z = true;
                if (aVar2.a == 2 && i4 >= pud.c) {
                    aVar = new a(3, aVar2.b, aVar2.c, 0);
                } else {
                    if (aVar2.a != 3 || i4 >= pud.c) {
                        z = false;
                    }
                    aVar = z ? new a(2, aVar2.b, aVar2.c, 0) : aVar2;
                }
                arrayList.add(aVar);
                i4++;
            }
            pud.a.clear();
            pud.a.addAll(arrayList);
            pue.k.a(wit.a((ObservableSource<T>) pue.d.setQueue(playerQueueUtil.moveTracks(playerQueue, i2, i3, pue.a(i3))), BackpressureStrategy.BUFFER).a(pue.g));
        }
        boolean a3 = this.a.a(i3);
        pvc pvc = this.d;
        if (a2) {
            if (!a3) {
                pvc.a(null, SectionId.TRACKS, UserIntent.MOVE_TO_NEXT_FROM, InteractionType.DRAG);
                return;
            }
        } else if (a3) {
            pvc.a(null, SectionId.TRACKS, UserIntent.MOVE_TO_UP_NEXT, InteractionType.DRAG);
            return;
        }
        pvc.a(null, SectionId.TRACKS, UserIntent.CHANGE_ORDER, InteractionType.DRAG);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r10 == r6) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r10) {
        /*
            r9 = this;
            pue r0 = r9.a
            com.spotify.mobile.android.cosmos.player.v2.Player r1 = r0.a
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r1 = r1.getLastPlayerState()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r1 = r1.restrictions()
            java.util.Set r1 = r1.disallowInsertingIntoContextTracksReasons()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            pud r4 = r0.b
            r5 = 2
            if (r10 < 0) goto L_0x004a
            int r6 = r4.a()
            if (r10 < r6) goto L_0x0029
            goto L_0x004a
        L_0x0029:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r6 = r4.b()
            if (r6 != 0) goto L_0x0031
            r6 = 0
            goto L_0x0032
        L_0x0031:
            r6 = 2
        L_0x0032:
            if (r10 >= r6) goto L_0x0035
            goto L_0x004a
        L_0x0035:
            int r7 = r6 + 1
            int r8 = r4.a()
            if (r7 >= r8) goto L_0x0045
            int r4 = r4.a(r7)
            if (r4 != r5) goto L_0x0045
            r4 = 1
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x004b
            if (r10 != r6) goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            pud r0 = r0.b
            int r10 = r0.a(r10)
            if (r10 == r5) goto L_0x0056
            if (r1 != 0) goto L_0x0056
            r2 = 0
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pug.c(int):boolean");
    }

    public void d() {
        this.f.c();
    }
}
