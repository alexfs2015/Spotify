package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.Map;

/* renamed from: tcy reason: default package */
public final class tcy {
    final tcz a;
    final Map<String, String> b;

    public tcy(tcz tcz, jrp jrp, jro jro, String str, Context context) {
        this.a = tcz;
        a b2 = ImmutableMap.g().b("signal", "is_car_connected:true").b("client-platform", "android").b("client-locale", str).b("client-timezone", jrp.e().getID());
        String a2 = jro.a();
        this.b = b2.b("client-version", a2).b("tablet-layout", String.valueOf(jtc.c(context))).b();
    }
}
