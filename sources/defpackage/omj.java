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

/* renamed from: omj reason: default package */
public class omj extends jrd implements a, jqx, ozj, ozk, ozl, ozm, ozn, rzq {
    public oma a;
    public pdq b;

    public static omj a(fqn fqn, String str, boolean z, boolean z2, Optional<String> optional, boolean z3) {
        omj omj = new omj();
        fqo.a((Fragment) omj, fqn);
        Bundle bundle = (Bundle) fbp.a(omj.i);
        bundle.putString("key_playlist_uri", str);
        bundle.putBoolean("open_all_songs_dialog", z);
        bundle.putBoolean("auto_play", z2);
        bundle.putString("auto_play_item", (String) optional.d());
        bundle.putBoolean("key_from_external_uri", z3);
        omj.g(bundle);
        return omj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable an() {
        oma oma = this.a;
        return oma.a.e(a.a(oma.ae_().toString()));
    }

    public static Intent b(Intent intent) {
        return intent.putExtra("open_all_songs_dialog", true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pdq pdq = this.b;
        pdq.f = p();
        pdq.g = viewGroup;
        pds pds = pdq.c;
        if (pds.k == null) {
            pds.k = pds.b.a();
        }
        return pds.k.a(layoutInflater, viewGroup);
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        fzv.a((Fragment) this, (fzq) new fzq() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(vlc vlc, fzn fzn) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void b(vlc vlc, fzn fzn) {
            }

            public final void a(fzn fzn) {
                if (pds.this.m != null) {
                    pds.this.m.a(fzn, null, $$Lambda$pds$1$1Qv0GgHnWMZ6Ua5mJDrDJ77pxQ.INSTANCE, $$Lambda$pds$1$w5KWFJvKZ2212JVwHJearRTLRPc.INSTANCE);
                }
            }

            public final sso ae_() {
                return pds.this.c.ae_();
            }
        }, menu);
    }

    public final void a(boolean z) {
        ((Bundle) fbp.a(this.i)).putBoolean("auto_play", false);
        ((Bundle) fbp.a(this.i)).putBoolean("auto_play_item_found", z);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a((a) new $$Lambda$omj$uXOEMff5x_AZye2jjLoWewoJ3yU(this));
    }

    public final uqm ag() {
        return uqo.az;
    }

    public final Optional<String> ah() {
        return Optional.c(((Bundle) fbp.a(this.i)).getString("auto_play_item"));
    }

    public final boolean ai() {
        return ((Bundle) fbp.a(this.i)).getBoolean("open_all_songs_dialog");
    }

    public final void aj() {
        ((Bundle) fbp.a(this.i)).putBoolean("open_all_songs_dialog", false);
    }

    public final boolean ak() {
        return ((Bundle) fbp.a(this.i)).getBoolean("key_from_external_uri", false);
    }

    public final String al() {
        return ((Bundle) fbp.a(this.i)).getString("key_algotorial_identifier");
    }

    public final void am() {
        ((Bundle) fbp.a(this.i)).remove("key_algotorial_identifier");
    }

    public final void aw_() {
        super.aw_();
        pdq pdq = this.b;
        pdq.h = false;
        pdq.a.a = false;
        pds pds = pdq.c;
        pds.e.clear();
        pds.t = null;
        pds.l = null;
        pds.o = null;
        pds.p = null;
        pds.m = null;
        pds.r = null;
        pds.s = null;
        pds.u = null;
        pds.v = null;
        pds.w = null;
        pds.x = null;
        pds.y = null;
        pds.f = null;
        pds.g = null;
        pds.h = null;
        pds.i = null;
        pds.j = null;
        pds.d.a(null);
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        c(true);
        super.b(bundle);
    }

    public final boolean c() {
        return ((Bundle) fbp.a(this.i)).getBoolean("auto_play", false);
    }

    public final String e() {
        return "android-spotlet-free-tier-playlist";
    }

    public fqn getFlags() {
        return fqo.a((Fragment) this);
    }
}
