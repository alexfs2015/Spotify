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

/* renamed from: nvg reason: default package */
public final class nvg {
    private final Application a;
    private final rvg b;
    private final nvf c;

    public nvg(Application application, rvg rvg, nvf nvf) {
        this.a = application;
        this.b = rvg;
        this.c = nvf;
    }

    public final Observable<nvl> a(PartnerType partnerType) {
        return this.b.b().d().h(new $$Lambda$nvg$rNLHyykS0peBy0mD7xIe7DYkyY(this, partnerType)).h(new $$Lambda$nvg$LEMKjvMAHfgCaAxE1g26fq15uH4(this, partnerType)).d((ObservableSource<? extends T>) Observable.b(nvl.a(partnerType, false)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(PartnerType partnerType, AuthorizationRequest authorizationRequest) {
        return this.c.a(partnerType, authorizationRequest);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Observable<AuthorizationRequest> b(PartnerType partnerType, ImmutableMap<PartnerType, rvo> immutableMap) {
        ClientIdentity clientIdentity;
        try {
            clientIdentity = ClientIdentity.a((Context) this.a, partnerType.mPackageName);
        } catch (ValidationException e) {
            Logger.e(e, "Could not create ClientIdentity from package name", new Object[0]);
            clientIdentity = null;
        }
        ClientIdentity clientIdentity2 = clientIdentity;
        return Observable.b(AuthorizationRequest.a(((rvo) fay.a(immutableMap.get(partnerType))).b(), ResponseType.TOKEN, partnerType.mRedirectUri, clientIdentity2, null, new String[]{"app-remote-control"}, true));
    }
}
