package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f;

/* renamed from: qzs reason: default package */
public final class qzs implements kjd<MusicPagesModel, qwj> {
    /* access modifiers changed from: private */
    public static final a a = $$Lambda$qzs$kPeBlI1aNB5RtFlws1DQMTDjDA.INSTANCE;
    private final Context b;
    private final sih c;
    private final jpb d;
    private final kxg e;
    private final qzx f;
    private final jmd g;
    private a h;
    private a i;
    private a j;

    /* renamed from: qzs$a */
    interface a {
        void onAccessoryClicked(MusicItem musicItem, int i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(MusicItem musicItem, int i2) {
    }

    public qzs(Context context, kxg kxg, jpb jpb, sih sih, qzx qzx, jmd jmd) {
        a aVar = a;
        this.h = aVar;
        this.i = aVar;
        this.j = aVar;
        this.b = context;
        this.e = kxg;
        this.c = sih;
        this.d = jpb;
        this.f = qzx;
        this.g = jmd;
    }

    public final void a(com.spotify.music.freetiercommon.uicomponents.Rows.a aVar, MusicItem musicItem, int i2) {
        SpotifyIconV2 spotifyIconV2;
        SpotifyIconV2 spotifyIconV22;
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        f w = musicItem.w();
        int i3 = 0;
        if (w.c()) {
            boolean a2 = w.a();
            g2.c(a(a2 ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, a2 ? R.attr.pasteColorAccessoryGreen : 0, a2 ? R.string.your_library_music_pages_content_description_track_remove : R.string.your_library_music_pages_content_description_track_add, new $$Lambda$qzs$9WYnNbBPPhOrFBiahMzLu9esgvM(this, musicItem, i2)));
        }
        if (w.d()) {
            if (this.e.a(this.d.b())) {
                spotifyIconV22 = SpotifyIconV2.BLOCK;
                spotifyIconV2 = SpotifyIconV2.BLOCK;
            } else {
                spotifyIconV22 = SpotifyIconV2.BAN;
                spotifyIconV2 = SpotifyIconV2.BAN_ACTIVE;
            }
            boolean b2 = w.b();
            if (b2) {
                spotifyIconV22 = spotifyIconV2;
            }
            if (b2) {
                i3 = R.attr.pasteColorAccessoryRed;
            }
            g2.c(a(spotifyIconV22, i3, b2 ? R.string.your_library_music_pages_content_description_track_unban : R.string.your_library_music_pages_content_description_track_ban, new $$Lambda$qzs$MtngI2ji7CPefhEbMJHInKJ6_nA(this, musicItem, i2)));
        }
        g2.c(a(musicItem));
        aVar.a(g2.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(MusicItem musicItem, int i2, View view) {
        this.h.onAccessoryClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(MusicItem musicItem, int i2, View view) {
        this.i.onAccessoryClicked(musicItem, i2);
    }

    public final void a(fqz fqz, MusicItem musicItem, int i2) {
        if (musicItem.a() == Type.ARTIST_TWO_LINES || musicItem.a() == Type.ARTIST) {
            fqz.a(a(musicItem, i2));
            return;
        }
        if (musicItem.a() == Type.ALBUM) {
            fqz.a(b(musicItem, i2));
        }
    }

    public final void a(fqz fqz, MusicItem musicItem) {
        fqz.a(a(musicItem));
    }

    public static void a(fqz fqz) {
        fqz.a(null);
    }

    public final void b(fqz fqz, MusicItem musicItem) {
        View view = fqz.getView();
        view.setOnLongClickListener(this.g);
        view.setTag(R.id.context_menu_tag, new jny(this.f, musicItem));
    }

    public static void b(fqz fqz) {
        View view = fqz.getView();
        view.setOnLongClickListener(null);
        view.setTag(R.id.context_menu_tag, null);
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        b((a) new $$Lambda$qzs$_7jAaRDGHcOCpxAr6dhsmPv2I9M(kkn));
        a((a) new $$Lambda$qzs$jG_Dl76sqmCVUkll5UogELfzz84(kkn));
        this.j = (a) fav.a(new $$Lambda$qzs$Dhto2lG9Y3vUt4Rg0Cb_9Q6SgVQ(kkn), a);
        return new kje<MusicPagesModel>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
                qzs.this.b(qzs.a);
                qzs.this.a(qzs.a);
            }
        };
    }

    private View a(MusicItem musicItem, int i2) {
        Button a2 = a(this.b);
        a2.setText(this.b.getString(R.string.your_library_music_pages_button_label_follow));
        a2.setContentDescription(this.b.getString(R.string.your_library_music_pages_content_description_artist_follow));
        a2.setOnClickListener(new $$Lambda$qzs$FD0WMthdBgYscmDwVwE3rt_D_DM(this, musicItem, i2));
        a2.setEnabled(!musicItem.g());
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.j.onAccessoryClicked(musicItem, i2);
    }

    private View b(MusicItem musicItem, int i2) {
        boolean e2 = musicItem.e();
        return a(e2 ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, e2 ? R.attr.pasteColorAccessoryGreen : 0, e2 ? R.string.your_library_music_pages_content_description_album_unlike : R.string.your_library_music_pages_content_description_album_like, new $$Lambda$qzs$XWPut_CF9dwKBQqs22pFl0hCUo(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.h.onAccessoryClicked(musicItem, i2);
    }

    private View a(MusicItem musicItem) {
        Context context = this.b;
        return joe.a(context, jwz.c(context, SpotifyIconV2.MORE_ANDROID), this.f, musicItem, this.c);
    }

    private View a(SpotifyIconV2 spotifyIconV2, int i2, int i3, OnClickListener onClickListener) {
        Drawable drawable;
        if (i2 != 0) {
            Context context = this.b;
            drawable = jwz.b(context, spotifyIconV2, uuu.d(context, i2));
        } else {
            drawable = jwz.c(this.b, spotifyIconV2);
        }
        ImageButton a2 = jwz.a(this.b, drawable);
        a2.setContentDescription(a2.getResources().getString(i3));
        a2.setOnClickListener(onClickListener);
        return a2;
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.h = (a) fav.a(aVar, a);
    }

    /* access modifiers changed from: private */
    public void b(a aVar) {
        this.i = (a) fav.a(aVar, a);
    }

    private static Button a(Context context) {
        Button b2 = fzz.b(context);
        b2.setBackground(context.getResources().getDrawable(R.drawable.square_accessory_button));
        b2.setGravity(17);
        b2.setMinHeight(uts.c(28.0f, context.getResources()));
        b2.setTextColor(fr.c(context, R.color.glue_button_text));
        uuu.a(context, b2, 2132017678);
        return b2;
    }
}
