package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: qsv reason: default package */
public class qsv extends jor implements jol, jpb, kyf, qvk, qvl, qvy, qvz, qwd, uqr {
    public qst T;
    public qyd U;
    public qsr V;
    private rai W;
    private b<MusicPagesModel, qwj> X;
    public qsx a;
    public raj b;

    public /* synthetic */ uqp aR_() {
        return CC.$default$aR_(this);
    }

    public final Fragment ae() {
        return this;
    }

    public /* synthetic */ ImmutableList<View> f() {
        return CC.$default$f(this);
    }

    public static qsv a(fpt fpt, qyb qyb, String str) {
        qsv qsv = new qsv();
        qsq.c(qsv).putSerializable("music-page-id", qyb.a());
        if (qyb.b().b()) {
            qsq.a(qsv, (String) fay.a(qyb.b().c()));
        }
        qsq.b(qsv, str);
        fpu.a((Fragment) qsv, fpt);
        return qsv;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        c(!qsr.e());
        MusicPageId a2 = qsq.a(this);
        raj raj = this.b;
        LayoutInflater layoutInflater2 = (LayoutInflater) raj.a(layoutInflater, 1);
        MusicPageId musicPageId = (MusicPageId) raj.a(a2, 3);
        qti qti = (qti) raj.a(raj.a.get(), 5);
        qwt qwt = (qwt) raj.a(raj.b.get(), 6);
        raj.a(raj.c.get(), 7);
        MusicPageId musicPageId2 = a2;
        rai rai = r1;
        raj raj2 = raj;
        MusicPageId musicPageId3 = musicPageId2;
        rai rai2 = rai;
        rai rai3 = new rai(layoutInflater2, viewGroup, musicPageId, bundle, qti, qwt, (qxx) raj.a(raj.d.get(), 8), (qxz) raj.a(raj.e.get(), 9), (qyf) raj.a(raj.f.get(), 10), (quw) raj.a(raj.g.get(), 11), (qwd) raj.a(raj.h.get(), 12), (qta) raj.a(raj.i.get(), 13), (qzs) raj.a(raj.j.get(), 14), (rag) raj.a(raj.k.get(), 15), (qzv) raj.a(raj2.l.get(), 16), (qwz) raj.a(raj2.m.get(), 17), (qsr) raj.a(raj2.n.get(), 18));
        this.W = rai2;
        if (this.X == null) {
            a a3 = MusicPagesModel.x().d(jsl.b(this.V.a.b())).e(qsr.e()).a(this.U.a(musicPageId2));
            Bundle bundle3 = bundle;
            if (bundle3 != null) {
                qsw.a(bundle3, a3);
            }
            this.X = this.a.a(this.T, a3.a());
        }
        this.X.a(this.W);
        return this.W.a;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        b<MusicPagesModel, qwj> bVar = this.X;
        if (bVar != null) {
            qsw.a(bundle, (MusicPagesModel) bVar.e());
        }
    }

    public final void z() {
        super.z();
        this.X.c();
    }

    public final void A() {
        super.A();
        this.X.d();
    }

    public final void ax_() {
        super.ax_();
        this.X.b();
        this.W = null;
    }

    public final rdh af() {
        return rdh.a(((qyc) qyd.a().get(qsq.a(this))).d(), null);
    }

    public final udr ag() {
        return ((qyc) qyd.a().get(qsq.a(this))).e();
    }

    public final fpt b() {
        return fpu.a((Fragment) this);
    }

    public final gjf aj() {
        return ((qyc) qyd.a().get(qsq.a(this))).d();
    }

    public final MusicPageId ah() {
        return qsq.a(this);
    }

    public Optional<uqp> getDelegate() {
        return Optional.b(aR_());
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        rai rai = this.W;
        if (rai != null) {
            fzb.a((Fragment) this, rai.b.a(), menu);
        }
    }

    public final String ai() {
        return (String) qsq.b(this).d();
    }

    public final void ak() {
        Optional delegate = getDelegate();
        if (delegate.b()) {
            ((uqp) delegate.c()).b();
        }
    }

    public final void a(boolean z) {
        this.T.a.onNext(new q(z));
    }

    public boolean onBackPressed() {
        boolean q = ((MusicPagesModel) this.X.e()).q();
        if (q) {
            this.T.a.onNext(new a());
        }
        return q;
    }

    public final rae al() {
        return (rae) fay.a(this.W);
    }

    public final String b(Context context) {
        return qsq.a(this).mId;
    }

    public final String e() {
        return qsq.a(this).mId;
    }

    public final void am() {
        this.T.a.onNext(new t(true));
    }

    public final sih ae_() {
        return qtc.a(qsq.a(this), ai());
    }
}
