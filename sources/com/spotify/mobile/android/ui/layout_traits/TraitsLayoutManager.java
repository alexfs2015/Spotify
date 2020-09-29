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
    /* access modifiers changed from: private */
    public final jse A;
    e x;
    /* access modifiers changed from: private */
    public final b y = new b() {
        public final int a() {
            return TraitsLayoutManager.this.a;
        }

        public final int a(int i) {
            return TraitsLayoutManager.this.b.a(i, TraitsLayoutManager.this.a);
        }

        public final int b(int i) {
            return TraitsLayoutManager.this.b.a(i);
        }

        public final int c(int i) {
            return TraitsLayoutManager.this.b.d(i, TraitsLayoutManager.this.a);
        }
    };
    private final h z = new h() {
        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            u b = recyclerView.b(view);
            a c = recyclerView.c();
            if (!(b == null || c == null || TraitsLayoutManager.this.x == null)) {
                Rect rect2 = rect;
                TraitsLayoutManager.this.A.a(rect, b.e(), c.b(), TraitsLayoutManager.this.y, TraitsLayoutManager.this.x, c);
            }
        }
    };

    public TraitsLayoutManager(Context context, jse jse, int i) {
        super(context, i);
        this.A = (jse) fbp.a(jse);
    }

    private void a(final a aVar) {
        if (aVar != null) {
            this.x = new e() {
                public final int a(int i) {
                    return aVar.a(i);
                }
            };
        } else {
            this.x = null;
        }
    }

    public final void a(a aVar, a aVar2) {
        super.a(aVar, aVar2);
        a(aVar2);
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        this.A.a();
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        super.a(recyclerView, i, i2);
        this.A.a();
    }

    public final void a(RecyclerView recyclerView, int i, int i2, int i3) {
        super.a(recyclerView, i, i2, i3);
        this.A.a();
    }

    public final void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.a(recyclerView, i, i2, obj);
        this.A.a();
    }

    public final void a(RecyclerView recyclerView, o oVar) {
        super.a(recyclerView, oVar);
        this.b = new GridLayoutManager.a();
        recyclerView.b(this.z);
        a(recyclerView.c());
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        super.b(recyclerView, i, i2);
        this.A.a();
    }

    public final void d(final RecyclerView recyclerView) {
        super.d(recyclerView);
        AnonymousClass3 r0 = new b() {
            public final int a(int i) {
                int i2 = TraitsLayoutManager.this.a;
                a c = recyclerView.c();
                if (c == null || TraitsLayoutManager.this.x == null) {
                    return TraitsLayoutManager.this.a;
                }
                if (i >= c.b()) {
                    return 1;
                }
                return TraitsLayoutManager.this.A.a(i, c.b(), i2, TraitsLayoutManager.this.x, c);
            }
        };
        r0.c = true;
        this.b = r0;
        recyclerView.a(this.z, -1);
        a(recyclerView.c());
    }

    public final void e_(int i) {
        if (!(this.A == null || i == this.a)) {
            this.A.a();
        }
        super.e_(i);
    }
}
