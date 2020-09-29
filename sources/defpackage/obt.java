package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.ClientIdentity.ValidationException;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;

/* renamed from: obt reason: default package */
public final class obt {
    private final Application a;
    private final seq b;
    private final obs c;

    public obt(Application application, seq seq, obs obs) {
        this.a = application;
        this.b = seq;
        this.c = obs;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Observable<AuthorizationRequest> b(PartnerType partnerType, ImmutableMap<PartnerType, sey> immutableMap) {
        ClientIdentity clientIdentity;
        try {
            clientIdentity = ClientIdentity.a((Context) this.a, partnerType.mPackageName);
        } catch (ValidationException e) {
            Logger.e(e, "Could not create ClientIdentity from package name", new Object[0]);
            clientIdentity = null;
        }
        ClientIdentity clientIdentity2 = clientIdentity;
        return Observable.b(AuthorizationRequest.a(((sey) fbp.a(immutableMap.get(partnerType))).b(), ResponseType.TOKEN, partnerType.mRedirectUri, clientIdentity2, null, new String[]{"app-remote-control"}, true));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        return this.c.a(partnerType, authorizationRequest);
    }

    public final Observable<oby> a(PartnerType partnerType) {
        return this.b.b().d().h(new $$Lambda$obt$znrbqszzbkd3vrfi1O9wb59vx0(this, partnerType)).h(new $$Lambda$obt$ru0gRuQOWhqb7rm0Dopxfc2mW7w(this, partnerType)).d((ObservableSource<? extends T>) Observable.b(oby.a(partnerType, false)));
    }
}
