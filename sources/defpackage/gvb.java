package defpackage;

import android.database.Observable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gvb reason: default package */
public final class gvb {
    public final b a;
    final gvc b;
    final guo c = defpackage.guo.a.a((guo) new guo() {
        public final gzt decorate(gzt gzt) {
            return gvb.this.b.a(gzt).a;
        }
    });
    gzt d;
    public final gun<gzt, gzt> e = new gun<gzt, gzt>() {
        public final /* synthetic */ Object b() {
            if (gvb.this.d != null) {
                return gvb.this.c.decorate(gvb.this.d);
            }
            return null;
        }

        public final /* bridge */ /* synthetic */ Object a() {
            return gvb.this.d;
        }
    };
    private final gvd f;
    private final a g = new a(0);
    private gvh<?> h;

    /* renamed from: gvb$a */
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

    /* renamed from: gvb$b */
    public final class b extends guv {
        b(gvc gvc) {
            super(gvc);
        }

        /* access modifiers changed from: protected */
        public final Parcelable a(Map<gzt, Parcelable> map) {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == gvb.this.d) {
                    return (Parcelable) entry.getValue();
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final void a(Parcelable parcelable, Map<gzt, Parcelable> map) {
            if (gvb.this.d != null) {
                map.put(gvb.this.d, parcelable);
            }
        }
    }

    /* renamed from: gvb$c */
    public interface c {
        void onChanged();
    }

    public gvb(gum gum) {
        fay.a(gum);
        this.b = new gvc(gum);
        this.a = new b(this.b);
        this.f = new gvd(gum, this.b, this.a);
    }

    public final void a(gzt gzt) {
        if (gzt == null) {
            this.b.a();
            this.a.a();
            gvh<?> gvh = this.h;
            if (gvh != null) {
                this.f.a(gvh);
                this.h = null;
            }
        }
        this.d = gzt;
    }

    public final View a(ViewGroup viewGroup) {
        gzt gzt = this.d;
        if (gzt == null) {
            return null;
        }
        this.h = this.f.a(this.h, gzt, viewGroup, -1);
        return this.h.b;
    }

    public final void a(c cVar) {
        this.g.registerObserver(cVar);
    }

    public final void a() {
        this.f.a.a();
        this.g.a();
    }
}
