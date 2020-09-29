package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.dailymix.itemlist.RefreshRow;
import com.spotify.music.features.dailymix.itemlist.RefreshRowBottom;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.List;

/* renamed from: moi reason: default package */
public class moi implements moh, moo, mos {
    private static final int a = moi.class.hashCode();
    private final ovm<?> b;
    private final mol c;
    private final ova d = a.a(this.b);
    private vhx e;
    private final fqn f;
    private final jlr g;
    private final jtz h;
    private final String i;

    public moi(ovn<tvw, who<jor<ovg>>> ovn, a aVar, mom mom, fqn fqn, jlr jlr, jtz jtz, String str, ItemListConfiguration itemListConfiguration) {
        this.c = new mol((a) mom.a(mom.a.get(), 1), (mnr) mom.a(mom.b.get(), 2), (ItemListConfiguration) mom.a(itemListConfiguration, 3));
        this.b = ovn.a(this.c, new $$Lambda$moi$RrjPagVGk6vuKnim924UbQpdUX8(this));
        this.f = fqn;
        this.g = jlr;
        this.h = jtz;
        this.i = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jor f() {
        return this.c;
    }

    public final Completable a() {
        mol mol = this.c;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(mol.e, mol.b.a()));
    }

    public final void a(Bundle bundle) {
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, vhx vhx) {
        this.e = vhx;
        if (mno.b(this.f)) {
            RefreshRow a2 = RefreshRow.a(viewGroup.getContext(), null);
            a2.b = this;
            vhx vhx2 = this.e;
            mor mor = new mor(a2, true, this.g, this.h, this.i, "track-row");
            vhx2.a((a<H>) mor, RefreshRow.a);
        }
        this.e.a(this.b.a(), a);
        if (mno.c(this.f)) {
            RefreshRowBottom a3 = RefreshRowBottom.a(viewGroup.getContext(), null);
            a3.b = this;
            vhx vhx3 = this.e;
            mor mor2 = new mor(a3, true, this.g, this.h, this.i, "track-row-bottom");
            vhx3.a((a<H>) mor2, RefreshRow.a);
        }
    }

    public final void a(ItemConfiguration itemConfiguration) {
        this.d.a(itemConfiguration);
    }

    public final void a(String str, boolean z) {
        this.d.a(str, z);
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void a(vlc vlc, List<vle> list) {
        this.b.a(list);
        if (mno.b(this.f)) {
            this.e.a(true, RefreshRow.a);
        }
        if (mno.c(this.f)) {
            this.e.a(true, RefreshRowBottom.a);
        }
    }

    public final void ay_() {
        this.c.a((moh) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.c.a((moh) null);
    }

    public final void d() {
        mol mol = this.c;
        mol.a.c();
        mol.c.a.c();
        mol.b.b();
    }

    public final void e() {
        mol mol = this.c;
        mol.c.a(mol.d.a().getUri());
    }
}
