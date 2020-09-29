package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jnz reason: default package */
public final class jnz {
    private static final Set<Integer> a;

    public static ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        for (fug fug : contextMenuViewModel.b) {
            boolean z2 = true;
            boolean z3 = !z && a.contains(Integer.valueOf(fug.h()));
            if (!fug.d() || z3) {
                z2 = false;
            }
            fug.a(z2);
        }
        return contextMenuViewModel;
    }

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(Integer.valueOf(R.id.context_menu_browse_artist));
        a.add(Integer.valueOf(R.id.context_menu_browse_album));
        a.add(Integer.valueOf(R.id.context_menu_add_full_album_to_collection));
        a.add(Integer.valueOf(R.id.options_menu_mark_explicit));
        a.add(Integer.valueOf(R.id.menu_item_start_station));
        a.add(Integer.valueOf(R.id.menu_item_report));
    }
}
