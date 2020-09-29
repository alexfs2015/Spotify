package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: ngq reason: default package */
public final class ngq {
    private final fou<Boolean> a;
    private final fou<Boolean> b;
    private final ngr c;
    private final Flowable<PlayerState> d;
    private final lbi e;

    public ngq(fou<Boolean> fou, fou<Boolean> fou2, ngr ngr, Flowable<PlayerState> flowable, lbi lbi) {
        this.a = fou;
        this.b = fou2;
        this.c = ngr;
        this.d = flowable;
        this.e = lbi;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nge a(PlayerState playerState) {
        return new h(!playerState.isPaused() && playerState.isPlaying());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nge a(Boolean bool) {
        return new a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nge a(a aVar) {
        return new b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nge a(ngj ngj) {
        return (nge) ngj.a($$Lambda$wjxQQioU79de55pNFr8Q3slk.INSTANCE, $$Lambda$5i248hDcblKbXzFWchk_E2VGN2g.INSTANCE, $$Lambda$BtkR33YwZPeH89YhEP4S_gfCoRY.INSTANCE, $$Lambda$ngq$RkmbK2ggDueP85NPDRcrtBrWYlo.INSTANCE, $$Lambda$ngq$xAVlTlN_4bjqpSeeSRsmyh5LZak.INSTANCE, $$Lambda$ngq$1qR5oaf1NJgfpvTz6pvsnMBPZU4.INSTANCE);
    }

    public final kmv<nge> a() {
        return koj.a(this.a.c((Function<? super T, ? extends R>) $$Lambda$ngq$mTp0TRHaYsLZJdc_Qote6eAHJs8.INSTANCE), this.b.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$0vCk0xDKfEDlHEEGD4RtqBPqeX0.INSTANCE), this.c.a.c((Function<? super T, ? extends R>) $$Lambda$ngq$B0tP5lZTpoefvOPDx78Tuo5WHtw.INSTANCE), this.d.j().c((Function<? super T, ? extends R>) $$Lambda$ngq$Daxz05fD1t0LUfKAO86An7TF2f8.INSTANCE), this.e.a().c((Function<? super T, ? extends R>) $$Lambda$5IBD8VNAcpK1vzNpFCI4cxpFSc.INSTANCE));
    }
}
