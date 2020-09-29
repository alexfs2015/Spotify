package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.yourlibrary.container.YourLibraryPrefs;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import io.reactivex.Observable;
import java.util.Map.Entry;

/* renamed from: rab reason: default package */
public class rab extends jrd implements a, NavigationItem, jqx, jrn, raf, a, szs, uqq, vbv {
    public vcg T;
    public qzz U;
    public rae V;
    public YourLibraryPrefs W;
    public lbr X;
    private rbc Y;
    private b<ram, rak> Z;
    public rac a;
    public rbd b;

    public static rab a(fqn fqn, String str, jva jva) {
        rab rab = new rab();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        bundle.putString("YourLibraryFragment.uri", jva.h());
        rab.g(bundle);
        fqo.a((Fragment) rab, fqn);
        return rab;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable am() {
        return this.U.c;
    }

    public final void A() {
        super.A();
        this.Z.d();
        this.X.a(null);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        YourLibraryPageId yourLibraryPageId;
        rbd rbd = this.b;
        rbc rbc = new rbc((LayoutInflater) rbd.a(layoutInflater, 1), viewGroup, (Context) rbd.a(rbd.a.get(), 3), (qzz) rbd.a(rbd.b.get(), 4), (rax) rbd.a(rbd.c.get(), 5), (ras) rbd.a(rbd.d.get(), 6), (rap) rbd.a(rbd.e.get(), 7), (raz) rbd.a(rbd.f.get(), 8), (qzx) rbd.a(rbd.g.get(), 9));
        this.Y = rbc;
        ram a2 = ram.a.f().a(this.T.a()).a();
        YourLibraryPrefs yourLibraryPrefs = this.W;
        if (!yourLibraryPrefs.a.a() || yourLibraryPrefs.c == null || !yourLibraryPrefs.c.focusedPageId().b()) {
            yourLibraryPageId = YourLibraryPageId.MUSIC_PLAYLISTS;
        } else {
            long a3 = vbq.a(yourLibraryPrefs.a.a.d());
            yourLibraryPageId = (a3 <= 0 || yourLibraryPrefs.b.a() - yourLibraryPrefs.c.timestamp() <= a3) ? (YourLibraryPageId) yourLibraryPrefs.c.focusedPageId().c() : YourLibraryPageId.MUSIC_PLAYLISTS;
        }
        if (bundle != null) {
            String string = bundle.getString("YourLibraryFragment.focusedPageId");
            if (string != null) {
                yourLibraryPageId = (YourLibraryPageId) fbm.a(YourLibraryPageId.a(string), yourLibraryPageId);
            }
            vbz vbz = (vbz) bundle.getParcelable("YourLibraryFragment.yourLibraryState");
            a2 = a2.a(vbz);
            rbc rbc2 = this.Y;
            rbc2.c.b = vbz.a();
            rbc2.b.f = vbz.b();
            this.Y.c.b(bundle.getInt("YourLibraryFragment.tabsOffset"));
        } else {
            Bundle bundle2 = this.i;
            if (bundle2 != null) {
                String string2 = bundle2.getString("YourLibraryFragment.uri");
                if (string2 != null) {
                    rae rae = this.V;
                    fdz R_ = rae.a.a().h().iterator();
                    loop0:
                    while (true) {
                        if (!R_.hasNext()) {
                            break;
                        }
                        fdz R_2 = ((ImmutableList) ((Entry) R_.next()).getValue()).R_();
                        while (true) {
                            if (R_2.hasNext()) {
                                vbx b2 = rae.a.b((YourLibraryPageId) R_2.next());
                                if (b2.a(string2)) {
                                    yourLibraryPageId = b2.a();
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.Z = knc.a(this.a.a(this.U, this.Y), a2.a(yourLibraryPageId), knm.a());
        this.Z.a(this.Y);
        return this.Y.a;
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final vbu a(vbw vbw) {
        qzz qzz = this.U;
        return new vbu(qzz, vbw) {
            private /* synthetic */ qzz a;
            private /* synthetic */ vbw b;

            {
                this.a = r2;
                this.b = r3;
            }

            public final Observable<vbz> a() {
                return this.a.b;
            }

            public final void a(LoadingState loadingState) {
                Optional a2 = qzz.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new f((YourLibraryPageId) a2.c(), loadingState));
                }
            }

            public final void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
                Optional a2 = qzz.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new j((YourLibraryPageId) a2.c(), yourLibraryTabsCollapseState, z));
                }
            }

            public final void a(boolean z) {
                Optional a2 = qzz.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new i((YourLibraryPageId) a2.c(), z));
                }
            }

            public final void b() {
                this.a.a.onNext(new a());
            }

            public final void b(boolean z) {
                Optional a2 = qzz.this.d.a(this.b);
                if (a2.b()) {
                    this.a.a.onNext(new h((YourLibraryPageId) a2.c(), z));
                }
            }

            public final void c(boolean z) {
                Optional a2 = qzz.this.d.a(this.b);
                if (a2.b()) {
                    if (!z) {
                        this.a.a.onNext(new j((YourLibraryPageId) a2.c(), YourLibraryTabsCollapseState.EXPANDED, true));
                        this.a.a.onNext(new i((YourLibraryPageId) a2.c(), true));
                        return;
                    }
                    this.a.a.onNext(new i((YourLibraryPageId) a2.c(), false));
                }
            }
        };
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.ba;
    }

    public final rmf af() {
        return rmf.a((a) new $$Lambda$rab$cmuXKwh4h6b0IkCM8Ut_xKkMrRQ(this));
    }

    public final uqm ag() {
        return uqo.aZ;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.COLLECTION;
    }

    public final boolean ai() {
        return true;
    }

    public final gkq aj() {
        return PageIdentifiers.YOURLIBRARY;
    }

    public final boolean ak() {
        this.U.a.onNext(new g());
        return true;
    }

    public final String al() {
        Bundle bundle = this.i;
        String str = "";
        return bundle != null ? bundle.getString("username", str) : str;
    }

    public final void aw_() {
        super.aw_();
        Optional b2 = ((ram) this.Z.e()).b();
        if (b2.b()) {
            YourLibraryPrefs yourLibraryPrefs = this.W;
            YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) b2.c();
            if (yourLibraryPrefs.c != null) {
                yourLibraryPrefs.c = yourLibraryPrefs.c.toBuilder().a(Optional.b(yourLibraryPageId)).a();
            }
        }
        this.Z.b();
    }

    public final String b(Context context) {
        return "";
    }

    public final fqn d() {
        return fqo.a((Fragment) this);
    }

    public final String e() {
        return "android-spotlet-your-library";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ram ram = (ram) this.Z.e();
        Optional b2 = ram.b();
        if (b2.b()) {
            bundle.putString("YourLibraryFragment.focusedPageId", ((YourLibraryPageId) b2.c()).mId);
        }
        bundle.putParcelable("YourLibraryFragment.yourLibraryState", ram.c());
        bundle.putInt("YourLibraryFragment.tabsOffset", this.Y.c.b());
    }

    public final void z() {
        super.z();
        this.Z.c();
        this.X.a(this.Y);
    }
}
