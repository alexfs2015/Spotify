package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.viewuri.ViewUris;

@Deprecated
/* renamed from: jlj reason: default package */
public final class jlj {
    private final jsi a;
    private final rqb b;
    private final uix c;
    private final srz d;

    public jlj(jsi jsi, rqb rqb, uix uix, srz srz) {
        this.a = jsi;
        this.b = rqb;
        this.c = uix;
        this.d = srz;
    }

    public final jqx a(jva jva, Intent intent, String str, fqn fqn, SessionState sessionState, uqm uqm) {
        jqx jqx;
        jva jva2 = jva;
        Intent intent2 = intent;
        String str2 = str;
        fqn fqn2 = fqn;
        fbp.a(fqn);
        jqx jqx2 = jqx.d;
        Logger.b("Resolved link type = [%s]", jva2.b.name());
        String currentUser = sessionState.currentUser();
        try {
            switch (jva2.b) {
                case ALBUM:
                case ALBUM_AUTOPLAY:
                    jsf jsf = new jsf(jva, intent, str, fqn, this.b, this.c);
                    String str3 = (String) fbp.a(jsf.d.q());
                    if (!jsf.e.a(jsf.c) && !uix.b(jsf.c)) {
                        if (!uix.a(jsf.c)) {
                            jqx = lrs.a(str3, jsf.b, jsf.d.o(), jsf.d.n(), jsf.c);
                            if (lrs.b(jsf.a)) {
                                jlg.a(jqx, jsf.a);
                                break;
                            }
                        }
                    }
                    jqx = mxn.a(str3, jsf.c, jsf.d.n(), jsf.d.o());
                    break;
                case ARTIST:
                case ARTIST_AUTOPLAY:
                    jqx = new jsg(fqn2, jva, str2, intent2).a();
                    break;
                case COLLECTION_ALBUM:
                    if (!this.b.a(fqn2)) {
                        if (!uix.a(fqn)) {
                            jqx = mhx.a(jva.h(), str2, currentUser, fqn2);
                            break;
                        }
                    }
                    jqx = mxn.a(jva.r(), fqn2, false);
                    break;
                case COLLECTION_ARTIST:
                    if (!this.b.a(fqn2)) {
                        if (!uix.a(fqn)) {
                            jqx = mig.a(jva.h(), str2, currentUser, fqn2);
                            break;
                        }
                    }
                    jqx = nbh.a(jva.r(), fqn2, jva.n());
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
                    jqx = new jsg(fqn2, jva, str2, intent2).a();
                    break;
                case PROFILE_FOLLOWERS:
                case PROFILE_FOLLOWING:
                case PROFILE_PLAYLIST_OVERVIEW:
                case PROFILE_ARTISTS:
                case PROFILE_INVITATION_CODES:
                case CHARTS_ROOT:
                case CHARTS_SUBPAGE:
                case CHARTS_SPECIFIC:
                    jqx = jsi.a(jva, fqn2, str2).a();
                    break;
                case FINDFRIENDS:
                    jqx = mtt.a(fqn);
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
                    jqx = ViewUris.al.b(jva.h()) ? nzs.a(fqn) : qbs.a(jva.h(), str2, fqn2, currentUser);
                    if (this.b.a(fqn2)) {
                        jqx = jqx.c;
                        break;
                    }
                    break;
                case MADE_FOR_YOU_HUB:
                    jqx = nzs.a(fqn);
                    break;
                case HOME_ROOT:
                    Logger.b("NPT_NFT_FLAGS mFreeTierFeatureUtils.isNftEnabled(flags) = %s", Boolean.valueOf(this.b.a(fqn2)));
                    Logger.b("NPT_NFT_FLAGS mPremiumFeatureUtils.isNptEnabled(flags) = %s", Boolean.valueOf(uix.a(fqn)));
                    String str4 = null;
                    String stringExtra = intent2 != null ? intent2.getStringExtra("space-id") : null;
                    if (intent2 != null) {
                        str4 = intent2.getStringExtra("redirect_uri");
                    }
                    if (!fqn2.b(nlt.c)) {
                        if (this.b.a(fqn2) && !uix.a(fqn)) {
                            jqx = nmh.a(fqn2, currentUser, stringExtra, str4);
                            break;
                        } else {
                            jqx = noj.a(fqn2, currentUser, stringExtra);
                            break;
                        }
                    } else {
                        jqx = nnd.a(fqn2, currentUser);
                        break;
                    }
                    break;
                case COLLECTION_RADIO:
                    jqx = qbw.a(fqn);
                    break;
                case LIKES_HIDDEN_CONTENT:
                    jqx = nhu.a(fqn);
                    break;
                case CONFIG_CONTENT_LANGUAGES:
                    jqx = nwe.ah();
                    break;
                case CONFIG_PUSH_NOTIFICATION:
                    jqx = ptq.c();
                    break;
                case CONFIG_STORAGE:
                    jqx = uys.ah();
                    break;
                case LICENSES:
                    jqx = new ssy();
                    break;
                case VIDEO_DEBUG:
                    jqx = jqx.c;
                    break;
                case FORMAT_LIST_CHART:
                case FORMAT_LIST_CHART_AUTOPLAY:
                    jqx = jsi.a(jva, fqn2, str2).a();
                    break;
                case PODCAST_EPISODE:
                    jqx = phh.a(qoh.b(jva.h()), intent.getExtras(), fqn2);
                    break;
                case STATIONS_PROMO:
                    if (!this.d.a(fqn2)) {
                        jqx = jqx.c;
                        break;
                    } else {
                        jqx = new lpc();
                        break;
                    }
                case LISTENING_HISTORY:
                    if (!(((fqn) fbp.a(fqn)).a(nwv.a) == RolloutFlag.ENABLED)) {
                        jqx = jqx.c;
                        break;
                    } else {
                        jqx = nwg.ah();
                        break;
                    }
                default:
                    jqx = jqx.d;
                    break;
            }
        } catch (AssertionError e) {
            Logger.e(e, "Could not resolve fragment for link %s, verification failed.", jva.h());
            jqx = jqx.c;
        }
        jlk.a(jqx, intent2, uqm);
        Object[] objArr = new Object[1];
        objArr[0] = !(jqx instanceof a) ? jqx.ae().toString() : "NoOpFragment";
        Logger.b("Resolved fragment = [%s]", objArr);
        return jqx;
    }
}
