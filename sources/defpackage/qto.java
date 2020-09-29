package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.freetiercommon.uicomponents.Rows.b;
import com.spotify.music.freetiercommon.uicomponents.Rows.c;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.squareup.picasso.Picasso;

/* renamed from: qto reason: default package */
public final class qto implements qtk, g<Type, MusicItem> {
    public a a;
    private final Context b;
    private final Picasso c;
    private final qzq d;
    private final Drawable e;
    private final Typeface f;
    private final qzs g;
    private final boolean h = false;
    private final boolean i;
    private final boolean j;
    private String k;
    private hcz l;

    /* renamed from: qto$a */
    public interface a {
        void onItemClicked(MusicItem musicItem, int i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(defpackage.qwl.a aVar) {
        return "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(d dVar) {
        return "";
    }

    public qto(qsr qsr, Context context, Picasso picasso, qzq qzq, qzs qzs) {
        this.b = context;
        this.c = picasso;
        this.d = qzq;
        this.g = qzs;
        this.e = fqx.a(context);
        this.f = utw.a(context, 2132017666);
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_CONTEXT_MENU_ACCESSORY_FOR_ENTITIES;
        DebugFlag debugFlag2 = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_CONTEXT_MENU_ACCESSORY_FOR_ENTITIES;
        this.i = false;
        DebugFlag debugFlag3 = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_CONTEXT_MENU_ACCESSORY_FOR_ENTITIES;
        this.j = false;
    }

    public final ImmutableList<c<Type, MusicItem>> a() {
        return ImmutableList.a(c.a(ImmutableSet.d(Type.ARTIST), new $$Lambda$qto$7AsA2hrde3rsVwHNM1z7uHCn8xc(this), new $$Lambda$qto$YF1vn91rBepR13S9unFUJnBgGwk(this)), c.a(ImmutableSet.a(Type.ALBUM, Type.ARTIST_TWO_LINES, Type.PLAYLIST, Type.FOLDER, Type.FAVORITE_SONGS_EMPTY, Type.FAVORITE_SONGS, Type.BANNED_ARTISTS, Type.BANNED_TRACKS), new $$Lambda$qto$XwLyR0DZUpGpG1nrC6UL8PR6CVU(this), new $$Lambda$qto$sbuoy6i8GseJ8gDU9DBCeUyN9dc(this)));
    }

    /* access modifiers changed from: private */
    public fqe a(ViewGroup viewGroup) {
        return Rows.a(viewGroup.getContext(), viewGroup, 64, 8);
    }

    /* access modifiers changed from: private */
    public void a(fqe fqe, MusicItem musicItem, int i2) {
        b bVar = (b) fqe;
        bVar.b().setTypeface(this.f);
        bVar.a(musicItem.h());
        a(bVar.c(), musicItem);
        bVar.getView().setOnClickListener(new $$Lambda$qto$uWTfzkWrj8LXUUbvJQciPGbPcrw(this, musicItem, i2));
        a((fqz) bVar, musicItem, i2);
        bVar.c(!musicItem.d());
        bVar.c().setImageAlpha(musicItem.d() ? 255 : 128);
        a((fqd) bVar, musicItem);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.a.onItemClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public fqe b(ViewGroup viewGroup) {
        return Rows.b(viewGroup.getContext(), viewGroup, 64, 8);
    }

    /* access modifiers changed from: private */
    public void b(fqe fqe, MusicItem musicItem, int i2) {
        c cVar = (c) fqe;
        cVar.a(musicItem.h());
        cVar.b().setTypeface(this.f);
        cVar.b(musicItem.i());
        TextView d2 = cVar.d();
        if (((Boolean) jtc.a(musicItem.o(), Boolean.TRUE)).booleanValue()) {
            jwu.a(d2, 0, (int) R.id.drawable_group_on_demand);
        } else {
            jwu.a(d2.getContext(), d2, 0, R.id.drawable_group_on_demand, Suppliers.a(this.e));
            d2.setCompoundDrawablePadding(uts.b(5.0f, d2.getResources()));
        }
        a(cVar.c(), musicItem);
        uzf uzf = (uzf) jtc.a(musicItem.p(), new f());
        jrv.a(this.b, cVar.d(), uzf);
        if (uzf instanceof b) {
            int i3 = ((b) uzf).a;
            cVar.c(this.b.getString(R.string.header_downloading_progress, new Object[]{Integer.valueOf(i3)}));
        } else if (uzf instanceof h) {
            cVar.c(this.b.getString(R.string.header_download_waiting));
        }
        cVar.getView().setOnClickListener(new $$Lambda$qto$8BShvNWKA_MH8JWEhlmppKKSHg(this, musicItem, i2));
        a((fqz) cVar, musicItem, i2);
        cVar.c(!musicItem.d());
        a((fqd) cVar, musicItem);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.a.onItemClicked(musicItem, i2);
    }

    private void a(fqz fqz, MusicItem musicItem, int i2) {
        if (a(musicItem)) {
            this.g.a(fqz, musicItem, i2);
        } else if (b(musicItem)) {
            this.g.a(fqz, musicItem);
        } else {
            qzs.a(fqz);
        }
        if (c(musicItem)) {
            this.g.b(fqz, musicItem);
        } else {
            qzs.b(fqz);
        }
    }

    private static boolean a(MusicItem musicItem) {
        Type c2 = musicItem.a();
        return (c2 == Type.ARTIST || c2 == Type.ARTIST_TWO_LINES || c2 == Type.ALBUM) && musicItem.f();
    }

    private boolean b(MusicItem musicItem) {
        Type c2 = musicItem.a();
        return (c2 == Type.PLAYLIST && this.h) || ((c2 == Type.ARTIST || c2 == Type.ARTIST_TWO_LINES) && this.i) || (c2 == Type.ALBUM && this.j);
    }

    private static boolean c(MusicItem musicItem) {
        Type c2 = musicItem.a();
        return c2 == Type.PLAYLIST || c2 == Type.ARTIST || c2 == Type.ARTIST_TWO_LINES || c2 == Type.ALBUM;
    }

    private void a(fqd fqd, MusicItem musicItem) {
        if (fax.a(this.k)) {
            fqd.a(false);
        } else if (musicItem.a() == Type.PLAYLIST) {
            fqd.a(new hcz(musicItem.j()).equals(this.l));
        } else {
            fqd.a(musicItem.j().equals(this.k));
        }
    }

    private void a(ImageView imageView, MusicItem musicItem) {
        Drawable a2 = this.d.a(musicItem);
        vsl a3 = this.c.a(musicItem.u()).b(a2).a(a2);
        if (musicItem.a() == Type.ARTIST || musicItem.a() == Type.ARTIST_TWO_LINES || musicItem.a() == Type.GROUP_HEADER_ARTIST) {
            a3.a(uvt.a(imageView));
        } else {
            a3.a(uvt.a(imageView, (utt) new $$Lambda$qto$VxjMmYQOQQ9yMsGWqhg6bI8Py7Q(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(this.b.getResources(), bitmap);
    }

    public final void a(qwl qwl, String str) {
        this.k = (String) qwl.a($$Lambda$cfI8ZHJGCNkm18t8NKxxZRtw88.INSTANCE, $$Lambda$_52SXrUa933nLV3tHYgB2uxTNew.INSTANCE, $$Lambda$qto$Qg0ygPHKg6pRolGqcwn0y2BDPw.INSTANCE, $$Lambda$qto$WOPK0ebgmQX9IWiW8hsurS3hMc.INSTANCE);
        this.l = new hcz(this.k);
    }
}
