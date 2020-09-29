package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.squareup.picasso.Picasso;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oav reason: default package */
public class oav implements oau, obb {
    private static int a;
    private static int b;
    private static int c;
    private final ovm<?> d;
    private final oay e;
    private final ova f = defpackage.ova.a.a(this.d);
    /* access modifiers changed from: private */
    public final Context g;
    private final Picasso h;
    private final fqn i;
    private final oaj j;
    private vhx k;
    private oat l;
    private oas m;

    /* renamed from: oav$a */
    class a extends h {
        a() {
        }

        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            super.a(rect, view, recyclerView, sVar);
            int dimension = (int) oav.this.g.getResources().getDimension(R.dimen.artist_card_margins);
            if (RecyclerView.e(view) == 0) {
                rect.left = dimension;
            }
            rect.right = dimension;
        }
    }

    static {
        Class<oav> cls = oav.class;
        a = cls.hashCode();
        b = cls.hashCode() + 1;
        c = cls.hashCode() + 2;
    }

    public oav(defpackage.oak.a aVar, omc omc, defpackage.ova.a aVar2, oaz oaz, Context context, Picasso picasso, fqn fqn, ItemListConfiguration itemListConfiguration, oaj oaj) {
        this.e = new oay((Scheduler) oaz.a(oaz.a.get(), 1), (defpackage.ouo.a) oaz.a(oaz.b.get(), 2), (szp) oaz.a(oaz.c.get(), 3), (ItemListConfiguration) oaz.a(itemListConfiguration, 4));
        this.d = aVar.a(this.e, new $$Lambda$oav$1N_YmdyiJeQ1TOq8Rfp7vBGNyYg(this));
        this.g = context;
        this.h = picasso;
        this.i = fqn;
        this.j = oaj;
        omc.b(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jor e() {
        return this.e;
    }

    public final Completable a() {
        oay oay = this.e;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(oay.c, oay.b.a()));
    }

    public final void a(Bundle bundle) {
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, vhx vhx) {
        this.k = vhx;
        RecyclerView recyclerView = new RecyclerView(this.g);
        this.m = new oas();
        recyclerView.a((androidx.recyclerview.widget.RecyclerView.a) this.m);
        recyclerView.a((i) new LinearLayoutManager(0, false));
        vhx.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(recyclerView), c);
        RecyclerView recyclerView2 = new RecyclerView(this.g);
        this.l = new oat(this.h, this.i, this.e);
        recyclerView2.a((androidx.recyclerview.widget.RecyclerView.a) this.l);
        recyclerView2.a((i) new LinearLayoutManager(0, false));
        recyclerView2.a((h) new a(), -1);
        vhx.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(recyclerView2), b);
        vhx.a(this.d.a(), a);
        if (this.j.a()) {
            this.k.a(false, a);
            return;
        }
        this.k.a(false, c);
        this.k.a(false, b);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        this.f.a(itemConfiguration);
    }

    public final void a(String str, boolean z) {
        this.f.a(str, z);
    }

    public final void a(defpackage.omg.a aVar) {
        this.e.a(aVar);
    }

    public final void a(vlc vlc, List<vle> list) {
        this.d.a(list);
        ArrayList arrayList = new ArrayList();
        for (vle vle : list) {
            if (!vle.c().isEmpty()) {
                arrayList.add(vle.c());
            }
        }
        this.l.a = arrayList;
    }

    public final void ay_() {
        this.e.a((oau) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.e.a((oau) null);
    }

    public final void d() {
        oay oay = this.e;
        oay.a.c();
        oay.b.b();
    }
}
