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

/* renamed from: rbk reason: default package */
public class rbk extends jrd implements jqx, jrn, lbp, rdx, rdy, ren, reo, res, vbw {
    public rbi T;
    public rgs U;
    public rbg V;
    private rje W;
    private b<MusicPagesModel, rey> X;
    public rbm a;
    public rjf b;

    public static rbk a(fqn fqn, rgq rgq, String str) {
        rbk rbk = new rbk();
        rbf.c(rbk).putSerializable("music-page-id", rgq.a());
        if (rgq.b().b()) {
            rbf.a(rbk, (String) fbp.a(rgq.b().c()));
        }
        rbf.b(rbk, str);
        fqo.a((Fragment) rbk, fqn);
        return rbk;
    }

    public final void A() {
        super.A();
        this.X.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        c(!rbg.e());
        MusicPageId a2 = rbf.a(this);
        rjf rjf = this.b;
        LayoutInflater layoutInflater2 = (LayoutInflater) rjf.a(layoutInflater, 1);
        MusicPageId musicPageId = (MusicPageId) rjf.a(a2, 3);
        rbx rbx = (rbx) rjf.a(rjf.a.get(), 5);
        rfi rfi = (rfi) rjf.a(rjf.b.get(), 6);
        rjf.a(rjf.c.get(), 7);
        MusicPageId musicPageId2 = a2;
        rje rje = r1;
        rjf rjf2 = rjf;
        MusicPageId musicPageId3 = musicPageId2;
        rje rje2 = rje;
        rje rje3 = new rje(layoutInflater2, viewGroup, musicPageId, bundle, rbx, rfi, (rgm) rjf.a(rjf.d.get(), 8), (rgo) rjf.a(rjf.e.get(), 9), (rgu) rjf.a(rjf.f.get(), 10), (rdl) rjf.a(rjf.g.get(), 11), (res) rjf.a(rjf.h.get(), 12), (rbp) rjf.a(rjf.i.get(), 13), (rio) rjf.a(rjf.j.get(), 14), (rjc) rjf.a(rjf.k.get(), 15), (rir) rjf.a(rjf2.l.get(), 16), (rfo) rjf.a(rjf2.m.get(), 17), (rbg) rjf.a(rjf2.n.get(), 18));
        this.W = rje2;
        if (this.X == null) {
            a a3 = MusicPagesModel.x().d(jus.b(this.V.a.d())).e(rbg.e()).a(this.U.a(musicPageId2));
            Bundle bundle3 = bundle;
            if (bundle3 != null) {
                rbl.a(bundle3, a3);
            }
            this.X = this.a.a(this.T, a3.a());
        }
        this.X.a(this.W);
        return this.W.a;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        rje rje = this.W;
        if (rje != null) {
            fzv.a((Fragment) this, rje.b.a(), menu);
        }
    }

    public final void a(boolean z) {
        this.T.a.onNext(new q(z));
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return rbr.a(rbf.a(this), ai());
    }

    public final rmf af() {
        return rmf.a(((rgr) rgs.a().get(rbf.a(this))).d(), null);
    }

    public final uqm ag() {
        return ((rgr) rgs.a().get(rbf.a(this))).e();
    }

    public final MusicPageId ah() {
        return rbf.a(this);
    }

    public final String ai() {
        return (String) rbf.b(this).d();
    }

    public final gkq aj() {
        return ((rgr) rgs.a().get(rbf.a(this))).d();
    }

    public final void ak() {
        Optional delegate = getDelegate();
        if (delegate.b()) {
            ((vbu) delegate.c()).b();
        }
    }

    public final rja al() {
        return (rja) fbp.a(this.W);
    }

    public final void am() {
        this.T.a.onNext(new t(true));
    }

    public final void aw_() {
        super.aw_();
        this.X.b();
        this.W = null;
    }

    public final String b(Context context) {
        return rbf.a(this).mId;
    }

    public final fqn d() {
        return fqo.a((Fragment) this);
    }

    public final String e() {
        return rbf.a(this).mId;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        b<MusicPagesModel, rey> bVar = this.X;
        if (bVar != null) {
            rbl.a(bundle, (MusicPagesModel) bVar.e());
        }
    }

    public /* synthetic */ vbu f() {
        return CC.$default$f(this);
    }

    public /* synthetic */ ImmutableList<View> g() {
        return CC.$default$g(this);
    }

    public Optional<vbu> getDelegate() {
        return Optional.b(f());
    }

    public boolean onBackPressed() {
        boolean q = ((MusicPagesModel) this.X.e()).q();
        if (q) {
            this.T.a.onNext(new a());
        }
        return q;
    }

    public final void z() {
        super.z();
        this.X.c();
    }
}
