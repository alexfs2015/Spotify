package com.spotify.music.features.hiddencontent.presenter;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.hiddencontent.FreeTierProfileLogger;
import java.util.List;

public final class HiddenContentFragmentPresenter {
    public final FreeTierProfileLogger a;
    public final szp b;
    public final sso c;
    public xok d;
    public Tab e = Tab.ARTISTS;
    private final nip f;
    private final nhs g;
    private final row h;
    private final nin i;
    private final nim j;
    private final hhc k;
    private final ujf l;
    private final xii<Boolean> m;
    private final lon n;
    private final fqn o;

    public enum Tab {
        SONGS,
        ARTISTS
    }

    public HiddenContentFragmentPresenter(nip nip, FreeTierProfileLogger freeTierProfileLogger, nhs nhs, szp szp, row row, nin nin, nim nim, hhc hhc, ujf ujf, xii<Boolean> xii, sso sso, lon lon, fqn fqn) {
        this.f = nip;
        this.a = freeTierProfileLogger;
        this.g = nhs;
        this.b = szp;
        this.h = row;
        this.i = nin;
        this.j = nim;
        this.k = hhc;
        this.l = ujf;
        this.m = xii;
        this.c = sso;
        this.n = lon;
        this.o = fqn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Boolean bool) {
        this.i.a.g = !bool.booleanValue();
        return this.i.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list.isEmpty()) {
            this.f.an();
        } else {
            this.f.b(list);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (list.isEmpty()) {
            this.f.am();
        } else {
            this.f.a(list);
        }
        this.f.ai();
    }

    private void b(vlf vlf) {
        String previewId = vlf.previewId();
        if (previewId != null) {
            this.l.b(previewId, nhv.a(vlf));
            return;
        }
        Logger.e("missing preview id for track %s", vlf.getUri());
    }

    public final void a() {
        this.d = new xok();
        this.d.a(this.m.h(new xiy() {
            public final Object call(Object obj) {
                return HiddenContentFragmentPresenter.this.a((Boolean) obj);
            }
        }).a(wit.a(this.k.c())).c((xis<? super T>) new xis() {
            public final void call(Object obj) {
                HiddenContentFragmentPresenter.this.b((List) obj);
            }
        }));
        xok xok = this.d;
        nim nim = this.j;
        nim.getClass();
        xok.a(xii.a((xix<xii<T>>) new xix() {
            public final Object call() {
                return nim.this.a();
            }
        }).a(wit.a(this.k.c())).c((xis<? super T>) new xis() {
            public final void call(Object obj) {
                HiddenContentFragmentPresenter.this.a((List) obj);
            }
        }));
    }

    public final void a(Tab tab) {
        if (tab != this.e) {
            if (tab == Tab.SONGS) {
                this.a.a();
            } else {
                this.a.b();
            }
            this.e = tab;
            b(this.e);
        }
    }

    public void a(vlf vlf) {
        if (!((Boolean) this.g.a.a(Boolean.FALSE)).booleanValue() || !vlf.isExplicit()) {
            b(vlf);
        } else {
            this.n.a(vlf.getUri(), null);
        }
    }

    public void b(Tab tab) {
        if (tab == Tab.SONGS) {
            this.f.ak();
        } else {
            this.f.al();
        }
    }
}
