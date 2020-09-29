package defpackage;

import android.content.Context;
import android.content.Intent;
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
import io.reactivex.Observable;
import io.reactivex.disposables.Disposables;

/* renamed from: off reason: default package */
public class off extends jor implements a, jol, osd, ose, osf, osg, osh, rqf {
    public oeu a;
    public owf b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "android-spotlet-free-tier-playlist";
    }

    public static off a(fpt fpt, String str, boolean z, boolean z2, Optional<String> optional, boolean z3) {
        off off = new off();
        fpu.a((Fragment) off, fpt);
        Bundle bundle = (Bundle) fay.a(off.i);
        bundle.putString("key_playlist_uri", str);
        bundle.putBoolean("open_all_songs_dialog", z);
        bundle.putBoolean("auto_play", z2);
        bundle.putString("auto_play_item", (String) optional.d());
        bundle.putBoolean("key_from_external_uri", z3);
        off.g(bundle);
        return off;
    }

    public static Intent b(Intent intent) {
        return intent.putExtra("open_all_songs_dialog", true);
    }

    public final void b(Bundle bundle) {
        c(true);
        super.b(bundle);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        owf owf = this.b;
        owf.I = p();
        owf.J = viewGroup;
        if (owf.u == null) {
            owf.u = owf.c.a();
        }
        return owf.u.a(layoutInflater, viewGroup);
    }

    public final void ax_() {
        super.ax_();
        owf owf = this.b;
        owf.b.a(Disposables.a());
        if (owf.K) {
            for (ofc c : owf.G) {
                c.c();
            }
        }
        owf.K = false;
        owf.L = false;
        owf.H.a = false;
        owf.G.clear();
        owf.t = null;
        owf.v = null;
        owf.D = null;
        owf.B = null;
        owf.s = null;
        owf.E = null;
        owf.z = null;
        owf.y = null;
        owf.A = null;
        owf.w = null;
        owf.C = null;
        owf.x = null;
        owf.n = null;
        owf.o = null;
        owf.p = null;
        owf.q = null;
        owf.r = null;
        owf.k.a(null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable an() {
        oeu oeu = this.a;
        return oeu.a.e(a.a(oeu.ae_().toString()));
    }

    public final rdh af() {
        return rdh.a((a) new $$Lambda$off$aXKkXL92syCDADSxXkB30bNUZ2A(this));
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        fzb.a((Fragment) this, (fyw) new fyw() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(uyz uyz, fyt fyt) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void b(uyz uyz, fyt fyt) {
            }

            public final void a(fyt fyt) {
                if (owf.this.s != null) {
                    owf.this.s.a(fyt, null, $$Lambda$owf$4$sQfr2CAhNLaTq_DgFAfWMVSlIgM.INSTANCE, $$Lambda$owf$4$AjuECp2iUDO2yg45saaC7wOG1tk.INSTANCE);
                }
            }

            public final sih ae_() {
                return owf.this.j.ae_();
            }
        }, menu);
    }

    public fpt getFlags() {
        return fpu.a((Fragment) this);
    }

    public final udr ag() {
        return udt.az;
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final boolean ai() {
        return ((Bundle) fay.a(this.i)).getBoolean("open_all_songs_dialog");
    }

    public final void aj() {
        ((Bundle) fay.a(this.i)).putBoolean("open_all_songs_dialog", false);
    }

    public final boolean c() {
        return ((Bundle) fay.a(this.i)).getBoolean("auto_play", false);
    }

    public final Optional<String> ah() {
        return Optional.c(((Bundle) fay.a(this.i)).getString("auto_play_item"));
    }

    public final void a(boolean z) {
        ((Bundle) fay.a(this.i)).putBoolean("auto_play", false);
        ((Bundle) fay.a(this.i)).putBoolean("auto_play_item_found", z);
    }

    public final boolean ak() {
        return ((Bundle) fay.a(this.i)).getBoolean("key_from_external_uri", false);
    }

    public final String al() {
        return ((Bundle) fay.a(this.i)).getString("key_algotorial_identifier");
    }

    public final void am() {
        ((Bundle) fay.a(this.i)).remove("key_algotorial_identifier");
    }
}
