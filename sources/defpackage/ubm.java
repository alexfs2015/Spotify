package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: ubm reason: default package */
public final class ubm implements vbx {
    private final tza a;

    public ubm(tzb tzb) {
        this.a = tzb.c();
    }

    public final YourLibraryPageId a() {
        return this.a.a();
    }

    public final vbw a(fqn fqn, String str) {
        return ubl.a(fqn, str);
    }

    public final boolean a(String str) {
        return this.a.f().contains(jva.a(str).b);
    }

    public final CharSequence b() {
        return this.a.b();
    }
}
