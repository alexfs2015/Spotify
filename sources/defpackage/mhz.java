package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: mhz reason: default package */
public final class mhz {
    private static final ImmutableMap<Integer, a> a = ImmutableMap.g().b(Integer.valueOf(R.string.placeholder_collection_empty_album_only_not_following_body), new a(R.string.placeholder_collection_empty_album_only_not_following_body_your_library)).b();

    /* renamed from: mhz$a */
    static class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    public static int a(fqn fqn, int i) {
        a aVar = (a) a.get(Integer.valueOf(i));
        if (aVar == null) {
            i = 0;
        } else if (isu.a(fqn)) {
            i = aVar.a;
        }
        Assertion.a(i != 0, "The requested string has no mapping. Add it to CollectionAlbumStringsHelper", new Object[0]);
        return i;
    }
}
