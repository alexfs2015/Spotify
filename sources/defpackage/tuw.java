package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.List;

/* renamed from: tuw reason: default package */
public final class tuw implements tuv, tvc {
    private static int a = tuw.class.hashCode();
    private final ovm<tvd> b;
    private final tuz c;
    private final ova d = a.a(this.b);
    private vhx e;

    public tuw(a aVar, omc omc, a aVar2, tva tva, ItemListConfiguration itemListConfiguration) {
        tuz tuz = new tuz((a) tva.a(tva.a.get(), 1), (hhc) tva.a(tva.b.get(), 2), (a) tva.a(tva.c.get(), 3), (rkc) tva.a(tva.d.get(), 4), (String) tva.a(tva.e.get(), 5), (ItemListConfiguration) tva.a(itemListConfiguration, 6));
        this.c = tuz;
        this.b = aVar.a(this.c, new $$Lambda$tuw$U7GCW23FMtNadoM_EfsXYSMW_DI(this));
        omc.b(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jor e() {
        return this.c;
    }

    public final Completable a() {
        tuz tuz = this.c;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(tuz.d, tuz.c.a()));
    }

    public final void a(Bundle bundle) {
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, vhx vhx) {
        this.e = vhx;
        vhx.a(this.b.a(), a);
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
        this.e.a(true, a);
    }

    public final void ay_() {
        this.c.a((tuv) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.c.a((tuv) null);
    }

    public final void d() {
        tuz tuz = this.c;
        tuz.a.c();
        tuz.b.a();
        tuz.c.b();
    }
}
