package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: raz reason: default package */
public final class raz {
    final kk a;
    final a b = new a() {
        public final void a(kk kkVar, Fragment fragment, View view) {
            if (fragment instanceof vbw) {
                YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) vci.a(fragment).get("your-library-page-id");
                if (yourLibraryPageId != null) {
                    view.setTag(R.id.your_library_testing_page_id_tag, yourLibraryPageId);
                }
                YourLibraryPageGroup yourLibraryPageGroup = (YourLibraryPageGroup) vci.a(fragment).get("your-library-page-group");
                if (yourLibraryPageGroup != null) {
                    view.setTag(R.id.your_library_testing_page_group_tag, yourLibraryPageGroup);
                }
            }
        }
    };

    public raz(kk kkVar) {
        this.a = kkVar;
    }
}
