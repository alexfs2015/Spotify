package defpackage;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: fhy reason: default package */
public class fhy implements Parcelable {
    public static final Creator<fhy> CREATOR = new fhz();
    private Messenger a;
    private fii b;

    /* renamed from: fhy$a */
    public static final class a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.f();
            return fhy.class;
        }
    }

    public fhy(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.a = new Messenger(iBinder);
        } else {
            this.b = new fij(iBinder);
        }
    }

    private final IBinder a() {
        Messenger messenger = this.a;
        return messenger != null ? messenger.getBinder() : this.b.asBinder();
    }

    public final void a(Message message) {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.b.a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((fhy) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
