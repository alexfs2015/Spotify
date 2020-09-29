package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;

/* renamed from: ezi reason: default package */
public final class ezi implements bd {
    public BottomNavigationMenuView a;
    public boolean b = false;
    public int c;
    private ax d;

    /* renamed from: ezi$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        int a;

        a() {
        }

        a(Parcel parcel) {
            this.a = parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    public final void a(Context context, ax axVar) {
        this.d = axVar;
        this.a.h = this.d;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            BottomNavigationMenuView bottomNavigationMenuView = this.a;
            int i = ((a) parcelable).a;
            int size = bottomNavigationMenuView.h.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = bottomNavigationMenuView.h.getItem(i2);
                if (i == item.getItemId()) {
                    bottomNavigationMenuView.e = i;
                    bottomNavigationMenuView.f = i2;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    public final void a(ax axVar, boolean z) {
    }

    public final void a(defpackage.bd.a aVar) {
    }

    public final void a(boolean z) {
        if (!this.b) {
            if (z) {
                this.a.a();
                return;
            }
            BottomNavigationMenuView bottomNavigationMenuView = this.a;
            if (!(bottomNavigationMenuView.h == null || bottomNavigationMenuView.d == null)) {
                int size = bottomNavigationMenuView.h.size();
                if (size != bottomNavigationMenuView.d.length) {
                    bottomNavigationMenuView.a();
                    return;
                }
                int i = bottomNavigationMenuView.e;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = bottomNavigationMenuView.h.getItem(i2);
                    if (item.isChecked()) {
                        bottomNavigationMenuView.e = item.getItemId();
                        bottomNavigationMenuView.f = i2;
                    }
                }
                if (i != bottomNavigationMenuView.e) {
                    qw.a(bottomNavigationMenuView, bottomNavigationMenuView.a);
                }
                boolean a2 = BottomNavigationMenuView.a(bottomNavigationMenuView.c, bottomNavigationMenuView.h.i().size());
                for (int i3 = 0; i3 < size; i3++) {
                    bottomNavigationMenuView.g.b = true;
                    bottomNavigationMenuView.d[i3].a(bottomNavigationMenuView.c);
                    bottomNavigationMenuView.d[i3].a(a2);
                    bottomNavigationMenuView.d[i3].a((az) bottomNavigationMenuView.h.getItem(i3), 0);
                    bottomNavigationMenuView.g.b = false;
                }
            }
        }
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(bi biVar) {
        return false;
    }

    public final int b() {
        return this.c;
    }

    public final boolean b(az azVar) {
        return false;
    }

    public final boolean c(az azVar) {
        return false;
    }

    public final Parcelable f() {
        a aVar = new a();
        aVar.a = this.a.e;
        return aVar;
    }
}
