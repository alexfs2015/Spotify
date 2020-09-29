package defpackage;

import com.spotify.podcastonboarding.api.CompleteRequestBody;
import io.reactivex.Completable;
import io.reactivex.CompletableTransformer;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: vnj reason: default package */
public final class vnj {
    private final vmx a;
    private final vvq b = new vvq();
    private final boolean c;

    public vnj(vmx vmx, boolean z) {
        this.a = vmx;
        this.c = z;
    }

    public final Completable a(Set<voh> set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (voh voh : set) {
            arrayList.add(vmy.create(voh.a(), voh.e()));
        }
        Completable a2 = this.a.a(CompleteRequestBody.create(vmw.create(arrayList))).a((CompletableTransformer) this.b);
        Completable b2 = Completable.a().b(2, TimeUnit.SECONDS);
        if (this.c) {
            return Completable.b(a2, b2, this.a.b());
        }
        return Completable.b(a2, b2);
    }
}
