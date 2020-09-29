package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState;

/* renamed from: -$$Lambda$juf$vmascy3GmOGAv2d4aNIWQt7J_zI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$juf$vmascy3GmOGAv2d4aNIWQt7J_zI implements ged {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ TextView f$1;

    public /* synthetic */ $$Lambda$juf$vmascy3GmOGAv2d4aNIWQt7J_zI(Context context, TextView textView) {
        this.f$0 = context;
        this.f$1 = textView;
    }

    public final void accept(Object obj) {
        ((DownloadIndicatorDrawable) jyw.a(this.f$0, this.f$1, 0, R.id.drawable_group_download_indicator, new $$Lambda$juf$GVwqgHlqMfQtEN4j2dTOVPsfyCo(this.f$0))).a(DownloadState.WAITING);
    }
}
