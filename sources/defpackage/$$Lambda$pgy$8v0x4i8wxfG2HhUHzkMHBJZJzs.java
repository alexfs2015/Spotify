package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.podcasttrailer.v1.proto.PodcastTrailerResponse;

/* renamed from: -$$Lambda$pgy$8v0x-4i8wxfG2HhUHzkMHBJZJzs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pgy$8v0x4i8wxfG2HhUHzkMHBJZJzs implements OnClickListener {
    private final /* synthetic */ pgy f$0;
    private final /* synthetic */ PodcastTrailerResponse f$1;

    public /* synthetic */ $$Lambda$pgy$8v0x4i8wxfG2HhUHzkMHBJZJzs(pgy pgy, PodcastTrailerResponse podcastTrailerResponse) {
        this.f$0 = pgy;
        this.f$1 = podcastTrailerResponse;
    }

    public final void onClick(View view) {
        this.f$0.a(this.f$1, view);
    }
}
