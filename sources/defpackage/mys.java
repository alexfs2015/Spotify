package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.functions.Function;
import java.util.TreeSet;

/* renamed from: mys reason: default package */
public final class mys {
    private final jrs a;
    private final jro b;
    private final uzm c;
    private final rgt d;

    public mys(jrs jrs, jro jro, uzm uzm, rgt rgt) {
        this.a = jrs;
        this.b = jro;
        this.c = uzm;
        this.d = rgt;
    }

    public final wud<String> a(String str) {
        jst a2 = jst.a(str);
        fay.a(a2.b == LinkType.ARTIST, (Object) "SpotifyLink needs to be of link type Artist");
        return vun.a((wrf<T>) this.d.a(Uri.parse(String.format("hm://artistview/v1/artist/%s", new Object[]{a2.f()}))).c((Function<? super T, ? extends R>) new $$Lambda$mys$3yDv6gxEGUmRTn1rzhtgPAoFPUk<Object,Object>(this)));
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
            sb.append(fau.a(",").a((Iterable<?>) treeSet));
            buildUpon.appendQueryParameter("signal", sb.toString());
        }
        return buildUpon.toString();
    }
}
