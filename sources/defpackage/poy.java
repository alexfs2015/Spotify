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

/* renamed from: poy reason: default package */
public final class poy {
    private final ObjectMapper a;
    private final pse b;

    public poy(rnf rnf, pse pse) {
        this.a = rnf.a().a();
        this.b = pse;
    }

    public final Function<wsj<wmg>, Observable<Optional<ho<String, ppb>>>> a(String str) {
        return new $$Lambda$poy$e6lM4YnyUBCATxFDTl5IjyEeQWk(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(String str, wsj wsj) {
        if (!wsj.a()) {
            String str2 = "fetch_trigger_message";
            this.b.a(str2, wsj.a.a.a.toString(), wsj.a.c, a(wsj), str);
            return Observable.a(new Throwable());
        }
        try {
            JSONObject jSONObject = new JSONObject(((wmg) wsj.b()).f());
            Iterator keys = jSONObject.keys();
            if (!keys.hasNext()) {
                return Observable.b(Optional.e());
            }
            String str3 = (String) keys.next();
            ppb a2 = a(wsj.a.a.a.toString(), jSONObject, str3, str);
            if (a2 == null) {
                return Observable.b(Optional.e());
            }
            return Observable.b(Optional.b(new ho(str3, a2)));
        } catch (IOException | JSONException e) {
            return Observable.a(e);
        }
    }

    private ppb a(String str, JSONObject jSONObject, String str2, String str3) {
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
                return ppb.a((QuicksilverCardMessage) this.a.readValue(jSONObject2.toString(), QuicksilverCardMessage.class));
            }
            if (c == 1) {
                return ppb.a((BannerMessage) this.a.readValue(jSONObject2.toString(), BannerMessage.class));
            }
            if (c != 2) {
                return null;
            }
            return ppb.a((NoteMessage) this.a.readValue(jSONObject2.toString(), NoteMessage.class));
        } catch (IOException | JSONException unused) {
            this.b.a("trigger_message_parser", str, str2);
            return null;
        }
    }

    private static String a(wsj<wmg> wsj) {
        try {
            return wsj.b.f();
        } catch (IOException unused) {
            return "";
        }
    }
}
