package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState;

/* renamed from: -$$Lambda$juf$xl1NaReRseKaEN5ICykajsbLu5c reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$juf$xl1NaReRseKaEN5ICykajsbLu5c implements ged {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ TextView f$1;

    public /* synthetic */ $$Lambda$juf$xl1NaReRseKaEN5ICykajsbLu5c(Context context, TextView textView) {
        this.f$0 = context;
        this.f$1 = textView;
    }

    public final void accept(Object obj) {
        ((DownloadIndicatorDrawable) jyw.a(this.f$0, this.f$1, 0, R.id.drawable_group_download_indicator, new $$Lambda$juf$e8v5_xbGZY2JcC92tHfdAdPcC1A(this.f$0))).a(DownloadState.DOWNLOADED);
    }
}
