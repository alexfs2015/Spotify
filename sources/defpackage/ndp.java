package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.functions.Function;
import java.util.TreeSet;

/* renamed from: ndp reason: default package */
public final class ndp {
    private final juc a;
    private final jty b;
    private final vlp c;
    private final rpv d;

    public ndp(juc juc, jty jty, vlp vlp, rpv rpv) {
        this.a = juc;
        this.b = jty;
        this.c = vlp;
        this.d = rpv;
    }

    /* access modifiers changed from: private */
    public String a(Uri uri) {
        String a2 = this.a.a();
        boolean g = this.b.g();
        Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("device_id", a2).appendQueryParameter("purchase_allowed", Boolean.toString(g));
        if (!this.c.a()) {
            TreeSet treeSet = new TreeSet(this.c.b());
            StringBuilder sb = new StringBuilder("ondemand:");
            sb.append(fbl.a(",").a((Iterable<?>) treeSet));
            buildUpon.appendQueryParameter("signal", sb.toString());
        }
        return buildUpon.toString();
    }

    public final xii<String> a(String str) {
        jva a2 = jva.a(str);
        fbp.a(a2.b == LinkType.ARTIST, (Object) "SpotifyLink needs to be of link type Artist");
        return wit.a((xfk<T>) this.d.a(Uri.parse(String.format("hm://artistview/v1/artist/%s", new Object[]{a2.f()}))).c((Function<? super T, ? extends R>) new $$Lambda$ndp$OsLFVczp5YtqKUKv8nSo8LbeHwA<Object,Object>(this)));
    }
}
