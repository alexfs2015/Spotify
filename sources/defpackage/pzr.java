package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: pzr reason: default package */
public final class pzr implements kjd<gzz, sbs> {
    /* access modifiers changed from: private */
    public final qcq a;
    /* access modifiers changed from: private */
    public final gup b;
    /* access modifiers changed from: private */
    public final sfj c;
    /* access modifiers changed from: private */
    public final pzw d;
    /* access modifiers changed from: private */
    public a e;

    public pzr(qcq qcq, gup gup, sfj sfj, pzw pzw) {
        this.a = qcq;
        this.b = gup;
        this.c = sfj;
        this.d = pzw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, String str, String str2, int i) {
        this.a.g().a(str, false);
        kkn.accept(sbs.a((sby) new a(str)));
    }

    public final kje<gzz> connect(final kkn<sbs> kkn) {
        this.e = new $$Lambda$pzr$qnXyKfYh866cI5QnOyE2R5DHvJc(kkn);
        this.a.g().a(this.e);
        this.d.a(new pzs() {
            public final void a(String str, int i, String str2, SearchHistoryItem searchHistoryItem) {
                kkn.accept(sbs.a((sby) new b(str, i, str2, searchHistoryItem)));
            }

            public final void a(String str, int i) {
                kkn.accept(new c(str, i));
            }

            public final void b(String str, int i) {
                kkn.accept(new f(str, i));
            }

            public final void a() {
                kkn.accept(new a());
            }
        });
        this.c.a = new $$Lambda$pzr$kjCmpjuDL9pGbzEd2qQ_dvfLRMY(this, kkn);
        return new kje<gzz>() {
            public final /* synthetic */ void accept(Object obj) {
                gzz gzz = (gzz) obj;
                pzr.this.a.n();
                pzr.this.b.a(gzz, false);
            }

            public final void dispose() {
                pzr.this.a.g().b(pzr.this.e);
                pzr.this.e = null;
                pzr.this.d.a(null);
                pzr.this.c.a = null;
            }
        };
    }
}
