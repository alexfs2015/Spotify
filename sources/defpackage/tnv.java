package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: tnv reason: default package */
public final class tnv implements uqs {
    private final tnb a;

    public tnv(tnc tnc) {
        this.a = tnc.b();
    }

    public final uqr a(fpt fpt, String str) {
        return tnu.a(fpt, str);
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
