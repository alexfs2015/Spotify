package defpackage;

/* renamed from: hsl reason: default package */
public final class hsl implements hrw {
    private final who<huj> a;

    public hsl(who<huj> who) {
        this.a = who;
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        String b = huo.b();
        return "com.spotify.your-playlists".equals(b) || b.contains(":folder:");
    }
}
