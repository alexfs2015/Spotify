package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.playlist.model.policy.RadioPolicy;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.CreateRadioStationModel;
import com.spotify.music.spotlets.radio.model.MultiSaveStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.SavedStationModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Locale;
import org.json.JSONArray;

/* renamed from: usu reason: default package */
public final class usu {
    private static final ImmutableList<gjs> c = ImmutableList.a(new gjs("image_style", RadioPolicy.IMAGE_STYLE_GRADIENT_OVERLAY));
    public final RxResolver a;
    public final gmm<RadioStationTracksModel> b;
    private final gmm<RadioStationsModel> d;
    private final gmm<TracksAndRadioStationModel> e;
    private final gmm<RadioStationModel> f;
    private final hgy g;

    public usu(RxResolver rxResolver, gmm<RadioStationTracksModel> gmm, gmm<RadioStationsModel> gmm2, gmm<TracksAndRadioStationModel> gmm3, gmm<RadioStationModel> gmm4, hgy hgy) {
        this.a = rxResolver;
        this.b = gmm;
        this.d = gmm2;
        this.e = gmm3;
        this.f = gmm4;
        this.g = hgy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return wit.b(this.d.resolve(RequestBuilder.get(String.format(Locale.US, bool.booleanValue() ? "hm://radio-apollo/v5/all?language=%s&image_style=gradient_overlay" : "hm://radio-apollo/v3/all?language=%s&image_style=gradient_overlay", new Object[]{SpotifyLocale.a()})).build()));
    }

