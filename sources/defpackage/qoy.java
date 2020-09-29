package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse;
import io.reactivex.Maybe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: qoy reason: default package */
public final class qoy {
    public final qpa a;
    private final qox b;

    public qoy(qox qox, qpa qpa) {
        this.b = qox;
        this.a = qpa;
    }

    public final Maybe<EntityResultsPageResponse> a(String str) {
        Maybe a2 = this.b.b(str).a((Predicate<? super T>) $$Lambda$FNHN3a_RQs977auhUeh2v0AWiQ.INSTANCE);
        qpa qpa = this.a;
        qpa.getClass();
        return a2.a((Consumer<? super T>) new $$Lambda$2B_8nOSGWZMRwH1iEHhKpElJr0<Object>(qpa));
    }
}
