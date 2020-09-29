package com.spotify.music.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class SimpleNavigationManager {
    public Fragment a;
    public final Set<kyh> b = new CopyOnWriteArraySet();
    private final Deque<ho<jja, String>> c = new ArrayDeque();
    private String d;
    private final Context e;
    private final spm f;
    private final kf g;
    private final spn h;
    private final int i;

    public enum NavigationType {
        BACK,
        UP
    }

    public SimpleNavigationManager(Context context, spm spm, kf kfVar, spn spn, int i2) {
        this.e = (Context) fay.a(context);
        this.f = (spm) fay.a(spm);
        this.g = (kf) fay.a(kfVar);
        this.h = (spn) fay.a(spn);
        this.i = i2;
    }

    public final void a(String str, String str2, SessionState sessionState, gjb gjb, Bundle bundle) {
        fay.a(str);
        fay.a(sessionState);
        fay.a(gjb);
        jol a2 = this.f.a(str, str2, sessionState);
        if (a2 != spm.b && !TextUtils.equals(this.d, str)) {
            Fragment ae = a2.ae();
            Bundle bundle2 = ae.i;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("username", sessionState.currentUser());
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            ae.g(bundle2);
            a.a(ae, gjb);
            a(ae, str, true);
        }
    }

    public final boolean a(NavigationType navigationType) {
        if (a()) {
            return false;
        }
        String str = this.d;
        ho hoVar = (ho) this.c.pop();
        a(((jja) hoVar.a).a(), (String) fay.a(hoVar.b), false);
        this.h.a(str, this.d, navigationType);
        return true;
    }

    private void a(Fragment fragment, String str, boolean z) {
        fay.a(fragment);
        fay.a(str);
        km a2 = this.g.a();
        if (this.a == null) {
            a2.a(this.i, fragment);
        } else {
            if (z) {
                if (this.c.size() >= 30) {
                    this.c.removeLast();
                }
                this.c.push(ho.a(jja.a(this.g, this.a), this.d));
            }
            a2.b(this.i, fragment, null);
        }
        this.a = fragment;
        this.d = str;
        a2.b();
        c();
    }

    private void c() {
        for (kyh onCurrentFragmentChanged : this.b) {
            onCurrentFragmentChanged.onCurrentFragmentChanged((Fragment) fay.a(this.a), (String) fay.a(this.d));
        }
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final Bundle b() {
        int i2;
        Bundle bundle = new Bundle();
        if (this.a != null) {
            Bundle bundle2 = new Bundle();
            this.g.a(bundle2, "key_current_fragment", this.a);
            bundle2.putString("key_current_fragment_uri", this.d);
            bundle.putParcelable("key_current_fragment_state", bundle2);
            i2 = jsf.a(bundle).length + 0;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < 524288) {
            for (ho hoVar : this.c) {
                ho b2 = ((jja) fay.a(hoVar.a)).b();
                i2 += ((Integer) fay.a(b2.b)).intValue();
                if (i2 >= 524288) {
                    break;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("key_entry_fragment", (Parcelable) b2.a);
                bundle3.putString("key_entry_fragment_uri", (String) hoVar.b);
                arrayList.add(0, bundle3);
            }
        }
        bundle.putParcelableArray("key_entry_fragments_states", (Parcelable[]) arrayList.toArray(new Bundle[0]));
        return bundle;
    }

    public final void a(Bundle bundle) {
        ClassLoader classLoader = this.e.getClassLoader();
        Parcelable parcelable = ((Bundle) fay.a(bundle)).getParcelable("key_current_fragment_state");
        String str = "";
        if (parcelable != null) {
            Bundle bundle2 = (Bundle) parcelable;
            this.a = this.g.a(bundle2, "key_current_fragment");
            this.d = bundle2.getString("key_current_fragment_uri", str);
        }
        Parcelable[] parcelableArray = ((Bundle) fay.a(bundle)).getParcelableArray("key_entry_fragments_states");
        if (parcelableArray != null) {
            for (Parcelable parcelable2 : parcelableArray) {
                Bundle bundle3 = (Bundle) parcelable2;
                bundle3.setClassLoader(classLoader);
                this.c.push(ho.a(jja.a(classLoader, bundle3.getParcelable("key_entry_fragment")), bundle3.getString("key_entry_fragment_uri", str)));
            }
        }
    }
}
