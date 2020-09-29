package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;

/* renamed from: jue reason: default package */
public final class jue extends Fragment {
    private a T;
    private boolean U;
    private ArrayList<a> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();

    /* renamed from: jue$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        /* access modifiers changed from: private */
        public final String a;

        private a(Parcel parcel) {
            this.a = parcel.readString();
        }

        /* synthetic */ a(Parcel parcel, byte b) {
            this(parcel);
        }

        private a(String str) {
            this.a = str;
        }

        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
        }
    }

    private jry a(a aVar) {
        return (jry) ((kk) fbp.a(this.t)).a(aVar.a);
    }

    private synchronized void a(Bundle bundle) {
        this.a = (ArrayList) fbp.a(bundle.getParcelableArrayList("request_code_map"));
        this.b = (ArrayList) fbp.a(bundle.getParcelableArrayList("dialog_queue"));
        this.T = (a) bundle.getParcelable("current_dialog");
    }

    private synchronized void c() {
        if (this.U) {
            if (!this.b.isEmpty()) {
                if (this.T == null) {
                    this.T = (a) this.b.remove(0);
                    jry a2 = a(this.T);
                    if (a2 == null) {
                        throw new AssertionError(String.format("Cannot find fragment with tag (%s)", new Object[]{this.T != null ? this.T.a : null}));
                    }
                    Logger.b("Showing dialog (%s)", a2);
                    a2.c();
                }
            }
        }
    }

    public final void A() {
        super.A();
        this.U = false;
    }

    public final synchronized void a(int i, int i2, Intent intent) {
        a aVar = (a) this.a.get(i - 1);
        jry a2 = a(aVar);
        Logger.b("Dialog has closed (%s)", a2);
        if (a2 != null) {
            Assertion.c(aVar, this.T);
            this.T = null;
        }
    }

    public final synchronized void a(jry jry) {
        Logger.b("Queuing dialog (%s)", jry);
        this.b.add(new a(jry.z, 0));
        c();
    }

    public final synchronized int b(jry jry) {
        this.a.add(new a(jry.z, 0));
        return this.a.size();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            a(bundle);
        }
    }

    public final synchronized void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelableArrayList("request_code_map", this.a);
        bundle.putParcelableArrayList("dialog_queue", this.b);
        bundle.putParcelable("current_dialog", this.T);
    }

    public final void z() {
        super.z();
        this.U = true;
        if (this.T == null) {
            c();
        }
    }
}
