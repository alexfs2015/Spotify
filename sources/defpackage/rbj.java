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

/* renamed from: rbj reason: default package */
public class rbj extends jrd implements a, b, jqx, jrn, rdx, rdy, ren, reo, a, uqq {
    public rbi T;
    public riy U;
    public rgs V;
    public rbg W;
    private b<MusicPagesModel, rey> X;
    private MusicPageId Y;
    private riv Z;
    public rbm a;
    private sso aa;
    public riw b;

    public static rbj a(fqn fqn, String str, String str2, String str3) {
        rbj rbj = new rbj();
        rbf.b(rbj, str);
        rbf.a(rbj, str2);
        if (!fbo.a(str3)) {
            rbf.c(rbj).putString("title", str3);
        }
        fqo.a((Fragment) rbj, fqn);
        return rbj;
    }

    public final void A() {
        super.A();
        this.X.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        MusicPageId ah = ah();
        c(!(ah == MusicPageId.SONGS && this.W.f()));
        riw riw = this.b;
        MusicPageId musicPageId = ah;
        riw riw2 = riw;
        riv riv = r1;
        riv riv2 = riv;
        MusicPageId musicPageId2 = musicPageId;
        riv riv3 = riv;
        riv riv4 = new riv((LayoutInflater) riw.a(layoutInflater, 1), viewGroup, (MusicPageId) riw.a(ah, 3), bundle, (rbv) riw.a(riw.a.get(), 5), (rfi) riw.a(riw.b.get(), 6), (rgm) riw.a(riw.c.get(), 7), (rgo) riw.a(riw.d.get(), 8), (rgu) riw.a(riw.e.get(), 9), (rdl) riw.a(riw.f.get(), 10), (reu) riw.a(riw.g.get(), 11), (rif) riw.a(riw.h.get(), 12), (rio) riw.a(riw.i.get(), 13), (rbp) riw.a(riw2.j.get(), 14), (riy) riw.a(riw2.k.get(), 15), (rjc) riw.a(riw2.l.get(), 16), (rir) riw.a(riw2.m.get(), 17), (rbg) riw.a(riw2.n.get(), 18), (rfo) riw.a(riw2.o.get(), 19), (a) riw.a(riw2.p.get(), 20));
        this.Z = riv3;
        if (this.X == null) {
            rgq a2 = this.V.a(musicPageId);
            Optional b2 = rbf.b(this);
            if (b2.b()) {
                a2 = a2.r().a(Optional.b((String) b2.c())).a();
            }
            Optional c = Optional.c(rbf.c(this).getString("title"));
            if (c.b()) {
                a2 = a2.r().a((String) c.c()).a();
            }
            MusicPagesModel.a b3 = MusicPagesModel.x().a(a2).b(true);
            Bundle bundle3 = bundle;
            if (bundle3 != null) {
                rbl.a(bundle3, b3);
            }
            this.X = this.a.a(this.T, b3.a());
        }
        this.U.a(((MusicPagesModel) this.X.e()).o());
        this.X.a(this.Z);
        return this.Z.a;
    }

    public final Visibility a() {
        return (this.U == null || ((MusicPagesModel) this.X.e()).o()) ? Visibility.ONLY_MAKE_ROOM : this.U.a ? Visibility.ONLY_MAKE_ROOM : Visibility.SHOW;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        riv riv = this.Z;
        if (riv != null) {
            fzv.a((Fragment) this, riv.b.a(), menu);
        }
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        if (this.aa == null) {
            this.aa = rbr.a(ah(), ai());
        }
        return this.aa;
    }

    public final rmf af() {
        return rmf.a(((rgr) rgs.a().get(ah())).d(), null);
    }

    public final uqm ag() {
        return ((rgr) rgs.a().get(ah())).e();
    }

    public final MusicPageId ah() {
        if (this.Y == null) {
            this.Y = rbe.a(ai(), MusicPageId.SONGS);
        }
        return this.Y;
    }

    public final String ai() {
        Optional b2 = rbf.b(this);
        if (b2.b()) {
            return (String) b2.c();
        }
        throw new IllegalStateException("Missing drill down uri");
    }

    public final gkq aj() {
        return ((rgr) rgs.a().get(ah())).d();
    }

    public final void ak() {
        kf p = p();
        if (p != null) {
            p.invalidateOptionsMenu();
        }
    }

    public final rja al() {
        return (rja) fbp.a(this.Z);
    }

    public final void aw_() {
        super.aw_();
        this.X.b();
        this.Z = null;
    }

    public final String b(Context context) {
        return "";
    }

    public final boolean b() {
        return this.V.a(ah()).p() != PageAction.NO_ACTION;
    }

    public final fqn d() {
        return fqo.a((Fragment) this);
    }

    public final String e() {
        return ah().mId;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        rbl.a(bundle, (MusicPagesModel) this.X.e());
    }

    public final void z() {
        super.z();
        this.X.c();
    }
}
