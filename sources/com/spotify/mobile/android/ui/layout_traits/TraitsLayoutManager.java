package com.spotify.mobile.android.ui.layout_traits;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;

public class TraitsLayoutManager extends GridLayoutManager {
    e w;
    /* access modifiers changed from: private */
    public final b x = new b() {
        public final int a(int i) {
            return TraitsLayoutManager.this.b.a(i, TraitsLayoutManager.this.a);
        }

        public final int b(int i) {
            return TraitsLayoutManager.this.b.a(i);
        }

        public final int c(int i) {
            return TraitsLayoutManager.this.b.c(i, TraitsLayoutManager.this.a);
        }

        public final int a() {
            return TraitsLayoutManager.this.a;
        }
    };
    private final h y = new h() {
        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            u b = recyclerView.b(view);
            a c = recyclerView.c();
            if (b != null && c != null && TraitsLayoutManager.this.w != null) {
                TraitsLayoutManager.this.z.a(rect, b.e(), c.b(), TraitsLayoutManager.this.x, TraitsLayoutManager.this.w, c);
            }
        }
    };
    /* access modifiers changed from: private */
    public final jps z;

    public TraitsLayoutManager(Context context, jps jps, int i) {
        super(context, i);
        this.z = (jps) fay.a(jps);
    }

    public final void a(a aVar, a aVar2) {
        super.a(aVar, aVar2);
        a(aVar2);
    }

    private void a(final a aVar) {
        if (aVar != null) {
            this.w = new e() {
                public final int a(int i) {
                    return aVar.a(i);
                }
            };
        } else {
            this.w = null;
        }
    }

    public final void d(final RecyclerView recyclerView) {
        super.d(recyclerView);
        AnonymousClass3 r0 = new b() {
            public final int a(int i) {
                int i2 = TraitsLayoutManager.this.a;
                a c2 = recyclerView.c();
                if (c2 == null || TraitsLayoutManager.this.w == null) {
                    return TraitsLayoutManager.this.a;
                }
                if (i >= c2.b()) {
                    return 1;
                }
                return TraitsLayoutManager.this.z.a(i, c2.b(), i2, TraitsLayoutManager.this.w, c2);
            }
        };
        r0.b = true;
        this.b = r0;
        recyclerView.a(this.y, -1);
        a(recyclerView.c());
    }

    public final void a(RecyclerView recyclerView, o oVar) {
        super.a(recyclerView, oVar);
        this.b = new GridLayoutManager.a();
        recyclerView.b(this.y);
        a(recyclerView.c());
    }

    public final void e_(int i) {
        if (!(this.z == null || i == this.a)) {
            this.z.a();
        }
        super.e_(i);
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.z.a();
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        super.a(recyclerView, i, i2);
        this.z.a();
    }

    public final void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.a(recyclerView, i, i2, obj);
        this.z.a();
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        super.b(recyclerView, i, i2);
        this.z.a();
    }

    public final void a(RecyclerView recyclerView, int i, int i2, int i3) {
        super.a(recyclerView, i, i2, i3);
        this.z.a();
    }
}
