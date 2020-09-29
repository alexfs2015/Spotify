package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: sf reason: default package */
public abstract class sf {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public int a(Object obj) {
        return -1;
    }

    public Parcelable a() {
        return null;
    }

    public Object a(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public final void a(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void a(ViewGroup viewGroup) {
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract boolean a(View view, Object obj);

    public abstract int b();

    public CharSequence b(int i) {
        return null;
    }

    public final void b(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }

    public void b(ViewGroup viewGroup) {
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
    }

    public final void c() {
        synchronized (this) {
            if (this.b != null) {
                this.b.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public final void c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public float k_(int i) {
        return 1.0f;
    }
}
