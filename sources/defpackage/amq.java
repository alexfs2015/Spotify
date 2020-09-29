package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* renamed from: amq reason: default package */
public final class amq {
    private static final String a = amq.class.getName();
    private static File b;

    /* renamed from: amq$a */
    public static final class a {
        final UUID a;
        public final String b;
        final String c;
        Bitmap d;
        public Uri e;
        boolean f;
        boolean g;

        /* synthetic */ a(UUID uuid, Bitmap bitmap, Uri uri, byte b2) {
            this(uuid, bitmap, uri);
        }

        private a(UUID uuid, Bitmap bitmap, Uri uri) {
            String str;
            this.a = uuid;
            this.d = bitmap;
            this.e = uri;
            boolean z = true;
            if (uri != null) {
                String scheme = uri.getScheme();
                if ("content".equalsIgnoreCase(scheme)) {
                    this.f = true;
                    if (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) {
                        z = false;
                    }
                    this.g = z;
                } else {
                    if ("file".equalsIgnoreCase(uri.getScheme())) {
                        this.g = true;
                    } else if (!amw.b(uri)) {
                        StringBuilder sb = new StringBuilder("Unsupported scheme for media Uri : ");
                        sb.append(scheme);
                        throw new FacebookException(sb.toString());
                    }
                }
            } else if (bitmap != null) {
                this.g = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            this.c = !this.g ? null : UUID.randomUUID().toString();
            if (!this.g) {
                str = this.e.toString();
            } else {
                str = akb.a(akc.k(), uuid, this.c);
            }
            this.b = str;
        }
    }

    private amq() {
    }

    public static a a(UUID uuid, Bitmap bitmap) {
        amx.a((Object) uuid, "callId");
        amx.a((Object) bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, null, 0);
    }

    public static a a(UUID uuid, Uri uri) {
        amx.a((Object) uuid, "callId");
        amx.a((Object) uri, "attachmentUri");
        return new a(uuid, null, uri, 0);
    }

    public static void a(Collection<a> collection) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        if (collection != null && collection.size() != 0) {
            if (b == null) {
                amw.a(a());
            }
            a().mkdirs();
            ArrayList<File> arrayList = new ArrayList<>();
            try {
                for (a aVar : collection) {
                    if (aVar.g) {
                        File a2 = a(aVar.a, aVar.c, true);
                        arrayList.add(a2);
                        if (aVar.d != null) {
                            Bitmap bitmap = aVar.d;
                            fileOutputStream2 = new FileOutputStream(a2);
                            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream2);
                            amw.a((Closeable) fileOutputStream2);
                        } else if (aVar.e != null) {
                            Uri uri = aVar.e;
                            boolean z = aVar.f;
                            fileOutputStream = new FileOutputStream(a2);
                            if (!z) {
                                inputStream = new FileInputStream(uri.getPath());
                            } else {
                                inputStream = akc.g().getContentResolver().openInputStream(uri);
                            }
                            amw.a(inputStream, (OutputStream) fileOutputStream);
                            amw.a((Closeable) fileOutputStream);
                        }
                    }
                }
            } catch (IOException e) {
                String str = a;
                StringBuilder sb = new StringBuilder("Got unexpected exception:");
                sb.append(e);
                Log.e(str, sb.toString());
                for (File delete : arrayList) {
                    try {
                        delete.delete();
                    } catch (Exception unused) {
                    }
                }
                throw new FacebookException((Throwable) e);
            } catch (Throwable th) {
                amw.a((Closeable) fileOutputStream2);
                throw th;
            }
        }
    }

    public static void a(UUID uuid) {
        File a2 = a(uuid, false);
        if (a2 != null) {
            amw.a(a2);
        }
    }

    public static File a(UUID uuid, String str) {
        if (amw.a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    private static synchronized File a() {
        File file;
        synchronized (amq.class) {
            if (b == null) {
                b = new File(akc.g().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = b;
        }
        return file;
    }

    private static File a(UUID uuid, boolean z) {
        File file = b;
        if (file == null) {
            return null;
        }
        File file2 = new File(file, uuid.toString());
        if (z && !file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    private static File a(UUID uuid, String str, boolean z) {
        File a2 = a(uuid, z);
        if (a2 == null) {
            return null;
        }
        try {
            return new File(a2, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
