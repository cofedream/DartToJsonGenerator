package com.cofe.plugin.utils;

import com.intellij.psi.util.PsiTreeUtil;
import com.jetbrains.lang.dart.psi.DartComponent;
import com.jetbrains.lang.dart.psi.DartReturnType;
import com.jetbrains.lang.dart.psi.DartType;
import com.jetbrains.lang.dart.util.DartPresentableUtil;

/**
 * @author : cofe
 * @date : 2022-11-22
 */
public class DomUtil {
    public static String getReturnTypeText(DartComponent component) {
        DartReturnType returnType = PsiTreeUtil.getChildOfType(component, DartReturnType.class);
        DartType dartType = PsiTreeUtil.getChildOfType(component, DartType.class);
        return returnType == null ? DartPresentableUtil.buildTypeText(component, dartType, null) : DartPresentableUtil.buildTypeText(component, returnType, null);
    }
}
