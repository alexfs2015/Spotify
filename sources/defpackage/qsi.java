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

/* renamed from: qsi reason: default package */
public final class qsi extends kj implements qrs, qsh {
    public ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a;
    public ImmutableList<uqs> b = ImmutableList.d();
    boolean c;
    public ImmutableList<String> d;
    private final jpb e;
    private final qrq f;
    private final a g;
    private final urb h;
    private final qsf i;
    private final Map<Integer, WeakReference<uqr>> j;
    private final Map<YourLibraryPageId, WeakReference<uqr>> k;
    private ImmutableList<YourLibraryPageGroup> l;

    public qsi(kf kfVar, jpb jpb, qrq qrq, a aVar, urb urb, qsf qsf) {
        super(kfVar);
        this.e = jpb;
        this.f = qrq;
        this.g = aVar;
        this.h = urb;
        this.i = qsf;
        this.j = new TreeMap();
        this.k = new TreeMap();
    }

    public final void a(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
        String str;
        this.a = immutableSortedMap;
        a g2 = ImmutableList.g();
        fdh R_ = this.a.h().iterator();
        while (R_.hasNext()) {
            Iterable iterable = (Iterable) ((Entry) R_.next()).getValue();
            urb urb = this.h;
            urb.getClass();
            g2.b(fcl.a(iterable, (Function<? super F, ? extends T>) new $$Lambda$u1scXE55QGfnHcRokNwbtjh1BE<Object,Object>(urb)));
        }
        this.b = g2.a();
        a g3 = ImmutableList.g();
        a g4 = ImmutableList.g();
        fdh R_2 = this.a.a.iterator();
        while (R_2.hasNext()) {
            YourLibraryPageGroup yourLibraryPageGroup = (YourLibraryPageGroup) R_2.next();
            if (yourLibraryPageGroup != null) {
                qsf qsf = this.i;
                int i2 = AnonymousClass1.a[yourLibraryPageGroup.ordinal()];
                if (i2 == 1) {
                    str = qsf.a.getString(R.string.your_library_music_tab_label);
                } else if (i2 == 2) {
                    str = qsf.a.getString(R.string.your_library_podcasts_tab_label);
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

    public final Fragment a(int i2) {
        uqs f2 = f(i2);
        Fragment ae = f2.a(this.e.b(), this.f.al()).ae();
        a.a(ae, gjb.a(this.g.ag()));
        urd.a(ae).putSerializable("your-library-page-id", f2.a());
        urd.a(ae).putSerializable("your-library-page-group", this.h.a(f2.a()));
        return ae;
    }

    public final CharSequence b(int i2) {
        return f(i2).b();
    }

    public final int b() {
        return this.b.size();
    }

    public final ImmutableList<View> c(int i2) {
        WeakReference weakReference = (WeakReference) this.j.get(Integer.valueOf(i2));
        if (weakReference == null) {
            return ImmutableList.d();
        }
        uqr uqr = (uqr) weakReference.get();
        return uqr == null ? ImmutableList.d() : uqr.f();
    }

    public final YourLibraryPageId d(int i2) {
        return f(i2).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(YourLibraryPageId yourLibraryPageId, uqs uqs) {
        return uqs.a() == yourLibraryPageId;
    }

    public final int a(YourLibraryPageId yourLibraryPageId) {
        int f2 = Iterators.f(this.b.iterator(), new $$Lambda$qsi$L_NgB20ztvsg_4raUU7RqwHJspk(yourLibraryPageId));
        return (!this.c || f2 < 0) ? f2 : (this.b.size() - f2) - 1;
    }

    public final int e(int i2) {
        return ((ImmutableList) this.a.b.f().get(i2)).size();
    }

    public final uqr b(YourLibraryPageId yourLibraryPageId) {
        WeakReference weakReference = (WeakReference) this.j.get(Integer.valueOf(a(yourLibraryPageId)));
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (uqr) ((WeakReference) this.j.get(Integer.valueOf(a(yourLibraryPageId)))).get();
    }

    private uqs f(int i2) {
        if (!this.c) {
            return (uqs) this.b.get(i2);
        }
        ImmutableList<uqs> immutableList = this.b;
        return (uqs) immutableList.get((immutableList.size() - i2) - 1);
    }

    public final Optional<uqr> c(YourLibraryPageId yourLibraryPageId) {
        WeakReference weakReference = (WeakReference) this.k.get(yourLibraryPageId);
        if (weakReference == null) {
            return Optional.e();
        }
        uqr uqr = (uqr) weakReference.get();
        return uqr == null ? Optional.e() : Optional.b(uqr);
    }

    public final Optional<YourLibraryPageId> a(uqr uqr) {
        for (Entry entry : this.k.entrySet()) {
            uqr uqr2 = (uqr) ((WeakReference) entry.getValue()).get();
            if (uqr2 != null && uqr2.equals(uqr)) {
                return Optional.b(entry.getKey());
            }
        }
        return Optional.e();
    }

    public final Object a(ViewGroup viewGroup, int i2) {
        Object a2 = super.a(viewGroup, i2);
        if (a2 instanceof uqr) {
            uqs f2 = f(i2);
            uqr uqr = (uqr) a2;
            this.j.put(Integer.valueOf(i2), new WeakReference(uqr));
            this.k.put(f2.a(), new WeakReference(uqr));
            return a2;
        }
        throw new IllegalStateException("YourLibraryPage.getFragment() must return the YourLibraryPage itself.");
    }
}
