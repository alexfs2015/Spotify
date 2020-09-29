package defpackage;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@cfp
/* renamed from: dzv reason: default package */
final class dzv {
    final dpp a;
    final String b;
    final int c;

    private dzv(dpp dpp, String str, int i) {
        this.a = dpp;
        this.b = str;
        this.c = i;
    }

    dzv(dzr dzr) {
        this(dzr.b, dzr.c, dzr.d);
    }

    static dzv a(String str) {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                dzv dzv = new dzv((dpp) dpp.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return dzv;
            } catch (ParseException | IllegalArgumentException | IllegalStateException e) {
                bkc.i().a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public final String a() {
        String str = "\u0000";
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.c);
            this.a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append(str);
            sb.append(num);
            sb.append(str);
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            cml.a("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
