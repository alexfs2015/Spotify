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

/* renamed from: jru reason: default package */
public final class jru extends Fragment {
    private a T;
    private boolean U;
    private ArrayList<a> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();

    /* renamed from: jru$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }
        };
        /* access modifiers changed from: private */
        public final String a;

        public final int describeContents() {
            return 0;
        }

        /* synthetic */ a(Parcel parcel, byte b) {
            this(parcel);
        }

        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        private a(String str) {
            this.a = str;
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

        private a(Parcel parcel) {
            this.a = parcel.readString();
        }
    }

    public final synchronized void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelableArrayList("request_code_map", this.a);
        bundle.putParcelableArrayList("dialog_queue", this.b);
        bundle.putParcelable("current_dialog", this.T);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            a(bundle);
        }
    }

    public final void z() {
        super.z();
        this.U = true;
        if (this.T == null) {
            c();
        }
    }

    public final void A() {
        super.A();
        this.U = false;
    }

    private synchronized void a(Bundle bundle) {
        this.a = (ArrayList) fay.a(bundle.getParcelableArrayList("request_code_map"));
        this.b = (ArrayList) fay.a(bundle.getParcelableArrayList("dialog_queue"));
        this.T = (a) bundle.getParcelable("current_dialog");
    }

    public final synchronized void a(jpm jpm) {
        Logger.b("Queuing dialog (%s)", jpm);
        this.b.add(new a(jpm.z, 0));
        c();
    }

    public final synchronized int b(jpm jpm) {
        this.a.add(new a(jpm.z, 0));
        return this.a.size();
    }

    private synchronized void c() {
        if (this.U) {
            if (!this.b.isEmpty()) {
                if (this.T == null) {
                    this.T = (a) this.b.remove(0);
                    jpm a2 = a(this.T);
                    if (a2 == null) {
                        throw new AssertionError(String.format("Cannot find fragment with tag (%s)", new Object[]{this.T != null ? this.T.a : null}));
                    }
                    Logger.b("Showing dialog (%s)", a2);
                    a2.c();
                }
            }
        }
    }

    public final synchronized void a(int i, int i2, Intent intent) {
        a aVar = (a) this.a.get(i - 1);
        jpm a2 = a(aVar);
        Logger.b("Dialog has closed (%s)", a2);
        if (a2 != null) {
            Assertion.c(aVar, this.T);
            this.T = null;
        }
    }

    private jpm a(a aVar) {
        return (jpm) ((kf) fay.a(this.t)).a(aVar.a);
    }
}
