package com.spotify.mobile.android.hubframework.defaults.view;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

public final class HubsGlueViewBinderFactories {

    public enum HeaderPolicy {
        ALWAYS_ON_TOP,
        PORTRAIT_ONLY,
        SPLIT_LANDSCAPE,
        SPLIT_ON_DEMAND
    }

    public interface a {
        a a(boolean z);

        c a(Fragment fragment);
    }

    public interface b {
        a a(HeaderPolicy headerPolicy);
    }

    public interface c {
        public static final m a = new m() {
            public final void a(RecyclerView recyclerView, int i) {
            }

            public final void a(RecyclerView recyclerView, int i, int i2) {
            }
        };

        gur a(gum gum, Context context);

        gur a(gum gum, Context context, m mVar);
    }

    public static final class d {
        public final Fragment a;
        public final HeaderPolicy b;
        public final com.spotify.mobile.android.util.ui.Lifecycle.a c;
        public final Boolean d;

        /* synthetic */ d(Fragment fragment, HeaderPolicy headerPolicy, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, Boolean bool, byte b2) {
            this(fragment, headerPolicy, aVar, bool);
        }

        private d(Fragment fragment, HeaderPolicy headerPolicy, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, Boolean bool) {
            this.b = (HeaderPolicy) fay.a(headerPolicy);
            this.a = fragment;
            this.c = aVar;
            this.d = bool;
        }
    }

    static final class e implements a, b {
        private HeaderPolicy a = HeaderPolicy.PORTRAIT_ONLY;
        private Boolean b;
        private final sih c;

        public e(sih sih) {
            this.c = sih;
        }

        public final a a(HeaderPolicy headerPolicy) {
            this.a = headerPolicy;
            return this;
        }

        public final a a(boolean z) {
            this.b = Boolean.FALSE;
            return this;
        }

        public final c a(Fragment fragment) {
            d dVar = new d((Fragment) fay.a(fragment), this.a, null, this.b, 0);
            defpackage.gzi.a a2 = defpackage.gzi.a.a(dVar, this.c);
            return dVar.b == HeaderPolicy.PORTRAIT_ONLY ? gzj.a((c) a2, (c) defpackage.gzh.a.a()) : a2;
        }
    }

    public static b a(sih sih) {
        return new e(sih);
    }
}
