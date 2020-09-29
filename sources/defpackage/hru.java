package defpackage;

/* renamed from: hru reason: default package */
public final class hru implements hrw {
    private final wzi<htf> a;
    private final hrk b;
    private final hsb c;
    private final hrs d;
    private final hrm e;

    public hru(wzi<htf> wzi, hrk hrk, hsb hsb, hrs hrs, hrm hrm) {
        this.a = wzi;
        this.b = hrk;
        this.c = hsb;
        this.d = hrs;
        this.e = hrm;
    }

    public final hth a() {
        return (hth) this.a.get();
    }

    public final boolean a(huo huo) {
        if (huo.e()) {
            if (!this.b.a(huo) && !this.c.a(huo) && !this.d.a(huo) && !this.e.a(huo)) {
                return true;
            }
        }
        return false;
    }
}
