package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityFeedbackResponse;
import io.reactivex.Maybe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: qgh reason: default package */
public final class qgh {
    public final qgm a;
    private final qgj b;

    public qgh(qgj qgj, qgm qgm) {
        this.b = qgj;
        this.a = qgm;
    }

    public final Maybe<EntityFeedbackResponse> a(String str) {
        Maybe a2 = this.b.a(str).a((Predicate<? super T>) $$Lambda$8HznL1wPUmW3FKMYuLE7oT6UIv4.INSTANCE);
        qgm qgm = this.a;
        qgm.getClass();
        return a2.a((Consumer<? super T>) new $$Lambda$j5kOLaH3xu72nmlp3SRqjPm8ZX0<Object>(qgm));
    }
}
