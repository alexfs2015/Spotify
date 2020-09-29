package defpackage;

import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.UUID;

/* renamed from: soe reason: default package */
public final class soe {
    private final skw a;
    private final snp b;
    private final sqh c;
    private final spl d;

    soe(skw skw, snp snp, sqh sqh, spl spl) {
        this.a = skw;
        this.b = snp;
        this.c = sqh;
        this.d = spl;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(QueryAutocompleteResult queryAutocompleteResult) {
        this.d.a = new b(queryAutocompleteResult.requestid);
    }

    public final Single<sqn<hcs>> a(sqo sqo) {
        skw skw = this.a;
        String b2 = sqo.a.a.b();
        sqh sqh = this.c;
        if (sqh.a == null) {
            sqh.a = UUID.randomUUID().toString();
        }
        return skw.a(b2, sqh.a).b((Consumer<? super T>) new $$Lambda$soe$RMUAfzLFU5OaYQNEJTyyyEEqeo<Object>(this)).f(new $$Lambda$soe$UMJPB5WzmzdVIUeMtpHADUhWbk(sqo)).f(this.b).f(new $$Lambda$soe$E9gmwWr9fT46PU9tCXHuCGA6A(sqo));
    }
}
