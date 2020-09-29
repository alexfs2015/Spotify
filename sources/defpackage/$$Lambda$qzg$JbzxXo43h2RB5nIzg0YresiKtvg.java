package defpackage;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;

/* renamed from: -$$Lambda$qzg$JbzxXo43h2RB5nIzg0YresiKtvg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qzg$JbzxXo43h2RB5nIzg0YresiKtvg implements xit {
    private final /* synthetic */ RemoteViews f$0;

    public /* synthetic */ $$Lambda$qzg$JbzxXo43h2RB5nIzg0YresiKtvg(RemoteViews remoteViews) {
        this.f$0 = remoteViews;
    }

    public final void call(Object obj, Object obj2) {
        ((AppWidgetManager) obj).partiallyUpdateAppWidget((int[]) obj2, this.f$0);
    }
}
