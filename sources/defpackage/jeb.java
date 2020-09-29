package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;

/* renamed from: jeb reason: default package */
public abstract class jeb implements jdz {

    /* renamed from: jeb$a */
    public interface a {
        a a(int i);

        a a(Drawable drawable);

        a a(Optional<String> optional);

        a a(ImmutableList<ShareCapability> immutableList);

        a a(String str);

        jeb a();
    }

    public static a a(int i, int i2, String str, ShareCapability shareCapability, Drawable drawable) {
        a aVar = new a();
        aVar.a = Integer.valueOf(i);
        return aVar.a(i2).a(str).a(Optional.e()).a(drawable).a(ImmutableList.a(shareCapability));
    }

    public abstract int a();

    public abstract int b();

    public abstract Drawable c();

    public abstract String d();

    public abstract Optional<String> e();

    /* renamed from: g */
    public abstract ImmutableList<ShareCapability> f();
}
