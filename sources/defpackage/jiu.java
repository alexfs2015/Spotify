package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: jiu reason: default package */
public final class jiu {
    public static void a(jol jol, Intent intent) {
        a(jol, intent.getExtras());
    }

    public static void a(jol jol, Bundle bundle) {
        if (!jol.c.equals(jol) && !jol.d.equals(jol)) {
            Bundle bundle2 = jol.ae().i;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                jol.ae().g(bundle2);
            }
            bundle2.putAll((Bundle) fay.a(bundle));
        }
    }
}
