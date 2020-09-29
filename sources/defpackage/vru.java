package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;

/* renamed from: vru reason: default package */
public final class vru extends vsm {
    private static final UriMatcher a;
    private final Context b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        String str = "com.android.contacts";
        uriMatcher.addURI(str, "contacts/lookup/*/#", 1);
        a.addURI(str, "contacts/lookup/*", 1);
        a.addURI(str, "contacts/#/photo", 2);
        a.addURI(str, "contacts/#", 3);
        a.addURI(str, "display_photo/#", 4);
    }

    public vru(Context context) {
        this.b = context;
    }

    public final boolean a(vsk vsk) {
        Uri uri = vsk.d;
        return "content".equals(uri.getScheme()) && Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && a.match(vsk.d) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.vsm.a a(defpackage.vsk r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.b
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.d
            android.content.UriMatcher r0 = a
            int r0 = r0.match(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0035
            r3 = 2
            if (r0 == r3) goto L_0x0030
            r3 = 3
            if (r0 == r3) goto L_0x003d
            r2 = 4
            if (r0 != r2) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid uri: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x0030:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L_0x004c
        L_0x0035:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L_0x003d
            r5 = r1
            goto L_0x004c
        L_0x003d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 14
            if (r0 >= r3) goto L_0x0048
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5)
            goto L_0x004c
        L_0x0048:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r2)
        L_0x004c:
            if (r5 == 0) goto L_0x0056
            vsm$a r6 = new vsm$a
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r6.<init>(r5, r0)
            return r6
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vru.a(vsk, int):vsm$a");
    }
}
