package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import io.reactivex.Observable;

/* renamed from: unn reason: default package */
public final class unn implements jpk<Void> {
    private final ImmutableMap<Integer, String> b;
    private final Context c;
    private final unm d;
    private final umw e;
    private final LinkType f;

    public unn(Context context, unm unm, umw umw, LinkType linkType) {
        this.c = context;
        this.d = unm;
        this.e = umw;
        this.f = linkType;
        Resources resources = this.c.getResources();
        this.b = ImmutableMap.g().b(Integer.valueOf(R.id.menu_item_sleep_timer_5_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 5, new Object[]{Integer.valueOf(5)})).b(Integer.valueOf(R.id.menu_item_sleep_timer_10_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 10, new Object[]{Integer.valueOf(10)})).b(Integer.valueOf(R.id.menu_item_sleep_timer_15_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 15, new Object[]{Integer.valueOf(15)})).b(Integer.valueOf(R.id.menu_item_sleep_timer_30_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 30, new Object[]{Integer.valueOf(30)})).b(Integer.valueOf(R.id.menu_item_sleep_timer_45_mins), resources.getQuantityString(R.plurals.context_menu_sleep_timer_mins, 45, new Object[]{Integer.valueOf(45)})).b(Integer.valueOf(R.id.menu_item_sleep_timer_1_hour), resources.getQuantityString(R.plurals.context_menu_sleep_timer_hours, 1, new Object[]{Integer.valueOf(1)})).b(Integer.valueOf(R.id.menu_item_sleep_timer_end_of_episode), this.c.getString(R.string.context_menu_sleep_timer_end_of_episode)).b(Integer.valueOf(R.id.menu_item_sleep_timer_end_of_track), this.c.getString(R.string.context_menu_sleep_timer_end_of_track)).b(Integer.valueOf(R.id.menu_item_sleep_timer_turn_off), this.c.getString(R.string.context_menu_sleep_timer_turn_off)).b();
    }

    private ContextMenuViewModel a() {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.a(this.c.getString(R.string.context_menu_sleep_timer_title));
        a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_5_mins);
        a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_10_mins);
        a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_15_mins);
        a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_30_mins);
        a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_45_mins);
        a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_1_hour);
        if (b()) {
            a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_end_of_episode);
        } else {
            a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_end_of_track);
        }
        if (this.e.d()) {
            a(contextMenuViewModel, (int) R.id.menu_item_sleep_timer_turn_off);
        }
        return contextMenuViewModel;
    }

    private void a(ContextMenuViewModel contextMenuViewModel, int i) {
        contextMenuViewModel.a(i, (CharSequence) this.b.get(Integer.valueOf(i))).d(true).a((fvc) this.d);
    }

    private boolean b() {
        return this.f == LinkType.SHOW_EPISODE;
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    public final ContextMenuViewModel a(jqo<Void> jqo) {
        return a();
    }

    public final Observable<ContextMenuViewModel> a(jqo<Void> jqo, fqn fqn) {
        return Observable.b(a());
    }
}
