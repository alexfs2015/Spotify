package defpackage;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;

/* renamed from: -$$Lambda$qqr$ALiZeM2BheVGJxkBHskpbKMT0fY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qqr$ALiZeM2BheVGJxkBHskpbKMT0fY implements wuo {
    private final /* synthetic */ RemoteViews f$0;

    public /* synthetic */ $$Lambda$qqr$ALiZeM2BheVGJxkBHskpbKMT0fY(RemoteViews remoteViews) {
        this.f$0 = remoteViews;
    }

    public final void call(Object obj, Object obj2) {
        ((AppWidgetManager) obj).updateAppWidget((int[]) obj2, this.f$0);
    }
}
