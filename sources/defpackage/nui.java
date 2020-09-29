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

/* renamed from: nui reason: default package */
public class nui implements nuh, nuo {
    private static int a;
    private static int b;
    private static int c;
    private final oog<?> d;
    private final nul e;
    private final onu f = defpackage.onu.a.a(this.d);
    /* access modifiers changed from: private */
    public final Context g;
    private final Picasso h;
    private final fpt i;
    private final ntw j;
    private uwh k;
    private nug l;
    private nuf m;

    /* renamed from: nui$a */
    class a extends h {
        a() {
        }

        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            super.a(rect, view, recyclerView, sVar);
            int dimension = (int) nui.this.g.getResources().getDimension(R.dimen.artist_card_margins);
            if (RecyclerView.e(view) == 0) {
                rect.left = dimension;
            }
            rect.right = dimension;
        }
    }

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    static {
        Class<nui> cls = nui.class;
        a = cls.hashCode();
        b = cls.hashCode() + 1;
        c = cls.hashCode() + 2;
    }

    public nui(defpackage.ntx.a aVar, oew oew, defpackage.onu.a aVar2, num num, Context context, Picasso picasso, fpt fpt, ItemListConfiguration itemListConfiguration, ntw ntw) {
        this.e = new nul((Scheduler) num.a(num.a.get(), 1), (defpackage.oni.a) num.a(num.b.get(), 2), (spi) num.a(num.c.get(), 3), (ItemListConfiguration) num.a(itemListConfiguration, 4));
        this.d = aVar.a(this.e, new $$Lambda$nui$3j8JaIy3YZaBhxuJhYnIwyfVH8k(this));
        this.g = context;
        this.h = picasso;
        this.i = fpt;
        this.j = ntw;
        oew.a(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jmf e() {
        return this.e;
    }

    public final Completable a() {
        nul nul = this.e;
        return Completable.b((Iterable<? extends CompletableSource>) ImmutableList.a(nul.c, nul.b.a()));
    }

    public final void a(defpackage.ofc.a aVar) {
        this.e.a(aVar);
    }

    public final void az_() {
        this.e.a((nuh) this);
    }

    public final void c() {
        this.e.a((nuh) null);
    }

    public final void d() {
        nul nul = this.e;
        nul.a.c();
        nul.b.b();
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, uwh uwh) {
        this.k = uwh;
        RecyclerView recyclerView = new RecyclerView(this.g);
        this.m = new nuf();
        recyclerView.a((androidx.recyclerview.widget.RecyclerView.a) this.m);
        recyclerView.a((i) new LinearLayoutManager(0, false));
        uwh.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(recyclerView), c);
        RecyclerView recyclerView2 = new RecyclerView(this.g);
        this.l = new nug(this.h, this.i, this.e);
        recyclerView2.a((androidx.recyclerview.widget.RecyclerView.a) this.l);
        recyclerView2.a((i) new LinearLayoutManager(0, false));
        recyclerView2.a((h) new a(), -1);
        uwh.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(recyclerView2), b);
        uwh.a(this.d.a(), a);
        if (this.j.a()) {
            this.k.a(false, a);
            return;
        }
        this.k.a(false, c);
        this.k.a(false, b);
    }

    public final void a(uyz uyz, List<uzb> list) {
        this.d.a(list);
        ArrayList arrayList = new ArrayList();
        for (uzb uzb : list) {
            if (!uzb.c().isEmpty()) {
                arrayList.add(uzb.c());
            }
        }
        this.l.a = arrayList;
    }

    public final void a(String str, boolean z) {
        this.f.a(str, z);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        this.f.a(itemConfiguration);
    }
}
