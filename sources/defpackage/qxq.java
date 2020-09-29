package defpackage;

import android.content.Context;
import com.google.common.hash.Hashing;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.e;

/* renamed from: qxq reason: default package */
public final class qxq {
    public final Context a;
    public final String b;
    public final fdr c = Hashing.a(64);
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public qxq(Context context, qsr qsr, String str) {
        this.a = context;
        this.b = str;
        this.d = jsl.b(qsr.a.b());
        this.e = qsr.d();
        this.f = qsr.d();
        fpt b2 = qsr.a.b();
        this.g = !qsr.b.a(b2) && !twu.a(b2) && !twu.b(b2);
    }

    public static String a(uyq uyq) {
        uyr artist = uyq.getArtist();
        return artist != null ? artist.getName() : "";
    }

    public final MusicItem a(String str) {
        a a2 = MusicItem.z().a(this.c.a((CharSequence) Type.CREATE_PLAYLIST_BUTTON.toString()).c()).a(Type.CREATE_PLAYLIST_BUTTON);
        if (str == null) {
            str = "";
        }
        return a2.c(str).a(this.a.getString(R.string.your_library_music_pages_button_create_playlist)).a();
    }

    public final MusicItem a(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        a z3 = MusicItem.z();
        fdr fdr = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(Type.SECTION_HEADER_CUSTOM);
        sb.append(str);
        return z3.a(fdr.a((CharSequence) sb.toString()).c()).a(Type.SECTION_HEADER_CUSTOM).a(str2).b(str3).a((b) e.h().a(false).b(z2).e(str4).a()).a();
    }
}
