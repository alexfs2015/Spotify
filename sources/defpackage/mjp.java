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

/* renamed from: mjp reason: default package */
public class mjp implements mjo, mjv, mjz {
    private static final int a = mjp.class.hashCode();
    private final oog<?> b;
    private final mjs c;
    private final onu d = a.a(this.b);
    private uwh e;
    private final fpt f;
    private final jjf g;
    private final jrp h;
    private final String i;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    public mjp(ooh<tke, vti<jmf<ooa>>> ooh, a aVar, mjt mjt, fpt fpt, jjf jjf, jrp jrp, String str, ItemListConfiguration itemListConfiguration) {
        this.c = new mjs((a) mjt.a(mjt.a.get(), 1), (miy) mjt.a(mjt.b.get(), 2), (ItemListConfiguration) mjt.a(itemListConfiguration, 3));
        this.b = ooh.a(this.c, new $$Lambda$mjp$GULW8_owfWSHLo18rsVGjN6dbKk(this));
        this.f = fpt;
        this.g = jjf;
        this.h = jrp;
        this.i = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jmf f() {
        return this.c;
    }

    public final Completable a() {
        mjs mjs = this.c;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(mjs.e, mjs.b.a()));
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void az_() {
        this.c.a((mjo) this);
    }

    public final void c() {
        this.c.a((mjo) null);
    }

    public final void d() {
        mjs mjs = this.c;
        mjs.a.c();
        mjs.c.a.c();
        mjs.b.b();
    }

    public final void a(uyz uyz, List<uzb> list) {
        this.b.a(list);
        if (miv.b(this.f)) {
            this.e.a(true, RefreshRow.a);
        }
        if (miv.c(this.f)) {
            this.e.a(true, RefreshRowBottom.a);
        }
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, uwh uwh) {
        this.e = uwh;
        if (miv.b(this.f)) {
            RefreshRow a2 = RefreshRow.a(viewGroup.getContext(), null);
            a2.b = this;
            uwh uwh2 = this.e;
            mjy mjy = new mjy(a2, true, this.g, this.h, this.i, "track-row");
            uwh2.a((a<H>) mjy, RefreshRow.a);
        }
        this.e.a(this.b.a(), a);
        if (miv.c(this.f)) {
            RefreshRowBottom a3 = RefreshRowBottom.a(viewGroup.getContext(), null);
            a3.b = this;
            uwh uwh3 = this.e;
            mjy mjy2 = new mjy(a3, true, this.g, this.h, this.i, "track-row-bottom");
            uwh3.a((a<H>) mjy2, RefreshRow.a);
        }
    }

    public final void a(String str, boolean z) {
        this.d.a(str, z);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        this.d.a(itemConfiguration);
    }

    public final void e() {
        mjs mjs = this.c;
        mjs.c.a(mjs.d.a().getUri());
    }
}
