package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: ucp reason: default package */
public final class ucp implements jpk<Integer> {
    private static final ImmutableMap<Integer, Integer> b = ImmutableMap.g().b(Integer.valueOf(R.id.menu_item_speed_control_50), Integer.valueOf(R.string.context_menu_speed_control_50)).b(Integer.valueOf(R.id.menu_item_speed_control_80), Integer.valueOf(R.string.context_menu_speed_control_80)).b(Integer.valueOf(R.id.menu_item_speed_control_100), Integer.valueOf(R.string.context_menu_speed_control_100)).b(Integer.valueOf(R.id.menu_item_speed_control_120), Integer.valueOf(R.string.context_menu_speed_control_120)).b(Integer.valueOf(R.id.menu_item_speed_control_150), Integer.valueOf(R.string.context_menu_speed_control_150)).b(Integer.valueOf(R.id.menu_item_speed_control_200), Integer.valueOf(R.string.context_menu_speed_control_200)).b(Integer.valueOf(R.id.menu_item_speed_control_300), Integer.valueOf(R.string.context_menu_speed_control_300)).b();
    private final Context c;
    private final ucn d;

    public ucp(Context context, ucn ucn) {
        this.c = context;
        this.d = ucn;
    }

    private ContextMenuViewModel a() {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.a(this.c.getString(R.string.context_menu_speed_control_title));
        a(contextMenuViewModel, (int) R.id.menu_item_speed_control_50);
        a(contextMenuViewModel, (int) R.id.menu_item_speed_control_80);
        a(contextMenuViewModel, (int) R.id.menu_item_speed_control_100);
        a(contextMenuViewModel, (int) R.id.menu_item_speed_control_120);
        a(contextMenuViewModel, (int) R.id.menu_item_speed_control_150);
        a(contextMenuViewModel, (int) R.id.menu_item_speed_control_200);
        a(contextMenuViewModel, (int) R.id.menu_item_speed_control_300);
        return contextMenuViewModel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ContextMenuViewModel a(Integer num) {
        ContextMenuViewModel a = a();
        a(a, num);
        return a;
    }

    private void a(ContextMenuViewModel contextMenuViewModel, int i) {
        contextMenuViewModel.a(i, this.c.getString(((Integer) b.get(Integer.valueOf(i))).intValue())).d(false).a((fvc) this.d);
    }

    private void a(ContextMenuViewModel contextMenuViewModel, Integer num) {
        Integer a = ucm.a(num);
        if (a != null) {
            contextMenuViewModel.b.clear();
            fdz R_ = b.keySet().iterator();
            while (R_.hasNext()) {
                Integer num2 = (Integer) R_.next();
                if (a.equals(num2)) {
                    b(contextMenuViewModel, num2.intValue());
                } else {
                    a(contextMenuViewModel, num2.intValue());
                }
            }
        }
    }

    private void b(ContextMenuViewModel contextMenuViewModel, int i) {
        StringBuilder sb = new StringBuilder("✓ ");
        sb.append(this.c.getString(((Integer) b.get(Integer.valueOf(i))).intValue()));
        String sb2 = sb.toString();
        if (vgi.a(this.c)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.c.getString(((Integer) b.get(Integer.valueOf(i))).intValue()));
            sb3.append(" ✓");
            sb2 = sb3.toString();
        }
        contextMenuViewModel.a(i, sb2).d(false).a((fvc) this.d).b(true).c(true);
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    public final ContextMenuViewModel a(jqo<Integer> jqo) {
        return a();
    }

    public final Observable<ContextMenuViewModel> a(jqo<Integer> jqo, fqn fqn) {
        ContextMenuViewModel a = a();
        a(a, (Integer) jqo.b());
        return this.d.a().c((Function<? super T, ? extends R>) new $$Lambda$ucp$DCfJP5oBzklW73wjAUmrdXLzxjM<Object,Object>(this)).e(a);
    }
}
