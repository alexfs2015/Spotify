package com.spotify.music.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class NavigationManager implements szf, szn {
    public final kk a;
    public final Set<szq> b = new CopyOnWriteArraySet();
    public final Deque<ho<jlm, a>> c = new ArrayDeque();
    public final Context d;
    public Fragment e;
    public a f;
    private final Set<lbq> g = new CopyOnWriteArraySet();
    private final int h;
    private final jlr i;

    public enum BackNavigationInteractionType {
        HW_BACK_BUTTON_PRESSED("nav-back-hardware-back-button"),
        UP_BUTTON_PRESSED("nav-back-up-toolbar-button"),
        NO_BUTTON_PRESSED("no-op");
        
        private final String mInteractionType;

        private BackNavigationInteractionType(String str) {
            this.mInteractionType = str;
        }

        public final String toString() {
            return this.mInteractionType;
        }
    }

    public static class a {
        String a;
        final String b;
        final String c;
        final String d;

        a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = (String) fbp.a(str2);
            this.c = str3;
            this.d = (String) fbp.a(str4);
        }

        public static a b(Bundle bundle) {
            String string = bundle.getString("title");
            String string2 = bundle.getString("spotify_uri_key");
            String string3 = bundle.getString("tag");
            String string4 = bundle.getString("feature_id_key");
            fbp.a(string2);
            fbp.a(string4);
            return new a(string, string2, string3, string4);
        }

        public final void a(Bundle bundle) {
            String str = this.a;
            if (str != null) {
                bundle.putString("title", str);
            }
            bundle.putString("spotify_uri_key", this.b);
            bundle.putString("tag", this.c);
            bundle.putString("feature_id_key", this.d);
        }
    }

    public NavigationManager(kf kfVar, int i2, jlr jlr) {
        this.d = (Context) fbp.a(kfVar);
        this.a = (kk) fbp.a(kfVar.i());
        fbp.a(i2 != 0);
        this.h = i2;
        this.i = jlr;
    }

    private void a(Fragment fragment, String str, String str2, String str3, String str4, boolean z, syx syx, boolean z2) {
        g();
        kr a2 = this.a.a();
        if (z) {
            a(a2);
        }
        if (this.c.size() >= 30) {
            this.c.removeLast();
        }
        if (syx != null && syx.a) {
            a2.a(syx.b, 0);
        }
        Fragment fragment2 = this.e;
        if (fragment2 != null) {
            this.c.push(ho.a(jlm.a(this.a, fragment2), this.f));
            a2.a(this.e);
        }
        this.e = (Fragment) fbp.a(fragment);
        this.f = new a(str, str2, str3, str4);
        a2.a(this.h, fragment);
        a2.b();
        this.a.b();
        f();
    }

    private void a(kr krVar) {
        Fragment fragment = this.e;
        if (fragment != null) {
            krVar.a(fragment);
            this.e = null;
            this.f = null;
        }
        this.c.clear();
    }

    private void c(lbq lbq) {
        c();
        Fragment fragment = this.e;
        String h2 = h();
        if (fragment != null && h2 != null) {
            lbq.onCurrentFragmentChanged(fragment, h2);
        }
    }

    private void g() {
        for (szq a2 : this.b) {
            a(a2);
        }
    }

    private String h() {
        a aVar = this.f;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public final Fragment a() {
        return this.e;
    }

    public final void a(Fragment fragment, String str) {
        c();
        if (((Fragment) fbp.a(fragment)).equals(this.e)) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.a = str;
            }
        }
    }

    public final void a(Fragment fragment, String str, String str2, String str3, String str4, boolean z) {
        g();
        kr a2 = this.a.a();
        if (z) {
            a2.a((int) R.anim.fade_in_hard, (int) R.anim.fade_out_hard);
        }
        Fragment fragment2 = this.e;
        if (fragment2 != null) {
            a2.a(fragment2);
            this.e = null;
            this.f = null;
        }
        a2.a(this.h, fragment);
        this.e = fragment;
        this.f = new a(str, str2, str3, str4);
        a2.b();
        this.a.b();
        f();
    }

    public final void a(Fragment fragment, String str, String str2, String str3, String str4, boolean z, syx syx) {
        a(fragment, str, str2, str3, str4, z, syx, false);
    }

    public final void a(BackNavigationInteractionType backNavigationInteractionType) {
        if (!this.a.i() && !this.c.isEmpty()) {
            g();
            kr a2 = this.a.a();
            Fragment fragment = this.e;
            if (fragment != null) {
                a2.a(fragment);
            }
            a aVar = this.f;
            String str = null;
            if (aVar == null) {
                aVar = null;
            }
            ho hoVar = (ho) this.c.pop();
            Fragment a3 = ((jlm) fbp.a(hoVar.a)).a();
            this.e = a3;
            this.f = (a) hoVar.b;
            c();
            a2.a(this.h, a3);
            a2.b();
            this.a.b();
            if (BackNavigationInteractionType.NO_BUTTON_PRESSED != backNavigationInteractionType) {
                String backNavigationInteractionType2 = backNavigationInteractionType.toString();
                String str2 = aVar != null ? aVar.d : null;
                String str3 = aVar != null ? aVar.b : null;
                jlr jlr = this.i;
                a aVar2 = this.f;
                if (aVar2 != null) {
                    str = aVar2.b;
                }
                bg bgVar = new bg(null, str2, str3, null, 0, str, "hit", backNavigationInteractionType2, (double) jtp.a.a());
                jlr.a(bgVar);
            }
            f();
        }
    }

    public final void a(String str, Fragment fragment, String str2, String str3, String str4, String str5, boolean z) {
        fbp.a(str);
        a aVar = this.f;
        if (!fbn.a(str, aVar == null ? null : aVar.c) && !this.c.isEmpty()) {
            boolean z2 = false;
            Iterator it = this.c.iterator();
            while (it.hasNext() && !z2) {
                if (fbn.a(str, ((a) fbp.a(((ho) it.next()).b)).c)) {
                    z2 = true;
                }
            }
            if (z2) {
                ho hoVar = (ho) this.c.pop();
                while (hoVar != null && !fbn.a(str, ((a) fbp.a(hoVar.b)).c)) {
                    hoVar = !this.c.isEmpty() ? (ho) this.c.pop() : null;
                }
            }
        }
        a(fragment, str2, str3, str4, str5, z);
    }

    public final void a(lbq lbq) {
        this.g.add(lbq);
        c(lbq);
    }

    public void a(szq szq) {
        c();
        Fragment fragment = this.e;
        String h2 = h();
        if (fragment != null && h2 != null) {
            szq.d();
        }
    }

    public final String b() {
        a aVar = this.f;
        if (aVar != null) {
            String str = aVar.a;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final void b(lbq lbq) {
        this.g.remove(lbq);
    }

    public void c() {
        boolean z = true;
        boolean z2 = this.e == null;
        if (this.f != null) {
            z = false;
        }
        if (z2 != z) {
            throw new AssertionError();
        }
    }

    public final void d() {
        this.c.clear();
    }

    public final boolean e() {
        return !this.c.isEmpty();
    }

    public void f() {
        for (lbq c2 : this.g) {
            c(c2);
        }
    }
}
