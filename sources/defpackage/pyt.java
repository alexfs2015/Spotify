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

/* renamed from: pyt reason: default package */
public final class pyt {
    private final pyx a;
    private final SpSharedPreferences<Object> b;
    private final juc c;
    private final pyu d;

    public pyt(gix gix, SpSharedPreferences<Object> spSharedPreferences, juc juc, pyu pyu) {
        this.a = (pyx) gix.a(pyx.class);
        this.b = spSharedPreferences;
        this.c = juc;
        this.d = pyu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(String str, String str2, xgo xgo) {
        Optional optional;
        Object obj;
        String str3 = "notes";
        String str4 = "banners";
        String str5 = "cards";
        if (!xgo.a()) {
            return Observable.a(new Throwable(String.format("Response unsuccessful, code: %s.", new Object[]{Integer.valueOf(xgo.a.c)})));
        }
        try {
            pyu pyu = this.d;
            if (xgo.b() == null) {
                optional = Optional.e();
            } else {
                JSONObject jSONObject = new JSONObject(((xam) xgo.b()).f());
                Iterator keys = jSONObject.keys();
                if (!keys.hasNext()) {
                    optional = Optional.e();
                } else {
                    String str6 = (String) keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str6);
                    if (fbo.a(str6)) {
                        optional = Optional.e();
                    } else {
                        pxx pxx = null;
                        if (str6.contains(str5)) {
                            pxx = pxx.a((QuicksilverCardMessage) pyu.a.readValue(jSONObject2.toString(), QuicksilverCardMessage.class));
                            obj = pyu.a(str, str2, str5);
                        } else if (str6.contains(str4)) {
                            pxx = pxx.a((BannerMessage) pyu.a.readValue(jSONObject2.toString(), BannerMessage.class));
                            obj = pyu.a(str, str2, str4);
                        } else if (str6.contains(str3)) {
                            pxx = pxx.a((NoteMessage) pyu.a.readValue(jSONObject2.toString(), NoteMessage.class));
                            obj = pyu.a(str, str2, str3);
                        } else {
                            obj = null;
                        }
                        if (pxx != null) {
                            if (obj != null) {
                                optional = Optional.b(new ho(obj, pxx));
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

    public final Observable<Optional<ho<qag, pxx>>> a(String str, String str2, String str3) {
        return this.a.a(str2, CC.a(this.b.a(qbb.i, false)), this.c.a(), SpotifyLocale.a(), str, str2, str3).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$pyt$tci1IGbxt4uydEi8nWTryYXet1A<Object,Object>(this, str2, str), false);
    }
}
