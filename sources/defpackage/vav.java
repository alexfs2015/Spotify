package defpackage;

import com.spotify.podcastonboarding.api.CompleteRequestBody;
import io.reactivex.Completable;
import io.reactivex.CompletableTransformer;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: vav reason: default package */
public final class vav {
    private final vaj a;
    private final vil b = new vil();
    private final boolean c;

    public vav(vaj vaj, boolean z) {
        this.a = vaj;
        this.c = z;
    }

    public final Completable a(Set<vbt> set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (vbt vbt : set) {
            arrayList.add(vak.create(vbt.a(), vbt.e()));
        }
        Completable a2 = this.a.a(CompleteRequestBody.create(vai.create(arrayList))).a((CompletableTransformer) this.b);
        Completable b2 = Completable.a().b(2, TimeUnit.SECONDS);
        if (this.c) {
            return Completable.b(a2, b2, this.a.b());
        }
        return Completable.b(a2, b2);
    }
}
