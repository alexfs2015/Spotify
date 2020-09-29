package defpackage;

import android.database.Observable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gxb reason: default package */
public final class gxb {
    public final b a;
    final gxc b;
    final gwo c = defpackage.gwo.a.a((gwo) new gwo() {
        public final hcm decorate(hcm hcm) {
            return gxb.this.b.a(hcm).a;
        }
    });
    hcm d;
    public final gwn<hcm, hcm> e = new gwn<hcm, hcm>() {
        public final /* bridge */ /* synthetic */ Object a() {
            return gxb.this.d;
        }

        public final /* synthetic */ Object b() {
            if (gxb.this.d != null) {
                return gxb.this.c.decorate(gxb.this.d);
            }
            return null;
        }
    };
    private final gxd f;
    private final a g = new a(0);
    private gxh<?> h;

    /* renamed from: gxb$a */
    static final class a extends Observable<c> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).onChanged();
            }
        }
    }

    /* renamed from: gxb$b */
    public final class b extends gwv {
        b(gxc gxc) {
            super(gxc);
        }

        /* access modifiers changed from: protected */
        public final Parcelable a(Map<hcm, Parcelable> map) {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == gxb.this.d) {
                    return (Parcelable) entry.getValue();
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final void a(Parcelable parcelable, Map<hcm, Parcelable> map) {
            if (gxb.this.d != null) {
                map.put(gxb.this.d, parcelable);
            }
        }
    }

    /* renamed from: gxb$c */
    public interface c {
        void onChanged();
    }

    public gxb(gwm gwm) {
        fbp.a(gwm);
        this.b = new gxc(gwm);
        this.a = new b(this.b);
        this.f = new gxd(gwm, this.b, this.a);
    }

    public final View a(ViewGroup viewGroup) {
        hcm hcm = this.d;
        if (hcm == null) {
            return null;
        }
        this.h = this.f.a(this.h, hcm, viewGroup, -1);
        return this.h.b;
    }

    public final void a() {
        this.f.a.a();
        this.g.a();
    }

    public final void a(c cVar) {
        this.g.registerObserver(cVar);
    }

    public final void a(hcm hcm) {
        if (hcm == null) {
            this.b.a();
            this.a.a();
            gxh<?> gxh = this.h;
            if (gxh != null) {
                this.f.a(gxh);
                this.h = null;
            }
        }
        this.d = hcm;
    }
}
