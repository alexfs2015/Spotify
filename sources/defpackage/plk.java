package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
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

/* renamed from: plk reason: default package */
public final class plk implements pma, pmb, pmd, pme {
    public final pli a;
    public final pmm b;
    public final gsg c;
    public final pmg d;
    public final Map<String, pml> e = new HashMap();
    public plm f;
    public wuk g;
    public wuk h;
    private final lkn i;
    private fpt j;
    private final hec k;
    private boolean l;

    public plk(gsg gsg, pli pli, pmm pmm, pmg pmg, hec hec, lkn lkn) {
        this.c = (gsg) fay.a(gsg);
        this.a = (pli) fay.a(pli);
        this.b = (pmm) fay.a(pmm);
        this.d = (pmg) fay.a(pmg);
        this.k = (hec) fay.a(hec);
        this.i = lkn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.l = bool.booleanValue();
        this.f.j(bool.booleanValue());
    }

    public final void a(int i2) {
        this.f.d(i2);
    }

    public final void a(int i2, int i3) {
        this.f.a(i2, i3);
    }

    public final void b(int i2) {
        this.f.e(i2);
    }

    public final void b(int i2, int i3) {
        this.f.c(i2, i3);
    }

    public final void a(PlayerTrack playerTrack) {
        if (this.l && PlayerTrackUtil.isExplicit(playerTrack)) {
            this.i.a(playerTrack.uri(), null);
        } else if (playerTrack.equals(this.a.e.e())) {
            this.f.ah();
        } else if (jvs.a(playerTrack, "availability_restrictions").isEmpty()) {
            boolean a2 = this.a.e.a(playerTrack);
            this.a.a.skipToFutureTrack(playerTrack, (ActionCallback) null);
            if (a2) {
                this.f.ah();
            }
        }
    }

    public void b() {
        if (this.e.isEmpty()) {
            this.f.ak();
            return;
        }
        boolean z = true;
        boolean z2 = true;
        for (pml pml : this.e.values()) {
            if (!pml.c) {
                z = false;
            }
            if (!pml.b) {
                z2 = false;
            }
        }
        this.f.a(z);
        this.f.i(z2);
        this.f.ai();
    }

    public void c() {
        this.e.clear();
        this.f.al();
    }

    public final void c(int i2, int i3) {
        a aVar;
        boolean a2 = this.a.a(i2);
        pli pli = this.a;
        PlayerQueue playerQueue = pli.f;
        if (playerQueue == null) {
            Assertion.b("Queue is null");
        } else {
            PlayerQueueUtil playerQueueUtil = new PlayerQueueUtil();
            plh plh = pli.b;
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 < plh.a.size()) {
                a aVar2 = (a) plh.a.get(i4);
                boolean z = true;
                if (aVar2.a == 2 && i4 >= plh.c) {
                    aVar = new a(3, aVar2.b, aVar2.c, 0);
                } else {
                    if (aVar2.a != 3 || i4 >= plh.c) {
                        z = false;
                    }
                    aVar = z ? new a(2, aVar2.b, aVar2.c, 0) : aVar2;
                }
                arrayList.add(aVar);
                i4++;
            }
            plh.a.clear();
            plh.a.addAll(arrayList);
            pli.k.a(vun.a((ObservableSource<T>) pli.d.setQueue(playerQueueUtil.moveTracks(playerQueue, i2, i3, pli.a(i3))), BackpressureStrategy.BUFFER).a(pli.g));
        }
        boolean a3 = this.a.a(i3);
        pmg pmg = this.d;
        if (a2) {
            if (!a3) {
                pmg.a(null, SectionId.TRACKS, UserIntent.MOVE_TO_NEXT_FROM, InteractionType.DRAG);
                return;
            }
        } else if (a3) {
            pmg.a(null, SectionId.TRACKS, UserIntent.MOVE_TO_UP_NEXT, InteractionType.DRAG);
            return;
        }
        pmg.a(null, SectionId.TRACKS, UserIntent.CHANGE_ORDER, InteractionType.DRAG);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r10 == r6) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r10) {
        /*
            r9 = this;
            pli r0 = r9.a
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
            plh r4 = r0.b
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
            plh r0 = r0.b
            int r10 = r0.a(r10)
            if (r10 == r5) goto L_0x0056
            if (r1 != 0) goto L_0x0056
            r2 = 0
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plk.c(int):boolean");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        this.j = fpt;
        this.j = fpt;
        this.a.a(jsl.c(this.j));
    }

    public void d() {
        this.f.c();
    }

    public final void a() {
        this.g = vun.a((wrf<T>) this.k.a()).a((wun<? super T>) new $$Lambda$plk$S77d7nP9wzwy8kxEVnevHYCd88<Object>(this), (wun<Throwable>) $$Lambda$plk$yFY2RJjpAxmeC3IthzbEt1i8yUk.INSTANCE);
        this.c.a();
        pli pli = this.a;
        pli.a.registerPlayerStateObserver(pli.i);
        pli.k.a(vun.a((ObservableSource<T>) pli.d.getQueue(), BackpressureStrategy.BUFFER).a(pli.c).a(pli.h));
        this.f.a(this.b);
        this.b.a();
        this.h = this.i.a().a((wun<? super T>) new $$Lambda$plk$Cr2x4UsdIor6JROQnvc0HBEx7u4<Object>(this), (wun<Throwable>) $$Lambda$plk$wOKE2iGhMtZbeJGhaJO0Mn5ASkM.INSTANCE);
    }

    public final void a(pml pml, boolean z) {
        String globallyUniqueUid = PlayTrackQueueUtils.getGloballyUniqueUid(pml.a);
        if (z) {
            this.d.a(pml.a.uri(), SectionId.TRACKS, UserIntent.SELECT_TRACK, InteractionType.HIT);
            this.e.put(globallyUniqueUid, pml);
        } else {
            this.d.a(pml.a.uri(), SectionId.TRACKS, UserIntent.DESELECT_TRACK, InteractionType.HIT);
            this.e.remove(globallyUniqueUid);
        }
        b();
    }
}
