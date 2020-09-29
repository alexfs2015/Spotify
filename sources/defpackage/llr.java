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

/* renamed from: llr reason: default package */
public final class llr {
    private final Scheduler a;

    public llr(Scheduler scheduler) {
        this.a = scheduler;
    }

    public final Observable<String> a() {
        return Observable.b((Callable<? extends T>) $$Lambda$llr$iY6yJmSyxCOJwrzDK_viAW4ksUw.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$llr$q0Mf1HSdftAZXFOsFyAP7ROubY.INSTANCE).b(this.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ akg c() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "picture.type(large)");
        return akd.a(new akd(aju.a(), "me", bundle, HttpMethod.GET));
    }

    public final Observable<llq> b() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,email");
        return Observable.b((Callable<? extends T>) new $$Lambda$llr$KAFABi__EeVSul5T1mb19NTTQ40<Object>(bundle)).c((Function<? super T, ? extends R>) $$Lambda$llr$MbsekarklDMAATTse0tUKAhmASs.INSTANCE).e(new b()).b(this.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ llq a(akg akg) {
        JSONObject jSONObject = akg.a;
        if (jSONObject == null || fax.a(jSONObject.optString("id"))) {
            return new a(akg.b.toString());
        }
        return new c(jSONObject);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(akg akg) {
        try {
            return akg.a.getJSONObject("picture").getJSONObject("data").getString("url");
        } catch (JSONException e) {
            throw Exceptions.a(e);
        }
    }
}
