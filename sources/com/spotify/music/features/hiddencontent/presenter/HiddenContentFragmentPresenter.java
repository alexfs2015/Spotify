package com.spotify.music.features.hiddencontent.presenter;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.hiddencontent.FreeTierProfileLogger;
import java.util.List;

public final class HiddenContentFragmentPresenter {
    public final FreeTierProfileLogger a;
    public final spi b;
    public final sih c;
    public xag d;
    public Tab e = Tab.ARTISTS;
    private final nda f;
    private final ncd g;
    private final rfu h;
    private final ncy i;
    private final ncx j;
    private final heg k;
    private final txc l;
    private final wud<Boolean> m;
    private final lkn n;
    private final fpt o;

    public enum Tab {
        SONGS,
        ARTISTS
    }

    public HiddenContentFragmentPresenter(nda nda, FreeTierProfileLogger freeTierProfileLogger, ncd ncd, spi spi, rfu rfu, ncy ncy, ncx ncx, heg heg, txc txc, wud<Boolean> wud, sih sih, lkn lkn, fpt fpt) {
        this.f = nda;
        this.a = freeTierProfileLogger;
        this.g = ncd;
        this.b = spi;
        this.h = rfu;
        this.i = ncy;
        this.j = ncx;
        this.k = heg;
        this.l = txc;
        this.m = wud;
        this.c = sih;
        this.n = lkn;
        this.o = fpt;
    }

    public final void a() {
        this.d = new xag();
        this.d.a(this.m.i(new wut() {
            public final Object call(Object obj) {
                return HiddenContentFragmentPresenter.this.a((Boolean) obj);
            }
        }).a(vun.a(this.k.c())).a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                HiddenContentFragmentPresenter.this.b((List) obj);
            }
        }, (wun<Throwable>) $$Lambda$HiddenContentFragmentPresenter$q5xgzTekX9iME3ODxVafp5D89o.INSTANCE));
        xag xag = this.d;
        ncx ncx = this.j;
        ncx.getClass();
        xag.a(wud.a((wus<wud<T>>) new wus() {
            public final Object call() {
                return ncx.this.a();
            }
        }).a(vun.a(this.k.c())).a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                HiddenContentFragmentPresenter.this.a((List) obj);
            }
        }, (wun<Throwable>) $$Lambda$HiddenContentFragmentPresenter$6AOTMGV9opjv5Kzkh5tdlN_QKRM.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Boolean bool) {
        this.i.a.g = !bool.booleanValue();
        return this.i.a();
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list.isEmpty()) {
            this.f.an();
        } else {
            this.f.b(list);
        }
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

    public void b(Tab tab) {
        if (tab == Tab.SONGS) {
            this.f.ak();
        } else {
            this.f.al();
        }
    }

    public void a(uzc uzc) {
        if (!((Boolean) this.g.a.a(Boolean.FALSE)).booleanValue() || !uzc.isExplicit()) {
            b(uzc);
        } else {
            this.n.a(uzc.getUri(), null);
        }
    }

    private void b(uzc uzc) {
        String previewId = uzc.previewId();
        if (previewId != null) {
            this.l.b(previewId, ncg.a(uzc));
            return;
        }
        Logger.e("missing preview id for track %s", uzc.getUri());
    }
}