    public static String a(String str, String str2) {
        String str3 = c(str) ? "hm://radio-apollo/v3/" : "hm://radio-apollo/v5/";
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    public static String a(String str, String str2, String str3) {
        String substring = str.substring(14);
        String[] split = str2.split(":");
        String str4 = split[split.length - 1];
        return String.format(Locale.US, str3, new Object[]{str4, substring});
    }

    public static byte[] a(RadioStationTracksModel radioStationTracksModel) {
        JSONArray jSONArray = new JSONArray();
        for (PlayerTrack uri : radioStationTracksModel.tracks) {
            jSONArray.put(uri.uri().substring(14));
        }
        return jSONArray.toString().getBytes(fbi.c);
    }

    private static gjs b(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return new gjs("prev_tracks", TextUtils.join(",", ute.a(strArr)));
    }

    private static byte[] b(String str, String str2) {
        String a2 = a(str, "tracks/%s?%s");
        return String.format(Locale.US, a2, new Object[]{str, str2}).getBytes(fbi.c);
    }

    private static boolean c(String str) {
        return jva.a(str, LinkType.PROFILE_PLAYLIST, LinkType.RADIO_PLAYLIST, LinkType.STATION_PLAYLIST_V2);
    }

    public final Observable<RadioStationsModel> a() {
        return this.g.a(url.b).j().h(new $$Lambda$usu$enKSgL9DKXTnRLLNe6gCU9I7DM(this));
    }

    public final Observable<Response> a(CreateRadioStationModel createRadioStationModel) {
        String a2 = a((String) createRadioStationModel.seeds().get(0), "stations?count=0&send_station=false&language=%s");
        String format = String.format(Locale.US, a2, new Object[]{SpotifyLocale.a()});
        try {
            return this.a.resolve(RequestBuilder.post(format, createRadioStationModel).build());
        } catch (ParserException e2) {
            Logger.d(e2, "Failed to parse NewRadioStationModel object for '%s' backend action.", format);
            return Observable.a((Throwable) e2);
        }
    }

    public final Observable<TracksAndRadioStationModel> a(CreateRadioStationModel createRadioStationModel, String[] strArr) {
        String str;
        gjs b2 = b(strArr);
        if (b2 != null) {
            StringBuilder sb = new StringBuilder("&");
            sb.append(b2.a);
            sb.append('=');
            sb.append(b2.b);
            str = sb.toString();
        } else {
            str = "";
        }
        String a2 = a((String) createRadioStationModel.seeds().get(0), "stations?language=%s%s");
        String format = String.format(Locale.US, a2, new Object[]{SpotifyLocale.a(), str});
        try {
            return wit.b(this.e.resolve(RequestBuilder.post(format, createRadioStationModel).build()));
        } catch (ParserException e2) {
            Logger.d(e2, "Failed to parse NewRadioStationModel object for '%s' backend action.", format);
            return Observable.a((Throwable) e2);
        }
    }

    public final Observable<Response> a(String str) {
        SavedStationModel create = SavedStationModel.create(str);
        String a2 = a(str, "saved-station");
        try {
            return this.a.resolve(RequestBuilder.put(a2, create).build());
        } catch (ParserException e2) {
            Logger.d(e2, "Failed to parse SavedStationModel object for '%s' backend action.", a2);
            return Observable.a((Throwable) e2);
        }
    }

    public final Observable<RadioStationModel> a(String str, int i, String[] strArr, boolean z, boolean z2) {
        Builder buildUpon = Uri.parse(String.format(Locale.US, ViewUris.am.b(str) ? "hm://dailymix/v5/dailymix_stations/%s" : a(str, "stations/%s"), new Object[]{str})).buildUpon();
        fdz R_ = c.R_();
        while (R_.hasNext()) {
            gjs gjs = (gjs) R_.next();
            buildUpon.appendQueryParameter(gjs.a, gjs.b);
        }
        buildUpon.appendQueryParameter("count", Integer.toString(40));
        gjs b2 = b(strArr);
        if (b2 != null) {
            buildUpon.appendQueryParameter(b2.a, b2.b);
        }
        if (z) {
            buildUpon.appendQueryParameter("filter-explicit", "1");
        }
        if (z2) {
            buildUpon.appendQueryParameter("autoplay", "true");
        }
        return wit.b(this.f.resolve(RequestBuilder.get(buildUpon.build().toString()).build()));
    }

    public final Observable<RadioStationTracksModel> a(String str, String[] strArr, boolean z) {
        Builder buildUpon = Uri.parse(String.format(Locale.US, ViewUris.am.b(str) ? "hm://dailymix/v5/dailymix_tracks/%s" : a(str, "tracks/%s"), new Object[]{str})).buildUpon();
        gjs b2 = b(strArr);
        if (b2 != null) {
            buildUpon.appendQueryParameter(b2.a, b2.b);
        }
        if (z) {
            buildUpon.appendQueryParameter("filter-explicit", "1");
        }
        return wit.b(this.b.resolve(RequestBuilder.get(buildUpon.build().toString()).build()));
    }

    public final Observable<Response> a(usi usi, ThumbState thumbState, RadioStationModel radioStationModel) {
        String a2 = usi.a();
        usm usm = usi.b;
        String str = radioStationModel.uri;
        String a3 = usm.a();
        String substring = a2.substring(14);
        return this.a.resolve(RequestBuilder.postBytes(String.format(Locale.US, a(str, "stations/%s/%s/%s?language=%s&count=%s"), new Object[]{str, thumbState.mApolloValue, substring, SpotifyLocale.a(), Integer.valueOf(0)}), fbo.a(a3) ? Request.EMPTY_BODY : b(str, a3)).build());
    }

    public final Observable<Response> a(String[] strArr) {
        String str = "hm://radio-apollo/v3/saved-station-multi";
        try {
            return this.a.resolve(RequestBuilder.put(str, MultiSaveStationModel.create(strArr)).build());
        } catch (ParserException e2) {
            Logger.d(e2, "Failed to parse MultiSaveStationModel object for '%s' backend action.", str);
            return Observable.a((Throwable) e2);
        }
    }

    public final Observable<Response> b(String str) {
        SavedStationModel create = SavedStationModel.create(str);
        String a2 = a(str, "saved-station");
        try {
            return this.a.resolve(RequestBuilder.delete(a2, create).build());
        } catch (ParserException e2) {
            Logger.d(e2, "Failed to parse SavedStationModel object for '%s' backend action.", a2);
            return Observable.a((Throwable) e2);
        }
    }
}
