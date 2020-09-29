package defpackage;

import com.google.gson.JsonParseException;

/* renamed from: fik reason: default package */
public final class fik {
    public static fih a(fjv fjv) {
        String str = " to Json";
        String str2 = "Failed parsing JSON source: ";
        boolean z = fjv.a;
        fjv.a = true;
        try {
            fih a = fja.a(fjv);
            fjv.a = z;
            return a;
        } catch (StackOverflowError e) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(fjv);
            sb.append(str);
            throw new JsonParseException(sb.toString(), e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(fjv);
            sb2.append(str);
            throw new JsonParseException(sb2.toString(), e2);
        } catch (Throwable th) {
            fjv.a = z;
            throw th;
        }
    }
}
