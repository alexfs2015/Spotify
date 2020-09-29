package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.phonenumbersignup.datasource.AuthenticatorDataSource;

/* renamed from: ohx reason: default package */
public final class ohx implements wig<AuthenticatorDataSource> {
    private final wzi<a> a;
    private final wzi<got> b;

    private ohx(wzi<a> wzi, wzi<got> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ohx a(wzi<a> wzi, wzi<got> wzi2) {
        return new ohx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new AuthenticatorDataSource((a) this.a.get(), (got) this.b.get());
    }
}
