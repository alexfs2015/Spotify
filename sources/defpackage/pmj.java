package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import java.util.ArrayList;

/* renamed from: pmj reason: default package */
public final class pmj implements pmk {
    private final PlayerQueue a;
    private final PlayerRestrictions b;
    private final int c;
    private final String d;
    private final boolean e;
    private final boolean f;

    /* renamed from: pmj$a */
    static class a implements faz<PlayerTrack> {
        private final int a;
        private int b = 0;

        a(int i) {
            this.a = i;
        }

        /* renamed from: a */
        public final boolean apply(PlayerTrack playerTrack) {
            if (playerTrack == null || PlayerQueueUtil.isQueued(playerTrack)) {
                return false;
            }
            if (PlayerQueueUtil.isDelimiter(playerTrack)) {
                this.b++;
                return false;
            } else if (!PlayerQueueUtil.isForceRemoved(playerTrack) && this.b < this.a) {
                return true;
            } else {
                return false;
            }
        }
    }

    public pmj(PlayerQueue playerQueue, String str, PlayerRestrictions playerRestrictions, boolean z, boolean z2, boolean z3) {
        this.a = (PlayerQueue) fay.a(playerQueue);
        this.d = (String) fay.a(str);
        this.b = (PlayerRestrictions) fay.a(playerRestrictions);
        this.f = z3;
        this.c = (!z || !z3) ? 1 : 2;
        this.e = z2;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean a(PlayerTrack playerTrack) {
        return "video".equals(jvs.a(playerTrack, "media.type"));
    }

    public final int b() {
        return this.a.nextTracks().length + (this.a.track() != null ? 1 : 0);
    }

    public final pml[] c() {
        PlayerTrack[] nextTracks;
        ArrayList arrayList = new ArrayList();
        boolean z = this.b.disallowRemovingFromNextTracksReasons().isEmpty() && this.b.disallowSetQueueReasons().isEmpty();
        boolean isEmpty = this.b.disallowInsertingIntoNextTracksReasons().isEmpty();
        boolean isEmpty2 = this.b.disallowReorderingInNextTracksReasons().isEmpty();
        for (PlayerTrack playerTrack : this.a.nextTracks()) {
            if (PlayerQueueUtil.isQueued(playerTrack)) {
                arrayList.add(pml.a(playerTrack, z, isEmpty, isEmpty2, false));
            }
        }
        return (pml[]) arrayList.toArray(new pml[0]);
    }

    public final pml[] d() {
        PlayerTrack[] nextTracks;
        a aVar = new a(this.c);
        ArrayList arrayList = new ArrayList();
        boolean z = this.b.disallowRemovingFromNextTracksReasons().isEmpty() && this.b.disallowRemovingFromContextTracksReasons().isEmpty() && this.b.disallowSetQueueReasons().isEmpty();
        boolean isEmpty = this.b.disallowInsertingIntoNextTracksReasons().isEmpty();
        boolean z2 = this.b.disallowReorderingInNextTracksReasons().isEmpty() && this.b.disallowReorderingInContextTracksReasons().isEmpty();
        for (PlayerTrack playerTrack : this.a.nextTracks()) {
            if (aVar.apply(playerTrack)) {
                arrayList.add(pml.a(playerTrack, z, isEmpty, z2, !this.f && !z2));
            }
        }
        return (pml[]) arrayList.toArray(new pml[0]);
    }

    public final PlayerTrack e() {
        return this.a.track();
    }

    public final String f() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmj)) {
            return false;
        }
        pmj pmj = (pmj) obj;
        if (this.c != pmj.c || this.e != pmj.e || this.f != pmj.f || !this.a.equals(pmj.a) || !this.b.equals(pmj.b)) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return str.equals(pmj.d);
        }
        return pmj.d == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31;
        String str = this.d;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
