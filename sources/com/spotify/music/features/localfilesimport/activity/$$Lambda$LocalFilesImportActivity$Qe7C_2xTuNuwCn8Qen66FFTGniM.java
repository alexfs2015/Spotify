package com.spotify.music.features.localfilesimport.activity;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: com.spotify.music.features.localfilesimport.activity.-$$Lambda$LocalFilesImportActivity$Qe7C_2xTuNuwCn8Qen66FFTGniM reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LocalFilesImportActivity$Qe7C_2xTuNuwCn8Qen66FFTGniM implements Consumer {
    public static final /* synthetic */ $$Lambda$LocalFilesImportActivity$Qe7C_2xTuNuwCn8Qen66FFTGniM INSTANCE = new $$Lambda$LocalFilesImportActivity$Qe7C_2xTuNuwCn8Qen66FFTGniM();

    private /* synthetic */ $$Lambda$LocalFilesImportActivity$Qe7C_2xTuNuwCn8Qen66FFTGniM() {
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Local files: status and tracks observable: on error %s", ((Throwable) obj).getMessage());
    }
}
