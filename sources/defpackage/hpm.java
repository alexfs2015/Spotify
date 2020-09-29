package defpackage;

import com.spotify.core.image.ImageLoaderInterface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hpm reason: default package */
public final class hpm implements hpl {
    private final ImageLoaderInterface a;
    private final List<hkb> b = new ArrayList();

    /* renamed from: hpm$a */
    public static class a implements defpackage.hpl.a {
        public final hpl a(ImageLoaderInterface imageLoaderInterface) {
            return new hpm(imageLoaderInterface);
        }
    }

    public hpm(ImageLoaderInterface imageLoaderInterface) {
        this.a = imageLoaderInterface;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.ParcelFileDescriptor a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            android.os.ParcelFileDescriptor[] r1 = android.os.ParcelFileDescriptor.createPipe()     // Catch:{ IOException -> 0x002b }
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r1 = r1[r4]
            com.spotify.core.image.ImageLoaderInterface r4 = r6.a
            java.io.FileDescriptor r5 = r1.getFileDescriptor()
            boolean r7 = r4.writeImageToPipe(r7, r5)
            if (r7 != 0) goto L_0x001e
            r3.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            r1.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r0
        L_0x001e:
            r1.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r7 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = ""
            com.spotify.base.java.logging.Logger.b(r7, r1, r0)
        L_0x002a:
            return r3
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpm.a(java.lang.String):android.os.ParcelFileDescriptor");
    }

    public final void a() {
        for (hkb a2 : this.b) {
            a2.a();
        }
    }

    public final void a(hkb hkb) {
        this.b.add(hkb);
    }
}
