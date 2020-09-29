package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static HashMap<String, a> c = new HashMap<>();
    private a d;

    interface a {
        Uri a(File file);

        File a(Uri uri);
    }

    static class b implements a {
        private final String a;
        private final HashMap<String, File> b = new HashMap<>();

        b(String str) {
            this.a = str;
        }

        public final Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Entry entry = null;
                for (Entry entry2 : this.b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    String str = "/";
                    String substring = path2.endsWith(str) ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                    StringBuilder sb = new StringBuilder();
                    sb.append(Uri.encode((String) entry.getKey()));
                    sb.append('/');
                    sb.append(Uri.encode(substring, str));
                    return new Builder().scheme("content").authority(this.a).encodedPath(sb.toString()).build();
                }
                StringBuilder sb2 = new StringBuilder("Failed to find configured root that contains ");
                sb2.append(canonicalPath);
                throw new IllegalArgumentException(sb2.toString());
            } catch (IOException unused) {
                StringBuilder sb3 = new StringBuilder("Failed to resolve canonical path for ");
                sb3.append(file);
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        public final File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                    sb.append(file2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Unable to find configured root for ");
                sb2.append(uri);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.b.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                    sb.append(file);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public static Uri a(Context context, String str, File file) {
        return a(context, str).a(file);
    }

    private static a a(Context context, String str) {
        a aVar;
        synchronized (c) {
            aVar = (a) c.get(str);
            if (aVar == 0) {
                try {
                    b bVar = new b(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider != null) {
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData != null) {
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next == 1) {
                                    break;
                                } else if (next == 2) {
                                    String name = loadXmlMetaData.getName();
                                    File file = null;
                                    String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                    String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                    if ("root-path".equals(name)) {
                                        file = b;
                                    } else if ("files-path".equals(name)) {
                                        file = context.getFilesDir();
                                    } else if ("cache-path".equals(name)) {
                                        file = context.getCacheDir();
                                    } else if ("external-path".equals(name)) {
                                        file = Environment.getExternalStorageDirectory();
                                    } else if ("external-files-path".equals(name)) {
                                        File[] a2 = fr.a(context, (String) null);
                                        if (a2.length > 0) {
                                            file = a2[0];
                                        }
                                    } else if ("external-cache-path".equals(name)) {
                                        File[] a3 = fr.a(context);
                                        if (a3.length > 0) {
                                            file = a3[0];
                                        }
                                    } else if (VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                                        File[] externalMediaDirs = context.getExternalMediaDirs();
                                        if (externalMediaDirs.length > 0) {
                                            file = externalMediaDirs[0];
                                        }
                                    }
                                    if (file != null) {
                                        bVar.a(attributeValue, a(file, attributeValue2));
                                    }
                                }
                            }
                            c.put(str, bVar);
                            aVar = bVar;
                        } else {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Couldn't find meta-data for provider with authority ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    private static File a(File file, String... strArr) {
        File file2 = file;
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                file2 = new File(file2, str);
            }
        }
        return file2;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.d = a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.d.a(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        File a2 = this.d.a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File a2 = this.d.a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return ParcelFileDescriptor.open(a2, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a2 = this.d.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            String str4 = "_display_name";
            if (str4.equals(str3)) {
                strArr3[i2] = str4;
                i = i2 + 1;
                objArr[i2] = a2.getName();
            } else {
                String str5 = "_size";
                if (str5.equals(str3)) {
                    strArr3[i2] = str5;
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(a2.length());
                }
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
