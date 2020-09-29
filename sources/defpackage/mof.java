package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import io.reactivex.Completable;

/* renamed from: mof reason: default package */
public final class mof implements oyw, ozc, ozg {
    private final mod a;
    private final pcm b;
    private final mnw c;
    private final a d;
    private final a e;
    private final mop f;
    private final mnz g;

    public mof(pcm pcm, a aVar, a aVar2, mod mod, mnw mnw, mop mop, mnz mnz) {
        this.a = mod;
        this.b = pcm;
        this.d = aVar;
        this.e = aVar2;
        this.f = mop;
        this.c = mnw;
        this.g = mnz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(vlc vlc, fzn fzn) {
    }

    public final Type a() {
        return Type.CUSTOM;
    }

    public final boolean a(FormatListType formatListType, fqn fqn) {
        return formatListType == FormatListType.DAILY_MIX;
    }

    public final pcl a_(fqn fqn) {
        pcm pcm = this.b;
        ooo ooo = (ooo) this.a.a.a();
        mnw mnw = this.c;
        mnv mnv = new mnv((mnr) mnw.a(mnw.a.get(), 1), (Context) mnw.a(mnw.b.get(), 2), (jlr) mnw.a(mnw.c.get(), 3), (jtz) mnw.a(mnw.d.get(), 4), (String) mnw.a(mnw.e.get(), 5));
        AnonymousClass1 r0 = new pcl(pcm.a.a(ooo), null, mnv.a(fqn), $$Lambda$mof$QpSMhtuScsDHxxQzk8qnsjG7ZY.INSTANCE) {
            private /* synthetic */ pcl a;
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

            public final void a(ViewGroup viewGroup) {
                this.a.a(viewGroup);
            }

            public final void a(fzn fzn, a aVar, a aVar2, a aVar3) {
                this.a.a(fzn, this.b, this.c, this.d);
            }

            public final void a(a aVar) {
                this.a.a(aVar);
            }

            public final void a(ozo ozo) {
                this.a.a(ozo);
            }

            public final void ao_() {
                this.a.ao_();
            }

            public final void ay_() {
                this.a.ay_();
            }

            public final fyh b() {
                return this.a.b();
            }

            public final void b(Bundle bundle) {
                this.a.b(bundle);
            }

            public final void c() {
                this.a.c();
            }

            public final void d() {
                this.a.d();
            }
        };
        return r0;
    }

    public final String b() {
        return "Daily Mix";
    }

    public final ouw<?> b(fqn fqn) {
        return mno.a(fqn) ? this.d.a(this.f, this.a.a()) : this.e.a(this.f, this.a.a());
    }

    public final omg c() {
        mnz mnz = this.g;
        return new mny((mob) mnz.a(mnz.a.get(), 1), (String) mnz.a(mnz.b.get(), 2));
    }
}
