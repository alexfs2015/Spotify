package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Flowable;

/* renamed from: ndt reason: default package */
public final class ndt implements rpu {
    private final rpv a;

    public ndt(rpv rpv) {
        this.a = rpv;
    }

    public final Flowable<Uri> a(String str) {
        jva a2 = jva.a(str);
        fbp.a(a2.b == LinkType.ARTIST_RELEASES);
        return this.a.a(Uri.parse(String.format("hm://artistview/v1/artist/%s/releases", new Object[]{a2.f()})));
    }
}
