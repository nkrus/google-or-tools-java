/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.linearsolver;

public final class MPModelExportOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MPModelExportOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MPModelExportOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        main_research_linear_solverJNI.delete_MPModelExportOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MPModelExportOptions() {
    this(main_research_linear_solverJNI.new_MPModelExportOptions(), true);
  }

  public void setObfuscate(boolean value) {
    main_research_linear_solverJNI.MPModelExportOptions_Obfuscate_set(swigCPtr, this, value);
  }

  public boolean getObfuscate() {
    return main_research_linear_solverJNI.MPModelExportOptions_Obfuscate_get(swigCPtr, this);
  }

  public void setLogInvalidNames(boolean value) {
    main_research_linear_solverJNI.MPModelExportOptions_LogInvalidNames_set(swigCPtr, this, value);
  }

  public boolean getLogInvalidNames() {
    return main_research_linear_solverJNI.MPModelExportOptions_LogInvalidNames_get(swigCPtr, this);
  }

  public void setShowUnusedVariables(boolean value) {
    main_research_linear_solverJNI.MPModelExportOptions_ShowUnusedVariables_set(swigCPtr, this, value);
  }

  public boolean getShowUnusedVariables() {
    return main_research_linear_solverJNI.MPModelExportOptions_ShowUnusedVariables_get(swigCPtr, this);
  }

  public void setMaxLineLength(int value) {
    main_research_linear_solverJNI.MPModelExportOptions_MaxLineLength_set(swigCPtr, this, value);
  }

  public int getMaxLineLength() {
    return main_research_linear_solverJNI.MPModelExportOptions_MaxLineLength_get(swigCPtr, this);
  }

}
