package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qad reason: default package */
public final class qad {
    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(a aVar, pxt pxt, jty jty, fqn fqn) {
        boolean g = jty.g();
        String str = aVar.a;
        fqk fqk = "cards".equalsIgnoreCase(str) ? qbb.g : "banners".equalsIgnoreCase(str) ? qbb.e : "notes".equalsIgnoreCase(str) ? qbb.f : null;
        if (fqk == null || !((Boolean) fqn.a(fqk)).booleanValue()) {
            return Observable.a(new Throwable());
        }
        return pxt.a(aVar.d, aVar.b, aVar.c, aVar.a, ((Boolean) fqn.a(qbb.a)).booleanValue() ? "v3" : "v2", g);
    }

    public static ObservableTransformer<e, qab> a(Scheduler scheduler) {
        return new $$Lambda$qad$e245pYFM6mgeqW2BBcGmqjKBCY(scheduler);
    }

    public static ObservableTransformer<a, qab> a(pxt pxt, hgy hgy, jty jty) {
        return new $$Lambda$qad$USk3frWSXVmkWavMkfxexDBDtco(hgy, pxt, jty);
    }

    public static ObservableTransformer<b, qab> a(qae qae, qba qba) {
        return new $$Lambda$qad$bfDtvUB58PvVHnDX0NE1pbMhjH8(qae, qba);
    }

    public static Consumer<d> a(pzo pzo) {
        return new $$Lambda$qad$OlThwloykkGJp3Y038mMjWmyQQ(pzo);
    }

    public static Consumer<c> a(qbc qbc) {
        return new $$Lambda$qad$Byia1N9Q3zaFuCfqM9gjv25JskY(qbc);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qab a(a aVar, Optional optional) {
        return new h(aVar.a, aVar.b, aVar.c, optional);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qab a(a aVar, Throwable th) {
        return new g(aVar.a, aVar.b, aVar.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qab a(e eVar) {
        return new k();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qab a(qba qba, Throwable th) {
        String str = "body";
        String str2 = "status";
        try {
            String message = th.getMessage();
            if (message != null) {
                if (!message.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(th.getMessage());
                    String string = jSONObject.getString("error_type");
                    String string2 = jSONObject.getString("uri");
                    int i = jSONObject.has(str2) ? jSONObject.getInt(str2) : 0;
                    String string3 = jSONObject.has(str) ? jSONObject.getString(str) : null;
                    if (string.equals("fetch_trigger_list")) {
                        qba.a(string, string2, i, string3, "");
                    } else if (string.equals("trigger_list_parser")) {
                        qba.a(string, string2, string3);
                    }
                }
            }
        } catch (JSONException unused) {
            Logger.b("error reading error message json", new Object[0]);
        }
        return new i();
    }
}
