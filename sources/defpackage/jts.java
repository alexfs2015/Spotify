package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.decorator.UpdateModel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Collections;
import java.util.Map;

/* renamed from: jts reason: default package */
public abstract class jts<T> implements jtu<T> {
    public boolean a = true;
    private final RxResolver b;
    private final ObjectMapper c;
    private final c<Response, Map<String, T>> d;
    private final Policy e;

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract Map<String, T> a(byte[] bArr);

    protected jts(RxResolver rxResolver, wug wug, wug wug2) {
        this(rxResolver, null, wug, wug2);
    }

    protected jts(RxResolver rxResolver, Policy policy, wug wug, wug wug2) {
        this.b = (RxResolver) fay.a(rxResolver);
        this.e = policy;
        this.c = ((rnf) ggw.a(rnf.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.d = new $$Lambda$jts$ka_YxWW2A3XzDPDxVEBTaK0eao(this, wug, wug2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(wug wug, wug wug2, wud wud) {
        return wud.b(wug).f(new $$Lambda$jts$hppGMUO4IMgijWGfLPNi37dPwfA(this)).a(wug2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map a(Response response) {
        try {
            return a(response.getBody());
        } catch (Exception e2) {
            throw wul.a((Throwable) e2);
        }
    }

    public final wuh<Map<String, T>> a(String str, String... strArr) {
        fay.a(strArr);
        return a(Request.GET, a(), new UpdateModel(strArr, this.e, str)).b((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$jts$gNHH6cGHpclzLJmEMcbz7RPxXI<Object,Object>(this)).a(this.d).a(1).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(Request request) {
        return vun.a((ObservableSource<T>) this.b.resolve(request), BackpressureStrategy.BUFFER);
    }

    public final wud<Map<String, T>> a(String... strArr) {
        fay.a(strArr);
        return a(Request.SUB, a(), new UpdateModel(strArr, this.e, null)).b((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$jts$CMjElylzTQuH6TainFdh7pduKLs<Object,Object>(this)).a(this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Request request) {
        return vun.a((ObservableSource<T>) this.b.resolve(request), BackpressureStrategy.BUFFER);
    }

    private wuh<Request> a(String str, String str2, UpdateModel updateModel) {
        return wuh.a((a<T>) new $$Lambda$jts$kpW4xxQBY6Frx4jEYt_3yjMEa_U<T>(this, str, str2, updateModel));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, UpdateModel updateModel, wui wui) {
        try {
            wui.a(new Request(str, str2, Collections.emptyMap(), this.c.writeValueAsBytes(updateModel)));
        } catch (JsonProcessingException e2) {
            wui.a((Throwable) e2);
        }
    }
}
