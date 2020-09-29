package defpackage;

import com.spotify.music.R;
import com.spotify.music.follow.FollowManager.a;
import java.util.List;

/* renamed from: myh reason: default package */
public final class myh implements rfp {
    public final xag a = new xag();
    public gzz b;
    private final mwt c;
    private final heg d;
    private final mxt e;
    private final rfk f;
    private final iww g;
    private final ruz h;
    private final sje i;
    private final ufy j;
    private final boolean k;

    public /* synthetic */ void a(boolean z) {
        CC.$default$a(this, z);
    }

    public final void b(String str) {
    }

    public final void c(String str) {
    }

    public myh(ufy ufy, mwt mwt, heg heg, mxt mxt, rfk rfk, iww iww, ruz ruz, sje sje, boolean z) {
        this.j = ufy;
        this.c = (mwt) fay.a(mwt);
        this.d = (heg) fay.a(heg);
        this.e = (mxt) fay.a(mxt);
        this.f = (rfk) fay.a(rfk);
        this.g = (iww) fay.a(iww);
        this.h = ruz;
        this.i = sje;
        this.k = z;
    }

    public final void a(myy myy, rfq rfq) {
        fay.a(myy);
        if (this.b == null) {
            myy.a();
        }
        this.a.a(this.c.a(this.b).a(vun.a(this.d.c())).a((wun<? super T>) new $$Lambda$myh$MXENJCtSmDiHT6bNKjkkUX6uQ<Object>(this, myy, rfq), (wun<Throwable>) new $$Lambda$myh$qYogxpRzbIqA2IDIgl8m59Ot2es<Throwable>(myy)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(myy myy, rfq rfq, ho hoVar) {
        this.b = (gzz) fay.a(hoVar.a);
        if (this.b.body().isEmpty()) {
            myy.b();
            return;
        }
        myy.a(this.b);
        rfq.a((rfo) hoVar.b);
        if (this.k) {
            this.i.a(this.b);
        }
    }

    public final void a(String str, boolean z) {
        mwr mwr = this.c.a;
        fay.a(str);
        a a2 = mwr.a.a(str);
        if (!(a2 == null || a2.d == z)) {
            mwr.a.a(str, z);
        }
        if (z) {
            mxv mxv = this.e.a;
            mxv.a.a(mxv.b.a(R.string.freetier_artist_toastie_artist_followed, 3000));
        }
        this.f.a(!z, str, str);
    }

    public final void b(String str, boolean z) {
        mwr mwr = this.c.a;
        fay.a(str);
        a a2 = mwr.a.a(str);
        if (!(a2 == null || a2.e == z)) {
            mwr.a.b(str, z);
        }
        if (z) {
            mxt mxt = this.e;
            if (mxt.b.a(mxt.c) || twu.a(mxt.c)) {
                mxv mxv = mxt.a;
                mxv.a.a(mxv.b.a(R.string.freetier_education_toastie_artist_ban, 3000));
            }
        }
        this.f.b(!z, str, str);
    }

    public final void a(String str) {
        this.j.a(str);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.g.a(str, str2, (String) null, str3, str4, (String) null, jnu.a);
        this.f.a(str, null);
    }

    public final void a(String str, List<String> list) {
        this.h.a(sih.a(str), str, list);
    }
}
