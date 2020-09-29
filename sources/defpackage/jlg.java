package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: jlg reason: default package */
public final class jlg {
    public static void a(jqx jqx, Intent intent) {
        a(jqx, intent.getExtras());
    }

    public static void a(jqx jqx, Bundle bundle) {
        if (!jqx.c.equals(jqx) && !jqx.d.equals(jqx)) {
            Bundle bundle2 = jqx.ae().i;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                jqx.ae().g(bundle2);
            }
            bundle2.putAll((Bundle) fbp.a(bundle));
        }
    }
}
