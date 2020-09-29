package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: iqk reason: default package */
public final class iqk {
    private static final ImmutableMap<Integer, a> a = ImmutableMap.g().b(Integer.valueOf(R.string.toast_saved_to_collection), new a(R.string.toast_saved_to_collection_your_library)).b(Integer.valueOf(R.string.toast_removed_from_collection), new a(R.string.toast_removed_from_collection_your_library)).b();
    private static final ImmutableMap<Integer, a> b = ImmutableMap.g().b(Integer.valueOf(R.string.collection_error_insufficient_storage_body), new a(R.string.collection_error_insufficient_storage_body_your_library)).b(Integer.valueOf(R.string.context_menu_unfollow_in_collection), new a(R.string.context_menu_unfollow_in_collection_your_library)).b();

    /* renamed from: iqk$a */
    static class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    public static int a(fpt fpt, int i) {
        boolean z = false;
        int i2 = i == R.string.collection_title ? iqh.a(fpt) ? R.string.collection_title_your_library : i : 0;
        if (i2 == 0) {
            a aVar = (a) b.get(Integer.valueOf(i));
            i2 = aVar != null ? iqh.a(fpt) ? aVar.a : i : 0;
        }
        if (i2 == 0) {
            boolean a2 = iqh.a(fpt);
            a aVar2 = (a) a.get(Integer.valueOf(i));
            if (aVar2 != null) {
                if (a2) {
                    i = aVar2.a;
                }
                i2 = i;
            } else {
                i2 = 0;
            }
        }
        if (i2 != 0) {
            z = true;
        }
        Assertion.a("The requested string has no mapping. Add it to CollectionStringsHelper", z);
        return i2;
    }
}
