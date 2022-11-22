package com.cofe.plugin.common.bundle;

import com.intellij.DynamicBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

/**
 * @author : cofe
 * @date : 2022-11-22
 */
public class DartBundle extends DynamicBundle {

    @NonNls
    private static final String BUNDLE = "messages.DartGeneratorBundle";
    private static final DartBundle INSTANCE = new DartBundle();

    public DartBundle() {
        super(BUNDLE);
    }

    public static String message(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, @NotNull Object... params) {
        return INSTANCE.getMessage(key, params);
    }

}
