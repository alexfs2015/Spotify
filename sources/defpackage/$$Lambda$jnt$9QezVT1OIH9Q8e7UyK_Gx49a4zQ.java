package defpackage;

import android.net.Uri;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import io.reactivex.functions.BiFunction;

/* renamed from: -$$Lambda$jnt$9QezVT1OIH9Q8e7UyK_Gx49a4zQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jnt$9QezVT1OIH9Q8e7UyK_Gx49a4zQ implements BiFunction {
    private final /* synthetic */ ContextMenuHelper f$0;
    private final /* synthetic */ ContextMenuViewModel f$1;

    public /* synthetic */ $$Lambda$jnt$9QezVT1OIH9Q8e7UyK_Gx49a4zQ(ContextMenuHelper contextMenuHelper, ContextMenuViewModel contextMenuViewModel) {
        this.f$0 = contextMenuHelper;
        this.f$1 = contextMenuViewModel;
    }

    public final Object apply(Object obj, Object obj2) {
        return this.f$0.a(this.f$1.b.size(), String.valueOf((Uri) obj2));
    }
}
