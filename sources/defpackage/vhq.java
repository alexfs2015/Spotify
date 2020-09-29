package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.f.b;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vhq reason: default package */
public final class vhq extends oq {
    final ArrayList<ArrayList<u>> a = new ArrayList<>();
    final ArrayList<u> b = new ArrayList<>();
    final ArrayList<u> c = new ArrayList<>();
    private final ArrayList<u> d = new ArrayList<>();
    private final ArrayList<u> e = new ArrayList<>();

    /* renamed from: vhq$a */
    public static class a {
        public float a;
    }

    private static void a(List<u> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ip.n(((u) list.get(size)).o).b();
        }
    }

    private static boolean h(u uVar) {
        vhp vhp = (vhp) uVar.o.getTag(R.id.paste_carousel_tag);
        return false;
    }

    public final void a() {
        boolean z = !this.d.isEmpty();
        boolean z2 = !this.e.isEmpty();
        if (z || z2) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                final u uVar = (u) it.next();
                View view = uVar.o;
                final is n = ip.n(view);
                vhp vhp = (vhp) view.getTag(R.id.paste_carousel_tag);
                if (vhp != null) {
                    if (vhp.b == -1) {
                        n.e((float) (-vhp.c));
                    }
                    if (vhp.b == 1) {
                        n.e((float) vhp.c);
                    }
                }
                this.c.add(uVar);
                n.a(120).a(0.0f).a((it) new it() {
                    private void d(View view) {
                        n.a((it) null);
                        ip.b(view, 1.0f);
                        ip.a(view, 0.0f);
                        vhq.this.f(uVar);
                        vhq.this.c.remove(uVar);
                        vhq.this.c();
                    }

                    public final void a(View view) {
                    }

                    public final void b(View view) {
                        d(view);
                    }

                    public final void c(View view) {
                        d(view);
                    }
                }).c();
            }
            this.d.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.e);
                this.a.add(arrayList);
                this.e.clear();
                AnonymousClass1 r2 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            u uVar = (u) it.next();
                            vhq vhq = vhq.this;
                            is n = ip.n(uVar.o);
                            vhq.b.add(uVar);
                            float f = 1.0f;
                            a aVar = (a) uVar.o.getTag(R.id.paste_carousel_animation_info);
                            if (aVar != null) {
                                f = aVar.a;
                            }
                            vhp vhp = (vhp) uVar.o.getTag(R.id.paste_carousel_tag);
                            if (vhp != null) {
                                if (vhp.b == -1) {
                                    ip.a(uVar.o, (float) (-vhp.c));
                                }
                                if (vhp.b == 1) {
                                    ip.a(uVar.o, (float) vhp.c);
                                }
                            }
                            is a2 = n.a(f);
                            View view = (View) a2.a.get();
                            if (view != null) {
                                view.animate().translationX(0.0f);
                            }
                            a2.a(300).a((it) new it(uVar, n) {
                                private /* synthetic */ u a;
                                private /* synthetic */ is b;

                                {
                                    this.a = r2;
                                    this.b = r3;
                                }

                                public final void a(View view) {
                                }

                                public final void b(View view) {
                                    view.setTag(R.id.paste_carousel_animation_info, null);
                                    this.b.a((it) null);
                                    vhq.this.f(this.a);
                                    vhq.this.b.remove(this.a);
                                    vhq.this.c();
                                }

                                public final void c(View view) {
                                    ip.b(view, 1.0f);
                                    ip.a(view, 0.0f);
                                }
                            }).c();
                        }
                        arrayList.clear();
                        vhq.this.a.remove(arrayList);
                    }
                };
                if (z) {
                    ip.a(((u) arrayList.get(0)).o, (Runnable) r2, 120);
                    return;
                }
                r2.run();
            }
        }
    }

    public final boolean a(u uVar) {
        c(uVar);
        if (h(uVar)) {
            return false;
        }
        this.d.add(uVar);
        return true;
    }

    public final boolean a(u uVar, int i, int i2, int i3, int i4) {
        if (uVar != null) {
            f(uVar);
        }
        return false;
    }

    public final boolean a(u uVar, u uVar2, int i, int i2, int i3, int i4) {
        if (uVar != null) {
            f(uVar);
        }
        if (uVar2 != null) {
            f(uVar2);
        }
        return false;
    }

    public final boolean a(u uVar, u uVar2, b bVar, b bVar2) {
        f(uVar);
        f(uVar2);
        return false;
    }

    public final boolean b() {
        return !this.e.isEmpty() || !this.d.isEmpty() || !this.c.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty();
    }

    public final boolean b(u uVar) {
        c(uVar);
        if (h(uVar)) {
            return false;
        }
        ip.b(uVar.o, 0.0f);
        a aVar = new a();
        aVar.a = 1.0f;
        uVar.o.setTag(R.id.paste_carousel_animation_info, aVar);
        this.e.add(uVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (!b()) {
            g();
        }
    }

    public final void c(u uVar) {
        View view = uVar.o;
        ip.n(view).b();
        if (this.d.remove(uVar)) {
            ip.b(view, 1.0f);
            f(uVar);
        }
        if (this.e.remove(uVar)) {
            a aVar = (a) uVar.o.getTag(R.id.paste_carousel_animation_info);
            ip.b(view, aVar != null ? aVar.a : 1.0f);
            f(uVar);
        }
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ArrayList arrayList = (ArrayList) this.a.get(size);
            if (arrayList.remove(uVar)) {
                ip.b(view, 1.0f);
                f(uVar);
                if (arrayList.isEmpty()) {
                    this.a.remove(size);
                }
            }
        }
        c();
    }

    public final void d() {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            f((u) this.d.get(size));
            this.d.remove(size);
        }
        int size2 = this.e.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            u uVar = (u) this.e.get(size2);
            ip.b(uVar.o, 1.0f);
            f(uVar);
            this.e.remove(size2);
        }
        if (b()) {
            for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
                ArrayList arrayList = (ArrayList) this.a.get(size3);
                for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
                    u uVar2 = (u) arrayList.get(size4);
                    ip.b(uVar2.o, 1.0f);
                    f(uVar2);
                    arrayList.remove(size4);
                    if (arrayList.isEmpty()) {
                        this.a.remove(arrayList);
                    }
                }
            }
            a((List<u>) this.c);
            a((List<u>) this.b);
            g();
        }
    }

    public final long e() {
        return 300;
    }

    public final long f() {
        return 120;
    }
}
