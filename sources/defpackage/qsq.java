package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: qsq reason: default package */
public final class qsq {
    public static MusicPageId a(Fragment fragment) {
        return (MusicPageId) c(fragment).get("music-page-id");
    }

    public static void a(Fragment fragment, String str) {
        c(fragment).putString("uri", str);
    }

    public static Optional<String> b(Fragment fragment) {
        return Optional.c(c(fragment).getString("uri"));
    }

    public static void b(Fragment fragment, String str) {
        c(fragment).putString("username", str);
    }

    static Bundle c(Fragment fragment) {
        Bundle bundle = fragment.i;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        fragment.g(bundle2);
        return bundle2;
    }
}
