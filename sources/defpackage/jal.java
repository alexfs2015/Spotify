package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Optional;

/* renamed from: jal reason: default package */
public interface jal {
    Intent a(String str, Uri uri, String str2, String str3);

    Intent a(String str, Optional<Uri> optional, Uri uri);

    boolean a();

    boolean a(PackageManager packageManager);

    String b();

    String c();
}
