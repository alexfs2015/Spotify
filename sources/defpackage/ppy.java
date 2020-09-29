package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.model.ProfileListItem.Type;

/* renamed from: ppy reason: default package */
public final class ppy extends androidx.recyclerview.widget.RecyclerView.a<f> {
    final jyx a;
    public a d = $$Lambda$ppy$yUQj_2nRZvnGxM8OoCNJfU27JbY.INSTANCE;
    public d e = $$Lambda$ppy$afh64Oiol2MsmdE9wAM5dozZ3IA.INSTANCE;
    private String f = "";
    private prg g = prg.c;
    private int h = Integer.MAX_VALUE;

    /* renamed from: ppy$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.profile.model.ProfileListItem$Type[] r0 = com.spotify.music.features.profile.model.ProfileListItem.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.profile.model.ProfileListItem$Type r1 = com.spotify.music.features.profile.model.ProfileListItem.Type.PROFILE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.profile.model.ProfileListItem$Type r1 = com.spotify.music.features.profile.model.ProfileListItem.Type.ARTIST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.profile.model.ProfileListItem$Type r1 = com.spotify.music.features.profile.model.ProfileListItem.Type.PLAYLIST     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ppy.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: ppy$a */
    public interface a {
        void profileListItemClicked(ProfileListItem profileListItem);
    }

    /* renamed from: ppy$b */
    public class b extends f {
        public b(ViewGroup viewGroup) {
            fqv.b();
            super(fsk.b(viewGroup.getContext(), viewGroup, false).getView());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(ProfileListItem profileListItem, View view) {
            ppy.this.d.profileListItemClicked(profileListItem);
        }

        public final void a(ProfileListItem profileListItem) {
            fsc fsc = (fsc) fqz.a(this.o, fsc.class);
            fsc.a(profileListItem.c());
            fsc.b(profileListItem.d());
            String e = fbo.a(profileListItem.e()) ? null : profileListItem.e();
            int i = AnonymousClass1.a[profileListItem.a().ordinal()];
            if (i == 1) {
                ppy.this.a.b(fsc.c(), e);
            } else if (i == 2) {
                ppy.this.a.d(fsc.c(), e);
            } else if (i == 3) {
                ppy.this.a.e(fsc.c(), e);
            }
            fsc.getView().setOnClickListener(new $$Lambda$ppy$b$GVnx5I_uvWyowD_6zmFlNjQc(this, profileListItem));
        }
    }

    /* renamed from: ppy$c */
    public static class c extends f {
        public c(ViewGroup viewGroup) {
            super(fqv.e().a(viewGroup.getContext(), viewGroup).getView());
        }
    }

    /* renamed from: ppy$d */
    public interface d {
        void seeAllClicked();
    }

    /* renamed from: ppy$e */
    public class e extends f {
        public e(ViewGroup viewGroup) {
            fqv.b();
            super(fsk.a(viewGroup.getContext(), viewGroup).getView());
            frx frx = (frx) fqz.a(this.o, frx.class);
            frx.a(viewGroup.getContext().getString(R.string.profile_list_see_all_footer));
            frx.getView().setOnClickListener(new $$Lambda$ppy$e$FZqrjN00TBAqVR2LgcaugDzazvI(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(View view) {
            ppy.this.e.seeAllClicked();
        }
    }

    /* renamed from: ppy$f */
    public static class f extends u {
        public f(View view) {
            super(view);
        }

        public void a(ProfileListItem profileListItem) {
        }
    }

    public ppy(jyx jyx) {
        this.a = jyx;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ProfileListItem profileListItem) {
    }

    private boolean a() {
        return !this.f.isEmpty();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    private ProfileListItem g(int i) {
        if (a()) {
            i--;
        }
        return (ProfileListItem) this.g.b().get(i);
    }

    private boolean h(int i) {
        if (this.h != Integer.MAX_VALUE) {
            if (a()) {
                i--;
            }
            if (i >= this.h) {
                return true;
            }
        }
        return false;
    }

    public final int a(int i) {
        if (i == 0 && a()) {
            return 0;
        }
        if (h(i)) {
            return 2;
        }
        int i2 = AnonymousClass1.a[g(i).a().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return 1;
        }
        throw new AssertionError("Type not supported");
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new c(viewGroup);
        }
        if (i == 1) {
            return new b(viewGroup);
        }
        if (i == 2) {
            return new e(viewGroup);
        }
        throw new AssertionError("View type not supported");
    }

    public final /* synthetic */ void a(u uVar, int i) {
        f fVar = (f) uVar;
        int a2 = a(i);
        if (a2 != 0) {
            if (a2 == 1) {
                fVar.a(g(i));
            }
            return;
        }
        c cVar = (c) fVar;
        ((fsm) fqz.a(cVar.o, fsm.class)).a((CharSequence) this.f);
    }

    public final void a(String str) {
        this.f = str;
        e();
    }

    public final void a(prg prg) {
        this.g = prg;
        e();
    }

    public final int b() {
        int i;
        if (this.h != Integer.MAX_VALUE) {
            int size = this.g.b().size();
            int i2 = this.h;
            if (size > i2) {
                i = i2 + 1;
                return (i <= 0 || !a()) ? i : i + 1;
            }
        }
        i = this.g.b().size();
        if (i <= 0) {
            return i;
        }
    }

    public final void f(int i) {
        this.h = 3;
        e();
    }
}
