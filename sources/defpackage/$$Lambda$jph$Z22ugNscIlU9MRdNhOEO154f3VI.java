package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import io.reactivex.functions.BiFunction;
import java.util.List;

/* renamed from: -$$Lambda$jph$Z22ugNscIlU9MRdNhOEO154f3VI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jph$Z22ugNscIlU9MRdNhOEO154f3VI implements BiFunction {
    private final /* synthetic */ ContextMenuHelper f$0;
    private final /* synthetic */ List f$1;
    private final /* synthetic */ ContextMenuViewModel f$2;

    public /* synthetic */ $$Lambda$jph$Z22ugNscIlU9MRdNhOEO154f3VI(ContextMenuHelper contextMenuHelper, List list, ContextMenuViewModel contextMenuViewModel) {
        this.f$0 = contextMenuHelper;
        this.f$1 = list;
        this.f$2 = contextMenuViewModel;
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f$0.a(this.f$1, (kai) obj2);
    }
}
