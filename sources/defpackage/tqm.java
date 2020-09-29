package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: tqm reason: default package */
public final class tqm implements jmy<Integer> {
    private static final ImmutableMap<Integer, Integer> b = ImmutableMap.g().b(Integer.valueOf(R.id.menu_item_speed_control_50), Integer.valueOf(R.string.context_menu_speed_control_50)).b(Integer.valueOf(R.id.menu_item_speed_control_80), Integer.valueOf(R.string.context_menu_speed_control_80)).b(Integer.valueOf(R.id.menu_item_speed_control_100), Integer.valueOf(R.string.context_menu_speed_control_100)).b(Integer.valueOf(R.id.menu_item_speed_control_120), Integer.valueOf(R.string.context_menu_speed_control_120)).b(Integer.valueOf(R.id.menu_item_speed_control_150), Integer.valueOf(R.string.context_menu_speed_control_150)).b(Integer.valueOf(R.id.menu_item_speed_control_200), Integer.valueOf(R.string.context_menu_speed_control_200)).b(Integer.valueOf(R.id.menu_item_speed_control_300), Integer.valueOf(R.string.context_menu_speed_control_300)).b();
    private final Context c;
    private final tqk d;

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return contextMenuViewModel;
    }

    public tqm(Context context, tqk tqk) {
        this.c = context;
        this.d = tqk;
    }

    public final Observable<ContextMenuViewModel> a(joc<Integer> joc, fpt fpt) {
        ContextMenuViewModel a = a();
        a(a, (Integer) joc.b());
        return this.d.a().c((Function<? super T, ? extends R>) new $$Lambda$tqm$D1iIBglFDGEuAP2DPcQMaSRv7Y<Object,Object>(this)).e(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ContextMenuViewModel a(Integer num) {
        ContextMenuViewModel a = a();
        a(a, num);
        return a;
    }

    private void a(ContextMenuViewModel contextMenuViewModel, Integer num) {
        Integer a = tqj.a(num);
        if (a != null) {
            contextMenuViewModel.b.clear();
            fdh R_ = b.keySet().iterator();
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

    private void a(ContextMenuViewModel contextMenuViewModel, int i) {
        contextMenuViewModel.a(i, this.c.getString(((Integer) b.get(Integer.valueOf(i))).intValue())).d(false).a((fui) this.d);
    }

    private void b(ContextMenuViewModel contextMenuViewModel, int i) {
        StringBuilder sb = new StringBuilder("✓ ");
        sb.append(this.c.getString(((Integer) b.get(Integer.valueOf(i))).intValue()));
        String sb2 = sb.toString();
        if (uur.a(this.c)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.c.getString(((Integer) b.get(Integer.valueOf(i))).intValue()));
            sb3.append(" ✓");
            sb2 = sb3.toString();
        }
        contextMenuViewModel.a(i, sb2).d(false).a((fui) this.d).b(true).c(true);
    }

    public final ContextMenuViewModel a(joc<Integer> joc) {
        return a();
    }
}
