package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Iterators;
import com.spotify.music.R;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: rax reason: default package */
public final class rax extends ko implements rah, raw {
    public ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a;
    public ImmutableList<vbx> b = ImmutableList.d();
    boolean c;
    public ImmutableList<String> d;
    private final jrn e;
    private final raf f;
    private final a g;
    private final vcg h;
    private final rau i;
    private final Map<Integer, WeakReference<vbw>> j;
    private final Map<YourLibraryPageId, WeakReference<vbw>> k;
    private ImmutableList<YourLibraryPageGroup> l;

    public rax(kk kkVar, jrn jrn, raf raf, a aVar, vcg vcg, rau rau) {
        super(kkVar);
        this.e = jrn;
        this.f = raf;
        this.g = aVar;
        this.h = vcg;
        this.i = rau;
        this.j = new TreeMap();
        this.k = new TreeMap();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(YourLibraryPageId yourLibraryPageId, vbx vbx) {
        return vbx.a() == yourLibraryPageId;
    }

    private vbx f(int i2) {
        if (!this.c) {
            return (vbx) this.b.get(i2);
        }
        ImmutableList<vbx> immutableList = this.b;
        return (vbx) immutableList.get((immutableList.size() - i2) - 1);
    }

    public final int a(YourLibraryPageId yourLibraryPageId) {
        int f2 = Iterators.f(this.b.iterator(), new $$Lambda$rax$GNLjZUs8T8zfLwR_CpguIkAbK5U(yourLibraryPageId));
        return (!this.c || f2 < 0) ? f2 : (this.b.size() - f2) - 1;
    }

    public final Fragment a(int i2) {
        vbx f2 = f(i2);
        Fragment ae = f2.a(this.e.d(), this.f.al()).ae();
        a.a(ae, gkm.a(this.g.ag()));
        vci.a(ae).putSerializable("your-library-page-id", f2.a());
        vci.a(ae).putSerializable("your-library-page-group", this.h.a(f2.a()));
        return ae;
    }

    public final Optional<YourLibraryPageId> a(vbw vbw) {
        for (Entry entry : this.k.entrySet()) {
            vbw vbw2 = (vbw) ((WeakReference) entry.getValue()).get();
            if (vbw2 != null && vbw2.equals(vbw)) {
                return Optional.b(entry.getKey());
            }
        }
        return Optional.e();
    }

    public final Object a(ViewGroup viewGroup, int i2) {
        Object a2 = super.a(viewGroup, i2);
        if (a2 instanceof vbw) {
            vbx f2 = f(i2);
            vbw vbw = (vbw) a2;
            this.j.put(Integer.valueOf(i2), new WeakReference(vbw));
            this.k.put(f2.a(), new WeakReference(vbw));
            return a2;
        }
        throw new IllegalStateException("YourLibraryPage.getFragment() must return the YourLibraryPage itself.");
    }

    public final void a(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
        String str;
        this.a = immutableSortedMap;
        a g2 = ImmutableList.g();
        fdz R_ = this.a.h().iterator();
        while (R_.hasNext()) {
            Iterable iterable = (Iterable) ((Entry) R_.next()).getValue();
            vcg vcg = this.h;
            vcg.getClass();
            g2.b(fdd.a(iterable, (Function<? super F, ? extends T>) new $$Lambda$uvCUAjVDhc_PcZWq2GMc5V0ICaY<Object,Object>(vcg)));
        }
        this.b = g2.a();
        a g3 = ImmutableList.g();
        a g4 = ImmutableList.g();
        fdz R_2 = this.a.a.iterator();
        while (R_2.hasNext()) {
            YourLibraryPageGroup yourLibraryPageGroup = (YourLibraryPageGroup) R_2.next();
            if (yourLibraryPageGroup != null) {
                rau rau = this.i;
                int i2 = AnonymousClass1.a[yourLibraryPageGroup.ordinal()];
                if (i2 == 1) {
                    str = rau.a.getString(R.string.your_library_music_tab_label);
                } else if (i2 == 2) {
                    str = rau.a.getString(R.string.your_library_podcasts_tab_label);
                } else {
                    throw new IllegalArgumentException("Unsupported group");
                }
                g3.c(str);
                g4.c(yourLibraryPageGroup);
            }
        }
        this.d = g3.a();
        this.l = g4.a();
        c();
    }

    public final int b() {
        return this.b.size();
    }

    public final CharSequence b(int i2) {
        return f(i2).b();
    }

    public final vbw b(YourLibraryPageId yourLibraryPageId) {
        WeakReference weakReference = (WeakReference) this.j.get(Integer.valueOf(a(yourLibraryPageId)));
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (vbw) ((WeakReference) this.j.get(Integer.valueOf(a(yourLibraryPageId)))).get();
    }

    public final Optional<vbw> c(YourLibraryPageId yourLibraryPageId) {
        WeakReference weakReference = (WeakReference) this.k.get(yourLibraryPageId);
        if (weakReference == null) {
            return Optional.e();
        }
        vbw vbw = (vbw) weakReference.get();
        return vbw == null ? Optional.e() : Optional.b(vbw);
    }

    public final ImmutableList<View> c(int i2) {
        WeakReference weakReference = (WeakReference) this.j.get(Integer.valueOf(i2));
        if (weakReference == null) {
            return ImmutableList.d();
        }
        vbw vbw = (vbw) weakReference.get();
        return vbw == null ? ImmutableList.d() : vbw.g();
    }

    public final YourLibraryPageId d(int i2) {
        return f(i2).a();
    }

    public final int e(int i2) {
        return ((ImmutableList) this.a.b.f().get(i2)).size();
    }
}
