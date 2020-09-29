package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: agj reason: default package */
public class agj extends vuz<Void> implements vva {
    public final aia a;
    private agm b;
    private ahp c;
    private Collection<? extends vuz> d;

    public final String a() {
        return "2.9.8.30";
    }

    public final String b() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return null;
    }

    public agj() {
        this(new agm(), new ahp(), new aia());
    }

    private agj(agm agm, ahp ahp, aia aia) {
        this.b = agm;
        this.c = ahp;
        this.a = aia;
        this.d = Collections.unmodifiableCollection(Arrays.asList(new vuz[]{agm, ahp, aia}));
    }

    public final Collection<? extends vuz> c() {
        return this.d;
    }

    public static agj d() {
        return (agj) vuu.a(agj.class);
    }
}
