package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.viewuri.ViewUris;

@Deprecated
/* renamed from: jix reason: default package */
public final class jix {
    private final jpw a;
    private final rgz b;
    private final twu c;
    private final shs d;

    public jix(jpw jpw, rgz rgz, twu twu, shs shs) {
        this.a = jpw;
        this.b = rgz;
        this.c = twu;
        this.d = shs;
    }

    public final jol a(jst jst, Intent intent, String str, fpt fpt, SessionState sessionState, udr udr) {
        jol jol;
        jst jst2 = jst;
        Intent intent2 = intent;
        String str2 = str;
        fpt fpt2 = fpt;
        fay.a(fpt);
        jol jol2 = jol.d;
        Logger.b("Resolved link type = [%s]", jst2.b.name());
        String currentUser = sessionState.currentUser();
        try {
            switch (jst2.b) {
                case ALBUM:
                case ALBUM_AUTOPLAY:
                    jpt jpt = new jpt(jst, intent, str, fpt, this.b, this.c);
                    String str3 = (String) fay.a(jpt.d.q());
                    if (!jpt.e.a(jpt.c) && !twu.b(jpt.c)) {
                        if (!twu.a(jpt.c)) {
                            jol = lns.a(str3, jpt.b, jpt.d.o(), jpt.d.n(), jpt.c);
                            if (lns.b(jpt.a)) {
                                jiu.a(jol, jpt.a);
                                break;
                            }
                        }
                    }
                    jol = msm.a(str3, jpt.c, jpt.d.n(), jpt.d.o());
                    break;
                case ARTIST:
                case ARTIST_AUTOPLAY:
                    jol = new jpu(fpt2, jst, str2, intent2).a();
                    break;
                case COLLECTION_ALBUM:
                    if (!this.b.a(fpt2)) {
                        if (!twu.a(fpt)) {
                            jol = mdu.a(jst.h(), str2, currentUser, fpt2);
                            break;
                        }
                    }
                    jol = msm.a(jst.r(), fpt2, false);
                    break;
                case COLLECTION_ARTIST:
                    if (!this.b.a(fpt2)) {
                        if (!twu.a(fpt)) {
                            jol = med.a(jst.h(), str2, currentUser, fpt2);
                            break;
                        }
                    }
                    jol = mwg.a(jst.r(), fpt2, jst.n());
                    break;
                case ARTIST_GALLERY:
                case ARTIST_CONCERT:
                case ARTIST_CONCERTS:
                case ARTIST_BIOGRAPHY:
                case ARTIST_ABOUT:
                case ARTIST_PLAYLISTS:
                case ARTIST_RELATED:
                case ARTIST_ALBUMS:
                case ARTIST_SINGLES:
                case ARTIST_APPEARS_ON:
                case ARTIST_COMPILATIONS:
                case ARTIST_RELEASES:
                    jol = new jpu(fpt2, jst, str2, intent2).a();
                    break;
                case PROFILE_FOLLOWERS:
                case PROFILE_FOLLOWING:
                case PROFILE_PLAYLIST_OVERVIEW:
                case PROFILE_ARTISTS:
                case PROFILE_INVITATION_CODES:
                case FOLLOW_FACEBOOK:
                case FOLLOW_ARTISTS:
                    jol = new jpy(jst, intent2).a();
                    break;
                case CHARTS_ROOT:
                case CHARTS_SUBPAGE:
                case CHARTS_SPECIFIC:
                    jol = jpw.a(jst, fpt2, str2).a();
                    break;
                case FINDFRIENDS:
                    jol = mpk.a(fpt);
                    break;
                case CLUSTER_STATIONS_ROOT:
                case STATION:
                case STATION_CLUSTER:
                case DAILYMIX:
                case RADIO_ALBUM:
                case RADIO_ARTIST:
                case RADIO_PLAYLIST:
                case STATION_PLAYLIST_V2:
                case RADIO_GENRE:
                case RADIO_TRACK:
                    if (ViewUris.am.b(jst.h())) {
                        jol = ntp.a(fpt);
                    } else {
                        jol = psw.a(jst.h(), str2, fpt2, currentUser);
                    }
                    if (this.b.a(fpt2)) {
                        jol = jol.c;
                        break;
                    }
                    break;
                case MADE_FOR_YOU_HUB:
                    jol = ntp.a(fpt);
                    break;
                case HOME_ROOT:
                    Logger.b("NPT_NFT_FLAGS mFreeTierFeatureUtils.isNftEnabled(flags) = %s", Boolean.valueOf(this.b.a(fpt2)));
                    Logger.b("NPT_NFT_FLAGS mPremiumFeatureUtils.isNptEnabled(flags) = %s", Boolean.valueOf(twu.a(fpt)));
                    String str4 = null;
                    String stringExtra = intent2 != null ? intent2.getStringExtra("space-id") : null;
                    if (intent2 != null) {
                        str4 = intent2.getStringExtra("redirect_uri");
                    }
                    if (!fpt2.b(nge.c)) {
                        if (this.b.a(fpt2) && !twu.a(fpt)) {
                            jol = ngl.a(fpt2, currentUser, stringExtra, str4);
                            break;
                        } else {
                            jol = nin.a(fpt2, currentUser, stringExtra);
                            break;
                        }
                    } else {
                        jol = nhh.a(fpt2, currentUser);
                        break;
                    }
                    break;
                case COLLECTION_RADIO:
                    jol = pta.a(fpt);
                    break;
                case LIKES_HIDDEN_CONTENT:
                    jol = ncf.a(fpt);
                    break;
                case CONFIG_CONTENT_LANGUAGES:
                    jol = nqb.ah();
                    break;
                case CONFIG_PUSH_NOTIFICATION:
                    jol = pky.c();
                    break;
                case CONFIG_STORAGE:
                    jol = uno.ah();
                    break;
                case LICENSES:
                    jol = new sir();
                    break;
                case VIDEO_DEBUG:
                    jol = jol.c;
                    break;
                case FORMAT_LIST_CHART:
                case FORMAT_LIST_CHART_AUTOPLAY:
                    jol = jpw.a(jst, fpt2, str2).a();
                    break;
                case PODCAST_EPISODE:
                    jol = ozy.a(qfe.b(jst.h()), intent.getExtras(), fpt2);
                    break;
                case STATIONS_PROMO:
                    if (!this.d.a(fpt2)) {
                        jol = jol.c;
                        break;
                    } else {
                        jol = new llc();
                        break;
                    }
                case LISTENING_HISTORY:
                    if (!(((fpt) fay.a(fpt)).a(nqs.a) == RolloutFlag.ENABLED)) {
                        jol = jol.c;
                        break;
                    } else {
                        jol = nqd.ah();
                        break;
                    }
                default:
                    jol = jol.d;
                    break;
            }
        } catch (AssertionError e) {
            Logger.e(e, "Could not resolve fragment for link %s, verification failed.", jst.h());
            jol = jol.c;
        }
        jiy.a(jol, intent2, udr);
        Object[] objArr = new Object[1];
        objArr[0] = !(jol instanceof a) ? jol.ae().toString() : "NoOpFragment";
        Logger.b("Resolved fragment = [%s]", objArr);
        return jol;
    }
}
