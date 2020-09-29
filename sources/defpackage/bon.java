package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bon reason: default package */
public final class bon extends bxf {
    public static final Creator<bon> CREATOR = new bpn();
    /* access modifiers changed from: private */
    public static final List<String> F = Arrays.asList(new String[]{"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"});
    /* access modifiers changed from: private */
    public static final int[] G = {0, 1};
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final bpd E;
    private final int[] H;
    public final List<String> a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* renamed from: bon$a */
    public static final class a {
        List<String> a = bon.F;
        int[] b = bon.G;
        int c = R.drawable.cast_ic_notification_small_icon;
        int d = R.drawable.cast_ic_notification_stop_live_stream;
        int e = R.drawable.cast_ic_notification_pause;
        int f = R.drawable.cast_ic_notification_play;
        int g = R.drawable.cast_ic_notification_skip_next;
        int h = R.drawable.cast_ic_notification_skip_prev;
        int i = R.drawable.cast_ic_notification_forward;
        int j = R.drawable.cast_ic_notification_forward10;
        int k = R.drawable.cast_ic_notification_forward30;
        int l = R.drawable.cast_ic_notification_rewind;
        int m = R.drawable.cast_ic_notification_rewind10;
        int n = R.drawable.cast_ic_notification_rewind30;
        int o = R.drawable.cast_ic_notification_disconnect;
        long p = 10000;
    }

    public bon(List<String> list, int[] iArr, long j2, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, IBinder iBinder) {
        int[] iArr2 = iArr;
        IBinder iBinder2 = iBinder;
        bpd bpd = null;
        if (list != null) {
            this.a = new ArrayList(list);
        } else {
            this.a = null;
        }
        if (iArr2 != null) {
            this.H = Arrays.copyOf(iArr, iArr2.length);
        } else {
            this.H = null;
        }
        this.b = j2;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = i10;
        this.m = i11;
        this.n = i12;
        this.o = i13;
        this.p = i14;
        this.q = i15;
        this.r = i16;
        this.s = i17;
        this.t = i18;
        this.u = i19;
        this.v = i20;
        this.w = i21;
        this.x = i22;
        this.y = i23;
        this.z = i24;
        this.A = i25;
        this.B = i26;
        this.C = i27;
        this.D = i28;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof bpd) {
                bpd = (bpd) queryLocalInterface;
            } else {
                bpd = new bpf(iBinder2);
            }
        }
        this.E = bpd;
    }

    public final int[] a() {
        int[] iArr = this.H;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        int[] a3 = a();
        if (a3 != null) {
            int a4 = bxg.a(parcel, 3);
            parcel.writeIntArray(a3);
            bxg.b(parcel, a4);
        }
        bxg.a(parcel, 4, this.b);
        bxg.a(parcel, 5, this.c, false);
        bxg.b(parcel, 6, this.d);
        bxg.b(parcel, 7, this.e);
        bxg.b(parcel, 8, this.f);
        bxg.b(parcel, 9, this.g);
        bxg.b(parcel, 10, this.h);
        bxg.b(parcel, 11, this.i);
        bxg.b(parcel, 12, this.j);
        bxg.b(parcel, 13, this.k);
        bxg.b(parcel, 14, this.l);
        bxg.b(parcel, 15, this.m);
        bxg.b(parcel, 16, this.n);
        bxg.b(parcel, 17, this.o);
        bxg.b(parcel, 18, this.p);
        bxg.b(parcel, 19, this.q);
        bxg.b(parcel, 20, this.r);
        bxg.b(parcel, 21, this.s);
        bxg.b(parcel, 22, this.t);
        bxg.b(parcel, 23, this.u);
        bxg.b(parcel, 24, this.v);
        bxg.b(parcel, 25, this.w);
        bxg.b(parcel, 26, this.x);
        bxg.b(parcel, 27, this.y);
        bxg.b(parcel, 28, this.z);
        bxg.b(parcel, 29, this.A);
        bxg.b(parcel, 30, this.B);
        bxg.b(parcel, 31, this.C);
        bxg.b(parcel, 32, this.D);
        bpd bpd = this.E;
        bxg.a(parcel, 33, bpd == null ? null : bpd.asBinder(), false);
        bxg.b(parcel, a2);
    }
}
