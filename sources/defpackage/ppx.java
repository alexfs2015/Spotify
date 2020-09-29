package defpackage;

import com.google.common.base.Optional;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ppx reason: default package */
public final class ppx {
    private final pqb a;
    private final SpSharedPreferences<Object> b;
    private final jrs c;
    private final ppy d;

    public ppx(ghm ghm, SpSharedPreferences<Object> spSharedPreferences, jrs jrs, ppy ppy) {
        this.a = (pqb) ghm.a(pqb.class);
        this.b = spSharedPreferences;
        this.c = jrs;
        this.d = ppy;
    }

    public final Observable<Optional<ho<prk, ppb>>> a(String str, String str2, String str3) {
        return this.a.a(str2, CC.a(this.b.a(psf.i, false)), this.c.a(), SpotifyLocale.a(), str, str2, str3).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ppx$_Wu2FutMLGprCNgHjJjIA1RAzw<Object,Object>(this, str2, str), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(String str, String str2, wsj wsj) {
        Optional optional;
        Object obj;
        String str3 = "notes";
        String str4 = "banners";
        String str5 = "cards";
        if (!wsj.a()) {
            return Observable.a(new Throwable(String.format("Response unsuccessful, code: %s.", new Object[]{Integer.valueOf(wsj.a.c)})));
        }
        try {
            ppy ppy = this.d;
            if (wsj.b() == null) {
                optional = Optional.e();
            } else {
                JSONObject jSONObject = new JSONObject(((wmg) wsj.b()).f());
                Iterator keys = jSONObject.keys();
                if (!keys.hasNext()) {
                    optional = Optional.e();
                } else {
                    String str6 = (String) keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str6);
                    if (fax.a(str6)) {
                        optional = Optional.e();
                    } else {
                        ppb ppb = null;
                        if (str6.contains(str5)) {
                            ppb = ppb.a((QuicksilverCardMessage) ppy.a.readValue(jSONObject2.toString(), QuicksilverCardMessage.class));
                            obj = ppy.a(str, str2, str5);
                        } else if (str6.contains(str4)) {
                            ppb = ppb.a((BannerMessage) ppy.a.readValue(jSONObject2.toString(), BannerMessage.class));
                            obj = ppy.a(str, str2, str4);
                        } else if (str6.contains(str3)) {
                            ppb = ppb.a((NoteMessage) ppy.a.readValue(jSONObject2.toString(), NoteMessage.class));
                            obj = ppy.a(str, str2, str3);
                        } else {
                            obj = null;
                        }
                        if (ppb != null) {
                            if (obj != null) {
                                optional = Optional.b(new ho(obj, ppb));
                            }
                        }
                        optional = Optional.e();
                    }
                }
            }
            return Observable.b(optional);
        } catch (IOException | JSONException unused) {
            return Observable.a(new Throwable("Error parsing payload payload."));
        }
    }
}
