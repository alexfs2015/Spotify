package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: tzv reason: default package */
public final class tzv implements vbx {
    private final tza a;

    public tzv(tzb tzb) {
        this.a = tzb.b();
    }

    public final YourLibraryPageId a() {
        return this.a.a();
    }

    public final vbw a(fqn fqn, String str) {
        return tzu.a(fqn, str);
    }

    public final boolean a(String str) {
        return this.a.f().contains(jva.a(str).b);
    }

    public final CharSequence b() {
        return this.a.b();
    }
}
