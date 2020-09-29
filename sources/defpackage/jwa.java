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

/* renamed from: jwa reason: default package */
public abstract class jwa<T> implements jwc<T> {
    public boolean a = true;
    private final RxResolver b;
    private final ObjectMapper c;
    private final c<Response, Map<String, T>> d;
    private final Policy e;

    protected jwa(RxResolver rxResolver, Policy policy, xil xil, xil xil2) {
        this.b = (RxResolver) fbp.a(rxResolver);
        this.e = policy;
        this.c = ((rwl) gih.a(rwl.class)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.d = new $$Lambda$jwa$WjmzcRI_qU3UwtvIIIsGxBjHsT4(this, xil, xil2);
    }

    protected jwa(RxResolver rxResolver, xil xil, xil xil2) {
        this(rxResolver, null, xil, xil2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map a(Response response) {
        try {
            return a(response.getBody());
        } catch (Exception e2) {
            throw xiq.a((Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Request request) {
        return wit.a((ObservableSource<T>) this.b.resolve(request), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(xil xil, xil xil2, xii xii) {
        return xii.b(xil).e((xiy<? super T, ? extends R>) new $$Lambda$jwa$DttO_WFiQ3SzdZZ4h4DCaRyVSo<Object,Object>(this)).a(xil2);
    }

    private xim<Request> a(String str, String str2, UpdateModel updateModel) {
        return xim.a((a<T>) new $$Lambda$jwa$4rGVVjggsKRAgBsjnhSCJzg9Orc<T>(this, str, str2, updateModel));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, UpdateModel updateModel, xin xin) {
        try {
            xin.a(new Request(str, str2, Collections.emptyMap(), this.c.writeValueAsBytes(updateModel)));
        } catch (JsonProcessingException e2) {
            xin.a((Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(Request request) {
        return wit.a((ObservableSource<T>) this.b.resolve(request), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract Map<String, T> a(byte[] bArr);

    public final xii<Map<String, T>> a(String... strArr) {
        fbp.a(strArr);
        return a(Request.SUB, a(), new UpdateModel(strArr, this.e, null)).b((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$jwa$KGkzmFwNnMbeanIh_a2qpY4WPI<Object,Object>(this)).a(this.d);
    }

    public final xim<Map<String, T>> a(String str, String... strArr) {
        fbp.a(strArr);
        return a(Request.GET, a(), new UpdateModel(strArr, this.e, str)).b((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$jwa$ZhIn2c2lbhpH0XvRDqiYJBeqpZw<Object,Object>(this)).a(this.d).a(1).a();
    }
}
