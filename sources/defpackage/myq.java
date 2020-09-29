package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Flowable;

/* renamed from: myq reason: default package */
public final class myq implements rgs {
    private final rgt a;

    public myq(rgt rgt) {
        this.a = rgt;
    }

    public final Flowable<Uri> a(String str) {
        jst a2 = jst.a(str);
        fay.a(a2.b == LinkType.ARTIST_RELEASES);
        return this.a.a(Uri.parse(String.format("hm://artistview/v1/artist/%s/releases", new Object[]{a2.f()})));
    }
}
