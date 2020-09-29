package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: pia reason: default package */
public final class pia {
    private final RxEpisodeDataLoader a;
    private final pht b;
    private final pkc c;
    private final hhv<phz> d;

    public pia(RxEpisodeDataLoader rxEpisodeDataLoader, pht pht, pkc pkc, hhv<phz> hhv) {
        this.a = rxEpisodeDataLoader;
        this.b = pht;
        this.c = pkc;
        this.d = hhv;
    }

    /* access modifiers changed from: private */
    public static phz a(phz phz, phw phw, pki pki) {
        return phz instanceof c ? phz.a(((c) phz).a, (Optional) phw.a($$Lambda$pia$gxWwWoBRufahdMTbIO0lZu5hUiY.INSTANCE, $$Lambda$pia$qvFj3r5FBTBD8DDL37BFTh5cY.INSTANCE, $$Lambda$pia$e3UNC3cO9mJoDRQqgWubCvt0yAI.INSTANCE), (Optional) pki.a($$Lambda$pia$apDZISLXpb7h8px4m3AQjPo4A.INSTANCE, $$Lambda$pia$lBgoBeZKzkkGvlOBGSYtyRAliqg.INSTANCE, $$Lambda$pia$DbuZifJ2bBmZ1cuCM70GSqKRTU0.INSTANCE)) : phz;
    }

    public final xii<phz> a(String str) {
        return xii.a(this.a.a(str), xim.a(this.b.a(str)).c(new b()).g(new $$Lambda$pia$siLVqMHV_u2dl2sbX_6KdysLtDk(str)), wit.a((ObservableSource<T>) this.c.fetch(str), BackpressureStrategy.BUFFER).c(new b()).g(new $$Lambda$pia$hEwuWRGP_IK0q8WrBup9q6YcZqc(str)), (xja<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$pia$A96LkOB0SdZ5m_s838fP1tSjIvo.INSTANCE).b().a((c<? super T, ? extends R>) this.d);
    }
}
