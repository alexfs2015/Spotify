package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import io.reactivex.functions.BiPredicate;

/* renamed from: -$$Lambda$qyl$Q6bX2cZlGV6aka_b9ZtiuY38a3o reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qyl$Q6bX2cZlGV6aka_b9ZtiuY38a3o implements BiPredicate {
    public static final /* synthetic */ $$Lambda$qyl$Q6bX2cZlGV6aka_b9ZtiuY38a3o INSTANCE = new $$Lambda$qyl$Q6bX2cZlGV6aka_b9ZtiuY38a3o();

    private /* synthetic */ $$Lambda$qyl$Q6bX2cZlGV6aka_b9ZtiuY38a3o() {
    }

    public final boolean test(Object obj, Object obj2) {
        return ((PagePrefs) obj).equals(((PagePrefs) obj2).toBuilder().a(((PagePrefs) obj).timestamp()).a());
    }
}
