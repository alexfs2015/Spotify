package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState;

/* renamed from: -$$Lambda$jrv$i8sdjv5-WPP1DoQx1r1sIJDrS1Q reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jrv$i8sdjv5WPP1DoQx1r1sIJDrS1Q implements gcs {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ TextView f$1;

    public /* synthetic */ $$Lambda$jrv$i8sdjv5WPP1DoQx1r1sIJDrS1Q(Context context, TextView textView) {
        this.f$0 = context;
        this.f$1 = textView;
    }

    public final void accept(Object obj) {
        ((DownloadIndicatorDrawable) jwu.a(this.f$0, this.f$1, 0, R.id.drawable_group_download_indicator, new $$Lambda$jrv$nLrhhpKY_oHFd3LpeoFTv5ILD3U(this.f$0))).a(DownloadState.WAITING);
    }
}
