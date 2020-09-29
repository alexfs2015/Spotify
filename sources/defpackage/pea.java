package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: pea reason: default package */
public final class pea {
    private final tyo a;
    private final xil b;
    private final String c;

    public pea(tyo tyo, xil xil, String str) {
        this.a = tyo;
        this.b = xil;
        this.c = str;
    }

    /* access modifiers changed from: private */
    public tyn a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track != null) {
            String entityUri = playerState.entityUri();
            if (("context".equals(track.provider()) && this.c.equals(entityUri)) || ("queue".equals(track.provider()) && this.c.equals(track.metadata().get("context_uri")))) {
                return tyn.a(track.uri(), tyo.a(playerState), playerState.currentPlaybackPosition(), playerState.duration());
            }
        }
        return new a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tyn a(Throwable th) {
        return new b();
    }

    public final xii<tyn> a() {
        return this.a.a(this.b).e((xiy<? super T, ? extends R>) new $$Lambda$pea$64OMss3RWYyt5knR9TbuYmr5Gcw<Object,Object>(this)).c(new b()).b().g($$Lambda$pea$9KWE5pjVIRP_jUyuatq1N_754.INSTANCE);
    }
}
