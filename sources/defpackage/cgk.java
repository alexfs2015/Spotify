package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.IOException;

@cey
/* renamed from: cgk reason: default package */
public final class cgk extends bxf {
    public static final Creator<cgk> CREATOR = new cgm();
    private ParcelFileDescriptor a;
    private Parcelable b;
    private boolean c;

    public cgk(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
        this.b = null;
        this.c = true;
    }

    public cgk(SafeParcelable safeParcelable) {
        this.a = null;
        this.b = safeParcelable;
        this.c = false;
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor a() {
        if (this.a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.a = a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.a;
    }

    private final <T> ParcelFileDescriptor a(byte[] bArr) {
        AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new cgl(autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                clu.a("Error transporting the ad response", e);
                bjl.i().a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                bzm.a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            clu.a("Error transporting the ad response", e);
            bjl.i().a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            bzm.a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final <T extends SafeParcelable> T a(Creator<T> creator) {
        if (this.c) {
            ParcelFileDescriptor parcelFileDescriptor = this.a;
            if (parcelFileDescriptor == null) {
                clu.a("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new AutoCloseInputStream(parcelFileDescriptor));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                bzm.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.b = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                clu.a("Could not read from parcel file descriptor", e);
                bzm.a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                bzm.a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        a();
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, (Parcelable) this.a, i, false);
        bxg.b(parcel, a2);
    }
}
