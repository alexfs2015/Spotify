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

/* renamed from: qts reason: default package */
public final class qts implements qtk, g<Type, MusicItem> {
    private final Context a;
    private final Picasso b;
    private final qzq c;
    private final twz d;
    private final qzs e;
    private final qwo f;
    private final Drawable g;
    private String h;
    private a i = $$Lambda$qts$CF6qn_opjHGASk6qmS4VVzSjRs.INSTANCE;
    private b j = $$Lambda$qts$Mpk5Iojjb9vjvzX8wHI0o62GGA4.INSTANCE;

    /* renamed from: qts$a */
    public interface a {
        void onItemClicked(MusicItem musicItem, int i);
    }

    /* renamed from: qts$b */
    public interface b {
        void onItemImageClicked(MusicItem musicItem, int i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(defpackage.qwl.a aVar) {
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
    public static /* synthetic */ void b(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(MusicItem musicItem, int i2) {
    }

    public qts(Context context, Picasso picasso, qzq qzq, twz twz, qzs qzs, qwo qwo) {
        this.a = context;
        this.b = picasso;
        this.c = qzq;
        this.d = twz;
        this.e = qzs;
        this.f = qwo;
        this.g = fqx.a(context);
    }

    public final void a(a aVar) {
        this.i = (a) fav.a(aVar, $$Lambda$qts$hCgyfQ5ahTDzdrpFQt_afB9ILdw.INSTANCE);
    }

    public final void a(b bVar) {
        this.j = (b) fav.a(bVar, $$Lambda$qts$kJHvZ6lRNRhAS_zVzaWbR4dWYxA.INSTANCE);
    }

    public final ImmutableList<c<Type, MusicItem>> a() {
        return ImmutableList.a(c.a(ImmutableSet.d(Type.TRACK), new $$Lambda$qts$pHkNBuZkszmVMdjWl4OU5VulMbs(this), new $$Lambda$qts$IqcsIEqPgOxoEgRFbyvDBPxeBmg(this)), c.a(ImmutableSet.d(Type.TRACK_SHUFFLE_ONLY), new $$Lambda$qts$DglofC__f9Safwa45anELc2twA8(this), new $$Lambda$qts$SpBFfPI7EamvWALqTXTiQ9TKc(this)));
    }

    /* access modifiers changed from: private */
    public fqe a(ViewGroup viewGroup) {
        fqb.b();
        return frq.a(viewGroup.getContext(), viewGroup, false);
    }

    /* access modifiers changed from: private */
    public void a(fqe fqe, MusicItem musicItem, int i2) {
        frh frh = (frh) fqe;
        frh.a(musicItem.h());
        frh.b(musicItem.i());
        a(frh, musicItem);
        uzf uzf = (uzf) jtc.a(musicItem.p(), new f());
        jrv.a(this.a, frh.d(), uzf);
        if (uzf instanceof defpackage.uzf.b) {
            frh.c(this.a.getString(R.string.your_library_music_pages_row_favorite_songs_downloading));
        }
        this.e.a((fqz) frh, musicItem);
        this.e.b((fqz) frh, musicItem);
        frh.getView().setOnClickListener(new $$Lambda$qts$6S_r1ElRqgwrbXEfFiuG9b0yG9w(this, musicItem, i2));
        a((fqd) frh, musicItem);
        frh.c(a(musicItem));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(MusicItem musicItem, int i2, View view) {
        this.i.onItemClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public fqe b(ViewGroup viewGroup) {
        return Rows.a(viewGroup.getContext(), viewGroup);
    }

    /* access modifiers changed from: private */
    public void b(fqe fqe, MusicItem musicItem, int i2) {
        e eVar = (e) fqf.a(fqe.getView(), e.class);
        boolean a2 = a(musicItem);
        eVar.a(musicItem.h());
        boolean z = false;
        if (TextUtils.isEmpty(musicItem.i())) {
            eVar.d().setVisibility(8);
        } else {
            eVar.d().setVisibility(0);
            eVar.b(musicItem.i());
            a((frh) eVar, musicItem);
        }
        ImageView c2 = eVar.c();
        Drawable a3 = this.c.a(musicItem);
        vsl a4 = this.b.a(musicItem.u()).b(a3).a(a3);
        if (musicItem.a() == Type.TRACK_SHUFFLE_ONLY) {
            f w = musicItem.w();
            twz twz = this.d;
            f w2 = musicItem.w();
            if (w2.f() && (!w2.e() || !((Boolean) this.f.b.a(Boolean.FALSE)).booleanValue())) {
                z = true;
            }
            a4.a((vsr) txa.a(c2, twz, z ? w.i() : "", null, a2));
        } else {
            a4.b().a(c2);
        }
        this.e.a((com.spotify.music.freetiercommon.uicomponents.Rows.a) eVar, musicItem, i2);
        this.e.b((fqz) eVar, musicItem);
        eVar.getView().setOnClickListener(new $$Lambda$qts$TGoUb5SE0F30QZjYeaHFPkzjXY(this, musicItem, i2));
        eVar.c().setOnClickListener(new $$Lambda$qts$k3i6_kVheqh8L46rm_CX7tiFAts(this, musicItem, i2));
        eVar.c(a2);
        a((fqd) eVar, musicItem);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.i.onItemClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.j.onItemImageClicked(musicItem, i2);
    }

    private void a(fqd fqd, MusicItem musicItem) {
        if (fax.a(this.h)) {
            fqd.a(false);
        } else {
            fqd.a(musicItem.j().equals(this.h));
        }
    }

    private boolean a(MusicItem musicItem) {
        f w = musicItem.w();
        return !w.f() || w.b() || (w.e() && ((Boolean) this.f.b.a(Boolean.FALSE)).booleanValue());
    }

    private void a(frh frh, MusicItem musicItem) {
        TextView d2 = frh.d();
        if (((Boolean) jtc.a(musicItem.o(), Boolean.TRUE)).booleanValue()) {
            jwu.a(d2, 0, (int) R.id.drawable_group_on_demand);
        } else {
            jwu.a(d2.getContext(), d2, 0, R.id.drawable_group_on_demand, Suppliers.a(this.g));
            d2.setCompoundDrawablePadding(uts.b(5.0f, d2.getResources()));
        }
        jxb.a(this.a, frh.d(), musicItem.w().e());
    }

    public final void a(qwl qwl, String str) {
        this.h = (String) qwl.a(new $$Lambda$qts$6ALoJLJg2kPUqsjFEBKh6wButA8(this, str), new $$Lambda$qts$b3yg_X1zzAldn_pRr8sQRoi_e90(this, str), $$Lambda$qts$xU0VKA1QL2M_Cur7NDVqrybCCTI.INSTANCE, $$Lambda$qts$goAF0Uu3yq7Nntv33xZPu6oZUB4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(String str, defpackage.qwl.b bVar) {
        return ((!jst.a(str, LinkType.COLLECTION_TRACKS) || !jst.a(bVar.a(), LinkType.COLLECTION_TRACKS)) && !bVar.a().equals(str)) ? "" : bVar.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(String str, c cVar) {
        return ((!jst.a(str, LinkType.COLLECTION_TRACKS) || !jst.a(cVar.a(), LinkType.COLLECTION_TRACKS)) && !cVar.a().equals(str)) ? "" : cVar.a;
    }
}
