package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;

/* renamed from: rbv reason: default package */
public final class rbv extends rca<Type, MusicItem> implements rbz {
    private final rcd e;
    private final rcb f;
    private final rcf g;
    private final rch h;

    public rbv(rcd rcd, rcb rcb, rcf rcf, rch rch) {
        this.e = rcd;
        this.f = rcb;
        this.g = rcf;
        this.h = rch;
        a((g<T, D>) this.e);
        a((g<T, D>) this.f);
        a((g<T, D>) this.h);
        a((g<T, D>) this.g);
    }

    public final void a(knw<rey> knw) {
        this.e.a = new $$Lambda$rbv$ohEg3KhBTfNuLRdCfkoikYKreVw(knw);
        this.f.a = new $$Lambda$rbv$8SRmuNijmELKUWFV3bRVOUS3fP4(knw);
        this.g.a((f) new $$Lambda$rbv$ZvW6kSDqqeCuRyORFkOaqgpcrwE(knw));
        this.h.a((a) new $$Lambda$rbv$PqJimXr0kYNyQKNHyU0E7cdj0Ck(knw));
        this.h.a((b) new $$Lambda$rbv$eWKHp2YlO0IP1uDDxAE1m3UpiGE(knw));
        this.g.a((g) new $$Lambda$rbv$RPxaB2QZPGo0dzOYcgOc98QDtXc(knw));
        this.g.a((e) new $$Lambda$rbv$hgN3lfamM1FUN3h5XSXVHUq48w4(knw));
        this.g.a((c) new $$Lambda$rbv$iafpV6Nr2OkT3fiLTEC8Ekc1i8c(knw));
        this.g.a((a) new $$Lambda$rbv$4qzYBWyODumuoAOMhSJvbgqcM(knw));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(d dVar, fqy fqy, a aVar, int i) {
        super.a(dVar, fqy, (MusicItem) aVar, i);
        fqy.getView();
    }

    public final void a(rfa rfa, String str) {
        this.h.a(rfa, str);
        this.e.a(rfa, str);
        e();
    }
}
