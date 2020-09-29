package defpackage;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;

/* renamed from: -$$Lambda$qqr$EfpJ2qPZ6Gy73nXk3vjZS-1vhjg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qqr$EfpJ2qPZ6Gy73nXk3vjZS1vhjg implements wuo {
    private final /* synthetic */ RemoteViews f$0;

    public /* synthetic */ $$Lambda$qqr$EfpJ2qPZ6Gy73nXk3vjZS1vhjg(RemoteViews remoteViews) {
        this.f$0 = remoteViews;
    }

    public final void call(Object obj, Object obj2) {
        ((AppWidgetManager) obj).partiallyUpdateAppWidget((int[]) obj2, this.f$0);
    }
}
