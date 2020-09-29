package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.UUID;

/* renamed from: sdx reason: default package */
public final class sdx {
    private final sap a;
    private final sdi b;
    private final sga c;
    private final sfe d;

    sdx(sap sap, sdi sdi, sga sga, sfe sfe) {
        this.a = sap;
        this.b = sdi;
        this.c = sga;
        this.d = sfe;
    }

    public final Single<sgg<gzz>> a(sgh sgh) {
        sap sap = this.a;
        String b2 = sgh.a.a.b();
        sga sga = this.c;
        if (sga.a == null) {
            sga.a = UUID.randomUUID().toString();
        }
        return sap.a(b2, sga.a).b((Consumer<? super T>) new $$Lambda$sdx$CxRQFLbt0M4DI8YGW4DEqRDlRBU<Object>(this)).f(new $$Lambda$sdx$ZvNiRBmo9LmaMfOiRj6FIOKtMxc(sgh)).f(this.b).f(new $$Lambda$sdx$Of5kRMYXTOhdA938D7FffuanzT4(sgh));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(QueryAutocompleteResult queryAutocompleteResult) {
        this.d.a = new b(queryAutocompleteResult.requestid);
    }
}
