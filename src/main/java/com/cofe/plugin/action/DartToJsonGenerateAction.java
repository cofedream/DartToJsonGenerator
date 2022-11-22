package com.cofe.plugin.action;

import com.jetbrains.lang.dart.ide.generation.BaseDartGenerateAction;
import com.jetbrains.lang.dart.ide.generation.BaseDartGenerateHandler;
import org.jetbrains.annotations.NotNull;

public class DartToJsonGenerateAction extends BaseDartGenerateAction {
    @NotNull
    @Override
    protected BaseDartGenerateHandler getGenerateHandler() {
        return new GenerateDartToJsonHandler();
    }
}
