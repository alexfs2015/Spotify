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

/* renamed from: prh reason: default package */
public final class prh {
    public static ObservableTransformer<b, prf> a(pri pri, pse pse) {
        return new $$Lambda$prh$JoXt5wEWctYwJPzRxnPfxk0yoGc(pri, pse);
    }

    public static ObservableTransformer<a, prf> a(pox pox, hec hec, jro jro) {
        return new $$Lambda$prh$Xe5UVTQfTkSMctG4dSZMDUHgkA(hec, pox, jro);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(a aVar, pox pox, jro jro, fpt fpt) {
        fpq fpq;
        boolean g = jro.g();
        String str = aVar.a;
        if ("cards".equalsIgnoreCase(str)) {
            fpq = psf.g;
        } else if ("banners".equalsIgnoreCase(str)) {
            fpq = psf.e;
        } else if ("notes".equalsIgnoreCase(str)) {
            fpq = psf.f;
        } else {
            fpq = null;
        }
        if (fpq == null || !((Boolean) fpt.a(fpq)).booleanValue()) {
            return Observable.a(new Throwable());
        }
        return pox.a(aVar.d, aVar.b, aVar.c, aVar.a, ((Boolean) fpt.a(psf.a)).booleanValue() ? "v3" : "v2", g);
    }

    public static Consumer<d> a(pqs pqs) {
        return new $$Lambda$prh$tbzYUDqf_JMRDwvEfSB5CcZ_4E(pqs);
    }

    public static Consumer<c> a(psg psg) {
        return new $$Lambda$prh$soWat_I_kOerjwKDLLxLj9aGQ0(psg);
    }

    public static ObservableTransformer<e, prf> a(Scheduler scheduler) {
        return new $$Lambda$prh$GXvJZcCIuNHZ9UVPv0gSss0Pw(scheduler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ prf a(e eVar) {
        return new k();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ prf a(a aVar, Throwable th) {
        return new g(aVar.a, aVar.b, aVar.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ prf a(a aVar, Optional optional) {
        return new h(aVar.a, aVar.b, aVar.c, optional);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ prf a(pse pse, Throwable th) {
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
                        pse.a(string, string2, i, string3, "");
                    } else if (string.equals("trigger_list_parser")) {
                        pse.a(string, string2, string3);
                    }
                }
            }
        } catch (JSONException unused) {
            Logger.b("error reading error message json", new Object[0]);
        }
        return new i();
    }
}
