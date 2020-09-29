package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.freetiercommon.uicomponents.Rows.e;
import com.squareup.picasso.Picasso;

/* renamed from: rch reason: default package */
public final class rch implements rbz, g<Type, MusicItem> {
    private final Context a;
    private final Picasso b;
    private final rim c;
    private final ujc d;
    private final rio e;
    private final rfd f;
    private final Drawable g;
    private String h;
    private a i = $$Lambda$rch$kUtIg0K27RC5c79YUMYLE8bCzU.INSTANCE;
    private b j = $$Lambda$rch$7pdFCWbW8TezUA0MdkTguCGRiw.INSTANCE;

    /* renamed from: rch$a */
    public interface a {
        void onItemClicked(MusicItem musicItem, int i);
    }

    /* renamed from: rch$b */
    public interface b {
        void onItemImageClicked(MusicItem musicItem, int i);
    }

    public rch(Context context, Picasso picasso, rim rim, ujc ujc, rio rio, rfd rfd) {
        this.a = context;
        this.b = picasso;
        this.c = rim;
        this.d = ujc;
        this.e = rio;
        this.f = rfd;
        this.g = frr.a(context);
    }

    /* access modifiers changed from: private */
    public fqy a(ViewGroup viewGroup) {
        fqv.b();
        return fsk.a(viewGroup.getContext(), viewGroup, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(String str, defpackage.rfa.b bVar) {
        return ((!jva.a(str, LinkType.COLLECTION_TRACKS) || !jva.a(bVar.a(), LinkType.COLLECTION_TRACKS)) && !bVar.a().equals(str)) ? "" : bVar.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(String str, c cVar) {
        return ((!jva.a(str, LinkType.COLLECTION_TRACKS) || !jva.a(cVar.a(), LinkType.COLLECTION_TRACKS)) && !cVar.a().equals(str)) ? "" : cVar.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(defpackage.rfa.a aVar) {
        return "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(d dVar) {
        return "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.j.onItemImageClicked(musicItem, i2);
    }

    private void a(fqx fqx, MusicItem musicItem) {
        if (fbo.a(this.h)) {
            fqx.a(false);
        } else {
            fqx.a(musicItem.j().equals(this.h));
        }
    }

    /* access modifiers changed from: private */
    public void a(fqy fqy, MusicItem musicItem, int i2) {
        fsb fsb = (fsb) fqy;
        fsb.a(musicItem.h());
        fsb.b(musicItem.i());
        a(fsb, musicItem);
        vli vli = (vli) jvi.a(musicItem.p(), new f());
        juf.a(this.a, fsb.d(), vli);
        if (vli instanceof defpackage.vli.b) {
            fsb.c(this.a.getString(R.string.your_library_music_pages_row_favorite_songs_downloading));
        }
        this.e.a((frt) fsb, musicItem);
        this.e.b((frt) fsb, musicItem);
        fsb.getView().setOnClickListener(new $$Lambda$rch$MLT1Ij0DQjlggWUaFmA4W2Nnz10(this, musicItem, i2));
        a((fqx) fsb, musicItem);
        fsb.c(a(musicItem));
    }

    private void a(fsb fsb, MusicItem musicItem) {
        TextView d2 = fsb.d();
        if (((Boolean) jvi.a(musicItem.o(), Boolean.TRUE)).booleanValue()) {
            jyw.a(d2, 0, (int) R.id.drawable_group_on_demand);
        } else {
            jyw.a(d2.getContext(), d2, 0, R.id.drawable_group_on_demand, Suppliers.a(this.g));
            d2.setCompoundDrawablePadding(vfj.b(5.0f, d2.getResources()));
        }
        jzb.a(this.a, fsb.d(), musicItem.w().e());
    }

    private boolean a(MusicItem musicItem) {
        f w = musicItem.w();
        return !w.f() || w.b() || (w.e() && ((Boolean) this.f.b.a(Boolean.FALSE)).booleanValue());
    }

    /* access modifiers changed from: private */
    public fqy b(ViewGroup viewGroup) {
        return Rows.a(viewGroup.getContext(), viewGroup);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.i.onItemClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public void b(fqy fqy, MusicItem musicItem, int i2) {
        e eVar = (e) fqz.a(fqy.getView(), e.class);
        boolean a2 = a(musicItem);
        eVar.a(musicItem.h());
        boolean z = false;
        if (TextUtils.isEmpty(musicItem.i())) {
            eVar.d().setVisibility(8);
        } else {
            eVar.d().setVisibility(0);
            eVar.b(musicItem.i());
            a((fsb) eVar, musicItem);
        }
        ImageView c2 = eVar.c();
        Drawable a3 = this.c.a(musicItem);
        wgr a4 = this.b.a(musicItem.u()).b(a3).a(a3);
        if (musicItem.a() == Type.TRACK_SHUFFLE_ONLY) {
            f w = musicItem.w();
            ujc ujc = this.d;
            f w2 = musicItem.w();
            if (w2.f() && (!w2.e() || !((Boolean) this.f.b.a(Boolean.FALSE)).booleanValue())) {
                z = true;
            }
            a4.a((wgx) ujd.a(c2, ujc, z ? w.i() : "", null, a2));
        } else {
            a4.b().a(c2);
        }
        this.e.a((com.spotify.music.freetiercommon.uicomponents.Rows.a) eVar, musicItem, i2);
        this.e.b((frt) eVar, musicItem);
        eVar.getView().setOnClickListener(new $$Lambda$rch$_K5ucE9jgdUF1cE_TkxfoQBQI9w(this, musicItem, i2));
        eVar.c().setOnClickListener(new $$Lambda$rch$cCqTaLbc8fFcu1vDwSZTou0ZM(this, musicItem, i2));
        eVar.c(a2);
        a((fqx) eVar, musicItem);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(MusicItem musicItem, int i2, View view) {
        this.i.onItemClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(MusicItem musicItem, int i2) {
    }

    public final ImmutableList<c<Type, MusicItem>> a() {
        return ImmutableList.a(c.a(ImmutableSet.d(Type.TRACK), new $$Lambda$rch$G6ueuDJjmsYxuxqLQph9pJbiq14(this), new $$Lambda$rch$Z0kd10iGO3zQ3CqK2p6kU0Z4Cs(this)), c.a(ImmutableSet.d(Type.TRACK_SHUFFLE_ONLY), new $$Lambda$rch$GHJ0HXkPDODwx5dVbVTDWI1z7hw(this), new $$Lambda$rch$w4w812hR2JuE8OXMZrzpL78JZRM(this)));
    }

    public final void a(a aVar) {
        this.i = (a) fbm.a(aVar, $$Lambda$rch$NKrocaHfleWENWCxwsPqCk_wexs.INSTANCE);
    }

    public final void a(b bVar) {
        this.j = (b) fbm.a(bVar, $$Lambda$rch$gPVfzNl1R6ctH1ZF0mhd7XlzU8A.INSTANCE);
    }

    public final void a(rfa rfa, String str) {
        this.h = (String) rfa.a(new $$Lambda$rch$nu7py5ZAnB7Q6FpBHVPFK76LGa0(this, str), new $$Lambda$rch$dzdFTrfEdk8gHmQbmBOuYmeE0us(this, str), $$Lambda$rch$E1sgLXwqnz64Xj_YRW5BFbOu4ws.INSTANCE, $$Lambda$rch$yp87358AiSC5R6xoejW8Lufd0ug.INSTANCE);
    }
}
