package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse;
import io.reactivex.Maybe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: qgk reason: default package */
public final class qgk {
    public final qgm a;
    private final qgj b;

    public qgk(qgj qgj, qgm qgm) {
        this.b = qgj;
        this.a = qgm;
    }

    public final Maybe<EntityResultsPageResponse> a(String str) {
        Maybe a2 = this.b.b(str).a((Predicate<? super T>) $$Lambda$FNHN3a_RQs977auhUeh2v0AWiQ.INSTANCE);
        qgm qgm = this.a;
        qgm.getClass();
        return a2.a((Consumer<? super T>) new $$Lambda$uHjYCj5MOb9nvqV2JXXM3fJdjk<Object>(qgm));
    }
}
