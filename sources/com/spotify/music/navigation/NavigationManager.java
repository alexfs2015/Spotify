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

public final class NavigationManager implements soy, spg {
    public final kf a;
    public final Set<spj> b = new CopyOnWriteArraySet();
    public final Deque<ho<jja, a>> c = new ArrayDeque();
    public final Context d;
    public Fragment e;
    public a f;
    private final Set<kyh> g = new CopyOnWriteArraySet();
    private final int h;
    private final jjf i;

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
            this.b = (String) fay.a(str2);
            this.c = str3;
            this.d = (String) fay.a(str4);
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

        public static a b(Bundle bundle) {
            String string = bundle.getString("title");
            String string2 = bundle.getString("spotify_uri_key");
            String string3 = bundle.getString("tag");
            String string4 = bundle.getString("feature_id_key");
            fay.a(string2);
            fay.a(string4);
            return new a(string, string2, string3, string4);
        }
    }

    public NavigationManager(ka kaVar, int i2, jjf jjf) {
        this.d = (Context) fay.a(kaVar);
        this.a = (kf) fay.a(kaVar.i());
        fay.a(i2 != 0);
        this.h = i2;
        this.i = jjf;
    }

    public final void a(Fragment fragment, String str) {
        c();
        if (((Fragment) fay.a(fragment)).equals(this.e)) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.a = str;
            }
        }
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

    public final Fragment a() {
        return this.e;
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

    public final void d() {
        this.c.clear();
    }

    public final void a(Fragment fragment, String str, String str2, String str3, String str4, boolean z, soq soq) {
        a(fragment, str, str2, str3, str4, z, soq, false);
    }

    private void a(Fragment fragment, String str, String str2, String str3, String str4, boolean z, soq soq, boolean z2) {
        g();
        km a2 = this.a.a();
        if (z) {
            a(a2);
        }
        if (this.c.size() >= 30) {
            this.c.removeLast();
        }
        if (soq != null && soq.a) {
            a2.a(soq.b, 0);
        }
        Fragment fragment2 = this.e;
        if (fragment2 != null) {
            this.c.push(ho.a(jja.a(this.a, fragment2), this.f));
            a2.a(this.e);
        }
        this.e = (Fragment) fay.a(fragment);
        this.f = new a(str, str2, str3, str4);
        a2.a(this.h, fragment);
        a2.b();
        this.a.b();
        f();
    }

    private void a(km kmVar) {
        Fragment fragment = this.e;
        if (fragment != null) {
            kmVar.a(fragment);
            this.e = null;
            this.f = null;
        }
        this.c.clear();
    }

    public final boolean e() {
        return !this.c.isEmpty();
    }

    public final void a(Fragment fragment, String str, String str2, String str3, String str4, boolean z) {
        g();
        km a2 = this.a.a();
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

    public final void a(String str, Fragment fragment, String str2, String str3, String str4, String str5, boolean z) {
        fay.a(str);
        a aVar = this.f;
        if (!faw.a(str, aVar == null ? null : aVar.c) && !this.c.isEmpty()) {
            boolean z2 = false;
            Iterator it = this.c.iterator();
            while (it.hasNext() && !z2) {
                if (faw.a(str, ((a) fay.a(((ho) it.next()).b)).c)) {
                    z2 = true;
                }
            }
            if (z2) {
                ho hoVar = (ho) this.c.pop();
                while (hoVar != null && !faw.a(str, ((a) fay.a(hoVar.b)).c)) {
                    hoVar = !this.c.isEmpty() ? (ho) this.c.pop() : null;
                }
            }
        }
        a(fragment, str2, str3, str4, str5, z);
    }

    public final void a(kyh kyh) {
        this.g.add(kyh);
        c(kyh);
    }

    public final void b(kyh kyh) {
        this.g.remove(kyh);
    }

    public void f() {
        for (kyh c2 : this.g) {
            c(c2);
        }
    }

    private void c(kyh kyh) {
        c();
        Fragment fragment = this.e;
        String h2 = h();
        if (fragment != null && h2 != null) {
            kyh.onCurrentFragmentChanged(fragment, h2);
        }
    }

    private void g() {
        for (spj a2 : this.b) {
            a(a2);
        }
    }

    public void a(spj spj) {
        c();
        Fragment fragment = this.e;
        String h2 = h();
        if (fragment != null && h2 != null) {
            spj.d();
        }
    }

    private String h() {
        a aVar = this.f;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public final void a(BackNavigationInteractionType backNavigationInteractionType) {
        String str;
        String str2;
        if (!this.a.h() && !this.c.isEmpty()) {
            g();
            km a2 = this.a.a();
            Fragment fragment = this.e;
            if (fragment != null) {
                a2.a(fragment);
            }
            a aVar = this.f;
            String str3 = null;
            if (aVar == null) {
                aVar = null;
            }
            ho hoVar = (ho) this.c.pop();
            Fragment a3 = ((jja) fay.a(hoVar.a)).a();
            this.e = a3;
            this.f = (a) hoVar.b;
            c();
            a2.a(this.h, a3);
            a2.b();
            this.a.b();
            if (BackNavigationInteractionType.NO_BUTTON_PRESSED != backNavigationInteractionType) {
                String backNavigationInteractionType2 = backNavigationInteractionType.toString();
                if (aVar != null) {
                    str = aVar.d;
                } else {
                    str = null;
                }
                if (aVar != null) {
                    str2 = aVar.b;
                } else {
                    str2 = null;
                }
                jjf jjf = this.i;
                a aVar2 = this.f;
                if (aVar2 != null) {
                    str3 = aVar2.b;
                }
                bh bhVar = new bh(null, str, str2, null, 0, str3, "hit", backNavigationInteractionType2, (double) jrf.a.a());
                jjf.a(bhVar);
            }
            f();
        }
    }
}
