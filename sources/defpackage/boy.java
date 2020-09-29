package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.spotify.music.R;
import java.util.List;

/* renamed from: boy reason: default package */
public final class boy extends bxw {
    public static final Creator<boy> CREATOR = new bpg();
    private static final ein e = new ein("CastMediaOptions", 0);
    public final String a;
    public final String b;
    public final bpe c;
    public final boolean d;
    private final bpt f;

    /* renamed from: boy$a */
    public static final class a {
        public String a = MediaIntentReceiver.class.getName();
        public bpe b;

        public a() {
            defpackage.bpe.a aVar = new defpackage.bpe.a();
            List<String> list = aVar.a;
            int[] iArr = aVar.b;
            long j = aVar.p;
            int i = aVar.c;
            int i2 = aVar.d;
            int i3 = aVar.e;
            int i4 = aVar.f;
            int i5 = aVar.g;
            int i6 = aVar.h;
            int i7 = aVar.i;
            int i8 = aVar.j;
            bpe bpe = r2;
            int i9 = aVar.k;
            int i10 = aVar.l;
            int i11 = aVar.m;
            int i12 = aVar.n;
            int i13 = aVar.o;
            bpe bpe2 = bpe;
            bpe bpe3 = new bpe(list, iArr, j, null, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, R.dimen.cast_notification_image_size, R.string.cast_casting_to_device, R.string.cast_stop_live_stream, R.string.cast_pause, R.string.cast_play, R.string.cast_skip_next, R.string.cast_skip_prev, R.string.cast_forward, R.string.cast_forward_10, R.string.cast_forward_30, R.string.cast_rewind, R.string.cast_rewind_10, R.string.cast_rewind_30, R.string.cast_disconnect, null);
            this.b = bpe2;
        }
    }

    public boy(String str, String str2, IBinder iBinder, bpe bpe, boolean z) {
        bpt bpt;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            bpt = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            bpt = queryLocalInterface instanceof bpt ? (bpt) queryLocalInterface : new bpv(iBinder);
        }
        this.f = bpt;
        this.c = bpe;
        this.d = z;
    }

    public final bpa a() {
        bpt bpt = this.f;
        if (bpt != null) {
            try {
                return (bpa) cbj.a(bpt.b());
            } catch (RemoteException e2) {
                e.a(e2, "Unable to call %s on %s.", "getWrappedClientObject", bpt.class.getSimpleName());
            }
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b, false);
        bpt bpt = this.f;
        bxx.a(parcel, 4, bpt == null ? null : bpt.asBinder(), false);
        bxx.a(parcel, 5, (Parcelable) this.c, i, false);
        bxx.a(parcel, 6, this.d);
        bxx.b(parcel, a2);
    }
}
