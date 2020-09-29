package defpackage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.comparator.LastModifiedFileComparator;

/* renamed from: rux reason: default package */
public final class rux {
    private final rup a;
    private final rwl b;

    public rux(rup rup, rwl rwl) {
        this.a = rup;
        this.b = rwl;
    }

    public static boolean b(File file) {
        if (file.exists() && file.isFile()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.canWrite()) {
                try {
                    return e(file).createNewFile();
                } catch (IOException unused) {
                    Logger.e("Unable to create receipt file for dump: %s", file.getAbsolutePath());
                }
            }
        }
        return false;
    }

    private static Optional<File> c(File file) {
        File file2 = null;
        if (file.exists()) {
            File[] listFiles = file.listFiles($$Lambda$k1LMnpJLlrYtcSsQvSbPWdaMgg.INSTANCE);
            if (listFiles != null) {
                long j = Long.MIN_VALUE;
                File file3 = null;
                for (File listFiles2 : listFiles) {
                    File[] listFiles3 = listFiles2.listFiles($$Lambda$rux$VWopN_FDkYYDhR_XNnwPPZNVDvI.INSTANCE);
                    if (listFiles3 != null) {
                        long j2 = j;
                        File file4 = file3;
                        for (File file5 : listFiles3) {
                            if ((!file5.isFile() || !file5.exists()) ? false : e(file5).exists()) {
                                Logger.d("Skipping crash with receipt: %s", file5.getAbsolutePath());
                            } else if (file5.lastModified() > j2) {
                                j2 = file5.lastModified();
                                file4 = file5;
                            }
                        }
                        file3 = file4;
                        j = j2;
                    }
                }
                file2 = file3;
            }
        }
        return Optional.c(file2);
    }

    private rul d(File file) {
        a g = ImmutableMap.g();
        fdz R_ = this.a.a().c.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (rul.b.contains(entry.getKey())) {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        try {
            for (Entry entry2 : ((Map) this.b.b().readValue(file, (TypeReference) new TypeReference<Map<String, String>>() {
            })).entrySet()) {
                if (rul.a.contains(entry2.getKey())) {
                    g.b(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (IOException e) {
            Logger.d("Unable to read json file: '%s', error message: '%s'", file.getAbsolutePath(), e.getMessage());
        }
        return rul.a(g.b());
    }

    private static File e(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(".spotify_reported");
        return new File(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean g(File file) {
        return file.isFile() && file.getName().endsWith(".dmp");
    }

    public final Optional<rus> a(File file) {
        Optional optional;
        Optional c = c(new File(file, ".Fabric/com.crashlytics.sdk.android.crashlytics-ndk/native"));
        if (!c.b()) {
            return Optional.e();
        }
        File file2 = new File(file, ".Fabric/com.crashlytics.sdk.android.crashlytics-core");
        File[] listFiles = file2.listFiles($$Lambda$rux$zWqC9wQXZUQa6Cnwx2I71KD1VuE.INSTANCE);
        if (listFiles == null || listFiles.length <= 0) {
            optional = Optional.e();
        } else {
            Arrays.sort(listFiles, LastModifiedFileComparator.a);
            String name = listFiles[0].getName();
            File file3 = new File(file2, name);
            if (listFiles.length > 1) {
                Logger.d("More than one Crashlytics metadata file found, picking %s", name);
            }
            optional = Optional.b(file3);
        }
        if (!optional.b()) {
            Logger.d("Crashlytics minidump found but no metadata file found", new Object[0]);
            return Optional.e();
        }
        return Optional.b(new rus((File) c.c(), d((File) optional.c())));
    }
}
