package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.Map;

/* renamed from: ipb reason: default package */
public final class ipb implements jwc<ire> {
    private static final sso a = ViewUris.bf;
    private final isn b;
    private final ipd c;

    public ipb(ipd ipd, iso iso) {
        this.c = ipd;
        this.b = new isn((CollectionStateProvider) iso.a(iso.a.get(), 1), (iss) iso.a(iso.b.get(), 2), (sso) iso.a(a, 3));
    }

    public final xim<Map<String, ire>> a(String str, String... strArr) {
        String str2 = strArr[0];
        return xii.a(xim.a(this.c.a(str2, str2)), this.b.a(str2), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$ipb$eQ102RG65SmzzhinZ6QCFRn3XM8<Object,Object,Object>(str2)).a(1).a();
    }
}
