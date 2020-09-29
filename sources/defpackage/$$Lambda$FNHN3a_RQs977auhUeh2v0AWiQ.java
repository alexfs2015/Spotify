package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$FNHN3a_RQs977auhUeh2v0AWi-Q reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FNHN3a_RQs977auhUeh2v0AWiQ implements Predicate {
    public static final /* synthetic */ $$Lambda$FNHN3a_RQs977auhUeh2v0AWiQ INSTANCE = new $$Lambda$FNHN3a_RQs977auhUeh2v0AWiQ();

    private /* synthetic */ $$Lambda$FNHN3a_RQs977auhUeh2v0AWiQ() {
    }

    public final boolean test(Object obj) {
        return ((EntityResultsPageResponse) obj).eligible();
    }
}
