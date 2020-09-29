package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;

/* renamed from: jbp reason: default package */
public abstract class jbp implements jbn {

    /* renamed from: jbp$a */
    public interface a {
        a a(int i);

        a a(Optional<Drawable> optional);

        a a(ImmutableList<ShareCapability> immutableList);

        a a(String str);

        jbp a();

        a b(Optional<String> optional);
    }

    public abstract int a();

    public abstract int b();

    public abstract String c();

    public abstract Optional<String> d();

    public abstract Optional<Drawable> f();

    /* renamed from: g */
    public abstract ImmutableList<ShareCapability> e();

    public static a a(int i, int i2, String str, ShareCapability shareCapability) {
        a aVar = new a();
        aVar.a = Integer.valueOf(i);
        return aVar.a(i2).a(str).b(Optional.e()).a(Optional.e()).a(ImmutableList.a(shareCapability));
    }
}
