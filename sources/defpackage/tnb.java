package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: tnb reason: default package */
public abstract class tnb {

    /* renamed from: tnb$a */
    public interface a {
        a a(ImmutableList<LinkType> immutableList);

        a a(YourLibraryPageId yourLibraryPageId);

        a a(CharSequence charSequence);

        a a(String str);

        tnb a();

        a b(String str);

        a c(String str);
    }

    public abstract YourLibraryPageId a();

    public abstract String b();

    public abstract String c();

    public abstract CharSequence d();

    public abstract String e();

    public abstract ImmutableList<LinkType> f();

    public static a g() {
        String str = "";
        return new a().b(str).a((CharSequence) str).c(str).a(ImmutableList.d());
    }
}
