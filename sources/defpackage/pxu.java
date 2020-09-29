package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pxu reason: default package */
public final class pxu {
    private final ObjectMapper a;
    private final qba b;

    public pxu(rwl rwl, qba qba) {
        this.a = rwl.a().a();
        this.b = qba;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(String str, xgo xgo) {
        if (!xgo.a()) {
            this.b.a("fetch_trigger_message", xgo.a.a.a.toString(), xgo.a.c, a(xgo), str);
            return Observable.a(new Throwable());
        }
        try {
            JSONObject jSONObject = new JSONObject(((xam) xgo.b()).f());
            Iterator keys = jSONObject.keys();
            if (!keys.hasNext()) {
                return Observable.b(Optional.e());
            }
            String str2 = (String) keys.next();
            pxx a2 = a(xgo.a.a.a.toString(), jSONObject, str2, str);
            return a2 == null ? Observable.b(Optional.e()) : Observable.b(Optional.b(new ho(str2, a2)));
        } catch (IOException | JSONException e) {
            return Observable.a(e);
        }
    }

    private static String a(xgo<xam> xgo) {
        try {
            return xgo.b.f();
        } catch (IOException unused) {
            return "";
        }
    }

    private pxx a(String str, JSONObject jSONObject, String str2, String str3) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            char c = 65535;
            int hashCode = str3.hashCode();
            if (hashCode != -336959801) {
                if (hashCode != 94431075) {
                    if (hashCode == 105008833) {
                        if (str3.equals("notes")) {
                            c = 2;
                        }
                    }
                } else if (str3.equals("cards")) {
                    c = 0;
                }
            } else if (str3.equals("banners")) {
                c = 1;
            }
            if (c == 0) {
                return pxx.a((QuicksilverCardMessage) this.a.readValue(jSONObject2.toString(), QuicksilverCardMessage.class));
            }
            if (c == 1) {
                return pxx.a((BannerMessage) this.a.readValue(jSONObject2.toString(), BannerMessage.class));
            }
            if (c != 2) {
                return null;
            }
            return pxx.a((NoteMessage) this.a.readValue(jSONObject2.toString(), NoteMessage.class));
        } catch (IOException | JSONException unused) {
            this.b.a("trigger_message_parser", str, str2);
            return null;
        }
    }

    public final Function<xgo<xam>, Observable<Optional<ho<String, pxx>>>> a(String str) {
        return new $$Lambda$pxu$PkndzyjBJNIYLsZy31yvslwV4(this, str);
    }
}
