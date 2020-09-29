package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: agx reason: default package */
public class agx extends wjf<Void> implements wjg {
    public final aio a;
    private aha b;
    private aid c;
    private Collection<? extends wjf> d;

    public agx() {
        this(new aha(), new aid(), new aio());
    }

    private agx(aha aha, aid aid, aio aio) {
        this.b = aha;
        this.c = aid;
        this.a = aio;
        this.d = Collections.unmodifiableCollection(Arrays.asList(new wjf[]{aha, aid, aio}));
    }

    public static agx d() {
        return (agx) wja.a(agx.class);
    }

    public final String a() {
        return "2.9.8.30";
    }

    public final String b() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final Collection<? extends wjf> c() {
        return this.d;
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return null;
    }
}
