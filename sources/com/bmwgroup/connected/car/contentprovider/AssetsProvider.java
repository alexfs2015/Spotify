package com.bmwgroup.connected.car.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.bmwgroup.connected.car.app.BrandType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class AssetsProvider extends ContentProvider {
    private static afp a = afp.a("connected.car.sdk");

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.AssetFileDescriptor openAssetFile(android.net.Uri r8, java.lang.String r9) {
        /*
            r7 = this;
            afp r9 = a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "openAssetFile"
            r0.<init>(r1)
            java.lang.String r1 = r8.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9.a(r0, r2)
            java.lang.String r9 = r8.getPath()
            if (r9 == 0) goto L_0x012f
            r0 = 17
            r2 = 0
            r3 = 1
            java.lang.String r0 = r9.substring(r0)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            java.lang.String r5 = "carapplications/"
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            r4.append(r0)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            java.lang.String r9 = r4.toString()     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            afp r0 = a     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            java.lang.String r5 = "openAssetFile:  "
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            r4.append(r9)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            r0.a(r4, r5)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            byte[] r0 = r7.a(r9)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            android.content.res.AssetFileDescriptor r0 = r7.a(r0)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x007c }
            afp r4 = a     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            java.lang.String r6 = "created cache file from: "
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            r5.append(r9)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            java.lang.String r6 = "; AssetFileDescriptor is "
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            if (r0 != 0) goto L_0x0069
            java.lang.String r6 = "null"
            goto L_0x006b
        L_0x0069:
            java.lang.String r6 = "not null"
        L_0x006b:
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            r4.a(r5, r6)     // Catch:{ FileNotFoundException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00e0
        L_0x0078:
            r9 = move-exception
            goto L_0x007e
        L_0x007a:
            r4 = move-exception
            goto L_0x00a6
        L_0x007c:
            r9 = move-exception
            r0 = r2
        L_0x007e:
            afp r4 = a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "openAssetFile:  Cannot open file in asset folder - uri: "
            r5.<init>(r6)
            java.lang.String r6 = r8.toString()
            r5.append(r6)
            java.lang.String r6 = " - "
            r5.append(r6)
            java.lang.String r9 = r9.getMessage()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r4.a(r9, r5)
            goto L_0x00e0
        L_0x00a4:
            r4 = move-exception
            r0 = r2
        L_0x00a6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.getMessage()
            r5.append(r6)
            java.lang.String r6 = r4.getLocalizedMessage()
            r5.append(r6)
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "compressed"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00d1
            android.content.res.AssetFileDescriptor r0 = r7.b(r9)
            goto L_0x00e0
        L_0x00d1:
            afp r9 = a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r8.toString()
            r4[r1] = r5
            java.lang.String r5 = "openAssetFile: File not found in asset folder - uri: %s"
            r9.c(r5, r4)
        L_0x00e0:
            java.lang.String r9 = a(r8)
            if (r0 != 0) goto L_0x012e
            java.lang.String r4 = r8.getLastPathSegment()
            java.lang.String r5 = "images.zip"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x011f }
            if (r5 == 0) goto L_0x00fb
            android.content.Context r2 = r7.getContext()     // Catch:{ Exception -> 0x011f }
            byte[] r2 = defpackage.adf.a(r2, r9)     // Catch:{ Exception -> 0x011f }
            goto L_0x010b
        L_0x00fb:
            java.lang.String r5 = "texts.zip"
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x011f }
            if (r4 == 0) goto L_0x010b
            android.content.Context r2 = r7.getContext()     // Catch:{ Exception -> 0x011f }
            byte[] r2 = defpackage.adf.b(r2, r9)     // Catch:{ Exception -> 0x011f }
        L_0x010b:
            android.content.res.AssetFileDescriptor r0 = r7.a(r2)     // Catch:{ Exception -> 0x011f }
            afp r9 = a     // Catch:{ Exception -> 0x011f }
            java.lang.String r2 = "openAssetFile: creating dynamic zip for uri %s"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x011f }
            java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x011f }
            r4[r1] = r5     // Catch:{ Exception -> 0x011f }
            r9.c(r2, r4)     // Catch:{ Exception -> 0x011f }
            goto L_0x012e
        L_0x011f:
            afp r9 = a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r2[r1] = r8
            java.lang.String r8 = "openAssetFile: Cannot generate Zip files for uri %s"
            r9.c(r8, r2)
        L_0x012e:
            return r0
        L_0x012f:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bmwgroup.connected.car.contentprovider.AssetsProvider.openAssetFile(android.net.Uri, java.lang.String):android.content.res.AssetFileDescriptor");
    }

    private byte[] a(String str) {
        InputStream open = getContext().getAssets().open(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = open.read(bArr, 0, 16384);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private AssetFileDescriptor b(String str) {
        AssetFileDescriptor assetFileDescriptor;
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append("temp");
        File file = new File(getContext().getCacheDir(), sb.toString());
        file.getParentFile().mkdirs();
        try {
            a(str, file);
            assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0, -1);
            try {
                a.c("getAssetFileDescriptorFromCompressedFile:  Opening compressed file: %s", str);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            assetFileDescriptor = null;
            a.c("getAssetFileDescriptorFromCompressedFile:  Cannot open file in asset folder - filename: %s", str);
            return assetFileDescriptor;
        }
        return assetFileDescriptor;
    }

    private AssetFileDescriptor a(byte[] bArr) {
        File cacheDir = getContext().getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append("temp");
        File file = new File(cacheDir, sb.toString());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr, 0, bArr.length);
            fileOutputStream.close();
            AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0, -1);
            return assetFileDescriptor;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    private static String a(Uri uri) {
        String str = null;
        for (String str2 : uri.getPathSegments()) {
            BrandType[] values = BrandType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (str2.equalsIgnoreCase(values[i].name())) {
                    str = str2;
                    break;
                } else {
                    i++;
                }
            }
        }
        return str;
    }

    private void a(String str, File file) {
        FileOutputStream fileOutputStream;
        InputStream open = getContext().getAssets().open(str, 3);
        try {
            fileOutputStream = new FileOutputStream(file, false);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    open.close();
                    return;
                }
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    private static boolean a(AssetManager assetManager, String str) {
        try {
            if (assetManager.list(str).length > 0) {
                return true;
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getType(Uri uri) {
        String str = "assets_provider";
        if (a(getContext().getAssets(), uri.getPath())) {
            return str;
        }
        String substring = uri.getPath().substring(17);
        StringBuilder sb = new StringBuilder("carapplications/");
        sb.append(substring);
        if (a(getContext().getAssets(), sb.toString())) {
            return str;
        }
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
