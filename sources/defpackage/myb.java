package defpackage;

import android.os.Bundle;

/* renamed from: myb reason: default package */
public final class myb implements wig<String> {
    private final wzi<mxn> a;

    private myb(wzi<mxn> wzi) {
        this.a = wzi;
    }

    public static myb a(wzi<mxn> wzi) {
        return new myb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((Bundle) fbp.a(((mxn) this.a.get()).i)).getString("album_view_uri"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
