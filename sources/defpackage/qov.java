package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityFeedbackResponse;
import io.reactivex.Maybe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: qov reason: default package */
public final class qov {
    public final qpa a;
    private final qox b;

    public qov(qox qox, qpa qpa) {
        this.b = qox;
        this.a = qpa;
    }

    public final Maybe<EntityFeedbackResponse> a(String str) {
        Maybe a2 = this.b.a(str).a((Predicate<? super T>) $$Lambda$8HznL1wPUmW3FKMYuLE7oT6UIv4.INSTANCE);
        qpa qpa = this.a;
        qpa.getClass();
        return a2.a((Consumer<? super T>) new $$Lambda$fASZgNS6VSpGOcJMjJcy6ZwO8W8<Object>(qpa));
    }
}
