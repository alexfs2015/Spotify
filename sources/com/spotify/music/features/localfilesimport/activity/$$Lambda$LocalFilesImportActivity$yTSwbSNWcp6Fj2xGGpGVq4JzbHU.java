package com.spotify.music.features.localfilesimport.activity;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: com.spotify.music.features.localfilesimport.activity.-$$Lambda$LocalFilesImportActivity$yTSwbSNWcp6Fj2xGGpGVq4JzbHU reason: invalid class name */
public final /* synthetic */ class $$Lambda$LocalFilesImportActivity$yTSwbSNWcp6Fj2xGGpGVq4JzbHU implements Consumer {
    public static final /* synthetic */ $$Lambda$LocalFilesImportActivity$yTSwbSNWcp6Fj2xGGpGVq4JzbHU INSTANCE = new $$Lambda$LocalFilesImportActivity$yTSwbSNWcp6Fj2xGGpGVq4JzbHU();

    private /* synthetic */ $$Lambda$LocalFilesImportActivity$yTSwbSNWcp6Fj2xGGpGVq4JzbHU() {
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Local files: status and tracks observable: on error %s", ((Throwable) obj).getMessage());
    }
}
