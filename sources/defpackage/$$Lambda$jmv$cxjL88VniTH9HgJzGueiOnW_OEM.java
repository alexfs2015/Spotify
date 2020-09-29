package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import io.reactivex.functions.BiFunction;
import java.util.List;

/* renamed from: -$$Lambda$jmv$cxjL88VniTH9HgJzGueiOnW_OEM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jmv$cxjL88VniTH9HgJzGueiOnW_OEM implements BiFunction {
    private final /* synthetic */ ContextMenuHelper f$0;
    private final /* synthetic */ List f$1;
    private final /* synthetic */ ContextMenuViewModel f$2;

    public /* synthetic */ $$Lambda$jmv$cxjL88VniTH9HgJzGueiOnW_OEM(ContextMenuHelper contextMenuHelper, List list, ContextMenuViewModel contextMenuViewModel) {
        this.f$0 = contextMenuHelper;
        this.f$1 = list;
        this.f$2 = contextMenuViewModel;
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f$0.a(this.f$1, (jyi) obj2);
    }
}
