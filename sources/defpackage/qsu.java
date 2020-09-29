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
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;

/* renamed from: qsu reason: default package */
public class qsu extends jor implements a, b, jol, jpb, qvk, qvl, qvy, qvz, a, udv {
    public qst T;
    public rac U;
    public qyd V;
    public qsr W;
    private b<MusicPagesModel, qwj> X;
    private MusicPageId Y;
    private qzz Z;
    public qsx a;
    private sih aa;
    public raa b;

    public final Fragment ae() {
        return this;
    }

    public final String b(Context context) {
        return "";
    }

    public static qsu a(fpt fpt, String str, String str2, String str3) {
        qsu qsu = new qsu();
        qsq.b(qsu, str);
        qsq.a(qsu, str2);
        if (!fax.a(str3)) {
            qsq.c(qsu).putString("title", str3);
        }
        fpu.a((Fragment) qsu, fpt);
        return qsu;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        ViewGroup viewGroup2 = viewGroup;
        Bundle bundle3 = bundle;
        c(true);
        MusicPageId ah = ah();
        raa raa = this.b;
        LayoutInflater layoutInflater2 = (LayoutInflater) raa.a(layoutInflater, 1);
        MusicPageId musicPageId = ah;
        raa raa2 = raa;
        qzz qzz = r1;
        MusicPageId musicPageId2 = musicPageId;
        raa raa3 = raa2;
        qzz qzz2 = qzz;
        MusicPageId musicPageId3 = musicPageId;
        Bundle bundle4 = bundle;
        MusicPageId musicPageId4 = musicPageId;
        Bundle bundle5 = bundle;
        qzz qzz3 = new qzz(layoutInflater2, viewGroup2, (MusicPageId) raa.a(ah, 3), bundle3, (qtg) raa.a(raa.a.get(), 5), (qwt) raa.a(raa.b.get(), 6), (qxx) raa.a(raa.c.get(), 7), (qxz) raa.a(raa.d.get(), 8), (qyf) raa.a(raa.e.get(), 9), (quw) raa.a(raa.f.get(), 10), (qwf) raa.a(raa.g.get(), 11), (qzj) raa.a(raa2.h.get(), 12), (qzs) raa.a(raa3.i.get(), 13), (qta) raa.a(raa3.j.get(), 14), (rac) raa.a(raa3.k.get(), 15), (rag) raa.a(raa3.l.get(), 16), (qzv) raa.a(raa3.m.get(), 17), (qsr) raa.a(raa3.n.get(), 18), (qwz) raa.a(raa3.o.get(), 19));
        this.Z = qzz2;
        if (this.X == null) {
            qyb a2 = this.V.a(musicPageId4);
            Optional b2 = qsq.b(this);
            if (b2.b()) {
                a2 = a2.r().a(Optional.b((String) b2.c())).a();
            }
            Optional c = Optional.c(qsq.c(this).getString("title"));
            if (c.b()) {
                a2 = a2.r().a((String) c.c()).a();
            }
            MusicPagesModel.a b3 = MusicPagesModel.x().a(a2).b(true);
            if (bundle5 != null) {
                qsw.a(bundle5, b3);
            }
            this.X = this.a.a(this.T, b3.a());
        }
        this.U.a(((MusicPagesModel) this.X.e()).o() || this.W.f());
        this.X.a(this.Z);
        return this.Z.a;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        qsw.a(bundle, (MusicPagesModel) this.X.e());
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
        this.Z = null;
    }

    public final String e() {
        return ah().mId;
    }

    public final rdh af() {
        return rdh.a(((qyc) qyd.a().get(ah())).d(), null);
    }

    public final udr ag() {
        return ((qyc) qyd.a().get(ah())).e();
    }

    public final fpt b() {
        return fpu.a((Fragment) this);
    }

    public final sih ae_() {
        if (this.aa == null) {
            this.aa = qtc.a(ah(), ai());
        }
        return this.aa;
    }

    public final gjf aj() {
        return ((qyc) qyd.a().get(ah())).d();
    }

    public final MusicPageId ah() {
        if (this.Y == null) {
            this.Y = qsp.a(ai(), MusicPageId.SONGS);
        }
        return this.Y;
    }

    public final boolean aQ_() {
        return this.V.a(ah()).p() != PageAction.NO_ACTION;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        qzz qzz = this.Z;
        if (qzz != null) {
            fzb.a((Fragment) this, qzz.b.a(), menu);
        }
    }

    public final Visibility a() {
        if (this.U == null || ((MusicPagesModel) this.X.e()).o()) {
            return Visibility.ONLY_MAKE_ROOM;
        }
        if (this.U.a) {
            return Visibility.ONLY_MAKE_ROOM;
        }
        return Visibility.SHOW;
    }

    public final String ai() {
        Optional b2 = qsq.b(this);
        if (b2.b()) {
            return (String) b2.c();
        }
        throw new IllegalStateException("Missing drill down uri");
    }

    public final void ak() {
        ka p = p();
        if (p != null) {
            p.invalidateOptionsMenu();
        }
    }

    public final rae al() {
        return (rae) fay.a(this.Z);
    }
}
