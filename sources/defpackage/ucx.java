package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Scheduler;

/* renamed from: ucx reason: default package */
public final class ucx {
    private final uwj a;
    private final uau b;
    private final hvl c;
    private final spi d;
    private final udh e;
    private final udm f;
    private final uci g;
    private final ucy h;
    private final Scheduler i;
    private final Scheduler j;
    private final Scheduler k;

    public ucx(uwj uwj, uau uau, hvl hvl, spi spi, ucy ucy, udh udh, udm udm, uci uci, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        this.a = uwj;
        this.b = uau;
        this.c = hvl;
        this.d = spi;
        this.h = ucy;
        this.e = udh;
        this.f = udm;
        this.g = uci;
        this.i = scheduler;
        this.j = scheduler2;
        this.k = scheduler3;
    }

    /* access modifiers changed from: 0000 */
    public c<udf, udd, udc> a() {
        a a2 = klb.a((kjz<M, E, F>) $$Lambda$oSzxGoz5WiQXndcBYpIJ8EbLuo.INSTANCE, udg.a(this.a, this.b, this.d, this.h, this.e, this.f, this.g, this.i)).a((kjo<M, F>) $$Lambda$ehjFlOb71a1cuGM3XnsSwPMa1B4.INSTANCE).b(new $$Lambda$ucx$EZJccR17gwZqvos7EiwdY9ZQWis(this)).a((kkp<kkv>) new $$Lambda$ucx$lSjhHddS0FTHkIeEeqVuIt9k<kkv>(this)).a(udj.a(this.b, this.c, this.e));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv c() {
        return new kld(this.j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ kkv b() {
        return new kld(this.k);
    }
}
