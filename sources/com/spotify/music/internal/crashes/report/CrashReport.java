package com.spotify.music.internal.crashes.report;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public abstract class CrashReport {

    public enum Architecture {
        i386,
        x64,
        armv7,
        armv7s,
        arm64,
        mips,
        unknown
    }

    public enum Lifecycle {
        startup,
        authentication,
        shutdown,
        unknown,
        operational
    }

    public enum State {
        inactive,
        active,
        background,
        suspended,
        unknown
    }
}
