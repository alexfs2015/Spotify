package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: tpj reason: default package */
public final class tpj implements uqs {
    private final tnb a;

    public tpj(tnc tnc) {
        this.a = tnc.c();
    }

    public final uqr a(fpt fpt, String str) {
        return tpi.a(fpt, str);
    }

    public final YourLibraryPageId a() {
        return this.a.a();
    }

    public final CharSequence b() {
        return this.a.b();
    }

    public final boolean a(String str) {
        return this.a.f().contains(jst.a(str).b);
    }
}
