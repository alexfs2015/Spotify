package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.core.navcontext.EntityType;
import java.util.Locale;

/* renamed from: tch reason: default package */
public final class tch {
    public final tcf a(PlayerState playerState) {
        EntityType a = EntityType.a(playerState);
        tcg tcg = new tcg(playerState);
        String str = "";
        switch (a) {
            case ADVERTISEMENT:
                String a2 = jvs.a(tcg.g, "advertiser");
                return tcg.a(a.mTitleHolder, new tcm(a2), jvs.a(tcg.g, "click_url"));
            case INTERRUPTION:
                return tcg.a(a.mTitleHolder, new tcm(str));
            case ALBUM:
            case SHOW:
            case SHOW_VIDEO:
                return tcg.a(a.mTitleHolder, new tcm(tcg.e));
            case ARTIST:
                String str2 = tcg.f;
                String a3 = jvs.a(tcg.g, "artist_uri");
                String str3 = tcg.f;
                int i = 1;
                while (true) {
                    if (!fax.a(a3)) {
                        if (!tcg.b.equals(a3)) {
                            a3 = jvs.a(tcg.g, String.format(Locale.getDefault(), "artist_uri:%d", new Object[]{Integer.valueOf(i)}));
                            str3 = jvs.a(tcg.g, String.format(Locale.getDefault(), "artist_name:%d", new Object[]{Integer.valueOf(i)}));
                            i++;
                        } else if (!fax.a(str3)) {
                            str2 = str3;
                        }
                    }
                }
                return tcg.a(a.mTitleHolder, new tcm(str2));
            case YOUR_MUSIC_ARTIST:
            case YOUR_LIBRARY_ARTIST:
                return tcg.a(a.mTitleHolder, new tcm(tcg.f));
            case RADIO:
            case ALBUM_RADIO:
            case ARTIST_RADIO:
            case PLAYLIST_RADIO:
            case TRACK_RADIO:
            case CLUSTER:
                tck tck = a.mTitleHolder;
                tcm tcm = new tcm(tcg.d);
                String str4 = (String) jtc.a(uhq.d(tcg.a), str);
                String str5 = (String) jtc.a(uhq.c(str4), str);
                if (ViewUris.aj.b(str5)) {
                    str4 = str5;
                }
                return tcg.a(tck, tcm, str4);
            case GENRE_RADIO:
                return tcg.a(a.mTitleHolder, new tcm(uhq.k(tcg.b)), tcg.a);
            case DAILY_MIX:
                return tcg.a(a.mTitleHolder, new tcm(tcg.d), tcg.a);
            case CHARTS:
            case PLAYLIST:
            case PLAYLIST_FOLDER:
            case START_PAGE:
                return tcg.a(a.mTitleHolder, new tcm(tcg.d));
            case SEARCH:
                if (jst.h(tcg.a)) {
                    str = jst.a(tcg.a).b();
                }
                return tcg.a(a.mTitleHolder, new tcj(R.string.player_title_search_for, str));
            case YOUR_MUSIC_ALBUM:
            case NEW_MUSIC_TUESDAY:
            case YOUR_LIBRARY_ALBUM:
                return tcg.a(a.mTitleHolder, new tcj(R.string.player_title_by, tcg.e, tcg.f));
            case YOUR_LIBRARY:
            case YOUR_MUSIC:
                return new tcf(a.mTitleHolder, a.mSubtitleHolder, tcg.b, ViewUris.bj.toString());
            default:
                return new tcf(a.mTitleHolder, a.mSubtitleHolder, tcg.b, tcg.c);
        }
    }
}
