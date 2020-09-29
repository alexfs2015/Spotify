package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import io.reactivex.Completable;

/* renamed from: mjm reason: default package */
public final class mjm implements orq, orw, osa {
    private final mjk a;
    private final ovb b;
    private final mjd c;
    private final a d;
    private final a e;
    private final mjw f;
    private final mjg g;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(uyz uyz, fyt fyt) {
    }

    public final String b() {
        return "Daily Mix";
    }

    public mjm(ovb ovb, a aVar, a aVar2, mjk mjk, mjd mjd, mjw mjw, mjg mjg) {
        this.a = mjk;
        this.b = ovb;
        this.d = aVar;
        this.e = aVar2;
        this.f = mjw;
        this.c = mjd;
        this.g = mjg;
    }

    public final ova a_(fpt fpt) {
        ovb ovb = this.b;
        ohk ohk = (ohk) this.a.a.a();
        mjd mjd = this.c;
        mjc mjc = new mjc((miy) mjd.a(mjd.a.get(), 1), (Context) mjd.a(mjd.b.get(), 2), (jjf) mjd.a(mjd.c.get(), 3), (jrp) mjd.a(mjd.d.get(), 4), (String) mjd.a(mjd.e.get(), 5));
        AnonymousClass1 r0 = new ova(ovb.a.a(ohk), null, mjc.a(fpt), $$Lambda$mjm$HQ6eCWpAR6kDjndl7ptXoH1Jxkk.INSTANCE) {
            private /* synthetic */ ova a;
            private /* synthetic */ a b;
            private /* synthetic */ a c;
            private /* synthetic */ a d;

            {
                this.a = r2;
                this.b = r3;
                this.c = r4;
                this.d = r5;
            }

            public final Completable a() {
                return this.a.a();
            }

            public final void a(Bundle bundle) {
                this.a.a(bundle);
            }

            public final void a(a aVar) {
                this.a.a(aVar);
            }

            public final void az_() {
                this.a.az_();
            }

            public final void c() {
                this.a.c();
            }

            public final void d() {
                this.a.d();
            }

            public final void b(Bundle bundle) {
                this.a.b(bundle);
            }

            public final void a(fyt fyt, a aVar, a aVar2, a aVar3) {
                this.a.a(fyt, this.b, this.c, this.d);
            }

            public final void a(ViewGroup viewGroup) {
                this.a.a(viewGroup);
            }

            public final void a(osi osi) {
                this.a.a(osi);
            }

            public final void ap_() {
                this.a.ap_();
            }

            public final fxn b() {
                return this.a.b();
            }
        };
        return r0;
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final boolean a(FormatListType formatListType, fpt fpt) {
        return formatListType == FormatListType.DAILY_MIX;
    }

    public final onq<?> b(fpt fpt) {
        if (miv.a(fpt)) {
            return this.d.a(this.f, this.a.a());
        }
        return this.e.a(this.f, this.a.a());
    }

    public final ofc c() {
        mjg mjg = this.g;
        return new mjf((mji) mjg.a(mjg.a.get(), 1), (String) mjg.a(mjg.b.get(), 2));
    }
}
