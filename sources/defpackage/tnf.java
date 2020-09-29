package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.Map;

/* renamed from: tnf reason: default package */
public final class tnf {
    final tng a;
    final Map<String, String> b;

    public tnf(tng tng, jtz jtz, jty jty, String str, Context context) {
        this.a = tng;
        a b2 = ImmutableMap.g().b("signal", "is_car_connected:true").b("client-platform", "android").b("client-locale", str).b("client-timezone", jtz.e().getID());
        String a2 = jty.a();
        this.b = b2.b("client-version", a2).b("tablet-layout", String.valueOf(jvi.c(context))).b();
    }
}
