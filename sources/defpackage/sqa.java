package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: sqa reason: default package */
public final class sqa implements gjx<Intent> {
    private final gjx<jst> a;

    public final /* synthetic */ boolean a(Object obj) {
        return this.a.a(jst.a(((Intent) obj).getDataString()));
    }

    private sqa(gjx<jst> gjx) {
        this.a = (gjx) fay.a(gjx);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("an intent that has a spotify link ");
        sb.append(this.a.a());
        return sb.toString();
    }

    public static gjx<Intent> a(gjx<jst> gjx) {
        return new sqa(gjx);
    }

    public static gjx<jst> a(final LinkType linkType) {
        return new gjx<jst>() {
            public final /* bridge */ /* synthetic */ boolean a(Object obj) {
                return ((jst) obj).b == linkType;
            }

            public final String a() {
                StringBuilder sb = new StringBuilder("of type ");
                sb.append(linkType);
                return sb.toString();
            }
        };
    }
}
