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

/* renamed from: rio reason: default package */
public final class rio implements kmm<MusicPagesModel, rey> {
    /* access modifiers changed from: private */
    public static final a a = $$Lambda$rio$29hqB3yk9d6JoRLGzD97qGNK9zg.INSTANCE;
    private final Context b;
    private final sso c;
    private final jrn d;
    private final lap e;
    private final rit f;
    private final jop g;
    private a h;
    private a i;
    private a j;

    /* renamed from: rio$a */
    interface a {
        void onAccessoryClicked(MusicItem musicItem, int i);
    }

    public rio(Context context, lap lap, jrn jrn, sso sso, rit rit, jop jop) {
        a aVar = a;
        this.h = aVar;
        this.i = aVar;
        this.j = aVar;
        this.b = context;
        this.e = lap;
        this.c = sso;
        this.d = jrn;
        this.f = rit;
        this.g = jop;
    }

    private View a(SpotifyIconV2 spotifyIconV2, int i2, int i3, OnClickListener onClickListener) {
        Drawable drawable;
        if (i2 != 0) {
            Context context = this.b;
            drawable = jyz.b(context, spotifyIconV2, vgl.d(context, i2));
        } else {
            drawable = jyz.c(this.b, spotifyIconV2);
        }
        ImageButton a2 = jyz.a(this.b, drawable);
        a2.setContentDescription(a2.getResources().getString(i3));
        a2.setOnClickListener(onClickListener);
        return a2;
    }

    private View a(MusicItem musicItem) {
        Context context = this.b;
        return jqq.a(context, jyz.c(context, SpotifyIconV2.MORE_ANDROID), this.f, musicItem, this.c);
    }

    private View a(MusicItem musicItem, int i2) {
        Button a2 = a(this.b);
        a2.setText(this.b.getString(R.string.your_library_music_pages_button_label_follow));
        a2.setContentDescription(this.b.getString(R.string.your_library_music_pages_content_description_artist_follow));
        a2.setOnClickListener(new $$Lambda$rio$aaI7zkMa2c8H05rbHOQGagDR3c(this, musicItem, i2));
        a2.setEnabled(!musicItem.g());
        return a2;
    }

    private static Button a(Context context) {
        Button b2 = gat.b(context);
        b2.setBackground(context.getResources().getDrawable(R.drawable.square_accessory_button));
        b2.setGravity(17);
        b2.setMinHeight(vfj.c(28.0f, context.getResources()));
        b2.setTextColor(fr.c(context, R.color.glue_button_text));
        vgl.a(context, b2, 2132017681);
        return b2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MusicItem musicItem, int i2, View view) {
        this.h.onAccessoryClicked(musicItem, i2);
    }

    public static void a(frt frt) {
        frt.a(null);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.h = (a) fbm.a(aVar, a);
    }

    private View b(MusicItem musicItem, int i2) {
        boolean e2 = musicItem.e();
        return a(e2 ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, e2 ? R.attr.pasteColorAccessoryGreen : 0, e2 ? R.string.your_library_music_pages_content_description_album_unlike : R.string.your_library_music_pages_content_description_album_like, new $$Lambda$rio$njXtxEXWBEyEHf0qerNwAyj8LEQ(this, musicItem, i2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(MusicItem musicItem, int i2, View view) {
        this.j.onAccessoryClicked(musicItem, i2);
    }

    public static void b(frt frt) {
        View view = frt.getView();
        view.setOnLongClickListener(null);
        view.setTag(R.id.context_menu_tag, null);
    }

    /* access modifiers changed from: private */
    public void b(a aVar) {
        this.i = (a) fbm.a(aVar, a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(MusicItem musicItem, int i2) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(MusicItem musicItem, int i2, View view) {
        this.i.onAccessoryClicked(musicItem, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(MusicItem musicItem, int i2, View view) {
        this.h.onAccessoryClicked(musicItem, i2);
    }

    public final void a(com.spotify.music.freetiercommon.uicomponents.Rows.a aVar, MusicItem musicItem, int i2) {
        SpotifyIconV2 spotifyIconV2;
        SpotifyIconV2 spotifyIconV22;
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        f w = musicItem.w();
        int i3 = 0;
        if (w.c()) {
            boolean a2 = w.a();
            g2.c(a(a2 ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, a2 ? R.attr.pasteColorAccessoryGreen : 0, a2 ? R.string.your_library_music_pages_content_description_track_remove : R.string.your_library_music_pages_content_description_track_add, new $$Lambda$rio$aDb8QArzhws7NuXMMeBrvhJtRlY(this, musicItem, i2)));
        }
        if (w.d()) {
            if (this.e.a(this.d.d())) {
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
            g2.c(a(spotifyIconV22, i3, b2 ? R.string.your_library_music_pages_content_description_track_unban : R.string.your_library_music_pages_content_description_track_ban, new $$Lambda$rio$cylfdMFfcjw5SMB6DqnG6iCiek(this, musicItem, i2)));
        }
        g2.c(a(musicItem));
        aVar.a(g2.a());
    }

    public final void a(frt frt, MusicItem musicItem) {
        frt.a(a(musicItem));
    }

    public final void a(frt frt, MusicItem musicItem, int i2) {
        if (musicItem.a() == Type.ARTIST_TWO_LINES || musicItem.a() == Type.ARTIST) {
            frt.a(a(musicItem, i2));
            return;
        }
        if (musicItem.a() == Type.ALBUM) {
            frt.a(b(musicItem, i2));
        }
    }

    public final void b(frt frt, MusicItem musicItem) {
        View view = frt.getView();
        view.setOnLongClickListener(this.g);
        view.setTag(R.id.context_menu_tag, new jqk(this.f, musicItem));
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        b((a) new $$Lambda$rio$KACTZqW7HW0cedvHWsQLp6BYIpk(knw));
        a((a) new $$Lambda$rio$BjJQoWgvQUnPkL6QjSeBpgjv9Tw(knw));
        this.j = (a) fbm.a(new $$Lambda$rio$wDNmDSYXSV5znTPznsxfSI9aizE(knw), a);
        return new kmn<MusicPagesModel>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }

            public final void dispose() {
                rio.this.b(rio.a);
                rio.this.a(rio.a);
            }
        };
    }
}
