package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    private final List<ffs<?>> zza;

    public DependencyCycleException(List<ffs<?>> list) {
        StringBuilder sb = new StringBuilder("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
        this.zza = list;
    }
}
