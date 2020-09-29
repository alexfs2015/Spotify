package defpackage;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;

/* renamed from: -$$Lambda$qzg$7pbhvoK1NUQ0fnUQsQyu5pfMHgU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qzg$7pbhvoK1NUQ0fnUQsQyu5pfMHgU implements xit {
    private final /* synthetic */ RemoteViews f$0;

    public /* synthetic */ $$Lambda$qzg$7pbhvoK1NUQ0fnUQsQyu5pfMHgU(RemoteViews remoteViews) {
        this.f$0 = remoteViews;
    }

    public final void call(Object obj, Object obj2) {
        ((AppWidgetManager) obj).updateAppWidget((int[]) obj2, this.f$0);
    }
}
