package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: qip reason: default package */
public final class qip implements kmm<hcs, slz> {
    /* access modifiers changed from: private */
    public final qlt a;
    /* access modifiers changed from: private */
    public final gwp b;
    /* access modifiers changed from: private */
    public final spq c;
    /* access modifiers changed from: private */
    public final qiu d;
    /* access modifiers changed from: private */
    public a e;

    public qip(qlt qlt, gwp gwp, spq spq, qiu qiu) {
        this.a = qlt;
        this.b = gwp;
        this.c = spq;
        this.d = qiu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, String str, String str2, int i) {
        this.a.g().a(str, false);
        knw.accept(slz.a((smf) new a(str)));
    }

    public final kmn<hcs> connect(final knw<slz> knw) {
        this.e = new $$Lambda$qip$30iJ2iMFjjB0WcU6RgwonYkFBA(knw);
        this.a.g().a(this.e);
        this.d.a(new qiq() {
            public final void a() {
                knw.accept(new a());
            }

            public final void a(String str, int i) {
                knw.accept(new c(str, i));
            }

            public final void a(String str, int i, String str2, SearchHistoryItem searchHistoryItem) {
                knw.accept(slz.a((smf) new b(str, i, str2, searchHistoryItem)));
            }

            public final void b(String str, int i) {
                knw.accept(new f(str, i));
            }
        });
        this.c.a = new $$Lambda$qip$yfYxh5XwajSbNHZowW6lBLeRus(this, knw);
        return new kmn<hcs>() {
            public final /* synthetic */ void accept(Object obj) {
                hcs hcs = (hcs) obj;
                qip.this.a.n();
                qip.this.b.a(hcs, false);
            }

            public final void dispose() {
                qip.this.a.g().b(qip.this.e);
                qip.this.e = null;
                qip.this.d.a(null);
                qip.this.c.a = null;
            }
        };
    }
}
