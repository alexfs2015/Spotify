package defpackage;

import android.os.Parcel;
import com.spotify.playlist.models.offline.WaitingReason;

/* renamed from: uzh reason: default package */
public final class uzh {
    public static uzf a(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            return new f();
        }
        if (readString.equals(f.class.getCanonicalName())) {
            return new f();
        }
        int readInt = parcel.readInt();
        if (readString.equals(h.class.getCanonicalName())) {
            WaitingReason waitingReason = (WaitingReason) parcel.readSerializable();
            if (waitingReason != null) {
                return uzf.a(waitingReason, readInt);
            }
        }
        if (readString.equals(b.class.getCanonicalName())) {
            return uzf.a(readInt);
        }
        if (readString.equals(a.class.getCanonicalName())) {
            return new a();
        }
        if (readString.equals(c.class.getCanonicalName())) {
            return new c();
        }
        if (readString.equals(e.class.getCanonicalName())) {
            return new e();
        }
        if (readString.equals(d.class.getCanonicalName())) {
            return new d();
        }
        return readString.equals(g.class.getCanonicalName()) ? new g() : new f();
    }

    public static void a(uzf uzf, Parcel parcel) {
        uzf.a((gcs<f>) new $$Lambda$uzh$F6BnQa1y_dt7XiWLoh2oBkQlXM<f>(parcel), (gcs<h>) new $$Lambda$uzh$_CxUmBjYdLAXpevhTJFo3qY20fI<h>(parcel), (gcs<b>) new $$Lambda$uzh$p1urbDkyBWKMY_Y225ivqlkYrwk<b>(parcel), (gcs<a>) new $$Lambda$uzh$RLzQXjLY75KHaY8PNqpN89UFn4<a>(parcel), (gcs<c>) new $$Lambda$uzh$Vt4P4lhKjDBPYKdoynvIdEH08<c>(parcel), (gcs<e>) new $$Lambda$uzh$B1rJ9jlOSnY0prg4fAZdgMZTYkU<e>(parcel), (gcs<d>) new $$Lambda$uzh$JolQSEyL0wWyGA5u03hMq1WNRNQ<d>(parcel), (gcs<g>) new $$Lambda$uzh$mC4yIijzSUojcf7gQWJB9njn8I<g>(parcel));
    }

    /* access modifiers changed from: private */
    public static void a(Parcel parcel, String str, int i) {
        parcel.writeString(str);
        parcel.writeInt(i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Parcel parcel, h hVar) {
        a(parcel, h.class.getCanonicalName(), hVar.b);
        parcel.writeSerializable(hVar.a);
    }
}
