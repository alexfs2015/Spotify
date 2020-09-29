package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityFeedbackResponse;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$8HznL1wPUmW3FKMYuLE7oT6UIv4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$8HznL1wPUmW3FKMYuLE7oT6UIv4 implements Predicate {
    public static final /* synthetic */ $$Lambda$8HznL1wPUmW3FKMYuLE7oT6UIv4 INSTANCE = new $$Lambda$8HznL1wPUmW3FKMYuLE7oT6UIv4();

    private /* synthetic */ $$Lambda$8HznL1wPUmW3FKMYuLE7oT6UIv4() {
    }

    public final boolean test(Object obj) {
        return ((EntityFeedbackResponse) obj).eligible();
    }
}
