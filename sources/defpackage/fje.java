package defpackage;

import com.google.gson.JsonParseException;

/* renamed from: fje reason: default package */
public final class fje {
    public static fjb a(fkp fkp) {
        String str = " to Json";
        String str2 = "Failed parsing JSON source: ";
        boolean z = fkp.a;
        fkp.a = true;
        try {
            fjb a = fju.a(fkp);
            fkp.a = z;
            return a;
        } catch (StackOverflowError e) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(fkp);
            sb.append(str);
            throw new JsonParseException(sb.toString(), e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(fkp);
            sb2.append(str);
            throw new JsonParseException(sb2.toString(), e2);
        } catch (Throwable th) {
            fkp.a = z;
            throw th;
        }
    }
}
