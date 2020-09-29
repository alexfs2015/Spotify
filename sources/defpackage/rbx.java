package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;

/* renamed from: rbx reason: default package */
public final class rbx extends rca<Type, MusicItem> implements rbz {
    private final rcd e;
    private final rcb f;
    private final rcf g;
    private final rch h;

    public rbx(rcd rcd, rcb rcb, rcf rcf, rch rch) {
        this.e = rcd;
        this.f = rcb;
        this.g = rcf;
        this.h = rch;
        a((g<T, D>) this.e);
        a((g<T, D>) this.f);
        a((g<T, D>) this.g);
        a((g<T, D>) this.h);
    }

    public final void a(knw<rey> knw) {
        this.e.a = new $$Lambda$rbx$TA9eX7pv_VcEam9KZYLsN0CGmY(knw);
        this.f.a = new $$Lambda$rbx$_08NhZj1I1nTHtR11f8CgQP6QIQ(knw);
        this.g.a((g) new $$Lambda$rbx$MQuJVZDqHqzHKbzUgnqNPGSxxcI(knw));
        this.g.a((c) new $$Lambda$rbx$Djc5W7HQ3sZRaPgqMUeo5ZL5A0I(knw));
        this.g.a((a) new $$Lambda$rbx$G5j924gIAHixrUypYdMbif80hx0(knw));
        this.g.a((d) new $$Lambda$rbx$3g28NCKNqW4NDXJVyM0fBOqsYhw(knw));
        this.g.a((b) new $$Lambda$rbx$CJ8psUitlz2t0qRZFSigviNcb0(knw));
        this.h.a((a) new $$Lambda$rbx$bEuuOuqmru5t4Kp595iomhWghQ(knw));
        this.h.a((b) new $$Lambda$rbx$NSt75Br4st9RBx581rfV1yaJwZw(knw));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(d dVar, fqy fqy, a aVar, int i) {
        super.a(dVar, fqy, (MusicItem) aVar, i);
        fqy.getView();
    }

    public final void a(rfa rfa, String str) {
        this.e.a(rfa, str);
        this.h.a(rfa, str);
        e();
    }
}
