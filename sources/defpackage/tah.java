package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: tah reason: default package */
public final class tah implements gli<Intent> {
    private final gli<jva> a;

    private tah(gli<jva> gli) {
        this.a = (gli) fbp.a(gli);
    }

    public static gli<jva> a(final LinkType linkType) {
        return new gli<jva>() {
            public final String a() {
                StringBuilder sb = new StringBuilder("of type ");
                sb.append(linkType);
                return sb.toString();
            }

            public final /* bridge */ /* synthetic */ boolean a(Object obj) {
                return ((jva) obj).b == linkType;
            }
        };
    }

    public static gli<Intent> a(gli<jva> gli) {
        return new tah(gli);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("an intent that has a spotify link ");
        sb.append(this.a.a());
        return sb.toString();
    }

    public final /* synthetic */ boolean a(Object obj) {
        return this.a.a(jva.a(((Intent) obj).getDataString()));
    }
}
