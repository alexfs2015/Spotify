package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
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

/* renamed from: rcd reason: default package */
public final class rcd implements rbz, g<Type, MusicItem> {
    public a a;
    private final Context b;
    private final Picasso c;
    private final rim d;
    private final Drawable e;
    private final rio f;
    private final boolean g = false;
    private final boolean h;
    private final boolean i;
    private String j;
    private hfv k;

    /* renamed from: rcd$a */
    public interface a {
        void onItemClicked(MusicItem musicItem, int i);
    }

    public rcd(rbg rbg, Context context, Picasso picasso, rim rim, rio rio) {
        this.b = context;
        this.c = picasso;
        this.d = rim;
        this.f = rio;
        this.e = frr.a(context);
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_CONTEXT_MENU_ACCESSORY_FOR_ENTITIES;
        DebugFlag debugFlag2 = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_CONTEXT_MENU_ACCESSORY_FOR_ENTITIES;
        this.h = false;
        DebugFlag debugFlag3 = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_CONTEXT_MENU_ACCESSORY_FOR_ENTITIES;
        this.i = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(this.b.getResources(), bitmap);
    }

    /* access modifiers changed from: private */
    public fqy a(ViewGroup viewGroup) {
        return Rows.a(viewGroup.getContext(), viewGroup, 64, 8);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(defpackage.rfa.a aVar) {
        return "";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(d dVar) {
        return "";
    }

    private void a(ImageView imageView, MusicItem musicItem) {
        Drawable a2 = this.d.a(musicItem);
        wgr a3 = this.c.a(musicItem.u()).b(a2).a(a2);
        if (musicItem.a() == Type.ARTIST || musicItem.a() == Type.ARTIST_TWO_LINES || musicItem.a() == Type.GROUP_HEADER_ARTIST) {
            a3.a(vhj.a(imageView));
        } else {
            a3.a(vhj.a(imageView, (vfk) new $$Lambda$rcd$tdhTJnC5dgUrIYvqL7j_NfvLle0(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.a.onItemClicked(musicItem, i2);
    }

    private void a(fqx fqx, MusicItem musicItem) {
        if (fbo.a(this.j)) {
            fqx.a(false);
        } else if (musicItem.a() == Type.PLAYLIST) {
            fqx.a(new hfv(musicItem.j()).equals(this.k));
        } else {
            fqx.a(musicItem.j().equals(this.j));
        }
    }

    /* access modifiers changed from: private */
    public void a(fqy fqy, MusicItem musicItem, int i2) {
        b bVar = (b) fqy;
        jm.a(bVar.b(), 2132017669);
        bVar.a(musicItem.h());
        a(bVar.c(), musicItem);
        bVar.getView().setOnClickListener(new $$Lambda$rcd$6bV8C28uuedbzAUts0fbAJP8JiY(this, musicItem, i2));
        a((frt) bVar, musicItem, i2);
        bVar.c(!musicItem.d());
        bVar.c().setImageAlpha(musicItem.d() ? 255 : 128);
        a((fqx) bVar, musicItem);
    }

    private void a(frt frt, MusicItem musicItem, int i2) {
        if (a(musicItem)) {
            this.f.a(frt, musicItem, i2);
        } else if (b(musicItem)) {
            this.f.a(frt, musicItem);
        } else {
            rio.a(frt);
        }
        if (c(musicItem)) {
            this.f.b(frt, musicItem);
        } else {
            rio.b(frt);
        }
    }

    private static boolean a(MusicItem musicItem) {
        Type c2 = musicItem.a();
        return (c2 == Type.ARTIST || c2 == Type.ARTIST_TWO_LINES || c2 == Type.ALBUM) && musicItem.f();
    }

    /* access modifiers changed from: private */
    public fqy b(ViewGroup viewGroup) {
        return Rows.b(viewGroup.getContext(), viewGroup, 64, 8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.a.onItemClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public void b(fqy fqy, MusicItem musicItem, int i2) {
        c cVar = (c) fqy;
        cVar.a(musicItem.h());
        jm.a(cVar.b(), 2132017669);
        cVar.b(musicItem.i());
        TextView d2 = cVar.d();
        if (((Boolean) jvi.a(musicItem.o(), Boolean.TRUE)).booleanValue()) {
            jyw.a(d2, 0, (int) R.id.drawable_group_on_demand);
        } else {
            jyw.a(d2.getContext(), d2, 0, R.id.drawable_group_on_demand, Suppliers.a(this.e));
            d2.setCompoundDrawablePadding(vfj.b(5.0f, d2.getResources()));
        }
        a(cVar.c(), musicItem);
        vli vli = (vli) jvi.a(musicItem.p(), new f());
        juf.a(this.b, cVar.d(), vli);
        if (vli instanceof b) {
            int i3 = ((b) vli).a;
            cVar.c(this.b.getString(R.string.header_downloading_progress, new Object[]{Integer.valueOf(i3)}));
        } else if (vli instanceof h) {
            cVar.c(this.b.getString(R.string.header_download_waiting));
        }
        cVar.getView().setOnClickListener(new $$Lambda$rcd$WLg8pGOZeXxBXoaXZsztpU1iq0(this, musicItem, i2));
        a((frt) cVar, musicItem, i2);
        cVar.c(!musicItem.d());
        a((fqx) cVar, musicItem);
    }

    private boolean b(MusicItem musicItem) {
        Type c2 = musicItem.a();
        return (c2 == Type.PLAYLIST && this.g) || ((c2 == Type.ARTIST || c2 == Type.ARTIST_TWO_LINES) && this.h) || (c2 == Type.ALBUM && this.i);
    }

    private static boolean c(MusicItem musicItem) {
        Type c2 = musicItem.a();
        return c2 == Type.PLAYLIST || c2 == Type.ARTIST || c2 == Type.ARTIST_TWO_LINES || c2 == Type.ALBUM;
    }

    public final ImmutableList<c<Type, MusicItem>> a() {
        return ImmutableList.a(c.a(ImmutableSet.d(Type.ARTIST), new $$Lambda$rcd$6i5aRzzEYyRaRcnYunoE24G80Ew(this), new $$Lambda$rcd$IpsNLYtZ7DGloHLaxFfX8Qn8W64(this)), c.a(ImmutableSet.a(Type.ALBUM, Type.ARTIST_TWO_LINES, Type.PLAYLIST, Type.FOLDER, Type.FAVORITE_SONGS_EMPTY, Type.FAVORITE_SONGS, Type.BANNED_ARTISTS, Type.BANNED_TRACKS), new $$Lambda$rcd$TiI9dkGmIrkY2n24D5HG5L7Lto(this), new $$Lambda$rcd$wP91tobg2PSyK9piT3iFcNVwZvI(this)));
    }

    public final void a(rfa rfa, String str) {
        this.j = (String) rfa.a($$Lambda$DxudHN_Vuwh2QJiJxUXQ1Ey0bY.INSTANCE, $$Lambda$RHBg2B7AZHVsxPTIW9LqaUu6g.INSTANCE, $$Lambda$rcd$YjYZuMeo7crHzg2x52wgn0zfzjY.INSTANCE, $$Lambda$rcd$o8tN_hYmdkcRFfWVdw0iKvdWZJk.INSTANCE);
        this.k = new hfv(this.j);
    }
}
