package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import io.reactivex.functions.BiPredicate;

/* renamed from: -$$Lambda$rha$ZhoArj9mOnf9Fwt88Hg2zUfMB3E reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rha$ZhoArj9mOnf9Fwt88Hg2zUfMB3E implements BiPredicate {
    public static final /* synthetic */ $$Lambda$rha$ZhoArj9mOnf9Fwt88Hg2zUfMB3E INSTANCE = new $$Lambda$rha$ZhoArj9mOnf9Fwt88Hg2zUfMB3E();

    private /* synthetic */ $$Lambda$rha$ZhoArj9mOnf9Fwt88Hg2zUfMB3E() {
    }

    public final boolean test(Object obj, Object obj2) {
        return ((PagePrefs) obj).equals(((PagePrefs) obj2).toBuilder().a(((PagePrefs) obj).timestamp()).a());
    }
}
