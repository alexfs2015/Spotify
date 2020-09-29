package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.core.navcontext.EntityType;
import java.util.Locale;

/* renamed from: tmo reason: default package */
public final class tmo {
    public final tmm a(PlayerState playerState) {
        EntityType a = EntityType.a(playerState);
        tmn tmn = new tmn(playerState);
        String str = "";
        switch (a) {
            case ADVERTISEMENT:
                String a2 = jya.a(tmn.g, "advertiser");
                return tmn.a(a.mTitleHolder, new tmt(a2), jya.a(tmn.g, "click_url"));
            case INTERRUPTION:
                return tmn.a(a.mTitleHolder, new tmt(str));
            case ALBUM:
            case SHOW:
            case SHOW_VIDEO:
                return tmn.a(a.mTitleHolder, new tmt(tmn.e));
            case ARTIST:
                String str2 = tmn.f;
                String a3 = jya.a(tmn.g, "artist_uri");
                String str3 = tmn.f;
                int i = 1;
                while (true) {
                    if (!fbo.a(a3)) {
                        if (!tmn.b.equals(a3)) {
                            a3 = jya.a(tmn.g, String.format(Locale.getDefault(), "artist_uri:%d", new Object[]{Integer.valueOf(i)}));
                            str3 = jya.a(tmn.g, String.format(Locale.getDefault(), "artist_name:%d", new Object[]{Integer.valueOf(i)}));
                            i++;
                        } else if (!fbo.a(str3)) {
                            str2 = str3;
                        }
                    }
                }
                return tmn.a(a.mTitleHolder, new tmt(str2));
            case YOUR_MUSIC_ARTIST:
            case YOUR_LIBRARY_ARTIST:
                return tmn.a(a.mTitleHolder, new tmt(tmn.f));
            case RADIO:
            case ALBUM_RADIO:
            case ARTIST_RADIO:
            case PLAYLIST_RADIO:
            case TRACK_RADIO:
            case CLUSTER:
                tmr tmr = a.mTitleHolder;
                tmt tmt = new tmt(tmn.d);
                String str4 = (String) jvi.a(ute.c(tmn.a), str);
                String str5 = (String) jvi.a(ute.b(str4), str);
                if (ViewUris.ai.b(str5)) {
                    str4 = str5;
                }
                return tmn.a(tmr, tmt, str4);
            case GENRE_RADIO:
                return tmn.a(a.mTitleHolder, new tmt(ute.j(tmn.b)), tmn.a);
            case DAILY_MIX:
                return tmn.a(a.mTitleHolder, new tmt(tmn.d), tmn.a);
            case CHARTS:
            case PLAYLIST:
            case PLAYLIST_FOLDER:
            case START_PAGE:
                return tmn.a(a.mTitleHolder, new tmt(tmn.d));
            case SEARCH:
                if (jva.h(tmn.a)) {
                    str = jva.a(tmn.a).b();
                }
                return tmn.a(a.mTitleHolder, new tmq(R.string.player_title_search_for, str));
            case YOUR_MUSIC_ALBUM:
            case NEW_MUSIC_TUESDAY:
            case YOUR_LIBRARY_ALBUM:
                return tmn.a(a.mTitleHolder, new tmq(R.string.player_title_by, tmn.e, tmn.f));
            case YOUR_LIBRARY:
            case YOUR_MUSIC:
                return new tmm(a.mTitleHolder, a.mSubtitleHolder, tmn.b, ViewUris.bi.toString());
            default:
                return new tmm(a.mTitleHolder, a.mSubtitleHolder, tmn.b, tmn.c);
        }
    }
}
