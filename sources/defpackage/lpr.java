package defpackage;

import android.os.Bundle;
import com.facebook.HttpMethod;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lpr reason: default package */
public final class lpr {
    private final Scheduler a;

    public lpr(Scheduler scheduler) {
        this.a = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ lpq a(aku aku) {
        JSONObject jSONObject = aku.a;
        return (jSONObject == null || fbo.a(jSONObject.optString("id"))) ? new a(aku.b.toString()) : new c(jSONObject);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(aku aku) {
        try {
            return aku.a.getJSONObject("picture").getJSONObject("data").getString("url");
        } catch (JSONException e) {
            throw Exceptions.a(e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ aku c() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "picture.type(large)");
        return akr.a(new akr(aki.a(), "me", bundle, HttpMethod.GET));
    }

    public final Observable<String> a() {
        return Observable.b((Callable<? extends T>) $$Lambda$lpr$0A7mzMLdQwqfDCqmAr5to2UgIdQ.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$lpr$dKUb0q98ndEWBWxWorYc3tua4c8.INSTANCE).b(this.a);
    }

    public final Observable<lpq> b() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,email");
        return Observable.b((Callable<? extends T>) new $$Lambda$lpr$6zWhPJt2_Z5LQKH5l7P4zz5qFLE<Object>(bundle)).c((Function<? super T, ? extends R>) $$Lambda$lpr$MtLFPegw_noTFph0RId5C3gNMCQ.INSTANCE).e(new b()).b(this.a);
    }
}
