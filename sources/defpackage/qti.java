package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;

/* renamed from: qti reason: default package */
public final class qti extends qtl<Type, MusicItem> implements qtk {
    private final qto e;
    private final qtm f;
    private final qtq g;
    private final qts h;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(d dVar, fqe fqe, a aVar, int i) {
        super.a(dVar, fqe, (MusicItem) aVar, i);
    }

    public qti(qto qto, qtm qtm, qtq qtq, qts qts) {
        this.e = qto;
        this.f = qtm;
        this.g = qtq;
        this.h = qts;
        a((g<T, D>) this.e);
        a((g<T, D>) this.f);
        a((g<T, D>) this.g);
        a((g<T, D>) this.h);
    }

    public final void a(kkn<qwj> kkn) {
        this.e.a = new $$Lambda$qti$oQFglGu6qP9x6IRdeAL1lKwc3_w(kkn);
        this.f.a = new $$Lambda$qti$3jtHFsCcVyYxHCcWcIvM_bXpgnk(kkn);
        this.g.a((g) new $$Lambda$qti$W2CObVCPMVO2hEikttuXn0NG0YM(kkn));
        this.g.a((c) new $$Lambda$qti$qFqEkfUTK6nqKvBSMaLswKcEN6I(kkn));
        this.g.a((a) new $$Lambda$qti$I7AQg0sMNj8DTylNFaTWh_WH72Y(kkn));
        this.g.a((d) new $$Lambda$qti$yIbK2Y9LuGpV6aobT9HoDnlNLTk(kkn));
        this.g.a((b) new $$Lambda$qti$PU0SupPH0U5e7RmKEwsKptBwH7w(kkn));
        this.h.a((a) new $$Lambda$qti$BeprrtRzjVTLkc52BLVz9OnDtmI(kkn));
        this.h.a((b) new $$Lambda$qti$momQbFy0pD9jxFy6VCUYAZKcN20(kkn));
    }

    public final void a(qwl qwl, String str) {
        this.e.a(qwl, str);
        this.h.a(qwl, str);
        e();
    }
}
